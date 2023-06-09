package com.devstringx.inviteuser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.devstringx.utility.Utility;

public class InviterUserPage extends InviteUserOR {
	private Utility webUtil;
String emailId="rajeshkuumarpandey@gmail.com";
	public InviterUserPage(Utility webUtil) {
		this.webUtil = webUtil;
		PageFactory.initElements(webUtil.getDriver(), this);
	}

	public void inviteUser() {
		webUtil.click(mangageUsersAndGroups, "Manage Users And Groups");
		webUtil.click(createBtn, "Create Btn");
		webUtil.click(inviteUserBtn, " Invite User Btn");
		webUtil.sendKey(emailField, "rajeshkumar@gmail.com",emailId);
		webUtil.pressEnterKey(emailField);
		webUtil.click(sendBtn, "Send Btn");
		
		
   
	}

	public void verifyinvitedUserIsIntheList() {
		webUtil.click(mangageUsersAndGroups, "Manage Users And Groups");
		webUtil.validateUserInTheList(listOfusers, emailId ); // iska dusara method banake usmae pass
																				// karana hai iska true false return
																				// karake usme use kare
	}

}
