package com.springrest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;



@Entity
@Table(name="user")
public class User {
	@Id
	private int userId;
	private String userName;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<UserRole> role=new ArrayList<UserRole>();
	
	public User() {
		super();
	}
	
	

	public User(int userId, String userName, Address address,
			Collection<UserRole> authorities) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.role = role;
	}



	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<UserRole> getRole() {
		return role;
	}
	public void setRole(List<UserRole> role) {
		this.role = role;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}
	

}
