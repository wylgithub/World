package com.java.basic;

/*Java����ѧϰ:private��public,procted�ؼ��ֵ�ʹ�÷���
 * 
 * */
public class JavaBasic {
	//����private�ؼ��ֵ�ѧϰ
	private String username;
	private String password;
	public int age;
	protected String sex;//�Ա�
	
	//����һ����̬�����ڲ��������̬������ֵ�Ļ�����������һ����̬����
	public static String number;
	
	//����һ����̬����
	public static final String hello = "mosquito";
	//��Ȼ�Ѿ���һ����̬��������ô�㲻�����������ֵ�Ļ��ͻ���뱨��
	
	//�޲����Ĺ��췽��
	public JavaBasic()
	{
		
	}
	
	//����һ��private ���εķ���
	private String getMessage(String username)
	{
		System.out.println("�������ڲ���private�ؼ������η����Ĺؼ��֡�");
		
		return username;
	}
	
	//Ϊ˽�б����ṩgetter��setter
	public String getUserName()
	{
		return username;
	}
	
	public void setUserName(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	//����һ��protected����
	protected String testProtected()
	{
		return "Hello woorld";
	}
	
	//����һ���Ǿ�̬�����ǲ��ǿ�������һ����̬����
	public String getNumber()
	{
		return number;
	}
	//֤��һ���Ǿ�̬�����ǿ�������һ����̬������
	
	//����һ����̬���������ǲ��ǿ��Բ�ʹ�÷Ǿ�̬����
	public static String getName()
	{
//		String test = username;
		//���Եó���һ����̬���������ǲ�����ʹ�÷Ǿ�̬�����ġ�
		String test = number;//����ͨ��
		
		return test;
	}
}
