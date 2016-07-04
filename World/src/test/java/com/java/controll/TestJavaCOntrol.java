package com.java.controll;

import org.junit.Test;

import com.java.control.TestControll;

public class TestJavaCOntrol {

	//测试Java中的程序控制关键字
	@Test
	public void testBreak()
	{
		//实例化一个TestControll对象
		TestControll tc = new TestControll();
		//调用方法执行
		tc.testBreak1();
	}
	
	@Test
	public void testContinue()
	{
		//实例化一个TestControll对象
		TestControll tc = new TestControll();
		//调用方法执行
		tc.testContinue1();
		
	}
	
	@Test
	public void testReturn()
	{
		TestControll tc = new TestControll();
		String test = tc.testReturn();
		System.out.println(test);
	}
	
	@Test
	public void testDoWhile()
	{
		TestControll tc = new TestControll();
		tc.testDoWhile();
	}
	
	@Test
	public void testIfElse()
	{
		TestControll tc = new TestControll();
		tc.testIfElse();
	}
}
