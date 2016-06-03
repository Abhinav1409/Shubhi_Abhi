package com.bluesapphire.view;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserRegFormView {
	
	@NotEmpty
	@Size(min=1, max=20)
	private String name;
	@NotEmpty
	@Email
	private String emailId;
	@NotEmpty
	@Size(min=7,max=30)
	private String password;
	@NotNull
	private Integer contactNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getContactNum() {
		return contactNum;
	}
	public void setContactNum(Integer contactNum) {
		this.contactNum = contactNum;
	}
	
	
}
