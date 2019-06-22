package PGB.EASYJET.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightSearch {
	
	
	public String path=System.getProperty("user.dir");
	public WebDriver driver;
	public String baseURL="http://easyjet.com";
	
	
@BeforeMethod
public void setBaseURL() {
	System.setProperty("webdriver.gecko.driver",path+"\\driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get(baseURL);
}
	
@Test 
public void test()
{ 
	WebElement esButton = driver.findElement(By.xpath("//span[contains(text(), 'es-ES')]"));
	esButton.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
}
@AfterMethod
public void quit()
{
	driver.quit();
}
}
