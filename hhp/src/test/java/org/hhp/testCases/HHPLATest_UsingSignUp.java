package org.hhp.testCases;

import org.hhp.pageObjects.HHPLAPage;
import org.hhp.pageObjects.SlideShowPage;
import org.hhp.pageObjects.SignUpForOurCoursePage;
import org.hhp.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HHPLATest_UsingSignUp extends BaseTest {

	@Test(priority=0)
	public void learningAcademySignUpSetUp() throws InterruptedException {
		SlideShowPage hp = new SlideShowPage (driver);
		hp.waitForSeconds(2);
		hp.clickAlertClose();
		logger.info("Alert in Home Page is closed");
		
		hp.waitForSeconds(5);
		hp.clickNext(2);	
		hp.clickSignUpForCourseBtn();
		String expectedURL = baseURL + "/courses/patient-driven-data-diagnosis/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expectedURL);
		logger.info("Navigated to Course Page successfully");
	}

	@Test(priority=2)
	public void signUpForNewCourse_HHPLA() {
		HHPLAPage hhp = new HHPLAPage(driver);
		hhp.clickTakeThisCourse();
		String expURL = baseURL + "/login-2/";
		Assert.assertEquals(TestUtil.verifyURL(driver).toString(), expURL);
		logger.info("Navigated to SignUp / Login page successfully");
		
		SignUpForOurCoursePage sign = new SignUpForOurCoursePage(driver);
		sign.setFirstName2("");
		sign.setLastName2("");
		sign.setUsername2("");
		sign.setUsername2("");
		sign.setEmail2("");
		sign.setPassword2("");
		sign.setPasswordCofirmation2("");
		sign.click_JoinUs_Btn2();
	}
}
