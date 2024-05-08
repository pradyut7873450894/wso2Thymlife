package com.centroxy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class UserDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private String email;
	private String address;
	private String qualification;
	private String password;
	private String role;
	 
	 @Column(columnDefinition = "BYTEA")
	private byte[] image;
	
	 
	 
	 @ManyToOne
	 @JoinColumn(name="groupName")
	 private Group group;
	 
	 

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	

	 

	public UserDtls(int id, String fullName, String email, String address, String qualification, String password,
			String role, byte[] image, Group group) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.address = address;
		this.qualification = qualification;
		this.password = password;
		this.role = role;
		this.image = image;
		this.group = group;
	}

	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	

}
