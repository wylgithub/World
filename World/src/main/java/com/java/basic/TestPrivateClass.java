/**
 * 
 */
package com.java.basic;

/**
 * @author Administrator
 *
 */
public class TestPrivateClass {

	//������һ����Ϊprivate��ʱ��û�ж�Ӧ�Ŀ�ѡ���ѡ��ֻ��public abstract,final
	//��������Խ���Ĺ��췽������Ϊprivate��
	private String username;
	
	private String password;
	
	public int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//�ṩһ��˽�еĹ��췽��
	private TestPrivateClass()
	{
		
	}
	
}
