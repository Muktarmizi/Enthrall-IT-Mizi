package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DashboardTest extends BaseClass {

	@Test
	public void dashboard_side_bar_Validation() {
		homePage.login();
		dashboard.click_All_dashboard_Side_Bar();
		dashboard.click_on_Automation_And_validate();
	}

	@Test
	public void happy_path_Tetster() {
		dashboard.happy_path_to_Automation_then_Click_EnrollNow_Then_input_All_Information();
	}

	@Test
	public void login_happy_path_Tester() {
		dashboard.landing_on_Automation_Then_Click_Enroll_Now();
	}
	
	@Test
	public void enroll_now_Page_Validation() {
	     homePage.landing_on_Automation_Then_Click_Enroll_Now();
	     dashboard.first_Name_validation();
	     dashboard.last_Name_validation();
	     dashboard.select_Profession_validation();
	     dashboard.select_Course_validation();
	     dashboard.Phone_Number_Validation();
	     dashboard.email_Address_Validation();
	     dashboard.password_Validation();
	     dashboard.choose_File_Validation();
	     dashboard.choose_Photo_Validation();
	     dashboard.birth_Year_Validation();
	     dashboard.birth_Month_Validation();
	     dashboard.birth_Day_Validation();
	     dashboard.home_Address_Validation();
	     dashboard.city_Validation();
	     dashboard.state_validation();
	     dashboard.zip_Code_Validation();
	     dashboard.signature_Validation();
	     
	   }
	
	@Test
	public void double_Click_Check_Box_And_Right_Click_Action() {
		
		homePage.landing_on_Automation_Then_Click_Enroll_Now();
		dashboard.double_Click_on_Check_box_Then_Click_on_Agree();
		dashboard.click_Right_click_Action_Then_click_Back_Button_Then_submit_Accept();
		dashboard.click_Right_click_Action_Then_click_Back_Button_Then_submit_Dismiss();
		dashboard.back_From_Enroll_now_page_Then_find_Your_Name_From_The_Table();
	}
	
    @Test
	public void firstnameTester() {
		dashboard.first_Name_validation();
	}

	@Test
	public void lastNameTester() {
		dashboard.last_Name_validation();
	}

	@Test
	public void selectProfessionvalidation() {
		dashboard.select_Profession_validation();
	}

	@Test
	public void selectCoursevalidation() {
		dashboard.select_Course_validation();
	}

	@Test
	public void phoneNumbervalidation() {
		dashboard.Phone_Number_Validation();
	}

	@Test
	public void emaiValidationTester() {
		dashboard.email_Address_Validation();
	}

	@Test
	public void chooseFileTester() {
		dashboard.choose_File_Validation();
	}

	@Test
	public void choosePhotoTester() {
     dashboard.choose_Photo_Validation();
	}

	@Test
	public void birthYearTester() {
		dashboard.birth_Year_Validation();
	}

	@Test
	public void birthMonthTetser() {
		dashboard.birth_Month_Validation();
	}

	@Test
	public void birthDayTester() {
		dashboard.birth_Day_Validation();
	}

	@Test
	public void homeAddressTester() {
		dashboard.home_Address_Validation();
	}

	@Test
	public void cityTester() {
		dashboard.city_Validation();
	}

	@Test
	public void stateTester() {
		dashboard.state_validation();
	}

	@Test
	public void zipCodeTester() {
		dashboard.zip_Code_Validation();

	}

	@Test
	public void signatureTester() {
		dashboard.signature_Validation();
	}

	@Test
	public void checkBoxTester() {
		dashboard.double_Click_on_Check_box_Then_Click_on_Agree();
	}

	@Test
	public void clickBackButtonTester() {
		dashboard.click_Right_click_Action_Then_click_Back_Button_Then_submit_Accept();

	}

	@Test
	public void clickCancelButton() {
		dashboard.click_Right_click_Action_Then_click_Back_Button_Then_submit_Dismiss();
	}

	@Test
	public void enrollNowPageValidationTester() {
		dashboard.validation_Of_Enroll_now_Page();
	}

	@Test
	public void backButtonvalidation() {
		dashboard.back_From_Enroll_now_page_Then_find_Your_Name_From_The_Table();
	}

}