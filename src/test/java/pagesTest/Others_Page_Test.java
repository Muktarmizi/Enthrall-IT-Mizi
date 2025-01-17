package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class Others_Page_Test extends BaseClass{
	
	
	@Test
	public void landing_automation_then_click_others() {
		others.landing_on_automation_click_to_others();
	}
	
	@Test
	public void click_radio_button() {
		others.step_1_click_radio_button();
	}
	
	@Test
	public void click_check_box() {
		others.step_2_click_check_box();
	}
	
	@Test
	 public void step_3_click_select_dropdown() {
		others.step_3_click_select_dropdown();
	}
	
	@Test
	public void step_4_click_select_dropdown() {
		others.step_4_drop_down();
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	public void step_one_click_right_click_action_then_click_back_button_then_submit_accept_1() {
		others.step_one_click_right_click_action_then_click_back_button_then_submit_accept_1();
	}
	

}
