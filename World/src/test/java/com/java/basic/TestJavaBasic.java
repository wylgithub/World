package com.java.basic;

import org.junit.Test;

//用于测试Java基础的类
public class TestJavaBasic {

	@Test//测试private的使用
	public void testJava_private()
	{
		//实例化一个JavaBasic对象
		JavaBasic js = new JavaBasic();
		
		//测试是不是可以调用里面的private属性(username或者password)
		//js.password;
		//js.username;编译时没有办法通过的，因为一个类的实例时没有办法调用里面的私有成员的
		
		//测试调用类里面的使用private修饰的方法
		//js.getMessage();//这一句也是没有办法调用成功的,原因在于使用peivate修饰的属性或者方法对于本类以外的所有类都是隐藏的。
		//只有提供public修饰的getter或者setter去获取他们的值
		
		//测试是不是可以调用protected修饰的属性或者方法
		js.sex = "男";
		
		js.testProtected();
	}
	
	@Test//测试私有构造方法下的public类
	public void testPrivateClass()
	{
		//TestPrivateClass tpc = new TestPrivateClass();
		//事实证明当一个类的构造函数把它声明为private的时候，这个类的实例化一个对象的时候回出现编译错误。
		
	}
}
