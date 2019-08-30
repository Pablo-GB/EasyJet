package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By hotelTab= By.xpath("//div[@class='above-section']//li[2]//a[1]");
	By destination= By.id("b_destination");
	By checkIn= By.id("checkInDate");
	By checkInSept= By.xpath("/html[1]/body[1]");
	By checkInDaySept= By.id("ui-datepicker-checkInDate-2019-8-1");
	By checkOut= By.id("checkOutDate");
	By checkOutDay=By.id("ui-datepicker-checkOutDate-2019-8-15");
	By adults= By.cssSelector("data-bui-ref[class='input-stepper-add-button']");
	By childs=By.cssSelector("span[class='bui-button__text']");
	By childAge=By.cssSelector("select[name='age']");
	By submitBtn= By.name("submit");
	
	public WebElement getHotelTab()
	{
		return driver.findElement(hotelTab);
	}
	
	public WebElement getDestination()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(By.id("b_destination"));
	}
	
	public WebElement getCheckIn()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(checkIn);
	}
	
	public WebElement getCheckInSept()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(checkInSept);
	}
	
	public WebElement getCheckInDaySept()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(checkInDaySept);
	}
	
	public WebElement getCheckOut()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(checkOut);
	}
	
	public WebElement getCheckOutDay()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(checkOutDay);
	}
	
	public WebElement getAdults()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(adults);
	}
	
	public WebElement getChilds()
	{
		return driver.findElement(childs);
	}
	
	public WebElement getChildAge()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(childAge);	
	}
	
	public WebElement getSubmitBtn()
	{
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='//www.booking.com/affiliatewidget.html?aid=945842;abel=easy-homepage-searchbox-load;iata_orr=1;target_aid=347810;label=easy-homepage-searchbox-load;label_click=easy-homepage-searchbox-click;aff_hostname=http%3A%2F%2Fhotels.easyjet.com;lang=es']//input")));
		return driver.findElement(submitBtn);	
	}
}
