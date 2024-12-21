package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.CommonActions.clickElement;
import static common.CommonActions.elementEnabled;
import static common.CommonActions.pause;
import static common.CommonActions.verifyCurrentUrl;
import static common.CommonActions.verifyTitle;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static common.CommonActions.*;
import static common.CommonWaits.*;

public class Dashboard {
	/*
	 * Test 1) Click Return Site, validate Homepage again Test 2) click on profile
	 * photo and logout to see you can logout Test 3) Test all aside element except
	 * "Automation", When they redirect, please validate title, current url and
	 * header if present. Test 4) Click Automation and go to form, When they
	 * redirect, please validate title, current url and header, sub header etc if
	 * present.
	 * 
	 * Test 5) Each field should be separtely tested based on requirement Test 6)
	 * Submit without any data Test 7) test back button Test 8) test cancel button
	 * Test 9) Submit with all data (happy path), validate success message
	 * 
	 */

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

	public void AutomationFullValidation() {
		pause(2000);
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfSubHeader(automationSubHeader, "Please choose from below");
		//More coming soon.
	}
	
	
	
}
