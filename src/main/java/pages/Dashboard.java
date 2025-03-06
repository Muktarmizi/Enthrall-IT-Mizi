package pages;

import static common.CommonActions.clickElement;
import static common.CommonActions.clickElementThenTab;
import static common.CommonActions.clickUsingJavascriptExecutor;
import static common.CommonActions.findYourNameFromTheTable;
import static common.CommonActions.inputText;
import static common.CommonActions.inputTextThenClickTab;
import static common.CommonActions.pause;
import static common.CommonActions.rightClickActionAccept;
import static common.CommonActions.rightClickActionDismiss;
import static common.CommonActions.scrollIntoViewTheElementUsingJavascriptExecutor;
import static common.CommonActions.selectDropdown;
import static common.CommonActions.selectElelementFromDropdownOnebyOne;
import static common.CommonActions.switchToChildWindow;
import static common.CommonActions.validationOfHeader;
import static common.CommonActions.validationOfOtherHeader;
import static common.CommonActions.validationOfSubHeader;
import static common.CommonActions.verifyCurrentUrl;
import static common.CommonActions.verifyErrorMessageUnderTheField;
import static common.CommonActions.verifyLengthOfTheFieldContent;
import static common.CommonActions.verifyTextOfTheWebElement;
import static common.CommonActions.verifyTitle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static utils.IConstant.password;
import static utils.IConstant.user_id;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Attribute;

public class Dashboard {

	WebDriver driver;
	WebDriverWait wait;
	Login login;
	HomePage homePage;

	public Dashboard(WebDriver driver) {
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

	
	
	
	public void step_one_landing_on_dashboard_then_click_all_side_bar() {

		// Profile.
		pause(2000);
		clickElement(profile);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/profile/");
		verifyTextOfTheWebElement(profile, "Profile");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// Add Course.
		pause(2000);
		clickElement(addCourse);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/enroll/course/");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// Quiz List.
		pause(2000);
		clickElement(quizList);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/qz/");
		verifyTextOfTheWebElement(quizlistHeader, "Quiz List");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(2000);

		// Home work.
		pause(2000);
		clickElement(homeWork);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/hw/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfOtherHeader(validationOfHomeWorkList, "Homework List");

		// Coding Challenge.
		pause(2000);
		clickElement(codinChallenge);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/cc/");
		validationOfOtherHeader(validationOfcodingChallenge, "Coding Challenge List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// Exam.
		pause(2000);
		clickElement(exam);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/exam/");
		verifyTextOfTheWebElement(exam, "Exam List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// BootCamp.
		pause(2000);
		clickElement(bootCamp);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/bt/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(validationbootCamp, "Bootcamp List");

		// Automation.
		pause(2000);
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfSubHeader(automationSubHeader, "Please choose from below");

		// Class Notes.
		pause(2000);
		clickElement(classNote);
		verifyCurrentUrl(driver, "https://enthrallit.com/modules/class/note/list/#class_note");
		verifyTextOfTheWebElement(validationOfClassNoteList, "Class Note List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// Class Schedule.
		pause(2000);
		clickElement(classSchedule);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/");
		verifyTextOfTheWebElement(validationOfclassCalenda, "Class Calendar");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// Join The Class.
		pause(2000);
		clickElement(joinTheClass);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/next-class/");
		verifyTextOfTheWebElement(validationOfMeetingList, "Meeting List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// Class Recording.
		pause(2000);
		clickElement(classRecording);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/recording/");
		verifyTextOfTheWebElement(listOfMeeting, "Meeting List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		// Others
		pause(2000);
		clickElement(others);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/others/list/");
		verifyTextOfTheWebElement(validationOfOthers, "Others");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		clickElement(gitHubElement);
		pause(2000);

	}

	public void validation_of_automation_page() {

		pause(2000);
		clickElement(loginElement);
		inputTextThenClickTab(useremailElement, user_id); // User Id set in Config.properties.
		inputTextThenClickTab(userpassElement, password); // Password set in Config.properties.
		clickElement(loginbuttonElement);
		pause(2000);
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(2000);
		validationOfHeader(AutomationHeaderText, "Automation");
		pause(2000);
		validationOfSubHeader(automationSubHeader, "Please choose from below");
		pause(2000);
		// scrollIntoViewTheElementUsingJavascriptExecutor(driver,
		// find_My_Name_Scroll_Down);
		// pause(2000);

	}

	public void happy_path_to_automation_then_click_enroll_now_then_input_all_information() {

		pause(2000);
		clickElement(logoElement);
		pause(2000);
		clickElement(loginElement);
		pause(2000);
		useremailElement.clear();
		useremailElement.sendKeys(user_id);
		pause(2000);
		clickElement(useremailElement);
		pause(2000);
		userpassElement.clear();
		userpassElement.sendKeys(password);
		pause(2000);
		clickElement(userpassElement);
		pause(2000);
		clickElement(loginbuttonElement);
		pause(3000);
		clickElement(automationElement);
		pause(2000);
		switchToChildWindow(driver, enroll);
		pause(2000);
		clickElement(firstnameElement);
		pause(2000);
		inputTextThenClickTab(firstnameElement, "Shuvo");
		pause(2000);
		inputTextThenClickTab(middlElement, "M");
		pause(2000);
		inputText(lastElement, "Mirza");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "a Student");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Python");
		pause(2000);
		inputTextThenClickTab(phoneNum, "9293306564");
		pause(2000);
		inputTextThenClickTab(emailAdd, "MirzaShuvo79@gmail.com");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Muktar2024$");
		pause(2000);
		selectDropdown(Gender, "Male");
		pause(2000);
		File file = new File("./image/Screenshot 2024-11-30 185110.png");
		choosefile1.sendKeys(file.getAbsolutePath());
		pause(2000);
		File file2 = new File("./image/Screenshot 2024-11-30 185141.png");
		choosefile2.sendKeys(file.getAbsolutePath());
		pause(2000);
		selectDropdown(selectBirthYear, "1989");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectBirthMonth, selectBirthMonthList);
		pause(2000);
		selectDropdown(selectBirthMonth, "December");
		pause(2000);
		inputTextThenClickTab(selectBirthDay, "16");
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "2268 Seward Ave");
		pause(2000);
		inputTextThenClickTab(homeAddressL2, "Apt 3");
		pause(2000);
		inputTextThenClickTab(cityElement, "Bronx");
		pause(2000);
		inputTextThenClickTab(stateElement, "New York");
		pause(2000);
		inputTextThenClickTab(zipCodElement, "10473");
		pause(2000);
		inputTextThenClickTab(immigrationElement, "Citizen");
		pause(2000);
		inputTextThenClickTab(arrivalDateElement, "24th Jan 2013");
		pause(2000);
		inputTextThenClickTab(emergencyElement, "9293306564");
		pause(2000);
		inputTextThenClickTab(knowAboutUs, "Friends");
		pause(2000);
		inputTextThenClickTab(highEducation, "Graduate");
		pause(2000);
		inputTextThenClickTab(countryOriginElement, "Bangladesh");
		pause(2000);
		inputTextThenClickTab(selectLanguage, "English");
		pause(2000);
		inputTextThenClickTab(signtureElement, "Shuvo M Mirza");
		pause(2000);
		Actions actions = new Actions(driver);
		actions.doubleClick(terms_and_condition).build().perform();
		pause(2000);
		clickElement(accept_Button);
		pause(2000);
		clickElement(submitEnrollPagElement);
		pause(2000);

	}

	public void first_name_validation() {

		pause(2000);
		verifyLengthOfTheFieldContent(firstnameElement, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(firstnameElement, "123456788980909009");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(firstnameElement, "%&$^%&^(*^*&)&)((*()&)&)&");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(firstnameElement, " "); // empty input.
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameRequiredFieldElement, Attribute.INNER_HTML,
				"First Name is a required field.");
		pause(2000);
		inputTextThenClickTab(firstnameElement, "'Shuvo-Mirza'");
		pause(2000);
	}

	public void last_name_validation() {

		pause(2000);
		verifyLengthOfTheFieldContent(lastElement, Attribute.MAX_LENGTH, "20");
		pause(2000);
		inputTextThenClickTab(lastElement, "12548599890878787");
		pause(2000);
		verifyErrorMessageUnderTheField(lastNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(lastElement, "*&%&^&(*^*(^*(^*(^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(lastNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(lastElement, " "); // empty input.
		pause(2000);
		verifyErrorMessageUnderTheField(lastNameRequireFieldElement, Attribute.INNER_HTML,
				"Last Name is a required field.");
		pause(2000);
		inputTextThenClickTab(lastElement, "'Shuvo-Mirza'");
		pause(2000);

	}

	public void select_profession_validation() {

		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "Select Profession");
		pause(2000);
		clickElementThenTab(selectProfession);
		pause(2000);
		verifyErrorMessageUnderTheField(iamrequiredfield, Attribute.INNER_HTML, "I'm is a required field.");
		pause(2000);

	}

	public void select_course_validation() {

		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Select Course");
		pause(2000);
		clickElementThenTab(selectCourse);
		pause(2000);
		verifyErrorMessageUnderTheField(courseWishtoEnrollisarequiredfield, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		pause(2000);
	}

	public void phone_number_validation() {

		pause(2000);
		verifyLengthOfTheFieldContent(phoneNum, Attribute.MAX_LENGTH, "10");
		pause(2000);
		inputTextThenClickTab(phoneNum, "*&%^#@@@#@#");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "000000000000000000000"); // can't Start with 0 or 1.
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "12345"); // must be 10 Digits.
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "+9293306564");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(2000);
	}

	public void email_address_validation() {

		verifyLengthOfTheFieldContent(emailAdd, Attribute.MAX_LENGTH, "74");
		pause(2000);
		inputTextThenClickTab(emailAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Must be a valid Email Address.");
		pause(2000);
	}

	public void password_validation() {

		pause(2000);
		verifyLengthOfTheFieldContent(passWordAdd, Attribute.MAX_LENGTH, "74");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "aBcds"); // Minimum of 8 characters.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "shuvoMirza"); // Password cann't contain First and last name.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "aaaaaaaaaaaaaaaa");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		pause(2000);
		inputTextThenClickTab(passWordAdd, "JHDJLFNDSJLNFKLDSNFKSNKSLNGSKNGKF");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Mirzashuvo79"); // Password cann't contain part of the Email.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Mirzashuvo79aaaaaaaaaa");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "821371029379102T*&%&*%&*");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Mirzashuvo790");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "121837892748913743");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Appleorange");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Appleorange^(^*^**");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Appleorange5234354364");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "shuvoMirza#1");// Password cannot contain First Name, Last Name, or email.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		pause(2000);

	}

	public void choose_file_validation() {
		pause(2000);
		clickElement(submitEnrollPagElement);
		pause(2000);
		verifyErrorMessageUnderTheField(chooseFileRequiredField, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(2000);
	}

	public void choose_photo_validation() {

		pause(2000);
		clickElement(submitEnrollPagElement);
		pause(2000);
		verifyErrorMessageUnderTheField(choosePhotoRequiredField, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		pause(2000);
	}

	public void birth_year_validation() {

		pause(2000);
		selectDropdown(selectBirthYear, "Select Birth Year");
		pause(2000);
		clickElementThenTab(selectBirthYear);
		pause(2000);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(2000);

	}

	public void birth_month_validation() {

		pause(2000);
		selectElelementFromDropdownOnebyOne(selectBirthMonth, selectBirthMonthList);
		pause(2000);
		selectDropdown(selectBirthMonth, "Select Birth Month");
		pause(2000);
		clickElementThenTab(selectBirthMonth);
		pause(2000);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		pause(2000);
	}

	public void birth_day_validation() {

		pause(2000);
		selectDropdown(selectBirthDay, "Select Birth Date");
		pause(2000);
		clickElementThenTab(selectBirthDay);
		pause(2000);
		verifyErrorMessageUnderTheField(birthDayRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(2000);
	}

	public void home_address_validation() {
		verifyLengthOfTheFieldContent(homeAddressL1, Attribute.MAX_LENGTH, "60");
		pause(3000);
		inputTextThenClickTab(homeAddressL1, "#$$%%^^#$%$%%(*^*(^(*^(*");
		pause(3000);
		verifyErrorMessageUnderTheField(home_Address_1_error, Attribute.INNER_HTML, "Must be alphanumeric characters.");
		pause(2000);
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		pause(2000);
	}

	public void city_validation() {

		pause(2000);
		inputTextThenClickTab(cityElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(cityRequiredFieldElement, Attribute.INNER_HTML, "City is a required field.");
		pause(2000);
	}

	public void state_validation() {

		pause(2000);
		selectDropdown(stateElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(stateRequiredFieldElement, Attribute.INNER_HTML, "State is a required field.");
		pause(2000);
	}

	public void zip_code_validation() {

		pause(2000);
		verifyLengthOfTheFieldContent(zipCodElement, Attribute.MAX_LENGTH, "5");
		inputTextThenClickTab(zipCodElement, "ksmd;lsmaf;lmad;lfma");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFieldElement, Attribute.INNER_HTML,
				"ZIP Code is a required field.");
		pause(2000);
		inputTextThenClickTab(zipCodElement, "1234");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFieldElement, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");
		pause(2000);
	}

	public void signature_validation() {

		pause(2000);
		inputTextThenClickTab(signtureElement, "1293u2193u2193u912321%%%%%%");
		pause(2000);
		verifyErrorMessageUnderTheField(signtureRequiredFieldElement, Attribute.INNER_HTML,
				"Signature is a required field.");
		pause(2000);
	}

	public void double_click_to_the_terms_and_condition() {

		pause(2000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, signtureElement);
		pause(2000);
		Actions actions = new Actions(driver);
		actions.doubleClick(terms_and_condition).build().perform();
		pause(2000);
		clickElement(accept_Button);
		pause(2000);

	}

	public void step_one_click_right_click_action_then_click_back_button_then_submit_accept() {

		//driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(2000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, rightClickActionElement);
		pause(2000);
		rightClickActionAccept(driver, rightClickActionElement, clickBackButton);
		pause(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert.getText());
		alert.accept(); // Alert is not Working.
		clickUsingJavascriptExecutor(driver, clickBackButton);
		clickElementThenTab(clickBackButton);
		pause(2000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		pause(2000);

	}

	public void step_two_click_right_click_action_then_click_cancel_button_then_submit_dismiss() {

		pause(2000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, signtureElement);
		rightClickActionDismiss(driver, rightClickActionElement, cancel_Element);
		pause(3000);
		clickElement(cancel_Element);
		pause(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert.getText());
		alert.dismiss();// Alert is not Working.
		pause(3000);
	}

	public void step_three_return_back_To_enroll_now_page_then_find_your_name_from_the_table() {

		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(2000);
		rightClickActionAccept(driver, rightClickActionElement, clickBackButton);
		pause(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text: " + alert.getText()); // Alert is Not Working.
		alert.accept();
		pause(2000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, scroll_down_to_Find_MyName);
		pause(2000);
		verifyTextOfTheWebElement(table_Header, "Automated the Table");
		pause(2000);
		findYourNameFromTheTable(findmyName, "Muktar mizi");
		pause(2000);

	}

	public void landing_on_automation_to_find_your_name_from_the_table() {

		pause(2000);
		clickElement(loginElement);
		inputTextThenClickTab(useremailElement, "Mizimuktar0@gmail.com");
		inputTextThenClickTab(userpassElement, "Password$1");
		clickElement(loginbuttonElement);
		clickElement(automationElement);
		pause(2000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, scroll_down_to_Find_MyName);
		pause(2000);
		verifyTextOfTheWebElement(table_Header, "Automated the Table");
		pause(2000);
		findYourNameFromTheTable(findmyName, "Muktar mizi");
		pause(2000);

	}

	public void enroll_now_page_error_message_and_required_field_validation() {

		pause(2000);
		verifyLengthOfTheFieldContent(firstnameElement, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(firstnameElement, "123456788980909009");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		inputTextThenClickTab(firstnameElement, "%&$^%&^(*^*&)&)((*()&)&)&");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		verifyErrorMessageUnderTheField(firstNameRequiredFieldElement, Attribute.INNER_HTML,
				"First Name is a required field.");
		pause(2000);
		inputTextThenClickTab(firstnameElement, "'Shuvo-Mirza'");
		pause(2000);
		verifyLengthOfTheFieldContent(lastElement, Attribute.MAX_LENGTH, "20");
		pause(2000);
		inputTextThenClickTab(lastElement, "12548599890878787");
		pause(2000);
		verifyErrorMessageUnderTheField(lastNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(lastElement, "*&%&^&(*^*(^*(^*(^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(lastNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		verifyErrorMessageUnderTheField(lastNameRequireFieldElement, Attribute.INNER_HTML,
				"Last Name is a required field.");
		pause(2000);
		inputTextThenClickTab(lastElement, "'Shuvo-Mirza'");
		pause(2000);
		selectDropdown(selectProfession, "Select Profession");
		pause(2000);
		clickElementThenTab(selectProfession);
		pause(2000);
		verifyErrorMessageUnderTheField(iamrequiredfield, Attribute.INNER_HTML, "I'm is a required field.");
		pause(2000);
		selectDropdown(selectCourse, "Select Course");
		pause(2000);
		clickElementThenTab(selectCourse);
		pause(2000);
		verifyErrorMessageUnderTheField(courseWishtoEnrollisarequiredfield, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		pause(2000);
		verifyLengthOfTheFieldContent(phoneNum, Attribute.MAX_LENGTH, "10");
		pause(2000);
		inputTextThenClickTab(phoneNum, "*&%^#@@@#@#");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "000000000000000000000");// can't Start with 0 or 1.
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "12345"); // must be 10 Digits.
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "+9293306564");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(2000);
		verifyLengthOfTheFieldContent(emailAdd, Attribute.MAX_LENGTH, "74");
		pause(2000);
		inputTextThenClickTab(emailAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Must be a valid Email Address.");
		pause(2000);
		verifyLengthOfTheFieldContent(passWordAdd, Attribute.MAX_LENGTH, "74");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "aBcds"); // Minimum of 8 characters.
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "shuvoMirza");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "aaaaaaaaaaaaaaaa");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		pause(2000);
		inputTextThenClickTab(passWordAdd, "JHDJLFNDSJLNFKLDSNFKSNKSLNGSKNGKF");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Mirzashuvo79");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Mirzashuvo79aaaaaaaaaa");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "821371029379102T*&%&*%&*");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Mirzashuvo79");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "121837892748913743");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Appleorange");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Appleorange^(^*^**");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Appleorange5234354364");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		clickElement(submitEnrollPagElement);
		pause(2000);
		verifyErrorMessageUnderTheField(chooseFileRequiredField, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(2000);
		clickElement(submitEnrollPagElement);
		pause(2000);
		verifyErrorMessageUnderTheField(choosePhotoRequiredField, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		pause(2000);
		selectDropdown(selectBirthYear, "Select Birth Year");
		pause(2000);
		clickElementThenTab(selectBirthYear);
		pause(2000);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(2000);
		selectDropdown(selectBirthMonth, "Select Birth Month");
		pause(2000);
		clickElementThenTab(selectBirthMonth);
		pause(2000);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		pause(2000);
		selectDropdown(selectBirthDay, "Select Birth Date");
		pause(2000);
		clickElementThenTab(selectBirthDay);
		pause(2000);
		verifyErrorMessageUnderTheField(birthDayRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(2000);
		verifyLengthOfTheFieldContent(homeAddressL1, Attribute.MAX_LENGTH, "60");
		pause(3000);
		inputTextThenClickTab(homeAddressL1, "#$$%%^^#$%$%%(*^*(^(*^(*");
		pause(3000);
		verifyErrorMessageUnderTheField(home_Address_1_error, Attribute.INNER_HTML, "Must be alphanumeric characters.");
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		pause(2000);
		inputTextThenClickTab(cityElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(cityRequiredFieldElement, Attribute.INNER_HTML, "City is a required field.");
		pause(2000);
		selectDropdown(stateElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(stateRequiredFieldElement, Attribute.INNER_HTML, "State is a required field.");
		pause(2000);
		verifyLengthOfTheFieldContent(phoneNum, Attribute.MAX_LENGTH, "5");
		inputTextThenClickTab(zipCodElement, "ksmd;lsmaf;lmad;lfma");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFieldElement, Attribute.INNER_HTML,
				"ZIP Code is a required field.");
		pause(2000);
		inputTextThenClickTab(zipCodElement, "1234");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFieldElement, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");
		pause(2000);
		inputTextThenClickTab(signtureElement, "1293u2193u2193u912321%%%%%%");
		pause(2000);
		verifyErrorMessageUnderTheField(signtureRequiredFieldElement, Attribute.INNER_HTML,
				"Signature is a required field.");
		pause(2000);

	}

	/*
	 * public void dynamic_pop_up() {
	 * 
	 * driver.get("https://enthrallit.com/course/dashboard/enrolls/"); Set<String>
	 * widSet = driver.getWindowHandles(); if (widSet.size() > 1) {
	 * 
	 * driver.switchTo().window("handleBack()"); pause(5000); try { WebElement
	 * elementonpopupElement = driver.findElement(By.id("customButton")); if
	 * (elementonpopupElement.isDisplayed()) { pause(3000);
	 * elementonpopupElement.click(); pause(4000); } }
	 * 
	 * catch (NoSuchElementException ne) {
	 * System.out.println("Alert is displayed but colud not click on ok button");
	 * 
	 * } pause(5000);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public void try_to_click_oK() {
	 * 
	 * //driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	 * driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	 * scrollIntoViewTheElementUsingJavascriptExecutor(driver,
	 * rightClickActionElement); pause(2000); rightClickActionAccept(driver,
	 * rightClickActionElement, clickBackButton); pause(2000); Set<String> widSet =
	 * driver.getWindowHandles(); if (widSet.size() > 1) {
	 * driver.switchTo().window("handleBack()"); pause(5000); } WebElement
	 * elementonpopupElement = driver.findElement(By.id("customButton"));
	 * 
	 * if (elementonpopupElement.isDisplayed()) { pause(3000);
	 * elementonpopupElement.click(); pause(4000); }
	 * driver.switchTo().alert().accept(); pause(3000);
	 * 
	 * }
	 */

}
