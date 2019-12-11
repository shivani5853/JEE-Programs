package com.bridgelabz.loginregistrationOne.model;

public class PersonDetails {
	private String firstName;
	private String lastname;
	private String emailId;
	private String userName;
	private String password;
	private String phoneNumber;
	private String conformPassword;
	
	public String getConformPassword() {
		return conformPassword;
	}

	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "PersonDetails [firstName=" + firstName + ", lastname=" + lastname + ", emailId=" + emailId
				+ ", userName=" + userName + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", conformPassword=" + conformPassword + "]";
	}

	
}
