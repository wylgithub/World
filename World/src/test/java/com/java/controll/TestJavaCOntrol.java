package com.java.controll;

import org.junit.Test;

import com.java.control.TestControll;

public class TestJavaCOntrol {

	//����Java�еĳ�����ƹؼ���
	@Test
	public void testBreak()
	{
		//ʵ����һ��TestControll����
		TestControll tc = new TestControll();
		//���÷���ִ��
		tc.testBreak1();
	}
	
	@Test
	public void testContinue()
	{
		//ʵ����һ��TestControll����
		TestControll tc = new TestControll();
		//���÷���ִ��
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
