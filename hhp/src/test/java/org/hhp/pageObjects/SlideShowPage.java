package org.hhp.pageObjects;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlideShowPage {
	
	protected WebDriver ldriver;
	
	//Online events
	@FindBy(xpath="//li[@class='slide-id-15292 flex-active-slide']//div[@class='background background-image']")
	WebElement onlineEventsImg;
	
	@FindBy(xpath="//li[@class='slide-id-15292 flex-active-slide']//h2")
	WebElement onlineEventsHeading;
	
	@FindBy(xpath="//li[@class='slide-id-15292 flex-active-slide']//h3")
	WebElement onlineEventsCaption;
	
	@FindBy(xpath="//li[@class='slide-id-15292 flex-active-slide']//a[@href='https://dev.humanhealthproject.org/events/']")
	//@FindBy(linkText="VIEW EVENTS")
	WebElement viewEventsBtn;
	
	//Real Data
	@FindBy(xpath="//li[@class='slide-id-15293 flex-active-slide']//div[@class='background background-image']")
	WebElement realDataImg;
	
	@FindBy(xpath="//li[@class='slide-id-15293 flex-active-slide']//h2")
	WebElement realDataHeading;
	
	@FindBy(xpath="//li[@class='slide-id-15293 flex-active-slide']//h3")
	WebElement realDataCaption;
	
	@FindBy(xpath="//li[@class='slide-id-15293 flex-active-slide']//a[@href='https://dev.humanhealthproject.org/hhp-real-world-data-program/']")
	//@FindBy(linkText="VIEW DATA")
	WebElement viewDataBtn;
	
	// Donate to help us grow
	@FindBy(xpath="//li[@class='slide-id-15295 flex-active-slide']//div[@class='background background-image']")
	WebElement donateToHelpImg;
	
	@FindBy(xpath="//li[@class='slide-id-15295 flex-active-slide']//h2")
	WebElement donateToHelpHeading;
	
	@FindBy(xpath="//li[@class='slide-id-15295 flex-active-slide']//h3")
	WebElement donateToHelpCaption;
	
	@FindBy(xpath="//li[@class='slide-id-15295 flex-active-slide']//a[@href='https://dev.humanhealthproject.org/paypal-donate/']")
	//@FindBy(linkText="DONATE TODAY!")
	WebElement donateTodayBtn;
	
	//Learning academy
	@FindBy(xpath="//li[@class='slide-id-15296 flex-active-slide']//div[@class='background background-image']")
	WebElement learningAcademyImg;
				
	@FindBy(xpath="//li[@class='slide-id-15296 flex-active-slide']//h2")
	WebElement learningAcademyHeading;
				
	@FindBy(xpath="//li[@class='slide-id-15296 flex-active-slide']//h3")
	WebElement learningAcademyCaption;
				
	@FindBy(xpath ="//li[@class='slide-id-15296 flex-active-slide']//a[@href='https://dev.humanhealthproject.org/courses/patient-driven-data-diagnosis/']")
	//@FindBy(linkText="SIGNUP FOR OUR COURSE!")
	WebElement signUpForCourseBtn;
	
	//Navigation
	@FindBy(xpath="//li[@class='flex-nav-next']//a") 
	WebElement slideRight;
	
	@FindBy(xpath="//li[@class='flex-nav-prev']//a")
	WebElement slideLeft;
	
	//Alert
	@FindBy(xpath="//div[@class='gdpr gdpr-privacy-bar']//p")
	WebElement alertContent;
	
	@FindBy(xpath="//button[@class='gdpr-preferences']") //check
	WebElement alertPreferences;
	
	@FindBy(xpath="//button[@class='gdpr-agreement']") //check
	WebElement alertAgreement;
	
	@FindBy(xpath="//span[@class='gdpr-close']") //check
	WebElement alertClose;
	
	public SlideShowPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Online Events
	public boolean onlineEventsImgStatus() {
		return onlineEventsImg.isDisplayed();
	}
	
	public String getOnlineEventsHeading() {
		return onlineEventsHeading.getText();
	}
	
	public String getOnlineEventsCaption() {
		return onlineEventsCaption.getText();
	}
	
	public void clickViewEventsBtn() {
		WebDriverWait wait = new WebDriverWait(ldriver,5);
		wait.until(ExpectedConditions.elementToBeClickable(viewEventsBtn));
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", viewEventsBtn);
		viewEventsBtn.click();
	}
	
	//Real Data
	public boolean realDataImgStatus() {
		return realDataImg.isDisplayed();
	}
	
	public String getRealDataHeading() {
		return realDataHeading.getText();
	}
	
	public String getRealDataCaption() {
		return realDataCaption.getText();
	}
	
	public void clickViewDataBtn() {
		WebDriverWait wait = new WebDriverWait(ldriver,5);
		wait.until(ExpectedConditions.elementToBeClickable(viewDataBtn));
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", viewDataBtn);
		viewDataBtn.click();
	}
	
	//Donate To Help Us Grow
	public boolean donateToHelpImgStatus() {
		return donateToHelpImg.isDisplayed();
	}
	
	public String getDonateToHelpHeading() {
		return donateToHelpHeading.getText();
	}
	
	public String getDonateToHelpCaption() {
		return donateToHelpCaption.getText();
	}
	
	public void clickDonateTodayBtn() {
		WebDriverWait wait = new WebDriverWait(ldriver,5);
		wait.until(ExpectedConditions.elementToBeClickable(donateTodayBtn));
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", donateTodayBtn);
		donateTodayBtn.click();
	}
	
	//Learning Academy
	public boolean learningAcademyImgStatus() {
		return learningAcademyImg.isDisplayed();
	}
			
	public String getLearningAcademyHeading() {
		return learningAcademyHeading.getText();
	}
			
	public String getLearningAcademyCaption() {
		return learningAcademyCaption.getText();
	}
			
	public void clickSignUpForCourseBtn() {
		WebDriverWait wait = new WebDriverWait(ldriver,5);
		wait.until(ExpectedConditions.elementToBeClickable(signUpForCourseBtn));
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", signUpForCourseBtn);
		signUpForCourseBtn.click();
    }
		
	//Slide left and right
	public void clickSlideRight() {
		slideRight.click();
	}
	
	public void clickSlideLeft() {
		slideLeft.click();
	}
	
	public boolean slideRightStatus() {
		return slideRight.isDisplayed();
	}
	
	public boolean slideLeftStatus() {
		return slideLeft.isDisplayed();
	}
	
	//Alert in Home Page
	public String getAlertContent() {
		return alertContent.getText();
	}
	
	public void clickAlertPreferences() {
		alertPreferences.click();
	}
	
	public void clickAlertAgreement() {
		alertAgreement.click();
	}
	
	public void clickAlertClose() {
		alertClose.click();
	}
	
	public void waitAndClickNextSlide() {
		WebDriverWait wait = new WebDriverWait(ldriver,10);
		wait.until(ExpectedConditions.elementToBeClickable(slideRight));	
		Assert.assertTrue(slideRightStatus());
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", slideRight);
		slideRight.click();
	}
	
	public void clickNext(int times) {	
		for (int i =0; i<=times ; i++) {
		WebDriverWait wait = new WebDriverWait(ldriver,10);
		wait.until(ExpectedConditions.elementToBeClickable(slideRight));	
		Assert.assertTrue(slideRightStatus());
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", slideRight);
		slideRight.click();
		}
	}
	
	public void waitForSeconds(int seconds) {
		ldriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
}
