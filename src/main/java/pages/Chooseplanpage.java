package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Chooseplanpage extends Base {
	
	@FindBy (xpath="//button[text()='Proceed to pay']") WebElement proceed; 
	
	@FindBy (xpath = "//button[@aria-label='Accept']") WebElement cookies;
	
	public Chooseplanpage()
	{
		PageFactory.initElements(driver, this);
	}
	public Paymentpage selection() throws InterruptedException
	{
		//plan.click();
		cookies.click();
		Thread.sleep(2000);
		proceed.click();
		return new Paymentpage();
	}

}
