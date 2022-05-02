package org.hhp.testCases;

import java.util.ArrayList;

import org.hhp.utilities.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest{
	@Test(priority = 0)	
	public void footer_Setup() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_Column1_Title() {
		Assert.assertEquals(TestUtil.getFooter(driver).get_Footer_Column1_Title(),"How we use funds");
		logger.info("Footer Column1 Title \"How we use funds\" found");
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_Column1_Chart() {
		Assert.assertTrue(TestUtil.getFooter(driver).get_Footer_Column1_Chart_Status());
		logger.info("Footer Column1 Chart is displayed");
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_Column2_Title() {
		Assert.assertEquals(TestUtil.getFooter(driver).get_Footer_Column2_Title(),"About");
		logger.info("Verify Footer_Column2_Title test passed.");
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_Column2_Text() {
		String actual_Footer_Column2_Text = TestUtil.getFooter(driver).get_Footer_Column2_Text();
		String expected_Footer_Column2_Text = new StringBuilder()
				.append("About\n")
				.append("Human Health Project is a Northern Ireland (UK) registered charity and a tax exempt 501(c)(3) Public Charity in the US.\n")
				.append("\n"
						+ "EIN: 71-0891805 | NI Charity No. 101323\n                  ")
				.toString();
		Assert.assertEquals(actual_Footer_Column2_Text, expected_Footer_Column2_Text);
		logger.info("Verify Footer_Column2_Text test passed.");
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Guidestar_Image() {
		String currentPageHandle = driver.getWindowHandle();   
		TestUtil.getFooter(driver).click_Guidestar_Image(driver);
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());
		String pageTitle = "HUMAN HEALTH PROJECT - GuideStar Profile";
		boolean myNewTabFound = false;

		for(String eachHandle : tabHandles)
		{
		    driver.switchTo().window(eachHandle);
		    // Check Your Page Title 
		    if(driver.getTitle().equalsIgnoreCase(pageTitle))
		    {
		        // Report ur new tab is found with appropriate title 


		        myNewTabFound = true;           
		    }
		}
        //Close the current tab
        driver.close(); // Note driver.quit() will close all tabs

        //Swithc focus to Old tab
        driver.switchTo().window(currentPageHandle);
		if(myNewTabFound)
		{
			logger.info("GuideStar link opened in new tab");     
		}
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Greatnonprofits_Image() {
		String currentPageHandle = driver.getWindowHandle(); 
		TestUtil.getFooter(driver).click_Greatnonprofits_Image(driver);
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());
		
		String pageTitle = "Human Health Project Reviews and Ratings | Los Angeles, CA | Donate, Volunteer, Review | GreatNonprofits";
		boolean myNewTabFound = false;

		for(String eachHandle : tabHandles)
		{
		    driver.switchTo().window(eachHandle);
		    // Check Your Page Title 
		    if(driver.getTitle().equalsIgnoreCase(pageTitle))
		    {
		        // Report ur new tab is found with appropriate title 


		        myNewTabFound = true;           
		    }
		}
        //Close the current tab
        driver.close(); // Note driver.quit() will close all tabs

        //Switch focus to Old tab
        driver.switchTo().window(currentPageHandle);
		if(myNewTabFound)
		{
			logger.info("Great Non profits link opened in new tab");      
		}
	}
	
	@Test(dependsOnMethods = { "footer_Setup" }) //failed
	public void verify_Footer_Column3_Title() {
		Assert.assertEquals(TestUtil.getFooter(driver).get_Footer_Column3_Title(),"Connect with us:");
		logger.info("Verify Footer_Column3_Title test passed.");
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_Column3_Facebook_Icon() {
		String currentPageHandle = driver.getWindowHandle(); 
		TestUtil.getFooter(driver).click_Footer_Column3_Facebook_Icon();
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());
		String pageTitle = "Human Health Project - Home | Facebook";
		boolean myNewTabFound = false;

		for(String eachHandle : tabHandles)
		{
		    driver.switchTo().window(eachHandle);
		    // Check Your Page Title 
		    if(driver.getTitle().equalsIgnoreCase(pageTitle))
		    {
		        // Report ur new tab is found with appropriate title 


		        myNewTabFound = true;           
		    }
		}
        //Close the current tab
        driver.close(); // Note driver.quit() will close all tabs

        //Switch focus to Old tab
        driver.switchTo().window(currentPageHandle);
		if(myNewTabFound)
		{
			logger.info("Facebook opened in new tab");     
		}
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })//failed
	public void verify_Footer_Column3_Twitter_Icon() throws InterruptedException {
		String currentPageHandle = driver.getWindowHandle(); 
		String actualTitle = "";
		Thread.sleep(1000);
		TestUtil.getFooter(driver).click_Footer_Column3_Twitter_Icon();
		
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());
		String pageTitle = "Human Health Project (@HHPx) / Twitter";
		boolean myNewTabFound = false;

		for(String eachHandle : tabHandles)
		{
		    driver.switchTo().window(eachHandle);
		    Thread.sleep(1000);
		    actualTitle = driver.getTitle();
		    // Check Your Page Title 
		    if(actualTitle.equalsIgnoreCase(pageTitle))
		    {
		        // Report ur new tab is found with appropriate title 


		        myNewTabFound = true;           
		    }
		}
		Thread.sleep(1000);
        //Close the current tab
        driver.close(); // Note driver.quit() will close all tabs

        //Switch focus to Old tab
        driver.switchTo().window(currentPageHandle);
		Thread.sleep(1000);
		if(myNewTabFound)
		{
			logger.info("Twitter opened in new tab");     
		}
		else {
			System.out.println("Actual title is " + actualTitle);
		}
	}
	
	@Test(dependsOnMethods = { "footer_Setup" }) //failed
	public void verify_Footer_Column3_Instagram_Icon() throws InterruptedException {
		String currentPageHandle = driver.getWindowHandle(); 
		Thread.sleep(1000);
		TestUtil.getFooter(driver).click_Footer_Column3_Instagram_Icon();
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());
		String pageTitle = "Human Health Project (@human_health_project) • Instagram photos and videos";
		boolean myNewTabFound = false;

		for(String eachHandle : tabHandles)
		{
		    driver.switchTo().window(eachHandle);
		    Thread.sleep(1000);
		    // Check Your Page Title 
		    if(driver.getTitle().equalsIgnoreCase(pageTitle))
		    {
		        // Report ur new tab is found with appropriate title 


		        myNewTabFound = true;           
		    }
		}
        //Close the current tab
        driver.close(); // Note driver.quit() will close all tabs

        //Switch focus to Old tab
        driver.switchTo().window(currentPageHandle);
		Thread.sleep(1000);
		if(myNewTabFound)
		{
			logger.info("Instagram opened in new tab");       
		}
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_Column3_LinkedIn_Icon() throws InterruptedException {
		String currentPageHandle = driver.getWindowHandle(); 
		String actualTitle = "";
		Thread.sleep(1000);
		TestUtil.getFooter(driver).click_Footer_Column3_LinkedIn_Icon();
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());
	//	String pageTitle = "Human Health Project | LinkedIn";
		String pageTitle = "Sign Up | LinkedIn";
		boolean myNewTabFound = false;

		for(String eachHandle : tabHandles)
		{
			Thread.sleep(1000);
		    driver.switchTo().window(eachHandle);
		    actualTitle = driver.getTitle();
		    // Check Your Page Title 
		    if(driver.getTitle().equalsIgnoreCase(pageTitle))
		    {
		        // Report ur new tab is found with appropriate title 

		        myNewTabFound = true;           
		    }
		    else {
				System.out.println("Actual title is " + actualTitle);
			}
		}
        //Close the current tab
        driver.close(); // Note driver.quit() will close all tabs

        //Switch focus to Old tab
        driver.switchTo().window(currentPageHandle);
		Thread.sleep(1000);       
		if(myNewTabFound)
		{
		    logger.info("LinkedIn opened in new tab");     
		}
	}
	
	@Test(dependsOnMethods = { "footer_Setup" }) //failed
	public void verify_Footer_Column3_QLinks_Text() {
		String actual_Footer_Column3_QLinks_Text = TestUtil.getFooter(driver).get_Footer_Column3_QLinks_Text();
		String expected_Footer_Column3_QLinks_Text = new StringBuilder()
				.append("Quick Links\n")
				.append("Contact Us\n")
				.append("Terms of Service\n")
				.append("Privacy Policy\n")
				.append("Medical Disclaimer")
				.toString();
		Assert.assertEquals(actual_Footer_Column3_QLinks_Text, expected_Footer_Column3_QLinks_Text);
		logger.info("Verify Footer_Column3_QLinks_Text test passed.");
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_ContactUs_Link() throws InterruptedException {
		TestUtil.getFooter(driver).click_Footer_ContactUs_Link();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_TermsofService_Link() throws InterruptedException {
		TestUtil.getFooter(driver).click_Footer_TermsofService_Link();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_PrivacyPolicy_Link() throws InterruptedException {
		TestUtil.getFooter(driver).click_Footer_PrivacyPolicy_Link();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = { "footer_Setup" })
	public void verify_Footer_MedicalDisclaimer_Link() throws InterruptedException {
		TestUtil.getFooter(driver).click_Footer_MedicalDisclaimer_Link();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
}
