package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.SearchResults;
import resources.Base;

public class HotelBookingSD extends Base{

	@Given("^initialized the browser$")
    public void initialized_the_browser() throws Throwable {
		initialize_driver();
    }

    @When("^user enter (.+)$")
    public void user_enter_(String hotelname) throws Throwable {
    	HomePage hp= new HomePage(driver);
    	hp.getHotelTab().click();
    	hp.getDestination().sendKeys(hotelname);
    	driver.switchTo().defaultContent();
    	hp.getDestination().sendKeys(Keys.TAB);	
    }
    
    @And("^select checkInDate, checkOutDate, adults, childs, childAges$")
    public void select_checkindate_checkoutdate_adults_childs_childages() throws Throwable {
        HomePage hp= new HomePage(driver);
        driver.switchTo().defaultContent();
        hp.getCheckInDaySept().click();
        driver.switchTo().defaultContent();
        hp.getCheckOutClic();
        hp.getCheckOutDay();
        driver.switchTo().defaultContent();
        hp.getAdults().click();
        driver.switchTo().defaultContent();
        hp.getChilds().click();
        driver.switchTo().defaultContent();
        hp.getChildAge();
        driver.switchTo().defaultContent();
        
    }

    @Then("^the user is redirect to the search results page$")
    public void the_user_is_redirect_to_the_search_results_page() throws Throwable {
    	Set<String> ids= driver.getWindowHandles();
		 Iterator <String> it= ids.iterator();
		 it.next();
		 String childID= it.next();
		 driver.switchTo().window(childID);
		 driver.findElement(By.cssSelector("a[class='close_package_travel_directive_warning']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("a[class='close_warning']")).click();	 
    }
    
    @And("^verify the results match$")
    public void verify_the_results_match() throws Throwable {
    	 //verify destiny
    	SearchResults sr= new SearchResults(driver);
    	String destiny= sr.getDestiny().getText();
    	 Assert.assertEquals(destiny, "Hotel Berlin, Berlin");
   	    //verify recommendation for 2 adults 1 child	 
    	 String recommendation= sr.getMsge().getText();
    	 Assert.assertEquals(recommendation, "Recommended for 2 adults, 1 child"); 
    }

    @And("^navigate to \"([^\"]*)\" website$")
    public void navigate_to_something_website(String url) throws Throwable {
    	driver.get(url);
    }

    @And("^clic on search button$")
    public void clic_on_search_button() throws Throwable {
    	HomePage hp= new HomePage(driver);
    	hp.getSubmitBtn();
    }
    
    @And("^close all open windows$")
    public void close_all_open_windows() throws Throwable {
        driver.quit();
    }
}
