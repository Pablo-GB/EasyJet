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
	
	By destiny= By.id("ss");
	By checkIn= By.xpath("//div[contains(text(),'domingo, 1 de septiembre de 2019')]");
	By checkOut= By.xpath("//div[contains(text(),'domingo, 15 de septiembre de 2019')]");
	By adults= By.cssSelector("#group_adults");
	By childrens= By.cssSelector("#group_children");
	By rooms= By.cssSelector("#no_rooms");
	By childAge= By.xpath("//select[@name='age']");
	
	public WebElement getDestiny()
	{
		return driver.findElement(destiny);
	}
	
	public WebElement getCheckIn()
	{
		return driver.findElement(checkIn);
	}
	
	public WebElement getCheckOut()
	{
		return driver.findElement(checkOut);
	}
	
	public WebElement getAdults()
	{
		return driver.findElement(adults);
	}
	
	public WebElement getChildrens()
	{
		return driver.findElement(childrens);
	}
	
	public WebElement getRooms()
	{
		return driver.findElement(rooms);
	}
	
	public WebElement getChildAge()
	{
		return driver.findElement(childAge);
	}
	
}
