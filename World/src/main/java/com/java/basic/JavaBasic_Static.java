package com.java.basic;

public class JavaBasic_Static {

	//声明两个静态变量
	private static String username;
	
	private static String password;
	
	public static int age;
	
	public static String sex;
	
	//声明两个静态方法
	public static void getName()
	{
		System.out.println("测试Java中的静态方法！");
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		JavaBasic_Static.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		JavaBasic_Static.password = password;
	}
}
