package org.hhp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MedicalDisclaimerPage {
	
	protected WebDriver ldriver;
	
	public MedicalDisclaimerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
}
