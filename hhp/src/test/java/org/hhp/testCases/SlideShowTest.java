package org.hhp.testCases;

import org.hhp.pageObjects.SlideShowPage;
import org.hhp.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SlideShowTest extends BaseTest {

	@Test(priority=0)
	public void slideShowSetUp() throws InterruptedException {
		SlideShowPage hp = new SlideShowPage(driver);
		hp.waitForSeconds(5);
		hp.clickAlertClose();
		logger.info("Alert in Home Page is closed");
	}
	
	@Test(priority=1)
	public void verifyOnlineEventsSlide() throws InterruptedException {
		SlideShowPage hp = new SlideShowPage (driver);
		hp.waitForSeconds(5);
		hp.clickViewEventsBtn();
		String expectedURL = baseURL + "/events/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expectedURL);
		logger.info("Navigated to Events Page successfully");
		driver.navigate().back();
		hp.clickAlertClose();
	}

	@Test(priority=2)
	public void verifyRealDataSlide() throws InterruptedException {
		SlideShowPage hp = new SlideShowPage (driver);
		hp.waitForSeconds(5);
		hp.clickNext(0);
		hp.waitForSeconds(3);
		hp.clickViewDataBtn();
		String expectedURL = baseURL + "/hhp-real-world-data-program/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expectedURL);
		logger.info("Navigated to Real world program Page successfully");
		driver.navigate().back();
		hp.clickAlertClose();
	}
	
	@Test(priority=3) 
	public void verifyDonateToHelpGrowSlide() throws InterruptedException {
		SlideShowPage hp = new SlideShowPage (driver);
		hp.waitForSeconds(5);
		hp.clickNext(1);
		hp.waitForSeconds(3);
		hp.clickDonateTodayBtn();
		String expectedURL = baseURL + "/paypal-donate/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expectedURL);
		logger.info("Navigated to Paypal donate Page successfully");
		driver.navigate().back();
		hp.clickAlertClose();
	} 
}

