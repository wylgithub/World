package com.java.basic;

public class Abstract_Extends_Implement_Interface_Extends extends
		Abstract_Extends_Implement_Interface {

	//���Ե��ó���������ı�����
	
	//��ʵ�����е���private���ε�����
	//private String username = super.username;//����ʧ�ܣ�
	
	public String password = super.password;//����ͨ��
	
	//����protected���εı���
	protected int age;
	
	//������ʹ��super���ø����еľ�̬����
	//����˽�о�̬����
	//private static String test1 = super.test1;//����ʧ��
	
	//����public��̬����
	//public static String test2 = super.test2;
	
	//����static final����
	//public static final String test3 = super.sex;//�������
	
	
	@Override
	public void testAbstract() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testAbs() {
		// TODO Auto-generated method stub

	}
	//�������е����г��󷽷���Ĭ����Ҫ����������д��
	
	//���ó������еķǳ��󷽷�
	String testMethod = super.testAbstract1();
	
	//�����ǲ��ǿ�����д�������еķǳ��󷽷�
	@Override
	public String testAbstract1()
	{
		return "Son_Of_Hello_World";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	//�ڳ������ж�����û�����ʵ�ֵķ����Ļ�Ĭ�������ڳ��󷽷�����������ʾ�������ʹ��abstract�ؼ��������ķ���Ҳ�����ڳ��󷽷��ģ�������ʵ�����б�����Ӿ���ʵ�ֵ�

	@Override
	public String getErroeMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}
