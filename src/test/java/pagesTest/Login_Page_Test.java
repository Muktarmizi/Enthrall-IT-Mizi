package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class Login_Page_Test extends BaseClass {

	@Test
	public void login_to_Dashboard() {
		login.login();
	}

	@Test
	public void login_to_dashBoard_And_Logout() {
		login.landing_on_dashboard_then_click_return_site_then_back_to_dashboard_then_logout();
	}

	@Test
	public void step_one_click_Automation_step_two_click_Enroll_Now() {
		login.landing_on_automation_then_click_enroll_now();
	}

}



