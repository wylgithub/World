package com.java.basic;

import org.junit.Test;

//���ڲ���Java��������
public class TestJavaBasic {

	@Test//����private��ʹ��
	public void testJava_private()
	{
		//ʵ����һ��JavaBasic����
		JavaBasic js = new JavaBasic();
		
		//�����ǲ��ǿ��Ե��������private����(username����password)
		//js.password;
		//js.username;����ʱû�а취ͨ���ģ���Ϊһ�����ʵ��ʱû�а취���������˽�г�Ա��
		
		//���Ե����������ʹ��private���εķ���
		//js.getMessage();//��һ��Ҳ��û�а취���óɹ���,ԭ������ʹ��peivate���ε����Ի��߷������ڱ�������������඼�����صġ�
		//ֻ���ṩpublic���ε�getter����setterȥ��ȡ���ǵ�ֵ
		
		//�����ǲ��ǿ��Ե���protected���ε����Ի��߷���
		js.sex = "��";
		
		js.testProtected();
	}
	
	@Test//����˽�й��췽���µ�public��
	public void testPrivateClass()
	{
		//TestPrivateClass tpc = new TestPrivateClass();
		//��ʵ֤����һ����Ĺ��캯����������Ϊprivate��ʱ��������ʵ����һ�������ʱ��س��ֱ������
		
	}
}
