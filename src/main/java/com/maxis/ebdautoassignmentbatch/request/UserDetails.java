package com.maxis.ebdautoassignmentbatch.request;

public class UserDetails {
	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", email=" + email + ", mobileno=" + mobileno + ", dealercode="
				+ dealercode + ", companyname=" + companyname + "]";
	}

	private String userId;
	
	private String email;
	
	private String mobileno;
	
	private String dealercode;
	
	private String companyname;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getDealercode() {
		return dealercode;
	}

	public void setDealercode(String dealercode) {
		this.dealercode = dealercode;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	
}
