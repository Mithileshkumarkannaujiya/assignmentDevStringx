package com.devstringx.inviteuser;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class InviteUserOR {

	@FindBy(xpath = "//li//a[normalize-space()='Manage Users & Groups']")
	protected WebElement mangageUsersAndGroups;

	@FindBy(xpath = "//div[normalize-space()='Create' and @id='createColumnBtn']")
	protected WebElement createBtn;

	@FindBy(xpath = "//span[normalize-space()='Invite User'   and  @id='inviteUserButton']")
	protected WebElement inviteUserBtn;

	@FindBy(xpath = "//span//input[@id='emailfield']")
	protected WebElement emailField;

	@FindBy(xpath = "//button[@id='sendbtn']")
	protected WebElement sendBtn;

	@FindBy(xpath = "//span[@class='successmsg']")
	protected WebElement succesMassageOfinvitedUser; // I have to validation of this

	@FindBy(xpath = "//i[@class='fa fa-times-circle p-3']")
	protected WebElement closeBtnOfInviteUser; 
	
	
	
	@FindBys(@FindBy(xpath = "//div[@id='userEmail']"))
	protected List<WebElement> listOfusers;

	@FindBys(@FindBy(xpath = "//div[@id='userStatus']"))
	protected List<WebElement> status;

	
}
