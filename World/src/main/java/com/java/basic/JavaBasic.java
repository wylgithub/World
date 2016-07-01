package com.java.basic;

/*Java基础学习:private，public,procted关键字的使用分析
 * 
 * */
public class JavaBasic {
	//测试private关键字的学习
	private String username;
	private String password;
	public int age;
	protected String sex;//性别
	
	//设置一个静态变量在不给这个静态变量赋值的话，它仅仅是一个静态变量
	public static String number;
	
	//设置一个静态常量
	public static final String hello = "mosquito";
	//既然已经是一个静态常量，那么你不给这个常量赋值的话就会编译报错
	
	//无参数的构造方法
	public JavaBasic()
	{
		
	}
	
	//声明一个private 修饰的方法
	private String getMessage(String username)
	{
		System.out.println("我是用于测试private关键字修饰方法的关键字。");
		
		return username;
	}
	
	//为私有变量提供getter和setter
	public String getUserName()
	{
		return username;
	}
	
	public void setUserName(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	//声明一个protected方法
	protected String testProtected()
	{
		return "Hello woorld";
	}
	
	//测试一个非静态方法是不是可以引用一个静态变量
	public String getNumber()
	{
		return number;
	}
	//证明一个非静态方法是可以引用一个静态变量的
	
	//测试一个静态方法里面是不是可以不使用非静态变量
	public static String getName()
	{
//		String test = username;
		//测试得出在一个静态方法里面是不可以使用非静态变量的。
		String test = number;//编译通过
		
		return test;
	}
}
