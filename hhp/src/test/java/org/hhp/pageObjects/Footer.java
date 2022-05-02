package org.hhp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	protected WebDriver ldriver;
	
	@FindBy(xpath="//section[@id='custom_html-12']//span")
	WebElement footer_Column1_Title;
	
	@FindBy(xpath="//section[@id='custom_html-12']//img")
	WebElement footer_Column1_Chart;
	
	@FindBy(xpath="//section[@id='custom_html-8']//span")
	WebElement footer_Column2_Title;
	
	@FindBy(xpath="//section[@id='custom_html-8']/div[@class='textwidget custom-html-widget']")
	WebElement footer_Column2_Text;
	
	@FindBy(xpath="//section[@id='custom_html-8']//a[@href='https://www.guidestar.org/profile/71-0891805']")
	WebElement footer_Column2_Guidestar_Image;
	
	@FindBy(xpath="//section[@id='custom_html-8']//a[@href='https://greatnonprofits.org/org/human-health-project']/img")
	WebElement footer_Column2_Greatnonprofits_Image;
	
	@FindBy(xpath="//section[@id='custom_html-15']//span")
	WebElement footer_Column3_Title;
	
	@FindBy(xpath="//section[@id='social_links-widget-6']//a[@href='https://www.facebook.com/humanhealthproject']")
	WebElement footer_Column3_Facebook_Icon;
	
	@FindBy(xpath="//section[@id='social_links-widget-6']//a[@href='https://twitter.com/HHPx']")
	WebElement footer_Column3_Twitter_Icon;
	
	@FindBy(xpath="//section[@id='social_links-widget-6']//a[@href='https://www.instagram.com/human_health_project/']")
	WebElement footer_Column3_Instagram_Icon;
	
	@FindBy(xpath="//section[@id='social_links-widget-6']//a[@href='https://www.linkedin.com/company/hhp/']")
	WebElement footer_Column3_LinkedIn_Icon;
	
	@FindBy(xpath="//section[@id='custom_html-5']")
	WebElement footer_Column3_QLinks_Text;
	
	@FindBy(linkText="Contact Us")
	WebElement footer_ContactUs_Link;
	
	@FindBy(linkText="Terms of Service")
	WebElement footer_TermsofService_Link;
	
	@FindBy(linkText="Privacy Policy")
	WebElement footer_PrivacyPolicy_Link;
	
	@FindBy(linkText="Medical Disclaimer")
	WebElement footer_MedicalDisclaimer_Link;
	
	public Footer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public String get_Footer_Column1_Title() {
		return footer_Column1_Title.getText();
	}
	
	public Boolean get_Footer_Column1_Chart_Status() {
		return footer_Column1_Chart.isDisplayed();
	}
	
	public String get_Footer_Column2_Title() {
		return footer_Column2_Title.getText();
	}
	
	public String get_Footer_Column2_Text() {
		return footer_Column2_Text.getText();
	}
		
	public void click_Guidestar_Image(WebDriver driver) {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//		jse.executeScript("scroll(0, 250)");
		
		footer_Column2_Guidestar_Image.click();
	}
	
	public void click_Greatnonprofits_Image(WebDriver driver) {
		footer_Column2_Greatnonprofits_Image.click();
	}
	
	public String get_Footer_Column3_Title() {
		return footer_Column3_Title.getText();
	}

	public void click_Footer_Column3_Facebook_Icon() {
		footer_Column3_Facebook_Icon.click();
	}
	
	public void click_Footer_Column3_Twitter_Icon() {
		footer_Column3_Twitter_Icon.click();
	}
	
	public void click_Footer_Column3_Instagram_Icon() {
		footer_Column3_Instagram_Icon.click();
	}
	
	public void click_Footer_Column3_LinkedIn_Icon() {
		footer_Column3_LinkedIn_Icon.click();
	}
		
	public String get_Footer_Column3_QLinks_Text() {
		return footer_Column3_QLinks_Text.getText();
	}
	
	public void click_Footer_ContactUs_Link() {
		footer_ContactUs_Link.click();
	}
	
	public void click_Footer_TermsofService_Link() {
		footer_TermsofService_Link.click();
	}
	
	public void click_Footer_PrivacyPolicy_Link() {
		footer_PrivacyPolicy_Link.click();
	}
	
	public void click_Footer_MedicalDisclaimer_Link() {
		footer_MedicalDisclaimer_Link.click();
	}
}
