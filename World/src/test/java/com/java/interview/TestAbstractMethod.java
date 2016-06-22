package com.java.interview;

import org.junit.Test;

import com.java.AbstractClass.Airplane;
import com.java.AbstractClass.Bird;

public class TestAbstractMethod {

	@Test
	public void testAbstract()
	{
		TestAbstractClassOveride atc = new TestAbstractClassOveride();
		
		atc.getUserName();
	}
	
	@Test
	public void testImpl()
	{
		InterfaceIMPL tf = new InterfaceIMPL();
		
		System.out.println(tf.extendMethod());
	}
	
	@Test
	public void testInterface()
	{
		//获得一个鸟的实例
		Bird b = new Bird();
		
		//获得一个飞机的实例
		Airplane a = new Airplane();
		
		a.fly();
		b.fly();
		
	}
	
	@Test
	public void method()
	{
		DoorImpl di = new DoorImpl();
		di.getPrint();
	}
}
