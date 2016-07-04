package com.java.basic;

public class Abstract_Extends_Implement_Interface_Extends extends
		Abstract_Extends_Implement_Interface {

	//测试调用抽象类里面的变量：
	
	//在实现类中调用private修饰的属性
	//private String username = super.username;//编译失败，
	
	public String password = super.password;//编译通过
	
	//调用protected修饰的变量
	protected int age;
	
	//不可以使用super调用父类中的静态变量
	//调用私有静态变量
	//private static String test1 = super.test1;//编译失败
	
	//调用public静态变量
	//public static String test2 = super.test2;
	
	//调用static final常量
	//public static final String test3 = super.sex;//编译错误
	
	
	@Override
	public void testAbstract() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testAbs() {
		// TODO Auto-generated method stub

	}
	//抽象类中的所有抽象方法都默认是要在子类中重写的
	
	//调用抽象类中的非抽象方法
	String testMethod = super.testAbstract1();
	
	//看看是不是可以重写抽象类中的非抽象方法
	@Override
	public String testAbstract1()
	{
		return "Son_Of_Hello_World";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	//在抽象类中定义了没有添加实现的方法的话默认是属于抽象方法，但是你显示的添加了使用abstract关键字声明的方法也是属于抽象方法的，在它的实现类中必须添加具体实现的

	@Override
	public String getErroeMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}
