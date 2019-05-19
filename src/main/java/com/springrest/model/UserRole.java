package com.springrest.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="userrole")
public class UserRole {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userRoleId;

  
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    @JsonIgnore
    private User user;

	public UserRole() {
		super();
	}

	public UserRole(Integer userRoleId, User user) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
