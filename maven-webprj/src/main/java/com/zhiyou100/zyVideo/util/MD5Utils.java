package com.zhiyou100.zyVideo.util;

import org.springframework.util.DigestUtils;

/**  
* @ClassName: MD5Utils  
* @Description: TODO
* @author lyb  
* @date 2017年8月27日  下午2:53:39
*    
*/ 
public class MD5Utils {

	public static String getMD5(String str){
		
		return DigestUtils.md5DigestAsHex(str.getBytes());
	}
	
	
}
