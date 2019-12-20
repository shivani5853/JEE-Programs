package com.bridgelabz.springcore.bean.prototypescope;

public class Registration {
	private String FirstName;
	private String LastName;
	private String UserName;
	private String Email;
	private String phoneNumber;

	@Override
	public String toString() {
		return "Registration [FirstName=" + FirstName + ", LastName=" + LastName + ", UserName=" + UserName + ", Email="
				+ Email + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
