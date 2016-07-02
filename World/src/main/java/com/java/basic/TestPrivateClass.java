/**
 * 
 */
package com.java.basic;

/**
 * @author Administrator
 *
 */
public class TestPrivateClass {

	//在声明一个类为private的时候没有对应的可选项，可选的只有public abstract,final
	//在这里可以将类的构造方法声明为private的
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
	
	//提供一个私有的构造方法
	private TestPrivateClass()
	{
		
	}
	
}
