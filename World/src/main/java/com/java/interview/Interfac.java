package com.java.interview;

public interface Interfac {

	//接口中不能有普通数据成员，只能够有静态的不能被修改的数据成员,static表示全局，final表示不可修改，可以不用static final 修饰，会隐式的声明为static和final
	public static final int i = 100;
	
	int j = 200;
	
	//接口中的方法一定是抽象方法，所以不使用abstract关键字声明
	public void method1();
	
	//接口中的方法不能有方法的默认行为，所以不能有方法的具体实现。
	public void method2();
	
	/*总结：
	 * 简言之抽象类是一种功能不全的类，接口只是一个抽象方法声明和静态不能被修改的数据的集合，两者都不能被实例化。
　　	 * 从某种意义上说，接口是一种特殊形式的抽象类，在ｊａｖａ语言中抽象类表示的是一种继承关系，一个类只能继承继承
	一个抽象类，而一个类却可以实现多个接口。在许多情况下，接口确实可以代替抽象类，如果你不需要刻意表达属性上的继承的话。
	 * */
}
