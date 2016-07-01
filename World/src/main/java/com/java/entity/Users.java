package com.java.entity;

import javax.persistence.Entity;

/**
 * ����û�ʵ����
 * @author Administrator
 *
 */
@Entity
public class Users {
	
	//�û����
	private String Id;

	//�û���
	private String username;
	
	//����
	private String password;
	
	//����
	private String email;
	
	//�ֻ�
	private String phoneNumber;
	
	//��ͥסַ
	private String address;
	
	//����
	private int age;
	
	//���ɶ�Ӧ��getter��setter
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//�ṩһ���޲����Ĺ��캯��
	public Users()
	{
		
	}

	//�ṩһ��ȫ�����Ĺ��캯��
	public Users(String id, String username, String password, String email,
			String phoneNumber, String address, int age) {
		//super();
		Id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age = age;
	}

	//Ϊ�˱��ڲ���,�����дtoString()����
	@Override
	public String toString() {
		return "Users [Id=" + Id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", age=" + age + "]";
	}

	//��дequals��hashCode����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
