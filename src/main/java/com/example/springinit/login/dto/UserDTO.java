package com.example.springinit.login.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/*public enum UserType {
    distributor,
    retailer
}
*/
public class UserDTO {
	private int entryNo;
	private String name;
	private int contact;
	private String area;
	private String city;
	private String email;
	private String password;
	private String verifyPassword;
	//private UserType userType;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	@Override
	public String toString() {
		return "UserDTO [entryNo=" + entryNo + ", name=" + name + ", contact=" + contact + ", area=" + area + ", city="
				+ city + ", email=" + email + ", password=" + password + ", verifyPassword=" + verifyPassword + "]";
	}

	public UserDTO() {
	}

	public int getEntryNo() {
		return entryNo;
	}

	public void setEntryNo(int entryNo) {
		this.entryNo = entryNo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/*public UserType getUserType() {
	    return userType;
	}

	public void setUserType(UserType userType) {
	    this.userType = userType;
	}
	*/
	public UserDTO(int entryNo, String name,int contact, String area, String city, String password) {
		super();
		this.entryNo=entryNo;
		this.name = name;
		this.contact = contact;
		this.area = area;
		this.city = city;
		this.password = password;
		//this.userType = userType;
	}
}