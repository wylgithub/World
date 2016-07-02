package com.java.basic;

/**
 * 按照我个人的理解，假如一个类被声明为常量类(final)的话，这个类是不可以被继承的
 * @author Administrator
 *
 */
public final class Test_FinalClass {

	//声明两个属性
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
