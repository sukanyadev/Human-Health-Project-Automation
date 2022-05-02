package org.hhp.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	protected WebDriver ldriver;
		
	//Course Form
	@FindBy(xpath="//form[@class='woocommerce-cart-form']//h2")
	WebElement formHeading;
	
	@FindBy(xpath="//div[@class='product-info']//a")
	WebElement productInfo;
	
	@FindBy(xpath="//td[@class='product-price']")
	WebElement productPrice;
	
	@FindBy(xpath="//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']")
	WebElement productSubtotal;
	
	@FindBy(xpath="//td[@class='product-quantity']")
	WebElement productQty;
	
	@FindBy(xpath="//td[@class='product-remove']//a")
	WebElement productRemove;
	
	//Apply Coupons
	@FindBy(xpath="//div[@class='coupon']//h2")
	WebElement couponHeading;
	
	@FindBy(id="avada_coupon_code")
	WebElement couponCode;
	
	@FindBy(name="apply_coupon")
	WebElement applyCoupon;
	
	//Cart details
	@FindBy()
	WebElement cartHeading;
	
	@FindBy(xpath="//tr[@class='cart-subtotal']//th")
	WebElement subTotalText;
	
	@FindBy(xpath="//tr[@class='cart-subtotal']//span[@class='woocommerce-Price-amount amount']")
	WebElement subTotalAmount;
	
	@FindBy(xpath="//tr[@class='order-total']//th")
	WebElement totalText;
	
	@FindBy(xpath="//tr[@class='order-total']//span[@class='woocommerce-Price-amount amount']")
	WebElement totalAmount;
	
	@FindBy(xpath="UPDATE CART")
	WebElement updateCartBtn;
	
	@FindBy(xpath="//div[@class='wc-proceed-to-checkout']//a[@href='https://dev.humanhealthproject.org/checkout/']")
	WebElement proceedToCheckoutBtn;
	
	
	public AddToCartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public String getFormHeading() {
		return formHeading.getText();
	}
	
	public String getProductInfo() {
		return productInfo.getText();
	}
	
	public String getProductPrice() {
		return productPrice.getText();
	}
	
	public String getProductQty() {
		return productQty.getText();
	}
	
	public String getProductSubTotal() {
		return productSubtotal.getText();
	}
	
	public String getCartSubTotalText() {
		return subTotalText.getText();
	}
	
	public String getCartSubTotalAmount() {
		return subTotalAmount.getText();
	}
	
	public String getCartTotalText() {
		return totalText.getText();
	}
	
	public String getCartTotalAmount() {
		return totalAmount.getText();
	}
	
	public void clickProceedBtn() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", proceedToCheckoutBtn);
	}
	
	public void waitForSeconds(int seconds) {
		ldriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
}
