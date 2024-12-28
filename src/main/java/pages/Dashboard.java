package pages;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.model.Video;

import constants.Attribute;
import io.reactivex.rxjava3.functions.Action;

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
	WebElement doublElement;

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
	WebElement rightClickButtonElement;

	@FindBy(xpath = "//li[text()='Back']")
	WebElement clickBackButton;

	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement canceleElement;

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

	public void dashbordSidebar() {
		login.directLogin();
		pause(2000);
		clickElement(profile);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/profile/");
		verifyTextOfTheWebElement(profile, "Profile");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(addCourse);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/enroll/course/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		clickElement(quizList);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/qz/");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(homeWork);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/hw/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfOtherHeader(validationOfHomeWorkList, "Homework List");

		pause(2000);
		clickElement(codinChallenge);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/cc/");
		validationOfOtherHeader(validationOfcodingChallenge, "Coding Challenge List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(exam);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/exam/");
		verifyTextOfTheWebElement(exam, "Exam List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(bootCamp);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/bt/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(validationbootCamp, "Bootcamp List");

		pause(2000);
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfSubHeader(automationSubHeader, "Please choose from below");

		pause(2000);
		clickElement(classNote);
		verifyCurrentUrl(driver, "https://enthrallit.com/modules/class/note/list/#class_note");
		verifyTextOfTheWebElement(validationOfClassNoteList, "Class Note List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(classSchedule);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/");
		verifyTextOfTheWebElement(validationOfclassCalenda, "Class Calendar");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(joinTheClass);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/next-class/");
		verifyTextOfTheWebElement(validationOfMeetingList, "Meeting List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(classRecording);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/recording/");
		verifyTextOfTheWebElement(listOfMeeting, "Meeting List");
		verifyTitle(driver, "Enthrall IT - Dashboard");

		pause(2000);
		clickElement(others);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/others/list/");
		verifyTextOfTheWebElement(validationOfOthers, "Others");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		clickElement(gitHubElement);
		pause(2000);

	}

	public void automationFullValidation() {
		pause(2000);
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfSubHeader(automationSubHeader, "Please choose from below");
		pause(2000);

	}

	public void automationHappyPath() {

		pause(2000);
		clickElement(loginElement);
		pause(2000);
		useremailElement.clear();
		useremailElement.sendKeys("Mizimuktar0@gmail.com");
		pause(2000);
		clickElement(useremailElement);
		pause(2000);
		userpassElement.clear();
		userpassElement.sendKeys("Password$1");
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
		clickElement(iAgreeCheckBox);
		pause(2000);
		clickElement(submitButton);
		pause(2000);

	}

	public void logIntoEnrollNowHappypath() {

		pause(2000);
		clickElement(loginElement);
		inputTextThenClickTab(useremailElement, "Mizimuktar0@gmail.com");
		inputTextThenClickTab(userpassElement, "Password$1");
		clickElement(loginbuttonElement);
		clickElement(automationElement);
		pause(2000);
		switchToChildWindow(driver, enroll);
		pause(2000);
	}

	public void firstNamevalidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		verifyLengthOfTheFieldContent(firstnameElement, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(firstnameElement, "123456788980909009");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(firstnameElement, "%&$^%&^(*^*&)&)((*()&)&)&");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameRequiredFieldElement, Attribute.INNER_HTML,
				"First Name is a required field.");

		inputTextThenClickTab(firstnameElement, "'Shuvo-Mirza'");
		pause(2000);
	}

	public void lastNamevalidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
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

		inputTextThenClickTab(lastElement, "'Shuvo-Mirza'");
		pause(2000);

	}

	public void selectProfessionvalidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
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

	public void selectCoursevalidation() {

		pause(2000);
		logIntoEnrollNowHappypath();
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

	public void PhoneNumberValidation() {

		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);
		verifyLengthOfTheFieldContent(phoneNum, Attribute.MAX_LENGTH, "10");
		pause(2000);
		inputTextThenClickTab(phoneNum, "*&%^#@@@#@#");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "000000000000000000000");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "12345");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "+9293306564");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		pause(2000);
	}

	public void emailAddressValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		verifyLengthOfTheFieldContent(phoneNum, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(emailAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Must be a valid Email Address.");
		pause(2000);
	}

	public void passwordValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		verifyLengthOfTheFieldContent(passWordAdd, Attribute.MAX_LENGTH, "74");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "aBcds");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "shuvoMirza");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
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
	}

	public void chooseFileValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		clickElement(submitEnrollPagElement);
		pause(2000);
		verifyErrorMessageUnderTheField(chooseFileRequiredField, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(2000);
	}

	public void choosePhotoValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		clickElement(submitEnrollPagElement);
		pause(2000);
		verifyErrorMessageUnderTheField(choosePhotoRequiredField, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		pause(2000);
	}

	public void birthYearValidation() {

		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);
		selectDropdown(selectBirthYear, "Select Birth Year");
		pause(2000);
		clickElementThenTab(selectBirthYear);
		pause(2000);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(2000);

	}

	public void birthmonthValidation() {

		pause(2000);
		logIntoEnrollNowHappypath();
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

	public void birthDayValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);
		selectDropdown(selectBirthDay, "Select Birth Date");
		pause(2000);
		clickElementThenTab(selectBirthDay);
		pause(2000);
		verifyErrorMessageUnderTheField(birthDayRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(2000);
	}

	public void homeAddressValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "90i31-4813840138041034801");// one more
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		pause(2000);
	}

	public void cityValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);
		inputTextThenClickTab(cityElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(cityRequiredFieldElement, Attribute.INNER_HTML, "City is a required field.");
		pause(2000);
	}

	public void statevalidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);
		selectDropdown(stateElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(stateRequiredFieldElement, Attribute.INNER_HTML, "State is a required field.");
		pause(2000);
	}

	public void zipCodeValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
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
	}

	public void signatureValidation() {

		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);
		inputTextThenClickTab(signtureElement, "1293u2193u2193u912321%%%%%%");
		pause(2000);
		verifyErrorMessageUnderTheField(signtureRequiredFieldElement, Attribute.INNER_HTML,
				"Signature is a required field.");
		pause(2000);
	}

	public void checkBoxClickVlaidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		doubleClickActionAccept(driver, doublElement);
		pause(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text: " + alert.getText());
		alert.accept();
		pause(3000);
		clickElement(agreeClickElement);
		pause(2000);
	}

	public void clickBackButton() {
		pause(2000);
		logIntoEnrollNowHappypath();
		rightClickActionAccept(driver, rightClickButtonElement, clickBackButton);
		pause(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text: " + alert.getText());
		alert.accept();
		pause(2000);

	}

	public void clickCancelButton() {
		pause(2000);
		logIntoEnrollNowHappypath();
		rightClickActionAccept(driver, rightClickButtonElement, canceleElement);
		pause(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text: " + alert.getText());
		alert.dismiss();
		pause(2000);
	}

	public void validationOfEnrollnowPage() {
		pause(2000);
		logIntoEnrollNowHappypath();
		pause(2000);

	}

	public void enrollPageFinalValidation() {
		pause(2000);
		logIntoEnrollNowHappypath();
		verifyLengthOfTheFieldContent(firstnameElement, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(firstnameElement, "123456788980909009");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(firstnameElement, "%&$^%&^(*^*&)&)((*()&)&)&");
		pause(2000);
		verifyErrorMessageUnderTheField(firstNameErrorElement, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(2000);
		clickElement(lastElement);
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
		clickElement(selectProfession);
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "Select Profession");
		pause(2000);
		clickElementThenTab(selectProfession);
		pause(2000);
		verifyErrorMessageUnderTheField(iamrequiredfield, Attribute.INNER_HTML, "I'm is a required field.");
		pause(2000);
		clickElement(selectCourse);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Select Course");
		pause(2000);
		clickElementThenTab(selectCourse);
		pause(2000);
		verifyErrorMessageUnderTheField(courseWishtoEnrollisarequiredfield, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		pause(2000);
		clickElement(phoneNum);
		verifyLengthOfTheFieldContent(phoneNum, Attribute.MAX_LENGTH, "10");
		pause(2000);
		inputTextThenClickTab(phoneNum, "*&%^#@@@#@#");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(2000);
		inputTextThenClickTab(phoneNum, "000000000000000000000");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(2000);
		clickElement(emailAdd);
		inputTextThenClickTab(emailAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Must be a valid Email Address.");
		pause(2000);
		clickElement(passWordAdd);
		verifyLengthOfTheFieldContent(passWordAdd, Attribute.MAX_LENGTH, "8");
		inputTextThenClickTab(passWordAdd, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
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
		clickElement(choosefile1);
		inputTextThenClickTab(choosefile1, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(chooseFileRequiredField, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(2000);
		clickElement(choosefile2);
		inputTextThenClickTab(choosefile2, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(choosePhotoRequiredField, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		pause(2000);
		clickElement(selectBirthYear);
		selectDropdown(selectBirthYear, "Select Birth Year");
		pause(2000);
		clickElementThenTab(selectBirthYear);
		pause(2000);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(2000);
		clickElement(selectBirthMonth);
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
		clickElement(selectBirthDay);
		pause(2000);
		selectDropdown(selectBirthDay, "Select Birth Date");
		pause(2000);
		clickElementThenTab(selectBirthDay);
		pause(2000);
		verifyErrorMessageUnderTheField(birthDayRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(2000);
		clickElement(homeAddressL1);
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumRequiredField, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		pause(2000);
		clickElement(cityElement);
		pause(2000);
		inputTextThenClickTab(cityElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(cityRequiredFieldElement, Attribute.INNER_HTML, "City is a required field.");
		pause(2000);
		clickElement(stateElement);
		pause(2000);
		inputTextThenClickTab(stateElement, "90i31-4813840138041034801");
		pause(2000);
		verifyErrorMessageUnderTheField(stateRequiredFieldElement, Attribute.INNER_HTML, "State is a required field.");
		pause(2000);
		clickElement(zipCodElement);
		pause(2000);
		inputTextThenClickTab(zipCodElement, "ksmd;lsmaf;lmad;lfma");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFieldElement, Attribute.INNER_HTML,
				"ZIP Code is a required field.");
		pause(2000);
		clickElement(signtureElement);
		pause(2000);
		inputTextThenClickTab(signtureElement, "1293u2193u2193u912321%%%%%%");
		pause(2000);
		verifyErrorMessageUnderTheField(signtureRequiredFieldElement, Attribute.INNER_HTML,
				"Signature is a required field.");
		pause(2000);
		doubleClickActionAccept(driver, doublElement);
		pause(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text: " + alert.getText());
		alert.accept();
		pause(3000);
		clickElement(agreeClickElement);
		pause(2000);
		rightClickActionAccept(driver, rightClickButtonElement, clickBackButton);
		pause(2000);
		Alert alert1 = driver.switchTo().alert();
		System.out.println("\nAlert Text: " + alert.getText());
		alert.accept();
		pause(2000);
		rightClickActionAccept(driver, rightClickButtonElement, canceleElement);
		pause(2000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println("\nAlert Text: " + alert.getText());
		alert.dismiss();
		pause(2000);
	}

}
