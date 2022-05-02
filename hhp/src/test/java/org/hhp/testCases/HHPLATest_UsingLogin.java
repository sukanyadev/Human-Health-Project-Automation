package org.hhp.testCases;

import java.io.IOException;

import org.hhp.pageObjects.AddToCartPage;
import org.hhp.pageObjects.CheckoutPage;
import org.hhp.pageObjects.HHPLAPage;
import org.hhp.pageObjects.LoginPage;
import org.hhp.pageObjects.SlideShowPage;
import org.hhp.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HHPLATest_UsingLogin extends BaseTest {

	@Test(priority=0)
	public void verifyLoginForCoursePurchase() throws IOException, InterruptedException {
			TestUtil.getHeader(driver).clickLoginBtn();
			LoginPage lp = new LoginPage(driver);
			lp.setUsername("hhptest1");
			lp.setPassword("test1234");
			lp.clickLoginBtn();
			lp.waitForSeconds(3);
			Assert.assertEquals(TestUtil.verifyURL(driver).toString(), "https://dev.humanhealthproject.org/");
			Assert.assertTrue(TestUtil.getHeader(driver).getPersonIconStatus());
			logger.info("Log in with valid credentials was successful. Test passed");
		}
	
	@Test(priority=1)
	public void learningAcademySetUp() {	
		SlideShowPage hp = new SlideShowPage (driver);
		hp.waitForSeconds(5);
		hp.clickNext(2);
		hp.waitForSeconds(3);
		hp.clickSignUpForCourseBtn();
		String expectedURL = baseURL + "/courses/patient-driven-data-diagnosis/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expectedURL);
		logger.info("Navigated to Course Page successfully");
	}
	
	@Test(priority=2)
	public void verifyCoursePriceDetails() {
		HHPLAPage hhp = new HHPLAPage (driver);
		Assert.assertEquals(hhp.getCourseLabel1(),"Current Status");
		Assert.assertEquals(hhp.getCourseContent(),"NOT ENROLLED");
		Assert.assertEquals(hhp.getCourseLabel2(),"Donation");
		Assert.assertEquals(hhp.getPriceAmount(),"$10");
		
		hhp.clickFinancialAid();
		hhp.handleFinancialAidWindow();
		
		Assert.assertEquals(hhp.getCourseLabel3(),"Get Started");
		hhp.clickTakeThisCourse();
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), baseURL+ "/cart/?add-to-cart=15367");
		logger.info("Navigated to Cart details page successfully");
	}
	
	@Test(priority=3)
	public void verifyProductDetailsInCart() {
		AddToCartPage acp = new AddToCartPage(driver);
		acp.waitForSeconds(5);
		Assert.assertEquals(acp.getProductInfo(),"Patient-Driven Data & Diagnosis: The New Trailblazers in Health Research");
		Assert.assertEquals(acp.getProductPrice(),"$10.00");
		Assert.assertEquals(acp.getProductQty(),"1");
		Assert.assertEquals(acp.getProductSubTotal(),"$10.00");
		logger.info("Product details verified in Cart");
	}
	
	@Test(priority=4)
	public void verifyCartTotals() {
		AddToCartPage acp = new AddToCartPage(driver);
		acp.waitForSeconds(5);
		Assert.assertEquals(acp.getCartSubTotalText(),"Subtotal");
		Assert.assertEquals(acp.getCartSubTotalAmount(),"$10.00");
		Assert.assertEquals(acp.getCartTotalText(),"Total");
		Assert.assertEquals(acp.getCartTotalAmount(),"$10.00");
		acp.clickProceedBtn();
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), baseURL+"/checkout/");
		logger.info("Navigated to Checkout Page successfully");	
	}
	
	@Test(priority=5)
	public void verifyBillingDetails() {
		CheckoutPage cp = new CheckoutPage(driver);
		Assert.assertEquals(cp.getBillingFormText(),"Billing details");
		cp.setBillingFirstName("Sukanya");
		cp.setBillingLastName("Devarajan");
		cp.clickReviewPaymentMenu();
	}
}
