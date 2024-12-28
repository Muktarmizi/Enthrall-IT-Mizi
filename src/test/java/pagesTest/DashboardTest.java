package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DashboardTest extends BaseClass {

	@Test
	public void dashboardTester() {
		dashboard.dashbordSidebar();
	}

	@Test
	public void automationTetser() {
		dashboard.automationFullValidation();

	}

	@Test
	public void happypathTetster() {
		dashboard.automationHappyPath();
	}

	@Test
	public void loginhappypathTester() {
		dashboard.logIntoEnrollNowHappypath();
	}
	
	@Test
	public void enrollNowFinalvalidationTester() {
		dashboard.enrollPageFinalValidation();
	}

	@Test
	public void firstnameTester() {
		dashboard.firstNamevalidation();
	}

	@Test
	public void lastNameTester() {
		dashboard.lastNamevalidation();
	}

	@Test
	public void selectProfessionvalidation() {
		dashboard.selectProfessionvalidation();
	}

	@Test
	public void selectCoursevalidation() {
		dashboard.selectCoursevalidation();
	}

	@Test
	public void phoneNumbervalidation() {
		dashboard.PhoneNumberValidation();
	}

	@Test
	public void emaiValidationTester() {
		dashboard.emailAddressValidation();
	}

	@Test
	public void chooseFileTester() {
		dashboard.chooseFileValidation();
	}

	@Test
	public void choosePhotoTester() {

	}

	@Test
	public void birthYearTester() {
		dashboard.birthYearValidation();
	}

	@Test
	public void birthMonthTetser() {
		dashboard.birthmonthValidation();
	}

	@Test
	public void birthDayTester() {
		dashboard.birthDayValidation();
	}

	@Test
	public void homeAddressTester() {
		dashboard.homeAddressValidation();
	}

	@Test
	public void cityTester() {
		dashboard.cityValidation();
	}

	@Test
	public void stateTester() {
		dashboard.statevalidation();
	}

	@Test
	public void zipCodeTester() {
		dashboard.zipCodeValidation();

	}

	@Test
	public void signatureTester() {
		dashboard.signatureValidation();
	}

	@Test
	public void checkBoxTester() {
		dashboard.checkBoxClickVlaidation();
	}

	@Test
	public void clickBackButtonTester() {
		dashboard.clickBackButton();
	}

	@Test
	public void clickCancelButton() {
		dashboard.clickCancelButton();
	}

	@Test
	public void enrollNowPageValidationTester() {
		dashboard.validationOfEnrollnowPage();
	}

	@Test
	public void backButtonvalidation() {
		dashboard.clickBackButton();
	}

}