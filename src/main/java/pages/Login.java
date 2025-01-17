package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static common.CommonActions.*;
import static common.CommonWaits.*;

public class Login {

	WebDriver driver;
	WebDriverWait wait;
	HomePage homePage;

	public Login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

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

	@FindBy(xpath = "//*[@id='emails' and @class='form-control form-control-lg']")
	WebElement userIdElement;

	@FindBy(id = "enroll-button")
	WebElement enrollElement;

	@FindBy(xpath = "//input[@id='emails' and @class='form-control form-control-lg']")
	WebElement useremailElement;

	@FindBy(xpath = "//*[@id='password' and @class='form-control form-control-lg']")
	WebElement userpassElement;

	@FindBy(xpath = "//*[@id='login' and@class='btn btn-lg px-5']")
	WebElement loginbuttonElement;
	//// button[@id='login']

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

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automationElement;

	@FindBy(xpath = "//button[text()='Mouse Hover Action']")
	WebElement mouseHoverElement;

	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enroll;


	
	public void login() {
		
        pause(2000);
		elementEnabled(loginHeader);
		pause(2000);
		clickElement(loginHeader);
		pause(2000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		pause(2000);
		validationOfOtherHeader(loginHeaderText, "Login into your account");
		pause(2000);
		clickElement(loginElement);
		pause(2000);
		inputTextThenClickTab(useremailElement, "Mizimuktar0@gmail.com");
		pause(1000);
		inputTextThenClickTab(userpassElement, "Password$1");
		pause(1000);
		clickElement(loginbuttonElement);
		pause(2000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");

	}
	

	public void landing_on_dashboard_then_click_return_site_then_back_to_dashboard_then_logout() {

		pause(2000);
		elementEnabled(loginHeader);
		clickElement(loginHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		validationOfOtherHeader(loginHeaderText, "Login into your account");
		pause(2000);
		clickElement(loginElement);
		pause(2000);
		inputTextThenClickTab(useremailElement, "Mizimuktar0@gmail.com");
		pause(2000);
		inputTextThenClickTab(userpassElement, "Password$1");
		pause(2000);
		clickElement(loginbuttonElement);
		pause(2000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		pause(2000);
		clickElement(returnSite); // click on Return Site.
		pause(2000);
		clickElement(dashboardBack); // Go back to Dashboard.
		pause(2000);
		clickElement(imageOnDashboard);
		pause(2000);
		clickElement(logOut); // log out from Dashboard.
		pause(2000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

	}

	public void landing_on_automation_then_click_enroll_now() {
		
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

}
