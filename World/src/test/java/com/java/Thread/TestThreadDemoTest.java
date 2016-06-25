package com.java.Thread;

import org.junit.Test;

/**
 * ����Java���߳�
 * @author Administrator
 *
 */
public class TestThreadDemoTest {

	@Test
	public void testThreadDemo() throws InterruptedException
	{
		//��ʼ����������
		TestThreadDemo test1 = new TestThreadDemo("A");
		TestThreadDemo test2 = new TestThreadDemo("B");
		
		//���������߳�
		//����join()����
		test1.join();
		test1.start();
		test2.start();
	}
	
	@Test
	public void ImplementsRunnable()
	{
		//��ʼ����������
//		TestThreadDemoImplementsRunnable test3 = new TestThreadDemoImplementsRunnable("c");
//		TestThreadDemoImplementsRunnable test2 = new TestThreadDemoImplementsRunnable("d");
//		
//		//��������
//		test3.run();
//		test2.run();
		
		//���еķ�ʽ��������
		new Thread(new TestThreadDemoImplementsRunnable("C")).start();
		new Thread(new TestThreadDemoImplementsRunnable("D")).start();
		
		//����Thread��һЩ����
		Thread th= new Thread();
	}
}
