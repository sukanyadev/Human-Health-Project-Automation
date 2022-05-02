package org.hhp.testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.hhp.pageObjects.DonatePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.hhp.utilities.TestUtil;
import org.openqa.selenium.JavascriptExecutor;

public class DonatePageTest2 extends BaseTest{


	@Test(priority = 0)	
	public void donatePageSetup() throws IOException, InterruptedException {
		HeaderTest donateHeader = new HeaderTest();
		donateHeader.verifyDonateBtn();
		TestUtil.getHeader(driver).clickDonateBtn();
	}
	
	
//	@Test(dependsOnMethods = { "donatePageSetup" })
//	public void verifyHeader() throws IOException, InterruptedException {
//		HeaderTest donateHeader = new HeaderTest();
//		
//		donateHeader.verifyLogo();
//		donateHeader.logoClickTest();
//		donateHeader.verifyMedDisLnk();
//		donateHeader.verifyWhoWeAreLnk();
//		donateHeader.verifyWhatWeDoLnk();
//		donateHeader.verifyWhyHHPMenu();
//		donateHeader.verifyHowToHelpMenu();
//		donateHeader.verifyNewsMenu();
//	//	donateHeader.verifyDonateBtn();
//		donateHeader.verifyLoginBtn();
//		
//	}
	
//	@Test(priority = 1, dependsOnMethods = { "donatePageSetup" })
//	public void verifyFooter() throws InterruptedException {
//		FooterTest donateFooter = new FooterTest();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		
//		donateFooter.verify_Footer_Column1_Title();
//		donateFooter.verify_Footer_Column1_Chart();
//		donateFooter.verify_Footer_Column2_Text();
//		donateFooter.verify_Footer_Column2_Title();
//		donateFooter.verify_Guidestar_Image();
//		donateFooter.verify_Greatnonprofits_Image();
//		donateFooter.verify_Footer_Column3_Facebook_Icon();
//		donateFooter.verify_Footer_Column3_Twitter_Icon();
//		donateFooter.verify_Footer_Column3_Instagram_Icon();
//		donateFooter.verify_Footer_Column3_LinkedIn_Icon();
//		donateFooter.verify_Footer_Column3_QLinks_Text();
//		donateFooter.verify_Footer_Column3_Title();
//		donateFooter.verify_Footer_ContactUs_Link();
//		donateFooter.verify_Footer_TermsofService_Link();
//		donateFooter.verify_Footer_PrivacyPolicy_Link();
//		donateFooter.verify_Footer_MedicalDisclaimer_Link();
//}
//	@Test(priority = 0)	
//	public void verifyDonateBtn() throws IOException, InterruptedException{
//	//	DonatePage dp = new DonatePage(driver);
//	//	HomePage hp = new HomePage(driver);
//		TestUtil.getHeader(driver).clickDonateBtn();
//				
//	//	Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Donate To HHP – Human Health Project");
//		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), "https://dev.humanhealthproject.org/paypal-donate/");
//		logger.info("Verify donate page test passed. In Donate To HHP Page");
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyLogo() throws IOException {
//	//	DonatePage dp = new DonatePage(driver);
//		Assert.assertTrue(TestUtil.getHeader(driver).getHHPLogoStatus());
//		logger.info("Logo displayed");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn", "verifyLogo"})
//	public void logoClickTest() throws IOException, InterruptedException {
//		TestUtil.getHeader(driver).clickHHPLogo();
//		
//		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Human Health Project");
//		logger.info("Verify Logo click test passed.");
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyMedDisLnk() throws IOException, InterruptedException {
//		
//		TestUtil.getHeader(driver).clickMedDisLnk();
//		
//		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Medical Disclaimer – Human Health Project");
//		logger.info("Verify Medical Disclaimer link test passed.");
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyWhoWeAreLnk() throws IOException, InterruptedException {
//		
//		TestUtil.getHeader(driver).clickWhoWeAreLnk();
//		
//		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Who We Are – Human Health Project");
//		logger.info("Verify WhoWeAre link test passed.");
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyWhatWeDoLnk() throws IOException, InterruptedException {
//		
//		TestUtil.getHeader(driver).clickWhatWeDoLnk();
//		
//		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "what-we-do – Human Health Project");
//		logger.info("Verify WHAT WE DO link test passed.");
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyWhyHHPMenu() throws IOException, InterruptedException {
//		TestUtil.getHeader(driver).clickWhyHHPLnk();
//		logger.info("Verify Why HHP link test passed.");
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyHowToHelpMenu() throws IOException, InterruptedException {
//		TestUtil.getHeader(driver).clickHowToHelpLnk();
//		logger.info("Verify HOW TO HELP link test passed.");
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyNewsMenu() throws IOException, InterruptedException {
//		TestUtil.getHeader(driver).clickNewsLnk();
//		logger.info("Verify NEWS link test passed.");
//		Thread.sleep(1000);
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyLoginBtn() throws IOException, InterruptedException {
//		Thread.sleep(1000);
//	}
	/*
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Row1_Column1_Text1() throws IOException, InterruptedException {
		DonatePage dp = new DonatePage(driver);
		String actual_Row1_Column1_Text1 = dp.get_Row1_Column1_Text1();
		String expected_Row1_Column1_Text1 = new StringBuilder()
				.append("Donate to Help Us Grow")
				.toString();
		Assert.assertEquals(actual_Row1_Column1_Text1, expected_Row1_Column1_Text1);
		logger.info("Verify Row1_Column1_Text1 test passed.");
		
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Row1_Column1_Text2() throws IOException, InterruptedException {
		DonatePage dp = new DonatePage(driver);
		String actual_Row1_Column1_Text2 = dp.get_Row1_Column1_Text2();
		String expected_Row1_Column1_Text2 = new StringBuilder()
				.append("Human Health Project‘s (HHP) foundation is built upon peer-to-peer health information, education, and support. Through our programs, our objective is to empower individuals locally and globally to manage their health.")
				.toString();
		Assert.assertEquals(actual_Row1_Column1_Text2, expected_Row1_Column1_Text2);
		logger.info("Verify Row1_Column1_Text2 test passed.");
		
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = { "donatePageSetup"})
	public void verify_GiveToday_Btn() throws IOException, InterruptedException {
		DonatePage dp = new DonatePage(driver);
		dp.click_GiveToday_Btn();
		try {
			Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Donate");
			logger.info("Verify GiveToday Button passed.");
		}
		catch (AssertionError e) {
			logger.info("Captcha found. Test GiveToday button manually");
		}
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_GiveToday_Image() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_GiveToday_Image_Status());
		logger.info("GiveToday Image displayed");
	}
	
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Equality_Image() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Equality_Image_Status());
		logger.info("Equality Image displayed");
	}
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Information_Image() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Information_Image_Status());
		logger.info("Information Image displayed");
	}
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Education_Image() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Education_Image_Status());
		logger.info("Education Image displayed");
	}
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Support_Image() throws IOException {
		DonatePage dp = new DonatePage(driver);
		Assert.assertTrue(dp.get_Support_Image_Status());
		logger.info("Support Image displayed");
	}
	
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Information_Text() throws IOException {
		DonatePage dp = new DonatePage(driver);
		String actual_Information_Text = dp.get_Information_Text();
		String expected_Information_Text = new StringBuilder()
				.append("Information")
				.toString();
		Assert.assertEquals(actual_Information_Text, expected_Information_Text);
		logger.info("Information text displayed.");

	}
	
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Education_Text() throws IOException {
		DonatePage dp = new DonatePage(driver);
		String actual_Education_Text = dp.get_Education_Text();
		String expected_Education_Text = new StringBuilder()
				.append("Education")
				.toString();
		Assert.assertEquals(actual_Education_Text, expected_Education_Text);
		logger.info("Education text displayed.");

	}
	
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Support_Text() throws IOException {
		DonatePage dp = new DonatePage(driver);
		String actual_Support_Text = dp.get_Support_Text();
		String expected_Support_Text = new StringBuilder()
				.append("Support")
				.toString();
		Assert.assertEquals(actual_Support_Text, expected_Support_Text);
		logger.info("Support text displayed.");

	}
	
	@Test(dependsOnMethods = { "donatePageSetup" })
	public void verify_Row3_Text() throws IOException {
		DonatePage dp = new DonatePage(driver);
		String actual_Row3_Text = dp.get_Row3_Text();
		String expected_Row3_Text = new StringBuilder()
				.append("Unrestricted funds allow Human Health Project to allocate funds where they are needed most.\n")
				.append("If you wish to donate to a specific program, or have any questions, please contact us at mydonations@humanhealthproject.org")
				.toString();
		Assert.assertEquals(actual_Row3_Text, expected_Row3_Text);
		logger.info("Row3 text displayed.");

	}
	
	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifyNoOfSlides() {
//		DonatePage dp = new DonatePage(driver);
//		Assert.assertEquals(dp.getNoOfSlides(),2);
//		logger.info("Verify NoOfSlides test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void verifySlideText() {
//		DonatePage dp = new DonatePage(driver);
//		int slideSize = dp.getNoOfSlides();
//		ArrayList<String> slidesText = new ArrayList<String>(); 
//		for (int index=0; index< slideSize; index++ ) {
//			System.out.println("The index is: " + index);
//			
//			String slideText = dp.getSlideText(index);
//			
//			System.out.println("Slide text is: " + slideText +".");
//			slidesText.add(index , slideText);
//		}
//		Assert.assertEquals(slidesText.get(0), "Empower 250k+ people to make better health choices");
//		Assert.assertEquals(slidesText.get(1), "Empower 500 Patients Through Education");
//		logger.info("Verify slide text test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void veriyNoOfSlideImages() {
//		DonatePage dp = new DonatePage(driver);
//		Assert.assertEquals(dp.getNoOfSlideImages(),2);
//		logger.info("Verify No Of Slide Images test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void veriyNoOfRow4Images() {
//		DonatePage dp = new DonatePage(driver);
//		Assert.assertEquals(dp.getNoOfRow4Images(),2);
//		logger.info("Verify No Of Row4 Images test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void veriy_Row2_Text() {
//		DonatePage dp = new DonatePage(driver);
//		String actual_Row2_Text = dp.get_Row2_Text();
//		String expected_Row2_Text = new StringBuilder()
//				.append("Donate to Human Health Project to help us achieve our mission\n")
//				.append("to provide peer-to-peer information, education, and support to empower patients")
//				.toString();
//		Assert.assertEquals(actual_Row2_Text, expected_Row2_Text);
//		logger.info("Verify Row2 Text test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void veriy_Row4_Column1_Text() {
//		DonatePage dp = new DonatePage(driver);
//		String actual_Row4_Column1_Text = dp.get_Row4_Column1_Text();
//		String expected_Row4_Column1_Text = new StringBuilder()
//				.append("Empower 250k+ people to make better health choices\n")
//				.append("You’ve just been diagnosed with a medical condition. You are overwhelmed and desperately need accurate information. You need guidance on all the options available, but on the web, you find a sea of ads that leave you confused. This is where HHP’s IMPACT can help. You’ll find peer-to-peer data that can help you understand your condition and treatment options, combined with HHP’s Patient Education and Peer-to-Peer Navigation.")
//				.toString();
//		Assert.assertEquals(actual_Row4_Column1_Text, expected_Row4_Column1_Text);
//		logger.info("Verify Row4 column1 Text test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void veriy_Row4_Column2_Text() {
//		DonatePage dp = new DonatePage(driver);
//		String actual_Row4_Column2_Text = dp.get_Row4_Column2_Text();
//		String expected_Row4_Column2_Text = new StringBuilder()
//				.append("Empower 500 Patients Through Education\n")
//				.append("HHP’s Learning Academy helps participants become empowered patients, caregivers, and patient advocates by participating in self-paced online courses. This campaign will fund the Patient Empowerment 101 course which will teach learners about what it means to be an empowered patient, and why it is increasingly important to be proactive, informed, and invested in health care decisions. Course modules will include: Patient Empowerment & The ePatient Movement, Patient Rights and Health Literacy.")
//				.toString();
//		Assert.assertEquals(actual_Row4_Column2_Text, expected_Row4_Column2_Text);
//		logger.info("Verify Row4 column2 Text test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void veriy_Row3_Text() {
//		DonatePage dp = new DonatePage(driver);
//		String actual_Row3_Text = dp.get_Row3_Text();
//		String expected_Row3_Text = new StringBuilder()
//				.append(" Why Donors Support Human Health Project\n")
//				.append("To advance integrative medicine on a global level and understanding the need for patient advocacy and navigation – Anette")
//				.toString();
//		Assert.assertEquals(actual_Row3_Text, expected_Row3_Text);
//		logger.info("Verify Row3 Text test passed.");
//	}
//	
//	@Test(dependsOnMethods = { "verifyDonateBtn" })
//	public void veriy_Row5_Text() {
//		DonatePage dp = new DonatePage(driver);
//		String actual_Row5_Text = dp.get_Row5_Text();
//		String expected_Row5_Text = new StringBuilder()
//				.append("Our project is growing and we want you to be a part of it.\n")
//				.append("More People. More Information. Better Health.\n")
//				.append("JOIN US!")
//				.toString();
//		Assert.assertEquals(actual_Row5_Text, expected_Row5_Text);
//		logger.info("Verify Row5 Text test passed.");
//	}
	*/
}
