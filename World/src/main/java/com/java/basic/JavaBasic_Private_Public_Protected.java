package com.java.basic;

//ʹ��Java�ļ̳в���
public class JavaBasic_Private_Public_Protected extends JavaBasic implements Test_Public_private_protected_Interface{

	//�������в鿴�ǲ��ǿ��Ե��ø����еı���
	//�����ǲ��ǿ��Ե��ø����е�private���εķ����ͱ���
	//private String username = super.username;//��һ�����ʱ�������֤��private���εı�����������Ҳ˯���ɼ���
	
	//�����������ǲ��ǿ��Ե��ø����е�private���εķ���
	//String testUsername = super.getMessage(username);//��һ�������ʾ��������ʹ��private���εķ����ǲ����Ա�����ɼ���
	
	//����public���εķ����������ǲ��Ƕ�����ɼ�
	int age = super.age;//˵�������е�public���ε����Զ��������ǿɼ���
	String test_Username = super.getUserName();//˵��������ʹ��public���εķ������������ǿɼ���
	
	//����ʹ��protected���εķ����������ǲ��Ƕ�������ɼ�
	String protected_ttest = super.sex;//���Կɼ�
	String protected_method = super.testProtected();//�����ɼ�
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * ��Java�е�private,public,protected�����ؼ��ֵ��ܽ�����:
	 * 
	 * private���ε����Ժͷ������ڱ���(�����ɼ������Ƕ���������߸����ʵ����������û�пɼ��Ե�)
	 * 
	 * public���ε����Ժͷ������ڲ����ǽӿڻ������ʵ���������ǿɼ��ģ����public��Ȩ�������ģ����Ա�һ�ж���ɼ�
	 * 
	 * protected���η����ε����Ի��߷����������ʵ���������ǿɼ��ģ����Ҷ�������ļ̳�Ҳ�ǿɼ��ġ�
	 */
	
	/**
	 * �ڽӿڲ����У�
	 * 
	 * ��һ���ӿ����ǲ�����ʹ��private ,protectedȥ���� һ���������߷����ģ���Ϊ�����ᵼ�±���׶ξͷ�������
	 * 
	 * ����Interface������һ��Java�е���������࣬��Ȼ��һ���ӿ���������з���������������ʵ�����б���д������
	 * 
	 * һ����������һ�����Ա����ó�private������protected������֮���ǲ����Ա�ʹ�ú���д�ġ�
	 * 
	 * ����һ������Ҫ��ע����ǣ�
	 * 
	 * �ӿ��е����еķ�����Ĭ����abstract(����)�ģ����б�����������static final��Ϊfinal����˵���������ʹ��
	 * final����֮��ͱ���Ϊ�丳ֵ�����粻��ֵ�ͻ����ʧ�ܡ�
	 * 
	 * final����˼�������յģ������Ըı�ġ�
	 */
}
