package com.devstringx.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOR {
@FindBy(xpath = "//input[@id='email']")
protected WebElement emailField;

@FindBy(xpath = "//input[@id='password']")
protected WebElement passwordField;

@FindBy(xpath = "//div//button[@type='submit']")
protected WebElement LoginBtn;


@FindBy(xpath = "//div[@class='mat-mdc-menu-trigger image-cropper dropDownBtn']")
protected WebElement dropdownBtnOfLogout;

@FindBy(xpath = "//span[contains(text(),'Logout')]")
protected WebElement logOutBtn;

	
	
	
}
