package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Homepage extends Base {
	
	@FindBy (xpath="//div[@class='css-pcfw1c-TooltipAction e18h3d5s2']") WebElement popup; 
	
	@FindBy(xpath="//button[@class=' eiav8li8 css-bbo95m-StyledButton-SubButton es6r9411']") WebElement getsub ;
	

	public Homepage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Chooseplanpage subscription() throws InterruptedException
	{
		popup.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		getsub.click();
		return new Chooseplanpage();
	}
	

}
