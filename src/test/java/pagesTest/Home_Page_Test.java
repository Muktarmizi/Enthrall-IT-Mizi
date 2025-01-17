package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class Home_Page_Test extends BaseClass {

	@Test
	public void logo_and_Title_url_Test() {
		
		homePage.logo_validation();
		homePage.title_and_url_validation();
	}

	@Test
	public void home_page_Valdation() {
		
		homePage.logo_validation();
		homePage.title_and_url_validation();
		homePage.landing_on_home_page_then_click_menu_section_step_one();
		homePage.click_on_home_page_footer_part_step_two();
	}

	@Test
	public void home_page_Contact_Us() {
		
		homePage.validation_of_contact_us_form_step_three();
	}

	@Test
	public void phone_Number_And_Email() {
		homePage.validation_of_phone_number_and_email();
	}

	@Test
	public void login_Test() {
		homePage.login();
	}

	@Test
	public void landing_on_Automation_Then_Click_Enroll_Now_Test() {
		homePage.landing_on_automation_then_click_enroll_now();
	}

}