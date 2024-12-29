package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.Login;

public class LoginPageTest extends BaseClass {

	@Test
	public void login_to_dashBoard_And_Logout() {

		login.landing_on_dashboard_click_returnSite_back_to_Dashboard_Then_logout();
	}

	@Test
	public void login_to_Dashboard() {
		login.login();
	}

	@Test
	public void landing_on_Enroll_Now() {
		login.landing_on_Automation_Then_Click_Enroll_Now();
	}

}