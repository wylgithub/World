package com.java.basic;

// ���ڲ���private��public,protected���εķ����ǲ��ǿ��Ա��ӿڵ�ʵ����ʵ��
public interface Test_Public_private_protected_Interface {

	//������������
	//private String username;//�ڱ����ڼ����ʾ����:llegal modifier for the interface field Test_Public_private_protected_Interface.username; only public, static & final are permitted
	//�����ԭ��ܼ򵥣�����˵����һ���ӿ��������ı���Ҫô��public��Ҫô��static������final��(��̬�Ĳ����ǲ����Ըı��)
	//public String password;//�ڽӿ��м�����Ҫ����һ�������Ķ��������ṩ��ʼֵ�û��ṹ�϶�������أ����붼��û�а취ͨ�����𣬱�������ṩһ����ʼֵ
	public String username = "wyl";//�����Ļ��ǿ��Ա���ͨ����
	
	//����һ��public static final����
	public static final String sex = "luot";//��������һ�������Ļ��ǿ��Ա���ͨ���ģ�
	//ע�⣺������static final����ʡ�Բ�д����Ϊ�ӿ��������ı�����Ĭ����static final���͵�
	
	//�ṩ���������Ĳ���
	//public���εķ���
	public String getUsername();
	
	//private���εķ���
	//private String getPassword();//�ڱ����ʱ��ͱ����ˣ���ΪInterface��һ������ĳ�����
	//�������еķ���һ����Ҫ��ʵ������д������ʹ��private���εķ������ֲ��ܱ���д������ڳ�����(�ӿ�)�б�дprivate���εķ����Ǵ���Ĳ������ǲ��ܱ�jvm�ı����������ܵ�
	
	//protected�ؼ������εķ��������Բ���
	//protected�ؼ������ε�����
//	protected String test_p = "wtl";//���ܹ�������ͨ��
//	protected String getMessage();//ͬ�����ܱ�����ͨ����
}
