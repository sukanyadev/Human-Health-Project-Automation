package org.hhp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	protected WebDriver ldriver;
	
	@FindBy(linkText="log in here")
	WebElement logInHere_Link;
	
	@FindBy(id="user_first_name1")
	WebElement firstName1;
	
	@FindBy(id="user_last_name1")
	WebElement lastName1;
	
	@FindBy(id="user_login1")
	WebElement userName1;
	
	@FindBy(id="user_email1")
	WebElement eMail1;
	
	@FindBy(id="user_validate_email")
	WebElement eMailConfirm;
	
	@FindBy(id="mepr_user_password1")
	WebElement pwd1;
	
	@FindBy(id="mepr_user_password_confirm1")
	WebElement pwdConfirm1;
	
	@FindBy(css="input.mepr-submit")
	WebElement joinUsBtn;
	
	@FindBy(xpath="//div[@id='mepr_jump']")
	WebElement error;
	
	@FindBy(xpath="//form[@class='mepr-signup-form mepr-form']//a[@href='https://dev.humanhealthproject.org/privacy-policy/']")
	WebElement privacyPolicyLink;
	
	@FindBy(xpath="//form[@class='mepr-signup-form mepr-form']//a[@href='https://dev.humanhealthproject.org/terms-of-service/']")
	WebElement termsOfUseLink;
	
	@FindBy(xpath="//div[@class='content-container']//h1")
	WebElement successMessage;
	
	@FindBy(xpath="//div[@class='content-container']//h3")
	WebElement verifyEmail;

	public SignUpPage(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	
	public void click_LoginHere_Link() {
		logInHere_Link.click();
	}
	public void setFirstName1(String firstname) {
		firstName1.clear();
		firstName1.sendKeys(firstname);
	}
	public void setLastName1(String lastname) {
		lastName1.clear();
		lastName1.sendKeys(lastname);
	}
	public void setUsername1(String username) {
		userName1.clear();
		userName1.sendKeys(username);
	}
	public void setEmail1(String email) {
		eMail1.clear();
		eMail1.sendKeys(email);
	}
	public void setEmailCofirmation(String emailConfirm) {
		eMailConfirm.clear();
		eMailConfirm.sendKeys(emailConfirm);
	}
	public void setPassword1(String password) {
		pwd1.clear();
		pwd1.sendKeys(password);
	}
	public void setPasswordCofirmation1(String passwordConfirm) {
		pwdConfirm1.clear();
		pwdConfirm1.sendKeys(passwordConfirm);
	}
	public void clickJoinUsBtn() {
		joinUsBtn.click();
	}
	public void clickPrivacyPolicyLink() {
		privacyPolicyLink.click();
	}
	public void clickTermsOfUseLink() {
		termsOfUseLink.click();
	}
	public Boolean getErrorStatus() {
		return error.isDisplayed();
	}
	public String getErrorMessage() {
		return error.getText();
	}
	
	public String getSuccessMessage() {
		return successMessage.getText();
	}
	public String getVerifyEmail() {
		return verifyEmail.getText();
	}
}
