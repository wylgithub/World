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
		//���һ�����ʵ��
		Bird b = new Bird();
		
		//���һ���ɻ���ʵ��
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
