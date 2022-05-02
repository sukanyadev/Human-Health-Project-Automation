package org.hhp.testCases;

import org.hhp.pageObjects.Header;
import org.hhp.pageObjects.LoginPage;
import org.hhp.pageObjects.SignUpPage;
import org.hhp.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
	
	@Test(priority = 0)
	public void signUpPageSetup() throws InterruptedException {
		Header hp = new Header(driver);
		hp.clickLoginBtn();
		String expectedURL = baseURL + "/login-2/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expectedURL);
		logger.info("Navigated to Join Us/Login Page successfully");
	}
	
	@Test(priority = 1)
	public void verifySignUpHereLink() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.click_SignUpHere_Link();
		String expectedURL = baseURL + "/register/free-membership/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expectedURL);
		logger.info("Navigated to SignUp Page successfully");
	}

	@Test(priority = 2)
	public void verifySignUp_ValidCredentials() throws InterruptedException {
		SignUpPage sp = new SignUpPage(driver);
		sp.setFirstName1("test1");
		sp.setLastName1("automation1");
		sp.setUsername1("hhptest1");
		sp.setEmail1("sukanyadev0905@gmail.com");
		sp.setEmailCofirmation("sukanyadev0905@gmail.com");
		sp.setPassword1("test1234");
		sp.setPasswordCofirmation1("test1234");
		sp.clickJoinUsBtn();
		Thread.sleep(1000);
		
		String expectedMsg ="Thank you for joining\n"
				+ "Human Health Project";
		Assert.assertEquals(sp.getSuccessMessage(), expectedMsg);
		
		String verifyEmailMsg = new StringBuilder().append("A verification email has been sent to\n")
				.append("your email address. Please verify\n")
				.append("your email first to log in.")
				.toString();
		Assert.assertEquals(sp.getVerifyEmail(), verifyEmailMsg);
	    driver.navigate().back();
	} 
	 
	/*Below is the error : Pass same data as in previous test @Test(priority=2) , error displayed for both user name and email
ERROR: This username has already been taken. If you are an existing user, please Login first. 
You will be redirected back here to complete your sign-up afterwards.
ERROR: This email address has already been used. If you are an existing user, please Login . 
You will be redirected back here to complete your sign-up afterwards.
	 */
	@Test(priority = 3)
	public void verifySignUp_InValidCredentials() throws InterruptedException {
		SignUpPage sp = new SignUpPage(driver);
		sp.setFirstName1("test1");
		sp.setLastName1("automation1");
		sp.setUsername1("hhptest1");
		sp.setEmail1("sukanyadev0905@gmail.com");
		sp.setEmailCofirmation("sukanyadev0905@gmail.com");
		sp.setPassword1("test1234");
		sp.setPasswordCofirmation1("test1234");
		sp.clickJoinUsBtn();
		Thread.sleep(1000);
		
		String errorMessage = new StringBuilder().append("ERROR: This username has already been taken. If you are an existing "
				+ "user, please Login first. You will be redirected back here to complete your sign-up afterwards.\n")
				.append("ERROR: This email address has already been used. If you are an existing user, "
						+ "please Login . You will be redirected back here to complete your sign-up afterwards.")
				.toString();
		Assert.assertEquals(sp.getErrorMessage(),errorMessage);
		//System.out.println(sp.getErrorMessage());
		logger.info("Signing Up with invalid credentials displayed an ERROR MESSAGE");
	} 
	
	@Test(priority=4)
	public void verifyLoginWithoutEmailVerification() {
			TestUtil.getHeader(driver).clickLoginBtn();
			LoginPage lp = new LoginPage(driver);
			lp.setUsername("hhptest1");
			lp.setPassword("test1234");
			lp.clickLoginBtn();
			lp.waitForSeconds(3);
			
			String errorMessage = new StringBuilder().append("ERROR: You need to verify your email address first to login. "
					+ "To get the verification email click on this link Resend verification email").toString();
			Assert.assertEquals(lp.getErrorMessage(),errorMessage);
			//System.out.println(lp.getErrorMessage());
			logger.info("Signing Up with invalid credentials displayed an ERROR MESSAGE");	
	}
}
