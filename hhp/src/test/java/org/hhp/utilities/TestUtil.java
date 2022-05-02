package org.hhp.utilities;

import org.hhp.pageObjects.Footer;
import org.hhp.pageObjects.Header;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	
	public static String verifyTitle(WebDriver driver) {
		 return driver.getTitle();
	}
	
	public static String verifyURL(WebDriver driver) {
		 return driver.getCurrentUrl();
	}
	
	public static Header getHeader(WebDriver driver) {
		 return new Header(driver);
	}
	
	public static Footer getFooter(WebDriver driver) {
		return new Footer(driver);
	}
}
