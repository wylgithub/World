package com.java.Thread;

/**
 * ���Ժ�ʵ��Java���̴߳���:ʵ��Java�Ķ��߳̿���ʹ�����ַ�ʽ����һ����Ǽ̳�java.lang.Thread�࣬����ʵ��Runable�ӿڡ�
 * @author WYL
 *
 *	������Ե���ʵ�ּ̳�Thread�����ʾ
 *	����ѧϰ����:http://blog.csdn.net/gf771115/article/details/51682561
 */
public class TestThreadDemo extends Thread {

	private String username;
	
	//�������Ĺ��캯��
	public TestThreadDemo(String username)
	{
		this.username = username;
	}
	
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(username+"      run: "+i);
		}
		
		//ʵ�ֽ��̵�����
		try{
			//��ȡ���������ʱ��
			sleep((int)Math.random()*10000);
		}catch(InterruptedException ex)
		{
			//��ӡ�쳣��ջ
			ex.printStackTrace();
		}
	}
}
