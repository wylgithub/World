package com.java.Thread;

public class TestThreadDemoImplementsRunnable implements Runnable {

	private int count = 5;
	private String username;
	
	public TestThreadDemoImplementsRunnable(String username)
	{
		this.username = username;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(username+"运行 count = "+count--);
		}
		
		try {
			//为了不让进程独占cpu资源，所以使用休眠一定的时间
			Thread.sleep((int)Math.random()*10000);
		} catch(InterruptedException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}

	}

}
