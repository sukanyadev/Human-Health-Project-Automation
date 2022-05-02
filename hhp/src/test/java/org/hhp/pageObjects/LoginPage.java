package org.hhp.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	protected WebDriver ldriver;
	
	@FindBy(xpath="//div[@class='fusion-text fusion-text-1']//span")
	WebElement loginFormHeading;
	
	@FindBy(xpath="//div[@class='fusion-text fusion-text-1']//p[2]")
	WebElement loginFormText;
	
	@FindBy(linkText="sign up here")
	WebElement signUpHere_Link;
	
	@FindBy(css="form#mepr_loginform")
	WebElement form;
	
	@FindBy(id="user_login")
	WebElement userName;
	
	@FindBy(id="user_pass")
	WebElement pwd;
	
	@FindBy(id="rememberme")
	WebElement rememberMe;
	
	@FindBy(id="wp-submit")
	WebElement loginBtn;
	
	@FindBy(linkText="Forgot Password")
	WebElement forgotPwd_Link;
	
	@FindBy(css="div#mepr_jump.mepr_error")
	WebElement loginError;
	
	public LoginPage(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	
	public String getLoginFormHeading() {
		return loginFormHeading.getText();
	}
	
	public String getLoginFormText() {
		return loginFormText.getText();
	}
	
	public void click_SignUpHere_Link() {
		signUpHere_Link.click();
	}
	
	public boolean get_Form_Status() {
		return form.isDisplayed();
	}
	
	public void setUsername(String username) {
		userName.clear();
		userName.sendKeys(username);
	}
	
	public void setPassword(String password) {
		pwd.clear();
		pwd.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public Boolean get_LoginError_Status() {
		return loginError.isDisplayed();
	}
	
	public String getErrorMessage() {
		return loginError.getText();
	}
	
	public void waitForSeconds(int seconds) {
		ldriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
}
