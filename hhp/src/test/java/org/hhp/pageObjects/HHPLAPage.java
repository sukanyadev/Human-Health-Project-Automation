package org.hhp.pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.hhp.utilities.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HHPLAPage {

	protected WebDriver ldriver;
	
	//Sign Up for a Course - HHP Learning Academy
	@FindBy(xpath="//div[@class='ld-course-status-segment ld-course-status-seg-status']//span[@class='ld-course-status-label']")
	WebElement courseLabel1;
	
	@FindBy(xpath="//span[@class='ld-status ld-status-waiting ld-tertiary-background']")
	WebElement courseStatusContent;
	
	@FindBy(xpath="//div[@class='ld-course-status-segment ld-course-status-seg-price']//span[@class='ld-course-status-label']")
	WebElement courseLabel2;
	
	@FindBy(xpath="//span[@class='ld-course-status-price']")
	WebElement priceAmount;
	
	@FindBy(xpath="//a[@href='https://docs.google.com/forms/d/e/1FAIpQLSdo2RhqcHf2UHBi0jX_94uQg8Pw1E_Bx2Urr3CeeaN_kP1bdA/viewform?usp=sf_link']")
	WebElement financialAid;
	
	@FindBy(xpath="//div[@class='ld-course-status-segment ld-course-status-seg-action status-closed']//span[@class='ld-course-status-label']")
	WebElement courseLabel3;
	
	@FindBy(xpath="//a[@href='https://dev.humanhealthproject.org/cart/?add-to-cart=15367']")
	WebElement takeThisCourse;

	
	public HHPLAPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//HHP Learning Academy
		public String getCourseLabel1() {
			return courseLabel1.getText();
		}
		
		public String getCourseContent() {
			return courseStatusContent.getText();
		}
		
		public String getCourseLabel2() {
			return courseLabel2.getText();
		}
		
		public String getPriceAmount() {
			return priceAmount.getText();
		}
		
		public void clickFinancialAid() {
			financialAid.click();
		}
		
		public String getCourseLabel3() {
			return courseLabel3.getText();
		}
		
		public void clickTakeThisCourse() {
			takeThisCourse.click();
		}
		
		//Get Title of the new window opened and close it
		public void handleFinancialAidWindow() {
			String parent=ldriver.getWindowHandle();
			Set<String>s=ldriver.getWindowHandles();
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
			ldriver.switchTo().window(child_window);
			System.out.println(ldriver.switchTo().window(child_window).getTitle());
			Assert.assertEquals(TestUtil.verifyTitle(ldriver).toString(), "HHP Financial Aid Application");
			ldriver.close();
			}
			}
			//switch to the parent window
			ldriver.switchTo().window(parent);
    }
}