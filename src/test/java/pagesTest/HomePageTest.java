package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void logo_and_Title_Test() {
		homePage.logo_Validation();
		homePage.title_And_Url_validation();
	}

	@Test
	public void home_page_Valdation() {
		homePage.logo_Validation();
		homePage.title_And_Url_validation();
		homePage.landing_on_home_page_Then_Click_Menu_Section_step_one();
		homePage.click_on_Home_page_Footer_part_step_two();
	}

	@Test
	public void home_page_Contact_Us() {
		homePage.validation_Of_Contact_Us_Form_Step_three();
	}

	@Test
	public void phone_Number_And_Email() {
		homePage.validation_Of_PhoneNumber_And_Email();
	}

	@Test
	public void login_Test() {
		homePage.login();
	}

	@Test
	public void landing_on_Automation_Then_Click_Enroll_Now_Test() {
		homePage.landing_on_Automation_Then_Click_Enroll_Now();
	}

}