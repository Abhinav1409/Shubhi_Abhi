package com.bluesapphire.view;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginView {
	
	@NotEmpty @Size(min=1, max=20)
	private String loginId;
	
	@NotEmpty @Size(min=7, max=30)
	//@Pattern(regexp="(A-Za-z0-9)*")
	private String password;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
