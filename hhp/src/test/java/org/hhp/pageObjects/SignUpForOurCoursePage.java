package org.hhp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpForOurCoursePage {
	
	
	protected WebDriver ldriver;
	
	//SignUp form - check for form, other text validations
	
	@FindBy(xpath="//a[@id='hhp_login_link']")
	WebElement logInHere_Link2;
	
	@FindBy(id="user_first_name2")
	WebElement firstName2;
	
	@FindBy(id="user_last_name2")
	WebElement lastName2;
	
	@FindBy(id="user_login2")
	WebElement userName2;
	
	@FindBy(id="user_email2")
	WebElement eMail2;
	
	@FindBy(id="user_validate_email")
	WebElement eMailConfirm;
	
	@FindBy(id="mepr_user_passwor2")
	WebElement pwd2;
	
	@FindBy(id="mepr_user_password_confir2")
	WebElement pwdConfirm2;
	
	@FindBy(linkText="Privacy Policy")
	WebElement privacyPolicy_Link2;
	
	@FindBy(linkText="Terms of Use")
	WebElement termsOfUse_Link2;
	
	@FindBy(css="input.mepr-submit")
	WebElement joinUs_Btn2;
	
	/*
	@FindBy(css="div#mepr_jump.mepr_error") //check
	WebElement error2; */
	
	//LoginForm
	
	@FindBy(id="user_login")
	WebElement userName;
	
	@FindBy(id="user_pass")
	WebElement pwd;
	
	@FindBy(id="rememberme")
	WebElement rememberMe;
	
	@FindBy(id="wp-submit")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@href='https://dev.humanhealthproject.org/login-2/?action=forgot_password']")
	WebElement forgotPwd_Link;
	
	/*
	@FindBy(xpath="//div[@id='mepr_jump']")
	WebElement loginError;
	*/
	
	public SignUpForOurCoursePage(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	
	//SignUp form
	public void click_LoginHere_Link2() {
		logInHere_Link2.click();
	}
	public void setFirstName2(String firstname) {
		firstName2.clear();
		firstName2.sendKeys(firstname);
	}
	public void setLastName2(String lastname) {
		lastName2.clear();
		lastName2.sendKeys(lastname);
	}
	public void setUsername2(String username) {
		userName2.clear();
		userName2.sendKeys(username);
	}
	public void setEmail2(String email) {
		eMail2.clear();
		eMail2.sendKeys(email);
	}
	public void setPassword2(String password) {
		pwd2.clear();
		pwd2.sendKeys(password);
	}
	public void setPasswordCofirmation2(String passwordConfirm) {
		pwdConfirm2.clear();
		pwdConfirm2.sendKeys(passwordConfirm);
	}
	public void click_JoinUs_Btn2() {
		joinUs_Btn2.click();
	}
	public void click_PrivacyPolicy_Link2() {
		privacyPolicy_Link2.click();
	}
	public void click_TermsOfUse_Link() {
		termsOfUse_Link2.click();
	}
	/*public Boolean get_Error2Status() {
		return error2.isDisplayed();
	}*/
	
	//Login form
	public void setUsername(String username) {
		userName.clear();
		userName.sendKeys(username);
	}
	
	public void setPassword(String password) {
		pwd.clear();
		pwd.sendKeys(password);
	}
	
	public void click_LoginBtn() {
		loginBtn.click();
	}
	
	/*public Boolean get_LoginError_Status() {
		return loginError.isDisplayed();
	}*/
}
