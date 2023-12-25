package com.mkpits.inheritance;

public class GetOtherDetails extends GetUserDetails {

	String mobile, gender, pinCode, details;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getDetails() {
		return "GetUserDetails [fName= " + fName + ", lName= " + lName + ", email= " + email
				+ "]  \nGetOtherDetails [mobile=" + mobile + ", gender=" + gender + ", pinCode=" + pinCode
				+ ", details=" + details + "]";
	}

}
