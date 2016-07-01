package com.java.basic;

// 用于测试private，public,protected修饰的方法是不是可以被接口的实现类实现
public interface Test_Public_private_protected_Interface {

	//定义三个变量
	//private String username;//在编译期间就提示错误:llegal modifier for the interface field Test_Public_private_protected_Interface.username; only public, static & final are permitted
	//错误的原因很简单，就是说，在一个接口中声明的变量要么是public的要么是static并且是final的(静态的并且是不可以改变的)
	//public String password;//在接口中假如你要声明一个变量的而不给他提供初始值得话结构肯定会很严重，编译都是没有办法通过的吗，必须给它提供一个初始值
	public String username = "wyl";//这样的话是可以编译通过的
	
	//声明一个public static final变量
	public static final String sex = "luot";//这样声明一个变量的话是可以编译通过的，
	//注意：在这里static final可以省略不写，因为接口中声明的变量都默认是static final类型的
	
	//提供几个方法的测试
	//public修饰的方法
	public String getUsername();
	
	//private修饰的方法
	//private String getPassword();//在编译的时候就报错了，因为Interface是一个特殊的抽象类
	//抽象类中的方法一定需要被实现类重写，但是使用private修饰的方法，又不能被重写，因此在抽象类(接口)中编写private修饰的方法是错误的操作，是不能被jvm的编译器锁接受的
	
	//protected关键字修饰的方法和属性测试
	//protected关键字修饰的属性
//	protected String test_p = "wtl";//不能够被编译通过
//	protected String getMessage();//同样不能被编译通过；
}
