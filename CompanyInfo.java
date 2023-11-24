package com.whydigit.efit.entity;


import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "companyinfo")
@Data

public class CompanyInfo {
   @Id
   @Column(name = "company_id", length = 45)
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int companyID;

   @Column(name = "company_name", length = 100, nullable = false)
   private String companyName;

   @Column(name = "company_address", length = 150, nullable = false)
   private String companyAddress;

   @Column(name = "contact_number", length = 11)
   private String contactNumber;

public int getCompanyID() {
	return companyID;
}

public void setCompanyID(int companyID) {
	this.companyID = companyID;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getCompanyAddress() {
	return companyAddress;
}

public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
}

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public CompanyInfo(int companyID, String companyName, String companyAddress, String contactNumber) {
	super();
	this.companyID = companyID;
	this.companyName = companyName;
	this.companyAddress = companyAddress;
	this.contactNumber = contactNumber;
}

@Override
public String toString() {
	return "CompanyInfo [companyID=" + companyID + ", companyName=" + companyName + ", companyAddress=" + companyAddress
			+ ", contactNumber=" + contactNumber + "]";
}

public CompanyInfo() {
	super();
	// TODO Auto-generated constructor stub
}
   
   

  
}