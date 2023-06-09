package runner;

import org.testng.annotations.Test;

import com.devstringx.inviteuser.InviterUserPage;
import com.devstringx.utility.BaseClass;
import com.devstringx.utility.Utility;

public class TestCases extends BaseClass {

	@Test(priority = 1)
	public void verifyInviteUserTestCase() {
		InviterUserPage iup = new InviterUserPage(webUtil);
		iup.inviteUser();

	}

	@Test(priority = 2)
	public void verifyInvitedUsersIsInTheListTestCase() {
		InviterUserPage iup = new InviterUserPage(webUtil);
		iup.verifyinvitedUserIsIntheList();

	}
}
