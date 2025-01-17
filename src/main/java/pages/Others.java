package pages;

import java.awt.Button;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.model.Video;
import com.github.dockerjava.api.model.Driver;
import com.google.common.base.Function;

import constants.Attribute;
import io.reactivex.rxjava3.functions.Action;
import reports.Loggers;

import java.time.Duration;

import javax.swing.text.ChangedCharSetException;
import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static common.CommonWaits.*;
import org.openqa.selenium.support.ui.Select;
import static common.CommonActions.*;

public class Others {
	

	WebDriver driver;
	WebDriverWait wait;
	Login login;
	HomePage homePage;
	
	public Others(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		login = new Login(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logoElement;

	@FindBy(id = "login-link")
	WebElement loginElement;

	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement dashboard;

	@FindBy(xpath = "//a[contains(text(), 'Return site')]")
	WebElement returnSite;

	@FindBy(id = "dashboard-link")
	WebElement dashboardBack;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle nav-user']")
	WebElement dropdown;

	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logOut;

	@FindBy(xpath = "//a[@id='dashboard-link']")
	WebElement dashboard2;

	@FindBy(xpath = "//img[@class='avatar-rounded']")
	WebElement imageOnDashboard;

	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logout;

	@FindBy(xpath = "//h1[text()= 'Dashboard']")
	WebElement headerDashboardElement;

	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;

	@FindBy(xpath = "//a[@id='home-tab']")
	WebElement validationOfProfile;

	@FindBy(xpath = "//span[text()='Add Course']")
	WebElement addCourse;

	@FindBy(xpath = "//h1[text()='Enroll Course']")
	WebElement validationOfEnrollCourse;

	@FindBy(xpath = "//span[text()='Quiz List']")
	WebElement quizList;

	@FindBy(xpath = "(//span[text()='Quiz List'])[2]")
	WebElement quizlistHeader;

	@FindBy(xpath = "//span[text()='Home Work']")
	WebElement homeWork;

	@FindBy(xpath = "//span[text()='Homework List']")
	WebElement validationOfHomeWorkList;

	@FindBy(xpath = "//span[text()='Codding Challenge']")
	WebElement codinChallenge;

	@FindBy(xpath = "//span[text()='Coding Challenge List']")
	WebElement validationOfcodingChallenge;

	@FindBy(xpath = "//span[text()='Exam']")
	WebElement exam;

	@FindBy(xpath = "//span[text()='Exam List']")
	WebElement validationOfExam;

	@FindBy(xpath = "//span[text()='Bootcamp']")
	WebElement bootCamp;

	@FindBy(xpath = "//span[text()='Bootcamp List']")
	WebElement validationbootCamp;

	@FindBy(xpath = "//span[text()='Class Notes']")
	WebElement classNote;

	@FindBy(xpath = "//h1[text()='Class Note List']")
	WebElement validationOfClassNoteList;

	@FindBy(xpath = "//span[text()='Class Schedule']")
	WebElement classSchedule;

	@FindBy(xpath = "//h1[text()='Class Calendar']")
	WebElement validationOfclassCalenda;

	@FindBy(xpath = "//span[text()='Join The Class']")
	WebElement joinTheClass;

	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement validationOfMeetingList;

	@FindBy(xpath = "//span[text()='Class recording']")
	WebElement classRecording;

	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement listOfMeeting;

	@FindBy(xpath = "//span[text()='Others']")
	WebElement others;

	@FindBy(xpath = "//h1[text()='Others']")
	WebElement validationOfOthers;

	@FindBy(xpath = "(//a[text()='Click'])[5]")
	WebElement gitHubElement;

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;

	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement validationOfAuomation;

	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enrollNow;

	@FindBy(xpath = "//h3[text()='Select your course from the dropdown']")
	WebElement enrollNowHeader;

	@FindBy(xpath = "//h1[text()='Please choose from below']")
	WebElement automationSubHeader;

	@FindBy(xpath = "//td[text()='smjohn.eu@gmail.com']")
	WebElement sendingEmail;

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automationElement;

	@FindBy(xpath = "//button[text()='Mouse Hover Action']")
	WebElement mouseHoverElement;

	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enroll;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstnameElement;

	@FindBy(xpath = "//small[@id='f_name_error']")
	WebElement firstNameErrorElement;

	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement firstNameRequiredFieldElement;

	@FindBy(xpath = "//input[@name='m_name']")
	WebElement middlElement;

	@FindBy(xpath = "//small[@id='m_name_error']")
	WebElement middleNmaeErrorElement;

	@FindBy(xpath = "//small[@id='l_name_error']")
	WebElement lastNameErrorElement;

	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastNameRequireFieldElement;

	@FindBy(xpath = "//input[@name='l_name' and @class='form-control']")
	WebElement lastElement;

	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;

	@FindBy(xpath = "//select[@id='id_i_am']/option")
	List<WebElement> selecProfessionList;

	@FindBy(xpath = "//*[@name='course_wish_to_enroll' and @class='form-control']")
	WebElement selectCourse;

	@FindBy(xpath = "//*[@name='course_wish_to_enroll' and @class='form-control']/option")
	List<WebElement> selectCourseList;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNum;

	@FindBy(xpath = "//input[@id='id_email' and @name='email']")
	WebElement emailAdd;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passWordAdd;
	
	@FindBy(xpath = "//*[@id='password_error']")
	WebElement passErrorRequired;
	
	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement Gender;

	@FindBy(xpath = "//select[@name='gender']/option")
	List<WebElement> selectGenderList;

	// @FindBy(xpath = "//option[text()='Select Birth Year']")
	// WebElement birthYear;

	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement selectBirthYear;

	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement birthYearRequiredFieldElement;

	@FindBy(xpath = "//select[@name='birth_month']/option")
	List<WebElement> selectBirthMonthList;

	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement selectBirthMonth;

	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement birthMonthRequiredFieldElement;

	@FindBy(xpath = "//select[@name='birth_date']")
	WebElement selectBirthDay;

	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birthDayRequiredFieldElement;

	@FindBy(xpath = "//*[@id='id_image']")
	WebElement choosefile1;

	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement chooseFileRequiredField;

	@FindBy(xpath = "//input[@id='id_photo_id']")
	WebElement choosefile2;

	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement choosePhotoRequiredField;

	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement homeAddressL1;

	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement homeAddress1RequiredFieldElement;

	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement homeAddressL2;

	@FindBy(xpath = "//input[@id='id_city']")
	WebElement cityElement;

	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityRequiredFieldElement;

	@FindBy(xpath = "//select[@id='id_state']")
	WebElement stateElement;

	@FindBy(xpath = "//span[text()='State is a required field.']")
	WebElement stateRequiredFieldElement;

	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCodElement;

	@FindBy(xpath = "//span[text()='ZIP Code is a required field.']")
	WebElement zipCodeRequiredFieldElement;

	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement immigrationElement;

	@FindBy(xpath = "//select[@name='immigration_status']/option")
	List<WebElement> immigrationList;

	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement arrivalDateElement;

	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement emergencyElement;

	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement knowAboutUs;

	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highEducation;

	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement countryOriginElement;

	@FindBy(xpath = "//select[@id='id_primary_language']/option")
	List<WebElement> selectlanguageList;

	@FindBy(xpath = "//select[@id='id_primary_language']")
	WebElement selectLanguage;

	@FindBy(xpath = "//input[@id='id_sign_by_name']")
	WebElement signtureElement;

	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement signtureRequiredFieldElement;

	@FindBy(id = "//a[@id='termsLink']")
	WebElement doubleClickActionElement;

	@FindBy(linkText = "//*[contains(text(),'Double Click to the')]")
	WebElement doubleClickElement;

	@FindBy(xpath = "//*[@id='is_agree' and @name='is_agree']")
	WebElement agreeClickElement;

	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement iAgreeCheckBox;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitButton;

	@FindBy(id = "//*[@id='customButton']")
	WebElement rightClickElement;

	@FindBy(xpath = "//button[text()='Right Click Action']")
	WebElement rightClickActionElement;

	@FindBy(xpath = "//li[text()='Back']")
	WebElement clickBackButton;

	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement cancel_Element;

	@FindBy(xpath = "//*[text()='Accept']")
	WebElement acceptElement;

	@FindBy(xpath = "//input[@id='emails' and @class='form-control form-control-lg']")
	WebElement useremailElement;

	@FindBy(xpath = "//*[@id='password' and @class='form-control form-control-lg']")
	WebElement userpassElement;

	@FindBy(xpath = "//button[@id='login']")
	WebElement loginbuttonElement;

	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement firstNameReq;

	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastNameReq;

	@FindBy(xpath = "//*[@id='i_am_error']")
	WebElement iamrequiredfield;

	@FindBy(xpath = "//*[@id='course_wish_error']")
	WebElement courseWishtoEnrollisarequiredfield;

	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phoneNumRequiredField;

	@FindBy(xpath = "//*[@id='email_error']")
	WebElement emailRequiredField;

	@FindBy(id = "//button[@id='submit_button']")
	WebElement submitEnrollPagElement;

	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement AutomationHeaderText;

	@FindBy(xpath = "//td[text()='Muktar mizi']")
	WebElement findmyName;

	@FindBy(xpath = "//td[text()='9293306564']")
	WebElement scroll_down_to_Find_MyName;

	@FindBy(xpath = "//h1[text()='Automated the Table']")
	WebElement table_Header;

	@FindBy(xpath = "//*[text()='Ok']")
	WebElement accept_OK;

	@FindBy(xpath = "//a[text()='Terms and condition']")
	WebElement terms_and_condition;

	@FindBy(xpath = "//button[text()='Accept']")
	WebElement accept_Button;

	@FindBy(xpath = "//*[text()='August Test Account']")
	WebElement find_My_Name_Scroll_Down;
	
	@FindBy(xpath = "//*[@id='home_address_error']")
	WebElement home_Address_1_error;

    @FindBy(xpath = "//button[text()='Others']")
    WebElement others_from_automation;
    
    
    //OTHERE PAGE SELENIUM PRACTICE.
    
    
    
    @FindBy(xpath = "//h1[text()='Selenium Practice']")
    WebElement selenium_practice_header;
    
    @FindBy(xpath = "//input[@id='exampleRadios1' and @class='form-check-input'][1]")
    WebElement radio_button_1;
    
    @FindBy(xpath ="//*[contains (text(), 'Male' )]")
    WebElement click_male;
    
    @FindBy(xpath = "//h5[text()='Multiple Select']")
    WebElement scroll_down_to_Mutiple_select;
    
    @FindBy(xpath = "//label[contains (text(), 'Scie' )]")
    WebElement checkbox_select_1;
    
    @FindBy(xpath = "//input[@type='checkbox' and @id='flexCheckDefault2']")
    WebElement checkbox_select_2;
    
    @FindBy(xpath =  "//input[@type='checkbox' and @id='flexCheckDefault3']")
    WebElement checkbox_select_3;
    
    @FindBy(xpath = "//h5[text()='Radio Button Example']")
    WebElement scroll_down_to_radio_button;
    
    @FindBy(xpath = "//select[@class='form-control'] [1]")
    WebElement select_drop_down_1;
    
    @FindBy(xpath = "//select[@class='form-control'] [1]/option")
    List<WebElement> select_drop_down_list_1;
    
    @FindBy(xpath = "//select[@class='form-control'] [2]")
    WebElement select_drop_down_2;
    
    @FindBy(xpath = "//select[@class='form-control'] [2]/option")
    List<WebElement> select_drop_down_list_2;
    
    @FindBy(xpath = "//option[text()='Other'] [2]")
    WebElement scroll_down_to_others;
    
    @FindBy(xpath = "//button[ contains (text(), 'Education Group') ]")
    WebElement drop_down_1;
    
    @FindBy(xpath = "//button[ contains (text(), 'Highest Education') ]")
    WebElement drop_down_2;
    
    @FindBy(xpath = "//button[ contains (text(), 'Primary Language') ]")
    WebElement drop_down_3;
    
    
    
    
    
    
 
    
    
    
    
    public void landing_on_automation_click_to_others() {
    	
    	pause(2000);
		clickElement(loginElement);
		inputTextThenClickTab(useremailElement, "Mizimuktar0@gmail.com");
		inputTextThenClickTab(userpassElement, "Password$1");
		clickElement(loginbuttonElement);
		clickElement(automationElement);
		pause(2000);
		switchToChildWindow(driver, others_from_automation);
		pause(2000);
		verifyCurrentUrl(driver,"https://enthrallit.com/selenium/");
		verifyTitle(driver,"Enthrall IT");
		validationOfHeader(selenium_practice_header,"Selenium Practice");
		pause(2000);
    }
    
    
    
    public void step_1_click_radio_button(){
    	

    	driver.get("https://enthrallit.com/selenium/");
    	pause(2000);
    	scrollIntoViewTheElementUsingJavascriptExecutor(driver,scroll_down_to_radio_button);
        WebElement radio_button1 = driver.findElement(By.xpath("//*[contains (text(), 'Male' )]"));
     	pause(2000);
    	
     	radio_button1.click();
    	WebElement radio_button2 = driver.findElement(By.xpath("//label[contains (text(), 'Windows' )][1]"));
     	pause(2000);
    	radio_button2.click();
    	
    	WebElement radio_button3 = driver.findElement(By.xpath("//label[contains (text(), 'Gr' )][1]"));
     	pause(2000);
    	radio_button3.click();
    	
    }
    	
    	
    
    
    public void step_2_click_check_box() {
    	
    	driver.get("https://enthrallit.com/selenium/");
    	pause(2000);
    	scrollIntoViewTheElementUsingJavascriptExecutor(driver,scroll_down_to_radio_button);
    	pause(2000);
    	WebElement check_box_1= driver.findElement(By.xpath("//label[contains (text(), 'Biolog' )][1]"));
    	check_box_1.click();
    	pause(2000);
    	
    	WebElement check_box_2= driver.findElement(By.xpath("//a[contains (text(), 'Ma' )]"));
    	check_box_1.click();
    	pause(2000);
    	
    	WebElement check_box_3= driver.findElement(By.xpath("//a[contains (text(), 'High Schoo' )]"));
    	check_box_1.click();
    	pause(2000);
    	
     }
    
    public void step_3_click_select_dropdown() {
    	
    	driver.get("https://enthrallit.com/selenium/");
    	pause(2000);
    	scrollIntoViewTheElementUsingJavascriptExecutor(driver,scroll_down_to_Mutiple_select);
    	pause(2000);
        selectElelementFromDropdownOnebyOne(select_drop_down_1, select_drop_down_list_1);
        pause(2000);
        selectDropdown(select_drop_down_1,"Employed" );
        pause(2000);
        
    	
    }
    
    public void step_4_drop_down() {
    	
    	driver.get("https://enthrallit.com/selenium/");
    	pause(2000);
    	scrollIntoViewTheElementUsingJavascriptExecutor(driver,scroll_down_to_Mutiple_select);
    	pause(2000);
    	inputTextThenClickTab(drop_down_1, "Biology");
    	pause(2000);
    	inputTextThenClickTab(drop_down_2,"High School");
    	pause(2000);
    	inputTextThenClickEnter(drop_down_3,"English");
    	pause(2000);
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void step_one_click_right_click_action_then_click_back_button_then_submit_accept_1() {
        driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, rightClickActionElement);
		pause(2000);
		rightClickActionAccept(driver, rightClickActionElement, clickBackButton);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text : Ok or cancel" + alert.getText());
		alert.accept();
		pause(2000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		pause(2000);
    }
    
    
		
		
		/*alert = Alert(driver)
           alert.accept()
		 * 
		 * Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text: " + alert.getText());
		alert.accept();//not Working.
		clickUsingJavascriptExecutor(driver, clickBackButton);
		clickElementThenTab(clickBackButton);
		pause(2000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		pause(2000);*/

	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	

}
