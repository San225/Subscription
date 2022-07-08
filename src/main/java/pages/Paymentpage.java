package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Paymentpage extends Base{

	@FindBy (xpath = "//h4[contains(.,'Choose a payment method')]") WebElement paymentinit;
	
	public Paymentpage()
	{
		PageFactory.initElements(driver, this);
	}
	public String paymentinit() throws InterruptedException {
	Thread.sleep(2000);
		return paymentinit.getText();
	}
	
}
