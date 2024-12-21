package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.Login;

public class LoginPageTest extends BaseClass {

	@Test
	public void loginTester() {

		login.logInProcess();
	}

	@Test
	public void loginAllTester() {
		login.directLogin();

	}
}