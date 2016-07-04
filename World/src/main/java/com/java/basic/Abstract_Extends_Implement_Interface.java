package com.java.basic;

public abstract class Abstract_Extends_Implement_Interface {

	//在抽象类中添加一些变量测试
	//1、声明一个私有成员属性：编译成功
	private String username;
	
	//添加public 和protected属性
	public String password;//编译通过
	
	protected int age;//编译通过
	
	//总结： 在抽象类中的变量是可以任意声明的，可以任意使用关键字，protected,private,public等任意关键字
	
	//声明静态成员变量测试
	public static String test1;
	
	private static String test2;
	//声明静态常量
	public static final String sex = "nan";
	
	private static final String sex2 = "woman";
	
	//声明一个abstract方法
	public abstract void testAbstract();
	
	//注意： 假如在一个非abstract类中声明一个abstract方法的话必须将这个类声明为abstract类，因为抽象方法默认只能在抽象类中声明
	//测试在一个抽象类中声明非抽象方法
	public abstract void testAbs();
	
	//注意总结，假如在一个抽象类中声明了一个非抽象方法的话有两种方法是可以成功的。在你声明非抽象方法的时候，为这个方法提供实现，如下(给方法添加方法体)
	public String testAbstract1()
	{
		//添加方法体的情况是可以成功在一个抽象类中声明一个非抽象方法的，或者将该方法改为抽象方法
		System.out.println("Hello world!");
		
		return "Hello_WOrld";
	}
	
	//显示的使用abstract关键字声明抽象方法
	public abstract String getName();
	
	//添加一个final方法测试:final意思就是最终的，不可扩展的，就是说
	//一个方法假如声明为final的话，那么在该类的子类中是不可以对这个类进行重写的
	public final String getPassword(){
		return "MVC";
	}
	//注意:一个方法在设置成abstract的情况下不可以使用final修饰符修饰:
	//因为假如一个方法显示的设置成为abstract的话那么意味着在它的子类中必须对该方法提供重写，但是假如你有将该方法设置成
	//final类型的话，又限制了final在子类中不可以对该方法进行重写。彼此矛盾，因此abstract和final两者只能二选一
	//同理一个类在设置成为了abstract之后就不可以再设置成为final类型了
	
	//声明静态方法
	public abstract String getErroeMessage();
	//在抽象类中也是不可以声明静态方法的
}
