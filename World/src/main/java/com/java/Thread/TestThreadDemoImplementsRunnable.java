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
			System.out.println(username+"���� count = "+count--);
		}
		
		try {
			//Ϊ�˲��ý��̶�ռcpu��Դ������ʹ������һ����ʱ��
			Thread.sleep((int)Math.random()*10000);
		} catch(InterruptedException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}

	}

}
