package com.java.Thread;

/**
 * 测试和实现Java多线程代码:实现Java的多线程可以使用两种方式，第一红就是继承java.lang.Thread类，或者实现Runable接口。
 * @author WYL
 *
 *	这里测试的是实现继承Thread类的演示
 *	参照学习博客:http://blog.csdn.net/gf771115/article/details/51682561
 */
public class TestThreadDemo extends Thread {

	private String username;
	
	//带参数的构造函数
	public TestThreadDemo(String username)
	{
		this.username = username;
	}
	
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(username+"      run: "+i);
		}
		
		//实现进程的休眠
		try{
			//获取随机数休眠时间
			sleep((int)Math.random()*10000);
		}catch(InterruptedException ex)
		{
			//打印异常堆栈
			ex.printStackTrace();
		}
	}
}
