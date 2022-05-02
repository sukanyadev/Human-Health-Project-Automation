package org.hhp.pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	protected WebDriver ldriver;
	
	@FindBy(xpath="//a[@class='fusion-logo-link']/img[@class='fusion-standard-logo']")
	WebElement hhpLogo;
	
	@FindBy(linkText="MEDICAL DISCLAIMER")
	WebElement medDisLnk;
	
	@FindBy(linkText="WHAT WE DO")
	WebElement whatwedoLnk;
	
	@FindBy(linkText="REAL WORLD DATA")
	WebElement realWorldLnk;
	
	@FindBy(linkText="LEARNING ACADEMY")
	WebElement learningAcademyLnk;
	
	@FindBy(linkText="PATIENT ADVOCACY")
	WebElement patientAdvocacyLnk;
	
	@FindBy(linkText="ONLINE EVENTS")
	WebElement onlineEventsLnk;
	
	@FindBy(linkText="WHO WE ARE")
	WebElement whoweareLnk;
	
	@FindBy(linkText="ABOUT US")
	WebElement aboutUsLnk;
	
	@FindBy(linkText="MEET THE TEAM")
	WebElement meetTeamLnk;
	
	@FindBy(linkText="WHY HHP")
	WebElement whyhhpLnk;
	
	@FindBy(linkText="WHO WE SERVE")
	WebElement whoWeServeLnk;
	
	@FindBy(linkText="HOW TO HELP")
	WebElement howtohelpLnk;
	
	@FindBy(linkText="SUPPORT TO HHP")
	WebElement supportToHHPLnk;
	
	@FindBy(linkText="VOLUNTEER")
	WebElement volunteerLnk;
	
	@FindBy(linkText="REAL WORLD DATA")
	WebElement realLnk;
	
	@FindBy(linkText="PATIENT ADVOCACY")
	WebElement patientLnk;
	
	@FindBy(linkText="NEWS")
	WebElement newsLnk;
	
	@FindBy(linkText="BLOG")
	WebElement blogsLnk;
	
	@FindBy(linkText="DONATE")
	WebElement donateBtn;
	
	@FindBy(linkText="JOIN US / LOG IN")
	WebElement loginBtn;
	
	@FindBy(xpath="//li[@id='menu-item-14810']")
	WebElement personIcon;
	
	@FindBy(linkText="LOGOUT")
	WebElement logout;
	
	public Header(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	
	public DonatePage clickDonateBtn() {
		donateBtn.click();
		return new DonatePage(ldriver);
	}
	
	public LoginPage clickLoginBtn() {
		loginBtn.click();
		return new LoginPage(ldriver);
	}
	
	public Boolean getHHPLogoStatus() {
		return hhpLogo.isDisplayed();
	}
	
	public SlideShowPage clickHHPLogo() {
		hhpLogo.click();
		return new SlideShowPage(ldriver);
	}
	
	public MedicalDisclaimerPage clickMedDisLnk() {
		medDisLnk.click();
		return new MedicalDisclaimerPage(ldriver);
	}
	
	public WhatWeDoPage clickWhatWeDoLnk() {
		whatwedoLnk.click();
		return new WhatWeDoPage(ldriver);
	}
	
	public WhoWeArePage clickWhoWeAreLnk() {
		whoweareLnk.click();
		return new WhoWeArePage(ldriver);
	}
	
	public void clickWhyHHPLnk() {
		whyhhpLnk.click();
	}
	
	public void clickHowToHelpLnk() {
		howtohelpLnk.click();
	}
	
	public void clickNewsLnk() {
		newsLnk.click();
	}
	
	public Boolean getPersonIconStatus() {
		return personIcon.isDisplayed();
	}
	
	public void clickPersonIcon() {
		personIcon.click();
	}
	
	public void clickLogout() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(personIcon).perform();
		logout.click();
	}
	
	public void waitForSeconds(int seconds) {
		ldriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
}
