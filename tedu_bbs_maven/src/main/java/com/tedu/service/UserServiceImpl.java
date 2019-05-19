package com.tedu.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.common.ServiceException;
import com.tedu.common.ov.JsonResult;
import com.tedu.dao.UserMapper;
import com.tedu.md5.MD5;
import com.tedu.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public User findByUserName(String username,String password) throws Exception{
		//String result=null;
		MD5 md5 = new MD5();
			String md5password = md5.getMD5(password);
			User user=userMapper.findByUserName(username);
			if(user==null){
				throw new ServiceException("账号或手机号码不存在");
			}
			if(!(md5password.equals(user.getPassword()))){
				throw new ServiceException("账号或者密码不正确");
			}
			if(user.getUserLock()==1){
				throw new ServiceException("账号锁定状态");
			}
			if(user.getUserFreeze()==1){	
				throw new ServiceException("账号冻结状态");
			}
			userMapper.updateTime(username);
			return user;	
	}
	
	@Override
	public JsonResult addUser(String username, String password, String phone){
		String u="[a-zA-Z\u4e00-\u9fa5]{1}[a-zA-Z0-9_\u4e00-\u9fa5]{2,19}";
		String p="(?!^(\\d+|[a-zA-Z]+|[~!@#$%^&*?]+)$)^[\\w~!@#$%^&*?]{7,20}";
		String ph="1(3|4|5|7|8)\\d{9}";
		Integer state = 0;
		try {
			if(username==null||username.equals("")){
				state = 2;
				throw new IllegalArgumentException("用户名不能为空");
			}else if(!username.matches(u)){
				state = 2;
				throw new IllegalArgumentException("用户名:3-20长度的汉字字母数字以及下划线!");	
			}
			
			if(password==null||password.equals("")){
				state = 3;
				throw new IllegalArgumentException("密码不能为空");
			}else if(password.length()<6){
				state = 3;
				throw new IllegalArgumentException("请输入6位以上密码!");
			}
			else if(!password.matches(p)){
				state =3;
				throw new IllegalArgumentException("至少包含数字,字母,常用符号中的两种!");	
			}
			
			if(phone==null||phone.equals("")){
				state = 4;
				throw new IllegalArgumentException("手机号不能为空");
			}
			else if(!phone.matches(ph)){
				state = 4;
				throw new IllegalArgumentException("请输入正确的手机号!");	
			}
		} catch (Exception e) {
			return new JsonResult(e, state);
		}
		MD5 md5 = new MD5();
		String md5password;
			try {
				md5password = md5.getMD5(password);
				userMapper.addUser(username, md5password,phone);	
			} catch (Exception e) {
				e.printStackTrace();
				e = new Exception("服务器正在维护!");
				return new JsonResult(e, state);
			}
			return null;
			
	}

	@SuppressWarnings("unused")
	@Override
	public  User findByuserPhone(String phone) {
		String ph="1(3|4|5|7|8)\\d{9}";
		 if(!phone.matches(ph)){
			throw new IllegalArgumentException("请输入正确的手机号!");
		}
		 User user= userMapper.findByPhone(phone);
			 if(user==null){
				 throw new ServiceException("恭喜号码可以使用");
			 }
			 if(!(user==null)){
				 throw new ServiceException("账号已存在");}
		return user;
		
	}

	@SuppressWarnings("unused")
	@Override
	public User findByUser(String username) {
		
		 User user= userMapper.findByUser(username);
		 if(user==null){
				throw new ServiceException("恭喜用户名可以使用!");
			}
		if(!(user==null)){
			throw new ServiceException("账号已存在!");
		}
		return user;
	}
	
	/*----------------------------------------贺昌--------------------------------------------------*/
		
		
		@Override
		public  User findByPhone(String phone) {
			String ph="1(3|4|5|7|8)\\d{9}";
			 if(!phone.matches(ph)){
				throw new IllegalArgumentException("请输入正确的手机号!");
			}
			
			 User user= userMapper.findByPhone(phone);
			 if(user==null){
				 throw new IllegalArgumentException("手机号不存在!");
			 }
			return user;
		}

		@Override
		public void updateByPhone(String phone, String password) {
			MD5 md5 = new MD5();
			try {
				String md5password = md5.getMD5(password);
				userMapper.updateByPhone(phone,md5password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void checkPasswordformat(String password) {
			String p="(?!^(\\d+|[a-zA-Z]+|[~!@#$%^&*?]+)$)^[\\w~!@#$%^&*?]{6,20}";
			if(password==null||password.equals("")){
				throw new IllegalArgumentException("密码不能为空");
			}else if(password.length()<6){
				throw new IllegalArgumentException("请输入6位以上密码!");
			}
			else if(!password.matches(p)){
				throw new IllegalArgumentException("至少包含数字,字母,常用符号中的两种!");	
			}
			
		}

	
	
	


/*@Override
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}*/
}
