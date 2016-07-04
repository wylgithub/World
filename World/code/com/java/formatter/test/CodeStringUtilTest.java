package com.java.formatter.test;

import org.junit.Test;

import com.java.formatter.CodeStringUtil;

public class CodeStringUtilTest {

	//测试将字符串转换成驼峰四大小写
	@Test
	public void testCamelToSnacke()
	{
		String test = CodeStringUtil.camelToSnacke("helloWorldWylOpen");
		
		System.out.println(test);
	}
	
	//将下划线分割字符串变换成驼峰式大小写
	@Test
	public void testSnackToCamel()
	{
		String test = CodeStringUtil.snakeToCamel("Hello_World_Fuck_you");
		
		System.out.println(test);
	}
	
	@Test
	public void testSlashConnecString()
	{
		String conn = CodeStringUtil.combineStr(".", "http://","www","bai","do");
		
		System.out.println(conn);
	}
}
