package com.java.basic;

public abstract class Abstract_Extends_Implement_Interface {

	//�ڳ����������һЩ��������
	//1������һ��˽�г�Ա���ԣ�����ɹ�
	private String username;
	
	//���public ��protected����
	public String password;//����ͨ��
	
	protected int age;//����ͨ��
	
	//�ܽ᣺ �ڳ������еı����ǿ������������ģ���������ʹ�ùؼ��֣�protected,private,public������ؼ���
	
	//������̬��Ա��������
	public static String test1;
	
	private static String test2;
	//������̬����
	public static final String sex = "nan";
	
	private static final String sex2 = "woman";
	
	//����һ��abstract����
	public abstract void testAbstract();
	
	//ע�⣺ ������һ����abstract��������һ��abstract�����Ļ����뽫���������Ϊabstract�࣬��Ϊ���󷽷�Ĭ��ֻ���ڳ�����������
	//������һ���������������ǳ��󷽷�
	public abstract void testAbs();
	
	//ע���ܽᣬ������һ����������������һ���ǳ��󷽷��Ļ������ַ����ǿ��Գɹ��ġ����������ǳ��󷽷���ʱ��Ϊ��������ṩʵ�֣�����(��������ӷ�����)
	public String testAbstract1()
	{
		//��ӷ����������ǿ��Գɹ���һ��������������һ���ǳ��󷽷��ģ����߽��÷�����Ϊ���󷽷�
		System.out.println("Hello world!");
		
		return "Hello_WOrld";
	}
	
	//��ʾ��ʹ��abstract�ؼ����������󷽷�
	public abstract String getName();
	
	//���һ��final��������:final��˼�������յģ�������չ�ģ�����˵
	//һ��������������Ϊfinal�Ļ�����ô�ڸ�����������ǲ����Զ�����������д��
	public final String getPassword(){
		return "MVC";
	}
	//ע��:һ�����������ó�abstract������²�����ʹ��final���η�����:
	//��Ϊ����һ��������ʾ�����ó�Ϊabstract�Ļ���ô��ζ�������������б���Ը÷����ṩ��д�����Ǽ������н��÷������ó�
	//final���͵Ļ�����������final�������в����ԶԸ÷���������д���˴�ì�ܣ����abstract��final����ֻ�ܶ�ѡһ
	//ͬ��һ���������ó�Ϊ��abstract֮��Ͳ����������ó�Ϊfinal������
	
	//������̬����
	public abstract String getErroeMessage();
	//�ڳ�������Ҳ�ǲ�����������̬������
}
