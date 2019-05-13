package com.tedu.md5;
import java.security.MessageDigest;

/** 
 * 采用MD5加密
 * @author Xingxing,Xie
 * @datetime 2014-5-31 
 */

public class MD5 {
		
		//字符串加密
	public static String getMD5(String str) throws Exception {

		String MD5 = "";

		//获取信息摘要对象:md5
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		//获取字符串的字节数组.
		byte[] bytes = str.getBytes();
		//得到摘要字节数组
		byte[] digest = md5.digest(bytes);

		for (int i = 0; i < digest.length; i++) {
			//摘要字节数组中各个字节的"十六进制"形式.
			int j = digest[i];
			j = j & 0x000000ff;
			String s1 = Integer.toHexString(j);

			if (s1.length() == 1) {
				s1 = "0" + s1;
			}
			MD5 += s1;
		}
		return MD5;
	}
} 
//文件加密
/*public static String getMD5(File file) throws Exception {
	String MD5 = "";

	MessageDigest md5 = MessageDigest.getInstance("MD5");
	FileInputStream fis = new FileInputStream(file);

	byte[] bytes = new byte[1024 * 5];

	int len = -1;
	while ((len=fis.read(bytes))!=-1) {
		//一部分一部分更新
		md5.update(bytes, 0, len);
	}
	byte[] digest = md5.digest();
	for (int i = 0; i <digest.length; i++) {
		int n = digest[i] & 0x000000ff;
		String s = Integer.toHexString(n);

		MD5 += s;
	}
	return MD5;
}
}*/
