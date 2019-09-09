package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults {

	WebDriver driver;
	
	public SearchResults(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By destiny= By.xpath("//span[contains(text(),'Hotel Berlin, Berlin')]");
	By title= By.xpath("//div[5]//div[2]//div[2]//div[1]//h4[1]");
	
	public WebElement getDestiny()
	{
		
		return driver.findElement(destiny);
	}
	
	public WebElement getMsge()
	{	
		return driver.findElement(title);
	}
}
	
	