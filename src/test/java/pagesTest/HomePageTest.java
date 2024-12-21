package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void homepageFullmenutester() {
		homePage.homePageFullMenuValidation();
	}

	@Test
	public void homePageHeaderTester() {
		homePage.ValidationOfHomePageHeader();
	}

	@Test
	public void homepageFooterTester() {
		homePage.validationOfHomePageFooter();
	}

	@Test
	public void phoneAndEmail() {
		homePage.validationOfPhoneNumberAndEmail();
	}

	@Test
	public void contactUs() {
		homePage.validationOfContactUsForm();
	}

	@Test
	public void logo() {
		homePage.logoValidation();

	}

	@Test
	public void title() {
		homePage.titleValidation();
	}

	@Test
	public void loginV() {
		homePage.validationOfLogin();
	}

}