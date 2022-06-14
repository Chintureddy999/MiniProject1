package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="abstract_users")
public class AbstractUser {
	@Id
	private String username;
@Column
	private String password;
@Column
	private String Address;
@Column
	private String mobileNumber;
@Column
	private String email;

public AbstractUser(String username2, String password2, String address2, String mobileNumber2, String email2) {
	// TODO Auto-generated constructor stub
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "AbstractUser [username=" + username + ", password=" + password + ", Address=" + Address + ", mobileNumber="
			+ mobileNumber + ", email=" + email + "]";
}

}

