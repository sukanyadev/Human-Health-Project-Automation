package org.hhp.testCases;

import java.io.IOException;

import org.hhp.pageObjects.Header;
import org.hhp.pageObjects.LoginPage;
import org.hhp.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(priority = 0)	
	public void loginPageSetup() throws IOException, InterruptedException {
		Header h = new Header(driver);
		h.clickLoginBtn();
		h.waitForSeconds(5);
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), baseURL + "/login-2/");
		logger.info("Navigated to Login Page");
	}
	
	@Test(priority=1)
	public void verifySignUpHereLink() {
		LoginPage lp = new LoginPage(driver);
		lp.click_SignUpHere_Link();
		lp.waitForSeconds(3);
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), baseURL + "/register/free-membership/");
		logger.info("Navigated to SignUp Page successfully");
		driver.navigate().back();
	}
	
	@Test(priority=2)
	public void verifyLoginFormText() {
		LoginPage lp = new LoginPage(driver);
		lp.waitForSeconds(3);
		Assert.assertEquals(lp.getLoginFormHeading(),"Sign in/Sign up");
		Assert.assertEquals(lp.getLoginFormText(),"If you are not a member, please sign up here");
		logger.info("Login Form Heading and Text displayed");
	}
	
	@Test(priority=4)
	public void verifyLoginWithValidCredentials() {
		LoginPage lp = new LoginPage(driver);
			lp.setUsername("hhptest1");
			lp.setPassword("test1234");
			lp.clickLoginBtn();
			lp.waitForSeconds(3);
			Assert.assertEquals(TestUtil.verifyURL(driver).toString(), "https://dev.humanhealthproject.org/");
			Assert.assertTrue(TestUtil.getHeader(driver).getPersonIconStatus());
			logger.info("Log in with valid credentials was successful. Test passed");
			TestUtil.getHeader(driver).clickLogout();
		}

	@Test(priority=3)
	public void verifyLoginWithInvalidCredentials() {
		LoginPage lp = new LoginPage(driver);
			lp.setUsername("invalid");
			lp.setPassword("data");
			lp.clickLoginBtn();
			lp.waitForSeconds(3);
			Assert.assertEquals(lp.getErrorMessage(), "ERROR: Your username or password was incorrect");
			logger.info("Log in with invalid credentials displayed ERROR. Test passed");
	}
}
