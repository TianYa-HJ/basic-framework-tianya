package com.tianya.basicframework.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class TestCaseTools {

	/**
	 * 文件内容转换为String
	 * @param fileName
	 * @return
	 */
	public static String readTxtToString(String fileName){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			InputStream in = TestCaseTools.class.getClassLoader().getResourceAsStream(fileName);
	        int i=-1;
	        while((i=in.read())!=-1){
	        	baos.write(i);
	        } 
		}catch (Exception e){
			return null;
		}
		return baos.toString();
	}
}
