package com.java.basic;

//使用Java的继承测试
public class JavaBasic_Private_Public_Protected extends JavaBasic implements Test_Public_private_protected_Interface{

	//在子类中查看是不是可以调用父类中的变量
	//测试是不是可以调用父类中的private修饰的方法和变量
	//private String username = super.username;//这一句调用时编译错误，证明private修饰的变量在子类中也睡不可见得
	
	//测试子类中是不是可以调用父类中的private修饰的方法
	//String testUsername = super.getMessage(username);//这一句调用显示，父类中使用private修饰的方法是不可以被子类可见的
	
	//测试public修饰的方法和属性是不是对子类可见
	int age = super.age;//说明父类中的public修饰的属性对于子类是可见的
	String test_Username = super.getUserName();//说明父类中使用public修饰的方法对于子类是可见的
	
	//测试使用protected修饰的方法和属性是不是对于子类可见
	String protected_ttest = super.sex;//属性可见
	String protected_method = super.testProtected();//方法可见
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 对Java中的private,public,protected三个关键字的总结如下:
	 * 
	 * private修饰的属性和方法对于本类(本包可见，但是对于子类或者该类的实例化对象是没有可见性的)
	 * 
	 * public修饰的属性和方法对于不管是接口或者类的实例化对象都是可见的，因此public的权限是最大的，可以被一切对象可见
	 * 
	 * protected修饰符修饰的属性或者方法对于类的实例化对象是可见的，而且对于子类的继承也是可见的。
	 */
	
	/**
	 * 在接口测试中：
	 * 
	 * 在一个接口中是不可以使用private ,protected去修饰 一个变量或者方法的，因为这样会导致编译阶段就发生错误
	 * 
	 * 而且Interface是属于一个Java中的特殊抽象类，，然而一个接口里面的所有方法都必须在它的实现类中被重写，假如
	 * 
	 * 一个方法或者一个属性被设置成private，或者protected的类型之后是不可以被使用和重写的。
	 * 
	 * 还有一个很重要的注意点是：
	 * 
	 * 接口中的所有的方法都默认是abstract(抽象)的，所有变量都是属于static final的为final就是说这个变量你使用
	 * final修饰之后就必须为其赋值，假如不赋值就会编译失败。
	 * 
	 * final的意思就是最终的，不可以改变的。
	 */
}
