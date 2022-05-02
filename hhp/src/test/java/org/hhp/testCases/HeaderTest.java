package org.hhp.testCases;

import java.io.IOException;
import org.hhp.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest{
	
	@Test(priority=0)
	public void verifyLogo() throws IOException, InterruptedException {
		Assert.assertTrue(TestUtil.getHeader(driver).getHHPLogoStatus());
		logger.info("Logo displayed");
		TestUtil.getHeader(driver).clickHHPLogo();
		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Home - Human Health Project");
		logger.info("Verify Logo click test passed.");
	}
	
	@Test(priority=1)
	public void verifyMedDisLnk() throws IOException, InterruptedException {
		TestUtil.getHeader(driver).clickMedDisLnk();	
		TestUtil.getHeader(driver).waitForSeconds(3);
		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Medical Service Disclaimer - Human Health Project");
		logger.info("Verify Medical Disclaimer link test passed.");
		driver.navigate().back();
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
	
	@Test(priority=2)
	public void verifyWhoWeAreLnk() throws IOException, InterruptedException {
		TestUtil.getHeader(driver).clickWhoWeAreLnk();	
		logger.info("Verify WhoWeAre link test passed.");
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
	
	@Test(priority=3)
	public void verifyWhatWeDoLnk() throws IOException, InterruptedException {	
		TestUtil.getHeader(driver).clickWhatWeDoLnk();
		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "What We Do - Human Health Project");
		logger.info("Verify WHAT WE DO link test passed.");
		driver.navigate().back();
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
	
	@Test(priority=4)
	public void verifyWhyHHPMenu() throws IOException, InterruptedException {
		TestUtil.getHeader(driver).clickWhyHHPLnk();
		logger.info("Verify Why HHP link test passed.");
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
	
	@Test(priority=5)
	public void verifyHowToHelpMenu() throws IOException, InterruptedException {
		TestUtil.getHeader(driver).clickHowToHelpLnk();
		logger.info("Verify HOW TO HELP link test passed.");
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
	
	@Test(priority=6)
	public void verifyNewsMenu() throws IOException, InterruptedException {
		TestUtil.getHeader(driver).clickNewsLnk();
		logger.info("Verify NEWS link test passed.");
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
	
	@Test(priority=7)	
	public void verifyDonateBtn() throws IOException, InterruptedException{
		TestUtil.getHeader(driver).clickDonateBtn();
		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Paypal Donate - Human Health Project");
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), baseURL + "/paypal-donate/");
		logger.info("Verify donate page test passed.");
		driver.navigate().back();
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
	
	@Test(priority=8)
	public void verifyLoginBtn() throws IOException, InterruptedException {
		TestUtil.getHeader(driver).clickLoginBtn();
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), baseURL + "/login-2/");
		logger.info("Verify login button test passed. In Login Page");
		driver.navigate().back();
		TestUtil.getHeader(driver).waitForSeconds(5);
	}
/*	
	@Test(dependsOnMethods = { "headerSetup" })
	public void verifyHowToHelpMenu() throws IOException, InterruptedException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./log/headless_screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		TestUtil.getHeader(driver).clickHowToHelpLnk();
		logger.info("Verify HOW TO HELP link test passed.");
		Thread.sleep(1000);
	}
*/
}
