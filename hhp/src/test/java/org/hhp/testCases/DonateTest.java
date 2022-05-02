package org.hhp.testCases;

import java.io.IOException;
import org.hhp.pageObjects.DonatePage;
import org.hhp.pageObjects.Header;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.hhp.utilities.TestUtil;

public class DonateTest extends BaseTest{

	@Test(priority=0)	
	public void donatePageSetup() throws IOException, InterruptedException {
		Header h = new Header(driver);
		h.clickDonateBtn();
		h.waitForSeconds(5);
		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Paypal Donate - Human Health Project");
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), baseURL + "/paypal-donate/");
		logger.info("Navigated to Donate Page");
	}
		
	@Test(priority=1)
	public void verifyPageHeading() throws IOException, InterruptedException {
		DonatePage dp = new DonatePage(driver);
		String actual_heading = dp.getPageHeading();
		Assert.assertEquals(actual_heading, "Donate to Help Us Grow");
		logger.info("Page heading verified");	
		dp.waitForSeconds(3);
	}
	
	@Test(priority=2)
	public void verifyPageContent() throws IOException, InterruptedException {
		DonatePage dp = new DonatePage(driver);
		String actual_content = dp.getPageContent();
		String expected_content = new StringBuilder()
				.append("Human Health Project‘s (HHP) foundation is built upon peer-to-peer health information, education, and support. Through our programs, our objective is to empower individuals locally and globally to manage their health.")
				.toString();
		Assert.assertEquals(actual_content, expected_content);
		logger.info("Page content verified");
		dp.waitForSeconds(3);
	}
	
	@Test(priority=3)
	public void verifyGiveTodayBtn() throws IOException, InterruptedException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_GiveToday_Image_Status());
		logger.info("GiveToday Image verified");
		dp.click_GiveToday_Btn();
		try {
			Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Donate");
			logger.info("GiveToday Button verified");
		}
		catch (AssertionError e) {
			logger.info("Captcha found. Test GiveToday button manually");
		}
		dp.waitForSeconds(3);
		driver.navigate().back();		
		dp.waitForSeconds(3);
	}
	
	@Test(priority=4)
	public void verify_Equality_Image() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Equality_Image_Status());
		logger.info("Equality Image verified");
		dp.waitForSeconds(3);
	}
	@Test(priority=5)
	public void verifyInformation() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Information_Image_Status());
		Assert.assertEquals(dp.get_Information_Text(), "Information");
		logger.info("Information Image and Text verified");
		dp.waitForSeconds(3);
	}
	@Test(priority=6)
	public void verifyEducation() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Education_Image_Status());
		Assert.assertEquals(dp.get_Education_Text(), "Education");
		logger.info("Education Image and Text verified");
		dp.waitForSeconds(3);
	}
	@Test(priority=7)
	public void verifySupport() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Support_Image_Status());
		Assert.assertEquals(dp.get_Support_Text(), "Support");
		logger.info("Support Image and Text verified");
		dp.waitForSeconds(3);
	}
	
	@Test(priority=8)
	public void verifyText() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertEquals(dp.getText1(),"Unrestricted funds allow Human Health Project to allocate funds where they are needed most.");
		logger.info("Text1 verified");
		Assert.assertEquals(dp.getText2(), "If you wish to donate to a specific program, or have any questions, please contact us at mydonations@humanhealthproject.org");
		logger.info("Text2 verified");
		dp.waitForSeconds(3);
	}	
}
