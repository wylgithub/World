package tt;

public class MyBean {

	// 创建几个变量
	private String mUserName;	//用户名
	private String password;	//密码
	private String passwordAgain;	//再次输入密码
	private String phoneNumber;	//手机号码
	private String sex;	//性别

	//分别设置getter和setter方法
	public String getmUserName() {
		return mUserName;
	}

	public void setmUserName(String mUserName) {
		this.mUserName = mUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
