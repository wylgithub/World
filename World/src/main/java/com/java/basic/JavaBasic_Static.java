package com.java.basic;

public class JavaBasic_Static {

	//����������̬����
	private static String username;
	
	private static String password;
	
	public static int age;
	
	public static String sex;
	
	//����������̬����
	public static void getName()
	{
		System.out.println("����Java�еľ�̬������");
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
