package com.maxis.ebdautoassignmentbatch.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ebd_user")
public class EbdUserEntity {

	@Override
	public String toString() {
		return "EbdUserEntity [id=" + id + ", userId=" + userId + ", passWord=" + passWord + ", name=" + name
				+ ", title=" + title + ", dob=" + dob + ", icType=" + icType + ", icNo=" + icNo + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", phoneNo=" + phoneNo + ", faxNo=" + faxNo + ", companyName="
				+ companyName + ", statusId=" + statusId + ", remarks=" + remarks + ", roleId=" + roleId + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", postCode=" + postCode + ", state=" + state
				+ ", countryId=" + countryId + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified
				+ ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", rollUp=" + rollUp + ", pwdCreatedDate="
				+ pwdCreatedDate + ", pwdExpiryDate=" + pwdExpiryDate + ", noOfAttempts=" + noOfAttempts
				+ ", acctMgrId=" + acctMgrId + ", policyId=" + policyId + ", dealerCode=" + dealerCode + ", isBpu="
				+ isBpu + ", industryId=" + industryId + ", kenanId=" + kenanId + ", exceptionalApproval="
				+ exceptionalApproval + ", passwordHistroy=" + passwordHistroy + ", bizFibre=" + bizFibre + ", region="
				+ region + ", accessPerm=" + accessPerm + ", isHomc=" + isHomc + "]";
	}

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "PASSWORD")
	private String passWord;

	@Column(name = "NAME")
	private String name;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "IC_TYPE")
	private String icType;

	@Column(name = "IC_NO")
	private String icNo;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_NO")
	private String mobileNo;

	@Column(name = "PHONE_NO")
	private String phoneNo;

	@Column(name = "FAX_NO")
	private String faxNo;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "STATUS_ID")
	private Integer statusId;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "ROLE_ID")
	private Long roleId;

	@Column(name = "ADDRESS1")
	private String address1;

	@Column(name = "ADDRESS2")
	private String address2;

	@Column(name = "CITY")
	private String city;

	@Column(name = "POST_CODE")
	private String postCode;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY_ID")
	private Long countryId;

	@Column(name = "DATE_CREATED")
	private Date dateCreated;

	@Column(name = "DATE_MODIFIED")
	private Date dateModified;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "ROLLUP")
	private String rollUp;

	@Column(name = "PWD_CREATED_DATE")
	private Date pwdCreatedDate;

	@Column(name = "PWD_EXPIRY_DATE")
	private Date pwdExpiryDate;

	@Column(name = "NO_OF_ATTEMPTS")
	private Long noOfAttempts;

	@Column(name = "ACCT_MGR_ID")
	private Integer acctMgrId;

	@Column(name = "POLICY_ID")
	private Integer policyId;

	@Column(name = "DEALER_CODE")
	private String dealerCode;

	@Column(name = "IS_BPU")
	private String isBpu;

	@Column(name = "INDUSTRY_ID")
	private Long industryId;

	@Column(name = "KENAN_ID")
	private String kenanId;

	@Column(name = "EXCEPTIONAL_APPROVAL")
	private String exceptionalApproval;

	@Column(name = "PASSWORD_HISTROY")
	private String passwordHistroy;

	@Column(name = "BIZ_FIBRE")
	private String bizFibre;

	@Column(name = "REGION")
	private String region;

	@Column(name = "ACCESS_PERM")
	private String accessPerm;

	@Column(name = "IS_HOMC")

	private String isHomc;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getIcType() {
		return icType;
	}

	public void setIcType(String icType) {
		this.icType = icType;
	}

	public String getIcNo() {
		return icNo;
	}

	public void setIcNo(String icNo) {
		this.icNo = icNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getRollUp() {
		return rollUp;
	}

	public void setRollUp(String rollUp) {
		this.rollUp = rollUp;
	}

	public Date getPwdCreatedDate() {
		return pwdCreatedDate;
	}

	public void setPwdCreatedDate(Date pwdCreatedDate) {
		this.pwdCreatedDate = pwdCreatedDate;
	}

	public Date getPwdExpiryDate() {
		return pwdExpiryDate;
	}

	public void setPwdExpiryDate(Date pwdExpiryDate) {
		this.pwdExpiryDate = pwdExpiryDate;
	}

	public Long getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(Long noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	public Integer getAcctMgrId() {
		return acctMgrId;
	}

	public void setAcctMgrId(Integer acctMgrId) {
		this.acctMgrId = acctMgrId;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getDealerCode() {
		return dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	public String getIsBpu() {
		return isBpu;
	}

	public void setIsBpu(String isBpu) {
		this.isBpu = isBpu;
	}

	public Long getIndustryId() {
		return industryId;
	}

	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}

	public String getKenanId() {
		return kenanId;
	}

	public void setKenanId(String kenanId) {
		this.kenanId = kenanId;
	}

	public String getExceptionalApproval() {
		return exceptionalApproval;
	}

	public void setExceptionalApproval(String exceptionalApproval) {
		this.exceptionalApproval = exceptionalApproval;
	}

	public String getPasswordHistroy() {
		return passwordHistroy;
	}

	public void setPasswordHistroy(String passwordHistroy) {
		this.passwordHistroy = passwordHistroy;
	}

	public String getBizFibre() {
		return bizFibre;
	}

	public void setBizFibre(String bizFibre) {
		this.bizFibre = bizFibre;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAccessPerm() {
		return accessPerm;
	}

	public void setAccessPerm(String accessPerm) {
		this.accessPerm = accessPerm;
	}

	public String getIsHomc() {
		return isHomc;
	}

	public void setIsHomc(String isHomc) {
		this.isHomc = isHomc;
	}

}
