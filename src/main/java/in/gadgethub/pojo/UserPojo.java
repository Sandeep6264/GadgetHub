package in.gadgethub.pojo;

public class UserPojo {
	private String userName;
	private String userEmail;
	private String mobile;
	private String Address;
	private int pinCode;
	private String password;
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public UserPojo(String userName, String userEmail, String mobile, String address, int pinCode, String password) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.mobile = mobile;
		Address = address;
		this.pinCode = pinCode;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserPojo [userName=" + userName + ", userEmail=" + userEmail + ", mobile=" + mobile + ", Address="
				+ Address + ", pinCode=" + pinCode + ", password=" + password + "]";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
