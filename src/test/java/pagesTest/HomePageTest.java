package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void home_page_Menu_Section() {
		homePage.home_page_Menu_Section();
	}

	@Test
	public void home_page_Validation() {
		homePage.home_Page_Full_Menu_Validation();
	}

	@Test
	public void home_page_Footer() {
		homePage.home_page_Footer_part();
	}

	@Test
	public void phone_And_Email() {
		homePage.validation_Of_PhoneNumber_And_Email();
	}

	@Test
	public void contact_Us() {
		homePage.validation_Of_Contact_Us_Form();
	}

	@Test
	public void logo() {
		homePage.logo_Validation();

	}

	@Test
	public void title() {
		homePage.title_validation();
	}

	@Test
	public void login() {
		homePage.login();
	}

}