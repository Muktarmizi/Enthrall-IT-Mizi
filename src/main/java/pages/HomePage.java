package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;
import java.util.List;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logoElement;

	@FindBy(xpath = "//li[@id='home' and @name='home']")
	WebElement homeHeader;

	@FindBy(xpath = "//a[@id='home' and @name='home']")
	WebElement homeFooter;

	@FindBy(xpath = "//div[text()='Class Starts In:']")
	WebElement homeHeadertext;

	@FindBy(xpath = "(//a[text()='Courses'])[1]")
	WebElement coursesHeader;

	@FindBy(xpath = "//p[contains(text(),'Expand your career opportunities by doing the most demanding courses offered by')]")
	WebElement courseSubHeader;

	@FindBy(xpath = "//a[@id='courses' and @name='courses']")
	WebElement coursesFooter;

	@FindBy(xpath = "//li[@id='about us' and @name='about us']")
	WebElement aboutusHeader;

	@FindBy(xpath = "//a[@id='about-us' and @name='about-us']")
	WebElement aboutUsFooter;

	@FindBy(xpath = "//h1[text()='About Us']")
	WebElement aboutUsHeaderText;

	@FindBy(xpath = "//p[contains(text(), 'coding makes ')]")
	WebElement aboutUsSubheader;

	@FindBy(xpath = "(//a[text()='Alumni'])[1]")
	WebElement alumniHeader;

	@FindBy(xpath = "(//a[text()='Alumni'])[2]")
	WebElement alumniFooter;

	@FindBy(xpath = "//li[@id='mentors' and @name='mentors']")
	WebElement mentorsHeader;

	@FindBy(xpath = "//a[@id='mentor' and @name='mentor']")
	WebElement mentorsFooter;

	@FindBy(xpath = "//h1[text()='Our Mentors']")
	WebElement mentorsHeaderText;

	@FindBy(xpath = "//a[@id='login-link' and @class='nav-link']")
	WebElement loginHeader;

	@FindBy(xpath = "(//a[@id='login-link'])[2]")
	WebElement loginFooter;

	@FindBy(xpath = "//h2[text()='Login into your account']")
	WebElement loginHeaderText;

	@FindBy(xpath = "//a[text()='Enroll now']")
	WebElement enrollNowHeader;

	@FindBy(id = "enroll_now")
	WebElement enrollNowFooter;

	@FindBy(xpath = "//h2[contains(text(),'Enroll to ')]")
	WebElement enrollNowHeaderText;

	@FindBy(xpath = "//h2[text()='Contact Us']")
	WebElement ScrolldownToContactUS;

	@FindBy(xpath = "//input[@name='name']")
	WebElement nameofcontactUs;

	@FindBy(xpath = "//input[@id='id_email']")
	WebElement emailofcontactUs;

	@FindBy(xpath = "//input[@name='subject']")
	WebElement subjectofcontactUs;

	@FindBy(xpath = "//input[@name='experiance']")
	WebElement experienceofcontactUs;

	@FindBy(xpath = "//textarea[@name='message']")
	WebElement messageofcontactUs;

	@FindBy(xpath = "//button[text()='send now']")
	WebElement sendNowofcontactUs;

	@FindBy(xpath = "//p[text()='+1 929-301-6028']")
	WebElement phoneNumber;

	@FindBy(xpath = "//p[text()='info@enthrallit.com']")
	WebElement emailName;

	@FindBy(xpath = "//h2[text()='Do You Have Any Questions']")
	WebElement doYouHaveAnyQus;

	public void logoValidation() {
		pause(3000);
		elementDisplayed(logoElement);
		clickElement(logoElement);
		pause(3000);
	}

	public void titleValidation() {
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);

	}

	public void validationOfLogin() {
		pause(2000);
		elementEnabled(loginHeader);
		clickElement(loginHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
     
	}

	public void ValidationOfHomePageHeader() {

		pause(2000);
		elementEnabled(homeHeader);
		clickElement(homeHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(2000);
		elementEnabled(coursesHeader);
		clickElement(coursesHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(2000);
		elementEnabled(mentorsHeader);
		clickElement(mentorsHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(2000);
		elementEnabled(alumniHeader);
		clickElement(alumniHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(2000);
		elementEnabled(aboutusHeader);
		clickElement(aboutusHeader);
		verifyTitle(driver, "About us");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(2000);
		elementEnabled(loginHeader);
		clickElement(loginHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		pause(2000);

	}

	public void validationOfHomePageFooter() {

		pause(2000);
		elementEnabled(homeFooter);
		clickElement(homeFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");
		validationOfOtherHeader(homeHeadertext, "Class Starts In:");

		pause(2000);
		elementEnabled(coursesFooter);
		clickElement(coursesFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(2000);
		elementEnabled(mentorsFooter);
		clickElement(mentorsFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(2000);
		elementEnabled(alumniFooter);
		clickElement(alumniFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(2000);
		elementEnabled(aboutUsFooter);
		clickElement(aboutUsFooter);
		verifyTitle(driver, "About us");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(2000);
		elementEnabled(loginFooter);
		clickElement(loginFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

	}

	public void validationOfPhoneNumberAndEmail() {

		pause(4000);
		verifyTextOfTheWebElement(phoneNumber, "+1 929-301-6028");
		pause(4000);
		verifyTextOfTheWebElement(emailName, "info@enthrallit.com");

	}

	public void validationOfContactUsForm() {

		pause(2000);
		clickElement(homeHeader);
		pause(2000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, ScrolldownToContactUS);
		pause(3000);
		verifyTextOfTheWebElement(doYouHaveAnyQus, "Do You Have Any Questions");
		pause(2000);
		clickElement(nameofcontactUs);
		pause(2000);
		clickElement(nameofcontactUs);
		pause(2000);
		inputTextThenClickTab(nameofcontactUs, "Shuvo");
		pause(2000);
		inputTextThenClickTab(emailofcontactUs, "Mirzashuvo79@gmail.com");
		pause(2000);
		inputTextThenClickTab(subjectofcontactUs, "N/A");
		pause(2000);
		inputTextThenClickTab(experienceofcontactUs, "3 Years");
		pause(2000);
		inputTextThenClickTab(messageofcontactUs, "Hello World");
		pause(2000);
		clickElement(sendNowofcontactUs);
		pause(2000);

	}

	public void homePageFullMenuValidation() {

		logoValidation();
		pause(2000);
		validationOfPhoneNumberAndEmail();
		pause(2000);
		titleValidation();
		pause(2000);
		validationOfLogin();
		pause(2000);
		ValidationOfHomePageHeader();
		pause(2000);
		validationOfHomePageFooter();
		pause(2000);
		validationOfContactUsForm();
		pause(2000);

	}

}