package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Chooseplanpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Paymentpage;
import resources.Base;

public class Subscribe extends Base {
	
	WebDriver driver;
	
	
	@Given("^Open the application URL$")
    public void open_the_application_url() throws IOException  {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
    }

	  @When("^User clicks on get subscription and Choose plan page is displayed$")
	    public void user_clicks_on_get_subscription_and_choose_plan_page_is_displayed() throws InterruptedException   {
      Homepage homepage = new Homepage();
		  homepage.subscription();
       
    }

    @Then("^User is sucessfully able to reach payment page$")
    public void user_is_sucessfully_able_to_reach_payment_page() throws InterruptedException  {
    	Paymentpage paymentpage = new Paymentpage();
    	Assert.assertEquals(paymentpage.paymentinit(), "Choose a payment method");
    	driver.quit();
   
    }

    @And("^User performs login operation and Home page is displayed$")
    public void user_performs_login_operation_and_home_page_is_displayed() throws InterruptedException  {
          Loginpage loginpage = new Loginpage();
          loginpage.login();
       
    }

    @And("^User clicks on plan and clicks on proceed to pay$")
    public void user_clicks_on_plan_and_clicks_on_proceed_to_pay() throws InterruptedException  {
    	Chooseplanpage chooseplanpage = new Chooseplanpage();	
    	chooseplanpage.selection();
    }

	}

