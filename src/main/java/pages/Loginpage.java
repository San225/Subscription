package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

	public class Loginpage extends Base {

	@FindBy(xpath="//button[@aria-label='Login']") WebElement loginbutn;
	
	@FindBy(xpath="//input[@placeholder='Enter your mobile number']") WebElement enterno;
	
	@FindBy (xpath="(//button[@aria-label='Login'])[2]") WebElement clicklogin;
	
	@FindBy (xpath="//button[@aria-label='Verify OTP']") WebElement verifyotp;
	
	public Loginpage ()
	{
		PageFactory.initElements(driver, this);
	}
	public Homepage login() throws InterruptedException
	{
		loginbutn.click();
		enterno.sendKeys("9074715985");
		Thread.sleep(200);
		clicklogin.click();
		Thread.sleep(25000);
		verifyotp.click();
		return new Homepage();
	}	
	}

