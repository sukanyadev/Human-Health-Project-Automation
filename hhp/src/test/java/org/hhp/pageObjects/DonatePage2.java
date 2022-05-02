package org.hhp.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DonatePage2 {

	 protected WebDriver ldriver;
	 //commented for paypal donate page change
//	 @FindBy(css="ul.slides h2")
//	 List<WebElement> slides;
//	 
//	 @FindBy(css="ul.slides div.background")
//	 List<WebElement> bgSlideImages;
//	 
//	 @FindBy(css="span img.img-responsive")
//	 List<WebElement> row4_Images;
//	 
//	 @FindBy(css="div.fusion-builder-row-2 div.fusion-text-1")
//	 WebElement row2_Text;
//	 
//	 @FindBy(css="div.fusion-builder-row-4 div.fusion-text-2")
//	 WebElement row4_Column1_Text;
//	 
//	 @FindBy(css="div.fusion-builder-row-4 div.fusion-text-3")
//	 WebElement row4_Column2_Text;
//	 
//	 @FindBy(css="div.fusion-builder-row-3 q.fusion-clearfix")
//	 WebElement row3_Text;
//	 
//	 @FindBy(css="div.fusion-builder-row-5")
//	 WebElement row5_Text;
//	 
//	 @FindBy(linkText="JOIN US!")
//	 WebElement joinUsBtn;
	 
	 @FindBy(css="div.fusion-builder-row-1 div.fusion-builder-column-0 div.fusion-text-1 h2")
	 WebElement row1_Column1_Text1;
	 
	 @FindBy(css="div.fusion-builder-row-1 div.fusion-builder-column-0 div.fusion-text-2 p")
	 WebElement row1_Column1_Text2;
	 
	 @FindBy(xpath="//a[@aria-label='GIVE-Button-1']")
	 WebElement giveToday_Btn;
	 
	 @FindBy(css="div.fusion-builder-row-1 div.fusion-builder-column-0 span.imageframe-1 img")
	 WebElement giveToday_Image;
	 
	 @FindBy(css="div.fusion-builder-row-1 div.fusion-builder-column-1 span.imageframe-2 img")
	 WebElement equality_Image;
	 
	 @FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-2 span.imageframe-3 img")
	 WebElement information_Image;
	 
	 @FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-3 span.imageframe-4 img")
	 WebElement education_Image;
	 
	 @FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-4 span.imageframe-5 img")
	 WebElement support_Image;
	 
	 @FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-2 div.fusion-text-3 p")
	 WebElement information_Text;
	 
	 @FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-3 div.fusion-text-4 p")
	 WebElement education_Text;
	 
	 @FindBy(css="div.fusion-builder-row-2 div.fusion-builder-column-4 div.fusion-text-5 p")
	 WebElement support_Text;
	 
	 @FindBy(css="div.fusion-builder-row-3 div.fusion-text-6")
	 WebElement row3_Text;
	 
	 public DonatePage2(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 public String get_Row1_Column1_Text1() {
		 return row1_Column1_Text1.getText();
	 }
	 
	 public String get_Row1_Column1_Text2() {
		 return row1_Column1_Text2.getText();
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
	 
	 public String get_Row3_Text() {
		 return row3_Text.getText();
	 }
//
	 
//	 public int getNoOfSlides() {
//		 int noOfSlides = slides.size();
//		 System.out.println("slides.size is: "+ noOfSlides);
//		 return noOfSlides;
//	 }
//	 
//	 public String getSlideText(int index) {
//		 
//		 String slideText = slides.get(index).getText();
//		 if(slideText.equals("")) {
//			 WebDriverWait w = new WebDriverWait(ldriver, 5);
//			 w.until(ExpectedConditions.
//					 visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fusion-title-2')]"))
//					 );
//			 slideText = slides.get(index).getText();
//		 }
//		 return slideText;
//	 }
//	 
//	 public int getNoOfSlideImages() {
//		 int noOfSlideImages = bgSlideImages.size();
//		 System.out.println("Number Of SlideImages is: "+ noOfSlideImages);
//		 return noOfSlideImages;
//	 }
//	 
//	 public int getNoOfRow4Images() {
//		 int noOfRow4Images = row4_Images.size();
//		 System.out.println("Number Of row 4 Images is: "+ noOfRow4Images);
//		 return noOfRow4Images;
//	 }
//	 
//	 public String get_Row2_Text() {
//		 return row2_Text.getText();
//	 }
//	 
//	 public String get_Row4_Column1_Text() {
//		 return row4_Column1_Text.getText();
//	 }
//	 
//	 public String get_Row4_Column2_Text() {
//		 return row4_Column2_Text.getText();
//	 }
//	 
//	 public String get_Row3_Text() {
//		 return row3_Text.getText();
//	 }
//	 
//	 public String get_Row5_Text() {
//		 return row5_Text.getText();
//	 }
	 

}
