package org.hhp.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	protected WebDriver ldriver;
	
	//Billing address section	
	
	@FindBy(xpath="//div[@class='woocommerce-message']//a")
	WebElement checkoutMsg;
	
	@FindBy(xpath="//div[@id='customer_details']//h3")
	WebElement billingFormHeading;
	
	@FindBy(id="billing_first_name")
	WebElement firstNameBilling;
	
	@FindBy(id="billing_last_name")
	WebElement lastNameBilling;
	
	@FindBy(xpath="billing_email") //autopopulated  email
	WebElement billingEmail;
	
	@FindBy(xpath="//ul[@class='woocommerce-error']")
	WebElement billingError; //Not all fields have been filled in correctly.
	
	//Review order section
	@FindBy(linkText="Review & Payment")
	WebElement reviewPaymentMenu;
	
	//Payment section
	@FindBy(xpath="")
	WebElement cardNo;
	
	@FindBy(xpath="")
	WebElement cardExpiry ;
	
	@FindBy(xpath="")
	WebElement cvcCode;
	
	@FindBy(xpath="//button[@id='place_order']")
	WebElement placeOrderBtn;
	
	public CheckoutPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public String getCheckoutMsgForLogin() {
		return checkoutMsg.getText();
	}
	public String getBillingFormText() {
		return billingFormHeading.getText();
	}
	
	public void setBillingFirstName(String fName) {
		firstNameBilling.sendKeys(fName);
	}
	
	public void setBillingLastName(String lName) {
		lastNameBilling.sendKeys(lName);
	}
	
	public String getEmailPopulated() {
		return billingEmail.getText();
	}
	
	public String getErrorMsg() {
		return billingError.getText();
	}
	
	public void clickReviewPaymentMenu() {
		reviewPaymentMenu.click();
	}
	
	public void clickPlaceOrder() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", placeOrderBtn);
	}
}
