package com.java.basic;

/**
 * �����Ҹ��˵���⣬����һ���౻����Ϊ������(final)�Ļ���������ǲ����Ա��̳е�
 * @author Administrator
 *
 */
public final class Test_FinalClass {

	//������������
	private String username;
	
	private String password;
	
	private String sex;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Test_FinalClass(String username, String password, String sex) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
	}
	
	
}
