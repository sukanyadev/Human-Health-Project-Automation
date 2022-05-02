package org.hhp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WhatWeDoPage {
	
	protected WebDriver ldriver;
	
	public WhatWeDoPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
