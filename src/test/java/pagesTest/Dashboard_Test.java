package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class Dashboard_Test extends BaseClass {

	@Test
	public void landing_on_dashboard_then_click_side_bar_validation() {

		homePage.login();
		dashboard.step_one_landing_on_dashboard_then_click_all_side_bar();

	}

	@Test
	public void happy_path_test() {
		
		dashboard.happy_path_to_automation_then_click_enroll_now_then_input_all_information();
	}

	@Test
	public void step_one_landing_on_automation_then_click_to_enroll_now_page_for_validation() {

		homePage.landing_on_automation_then_click_enroll_now();
		dashboard.first_name_validation();
		dashboard.last_name_validation();
		dashboard.select_profession_validation();
		dashboard.select_course_validation();
		dashboard.phone_number_validation();
		dashboard.email_address_validation();
		dashboard.password_validation();
		dashboard.choose_file_validation();
		dashboard.choose_photo_validation();
		dashboard.birth_year_validation();
		dashboard.birth_month_validation();
		dashboard.birth_day_validation();
		dashboard.home_address_validation();
		dashboard.city_validation();
		dashboard.state_validation();
		dashboard.zip_code_validation();
		dashboard.signature_validation();

	}

	@Test
	public void step_two_double_click_to_the_terms_and_condition() {

		homePage.landing_on_automation_then_click_enroll_now();
		dashboard.double_click_to_the_terms_and_condition();

	}

	@Test
	public void step_three_right_click_action_select_back_button() {

		homePage.landing_on_automation_then_click_enroll_now();
		dashboard.step_one_click_right_click_action_then_click_back_button_then_submit_accept();
	}

	@Test
	public void step_four_right_click_action_select_cancel_button() {

		homePage.landing_on_automation_then_click_enroll_now();
		dashboard.step_two_click_right_click_action_then_click_cancel_button_then_submit_dismiss();

	}

	@Test
	public void step_three_return_back_to_enroll_now_page_then_find_your_name_from_the_table() {

		homePage.landing_on_automation_then_click_enroll_now();
		dashboard.step_three_return_back_To_enroll_now_page_then_find_your_name_from_the_table();
	}

	@Test
	public void landing_on_automation_to_find_your_name_from_the_table() {

		dashboard.validation_of_automation_page();
		dashboard.landing_on_automation_to_find_your_name_from_the_table();

	}

	@Test
	public void enroll_now_page_error_message_and_required_field_validation() {

		homePage.landing_on_automation_then_click_enroll_now();
		dashboard.enroll_now_page_error_message_and_required_field_validation();
	}

	@Test
	public void first_name_Test() {
		dashboard.first_name_validation();
	}

	@Test
	public void last_name_test() {
		dashboard.last_name_validation();
	}

	@Test
	public void select_profession_validation() {
		dashboard.select_profession_validation();
	}

	@Test
	public void select_course_validation() {
		dashboard.select_course_validation();
	}

	@Test
	public void phone_number_validation() {
		dashboard.phone_number_validation();
	}

	@Test
	public void email_validation_test() {
		dashboard.email_address_validation();
	}

	@Test
	public void choose_file_test() {
		dashboard.choose_file_validation();
	}

	@Test
	public void choose_photo_test() {
		dashboard.choose_photo_validation();
	}

	@Test
	public void birth_year_test() {
		dashboard.birth_year_validation();
	}

	@Test
	public void birth_month_test() {
		dashboard.birth_month_validation();
	}

	@Test
	public void birth_day_test() {
		dashboard.birth_day_validation();
	}

	@Test
	public void home_address_test() {
		dashboard.home_address_validation();
	}

	@Test
	public void city_test() {
		dashboard.city_validation();
	}

	@Test
	public void state_test() {
		dashboard.state_validation();
	}

	@Test
	public void zip_Code_test() {
		dashboard.zip_code_validation();

	}

	@Test
	public void signature_test() {
		dashboard.signature_validation();
	}
	

	
	
	
	

	/*
	 * @Test public void dynamic() { dashboard.dynamic_pop_up();
	 * 
	 * }
	 * 
	 * @Test public void click_ok() { dashboard.try_to_click_oK();
	 * 
	 * }
	 */

}