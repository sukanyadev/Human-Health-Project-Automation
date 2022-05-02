package org.hhp.testCases;

import org.hhp.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
	
	@Test
	public void verifyHomePage() {
		Assert.assertEquals(TestUtil.verifyTitle(driver).toString(), "Home - Human Health Project");
	}
}
