/**
 * @author Tony
 * @date 2018-01-10
 * @project rest_demo
 */
package com.tedu.ucpaas.client;

public class SendMessages {

	static AbsRestClient InstantiationRestAPI() {
		return new JsonReqClient();
	}
	
	public static String testSendSms(String sid, String token, String appid, String templateid, String param, String mobile, String uid){
		try {
			String result=InstantiationRestAPI().sendSms(sid, token, appid, templateid, param, mobile, uid);
			System.out.println("Response content is: " + result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void testSendSmsBatch(String sid, String token, String appid, String templateid, String param, String mobile, String uid){
		try {
			String result=InstantiationRestAPI().sendSmsBatch(sid, token, appid, templateid, param, mobile, uid);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testAddSmsTemplate(String sid, String token, String appid, String type, String template_name, String autograph, String content){
		try {
			String result=InstantiationRestAPI().addSmsTemplate(sid, token, appid, type, template_name, autograph, content);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
	
	public static void testGetSmsTemplate(String sid, String token, String appid, String templateid, String page_num, String page_size){
		try {
			String result=InstantiationRestAPI().getSmsTemplate(sid, token, appid, templateid, page_num, page_size);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void testEditSmsTemplate(String sid, String token, String appid, String templateid, String type, String template_name, String autograph, String content){
		try {
			String result=InstantiationRestAPI().editSmsTemplate(sid, token, appid, templateid, type, template_name, autograph, content);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void testDeleterSmsTemplate(String sid, String token, String appid, String templateid){
		try {
			String result=InstantiationRestAPI().deleterSmsTemplate(sid, token, appid, templateid);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 测试说明  启动main方法后，请在控制台输入数字(数字对应 相应的调用方法)，回车键结束
	 * 参数名称含义，请参考rest api 文档
	 * @throws IOException 
	 * @method main
	 */
	/**
	 * sid:Account Sid
	 * token:Auth Token
	 * appid:appId
	 * templated:短信模板ID
	 * uid:用户透传ID，随状态报告返回
	 * @return 
	 * */
	
	public static String sendMessage(String mobile) {
		String sid = "fd5ff73ab3f48c6f4cb905453084decb";
		String token = "d0e4b4abf37aa8970eae182d6d7ba4e6";
		String appid = "76114f6eb8ac4eeca947d2c056d9b2a9";
		String templateid = "456270";
		int mobile_code = (int)((Math.random()*9+1)*100000);
		System.out.println(mobile_code);
		String param = ""+mobile_code;
		String uid = "";
		String result = testSendSms(sid, token, appid, templateid, param, mobile, uid);
		return result;
	}
}
