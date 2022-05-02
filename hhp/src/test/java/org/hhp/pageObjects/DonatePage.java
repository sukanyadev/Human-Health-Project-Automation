package org.hhp.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DonatePage {

	 protected WebDriver ldriver;
	 
	 @FindBy(xpath="//div[@class='fusion-text fusion-text-1']//h2")
	 WebElement pageHeading;
	 
	 @FindBy(xpath="//div[@class='fusion-text fusion-text-2']//p")
	 WebElement pageContent;
	 
	 @FindBy(xpath="//a[@aria-label='GIVE-Button-1']")
	 WebElement giveToday_Btn;
	 
	 //@FindBy(css="div.fusion-builder-row-1 div.fusion-builder-column-0 span.imageframe-1 img")
	 @FindBy(xpath="//img[@class='img-responsive wp-image-15430']")
	 WebElement giveToday_Image;
	 
	 //@FindBy(css="div.fusion-builder-row-1 div.fusion-builder-column-1 span.imageframe-2 img")
	 @FindBy(xpath="//img[@class='img-responsive wp-image-15429']")
	 WebElement equality_Image;
	 
	//@FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-2 span.imageframe-3 img")
	 @FindBy(xpath="//img[@class='img-responsive wp-image-15432']")
	 WebElement information_Image;
	 
	 //@FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-3 span.imageframe-4 img")
	 @FindBy(xpath="//img[@class='img-responsive wp-image-15433']")
	 WebElement education_Image;
	 
	 //@FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-4 span.imageframe-5 img")
	 @FindBy(xpath="//img[@class='img-responsive wp-image-15434']")
	 WebElement support_Image;
	 
	 @FindBy(xpath="//div[@class='fusion-text fusion-text-3']//p")
	 WebElement information_Text;
	 
	 @FindBy(xpath="//div[@class='fusion-text fusion-text-4']//p")
	 WebElement education_Text;
	 
	 @FindBy(xpath="//div[@class='fusion-text fusion-text-5']//p")
	 WebElement support_Text;
	 
	 @FindBy(xpath="//div[@class='fusion-text fusion-text-6']//p[1]")
	 WebElement text1;
	 
	 @FindBy(xpath="//div[@class='fusion-text fusion-text-6']//p[2]")
	 WebElement text2;
	 
	 public DonatePage(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 public String getPageHeading() {
		 return pageHeading.getText();
	 }
	 
	 public String getPageContent() {
		 return pageContent.getText();
	 }
	 
	 public void click_GiveToday_Btn() {
		 giveToday_Btn.click();
	 }
	 
	 public Boolean get_GiveToday_Image_Status() {
		 return giveToday_Image.isDisplayed();
	 }
	 
	 public Boolean get_Equality_Image_Status() {
		 return equality_Image.isDisplayed();
	 }
	 
	 public Boolean get_Information_Image_Status() {
		 return information_Image.isDisplayed();
	 }
	 
	 public Boolean get_Education_Image_Status() {
		 return education_Image.isDisplayed();
	 }
	 
	 public Boolean get_Support_Image_Status() {
		 return support_Image.isDisplayed();
	 }
	 
	 public String get_Information_Text() {
		 return information_Text.getText();
	 }
	 
	 public String get_Education_Text() {
		 return education_Text.getText();
	 }
	 
	 public String get_Support_Text() {
		 return support_Text.getText();
	 }
	 
	 public String getText1() {
		 return text1.getText();
	 }
	 
	 public String getText2() {
		 return text2.getText();
	 }
	 
	 public void waitForSeconds(int seconds) {
			ldriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}
}
