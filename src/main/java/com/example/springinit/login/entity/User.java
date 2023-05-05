package com.example.springinit.login.entity;

//import com.example.springinit.login.dto.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="user")
public class User {
	@Id
	@Column (name="entryNo", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int entryNo;
	@Column (name="name", length = 255)
	private String name;
	@Column (name="contact", length = 255)
	private int contact;
	@Column (name="area", length = 255)
	private String area;
	@Column (name="city", length = 255)
	private String city;
	@Column (name="email", length = 255)
	private String email;
	@Column (name="password", length = 255)
	private String password;
   /* @Enumerated(EnumType.STRING) // add this annotation to map the UserType enum to a string column
    @Column(name = "user_type", length = 20) // adjust length to match the max length of the UserType values
    private UserType userType;

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}*/
	
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

	@Override
	public String toString() {
		return "User [entryNo=" + entryNo + ", name=" + name + ", contact=" + contact + ", area=" + area + ", city="
				+ city + ", email=" + email + ", password=" + password +"]";
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
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
    }
	
    public User(int entryNo,String name, int contact, String area, String city, String email, String password) {
        this.name = name;
        this.contact = contact;
        this.area = area;
        this.city = city;
        this.email=email;
        this.password = password;
        //this.userType = userType;
}
}
