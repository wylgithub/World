package com.java.Thread;

import org.junit.Test;

/**
 * 测试Java多线程
 * @author Administrator
 *
 */
public class TestThreadDemoTest {

	@Test
	public void testThreadDemo() throws InterruptedException
	{
		//初始化两个对象
		TestThreadDemo test1 = new TestThreadDemo("A");
		TestThreadDemo test2 = new TestThreadDemo("B");
		
		//启动两个线程
		//测试join()方法
		test1.join();
		test1.start();
		test2.start();
	}
	
	@Test
	public void ImplementsRunnable()
	{
		//初始化两个对象
//		TestThreadDemoImplementsRunnable test3 = new TestThreadDemoImplementsRunnable("c");
//		TestThreadDemoImplementsRunnable test2 = new TestThreadDemoImplementsRunnable("d");
//		
//		//启动进程
//		test3.run();
//		test2.run();
		
		//运行的方式有所区别
		new Thread(new TestThreadDemoImplementsRunnable("C")).start();
		new Thread(new TestThreadDemoImplementsRunnable("D")).start();
		
		//测试Thread的一些方法
		Thread th= new Thread();
	}
}
