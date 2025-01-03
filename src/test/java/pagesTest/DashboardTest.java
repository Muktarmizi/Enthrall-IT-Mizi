package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DashboardTest extends BaseClass {

	@Test
	public void landing_on_dashboard_Then_Click_side_bar_Validation() {
		
		homePage.login();
		dashboard.step_one_landing_on_dashboard_Then_click_All_Side_Bar();
		
	}

	@Test
	public void happy_path_Test() {
		dashboard.happy_path_to_Automation_Then_Click_EnrollNow_Then_input_All_Information();
	}

	@Test
	public void step_one_landing_on_automation_then_click_to_enroll_now_Page_Validation() {

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
	public void step_Two_Double_Click_to_the_Terms_and_condition() {

		homePage.landing_on_Automation_Then_Click_Enroll_Now();
		dashboard.double_Click_To_The_terms_And_Condition();

	}

	@Test
	public void step_three_Right_Click_Action_select_Back_Button() {

		homePage.landing_on_Automation_Then_Click_Enroll_Now();
		dashboard.step_one_click_Right_click_Action_Then_click_Back_Button_Then_submit_Accept();
	}

	@Test
	public void step_Four_Right_Click_Action_select_cancel_Button() {

		homePage.landing_on_Automation_Then_Click_Enroll_Now();
		dashboard.step_two_click_Right_click_Action_Then_click_Cancel_Button_Then_submit_Dismiss();

	}

	@Test
	public void step_three_Return_Back_To_Enroll_now_page_Then_find_Your_Name_From_The_Table() {

		homePage.landing_on_Automation_Then_Click_Enroll_Now();
		dashboard.step_three_Return_Back_To_Enroll_now_page_Then_find_Your_Name_From_The_Table();
	}

	@Test
	public void landing_on_Automation_To_find_Your_Name_From_The_Table() {

		dashboard.validation_Of_Automation_Page();
		dashboard.landing_on_Automation_To_find_Your_Name_From_The_Table();

	}

	@Test
	public void Enroll_Now_Page_Error_Message_And_required_field_Validation() {
		homePage.landing_on_Automation_Then_Click_Enroll_Now();
		dashboard.Enroll_Now_Page_Error_Message_And_required_field_Validation();
	}

	@Test
	public void dynamic() {
		dashboard.dynamic_Pop_up();

	}

	@Test
	public void click_ok() {
		dashboard.try_to_click_OK();

	}

	@Test
	public void first_name_Test() {
		dashboard.first_Name_validation();
	}

	@Test
	public void last_Name_Test() {
		dashboard.last_Name_validation();
	}

	@Test
	public void select_Profession_validation() {
		dashboard.select_Profession_validation();
	}

	@Test
	public void select_Course_validation() {
		dashboard.select_Course_validation();
	}

	@Test
	public void phone_Number_validation() {
		dashboard.Phone_Number_Validation();
	}

	@Test
	public void email_Validation_Test() {
		dashboard.email_Address_Validation();
	}

	@Test
	public void choose_File_Test() {
		dashboard.choose_File_Validation();
	}

	@Test
	public void choose_Photo_Test() {
		dashboard.choose_Photo_Validation();
	}

	@Test
	public void birth_Year_Test() {
		dashboard.birth_Year_Validation();
	}

	@Test
	public void birth_Month_Tets() {
		dashboard.birth_Month_Validation();
	}

	@Test
	public void birth_Day_Test() {
		dashboard.birth_Day_Validation();
	}

	@Test
	public void home_Address_Test() {
		dashboard.home_Address_Validation();
	}

	@Test
	public void city_Test() {
		dashboard.city_Validation();
	}

	@Test
	public void state_Test() {
		dashboard.state_validation();
	}

	@Test
	public void zip_Code_Test() {
		dashboard.zip_Code_Validation();

	}

	@Test
	public void signature_Test() {
		dashboard.signature_Validation();
	}

}