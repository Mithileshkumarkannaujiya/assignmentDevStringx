package com.devstringx.login;

import org.openqa.selenium.support.PageFactory;

import com.devstringx.utility.Utility;

public class LoginPage extends LoginOR {
	private Utility webUtil;

	public LoginPage(Utility webUtil) {
		this.webUtil = webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);

	}

	public void validLogin() {
		String email = webUtil.getProObj().getProperty("username");
		webUtil.sendKey(emailField, email , "Email Field");

		String pass = webUtil.getProObj().getProperty("password");
		webUtil.sendKey(passwordField, pass ,"Password Field");
		webUtil.click(LoginBtn ,"Login Btn");
       
	}

	public void logout() {
		webUtil.click(dropdownBtnOfLogout ," drop down of logout Btn");
		webUtil.click(logOutBtn ," LogOut Btn");
	}
}
