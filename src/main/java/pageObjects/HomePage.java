package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	By checkInDaySept= By.id("ui-datepicker-checkInDate-2019-8-20");
	By checkOutDayClic = By.className("ui-datepicker-trigger");
	By checkOutDay=By.cssSelector("#ui-datepicker-checkOutDate-2019-8-26");
	By adults= By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div[2]/button[2]");
	By childs=By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[3]/div[2]/button[2]");
	By childAge=By.cssSelector("select[name='age']");
	By submitBtn= By.name("submit");
	
	public WebElement getHotelTab() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(hotelTab);
		
	}
	
	//enter destination
	public WebElement getDestination() throws InterruptedException
	{
		WebElement destiny = null;
		int count=0;
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		int iframes= driver.findElements(By.tagName("iframe")).size();
		
		if(iframes==3)
		{
		for (int i=0; i<driver.findElements(By.tagName("iframe")).size();i++)
		{
		driver.switchTo().frame(i);
		//Thread.sleep(2000);
		
		count= driver.findElements(By.id("b_destination")).size();
		
		if(count != 0)
		{
			destiny= driver.findElement(By.id("b_destination"));
			break;
		}
		else
		{
			i++;
		}
		}
		return destiny;
		}	
		else
		{
			for (int i=1; i<driver.findElements(By.tagName("iframe")).size();i++)
			{
				driver.switchTo().frame(i);
				//Thread.sleep(2000);
				
				count= driver.findElements(By.id("b_destination")).size();
				
				if(count != 0)
				{
					destiny= driver.findElement(By.id("b_destination"));
					break;
				}
				else
				{
					i++;
				}
				}
			return destiny;
			}
		}	
	
	//select the check in date.
	public WebElement getCheckInDaySept() throws InterruptedException
	{
		WebElement checkInDate = null;
		int size= driver.findElements(By.tagName("iframe")).size();
		int count=0;
		
		if (size==3)
		{
			for(int i=0; i<driver.findElements(By.tagName("iframe")).size();i++)
			{
				driver.switchTo().frame(i);
				//Thread.sleep(2000);
				count= driver.findElements(By.id("ui-datepicker-checkInDate-2019-8-20")).size();
				
				if(count!=0)
				{
					checkInDate= driver.findElement(By.id("ui-datepicker-checkInDate-2019-8-20"));
					break;
				}
				else
				{
					i++;
				}
			}
			return checkInDate;
		}
		else
		{
			for (int i=1; i<driver.findElements(By.tagName("iframe")).size();i++)
			{
				driver.switchTo().frame(i);
				//Thread.sleep(2000);
				
				count= driver.findElements(By.id("ui-datepicker-checkInDate-2019-8-20")).size();
				
				if(count != 0)
				{
					checkInDate= driver.findElement(By.id("ui-datepicker-checkInDate-2019-8-20"));
					break;
				}
				else
				{
					i++;
				}
				}
			return checkInDate;
			}
	}
	
	//clic first on calendar btn
	public void getCheckOutClic() throws InterruptedException
	{
		int count=0;
		int size= driver.findElements(By.tagName("iframe")).size();

		if (size==3)
		{
			for (int i=0; i<driver.findElements(By.tagName("iframe")).size();i++)
			{
				driver.switchTo().frame(i);
				//Thread.sleep(2000);
				count= driver.findElements(By.className("ui-datepicker-trigger")).size();
				
				if(count!=0)
				{
					//System.out.println(i);
					driver.findElement(By.className("ui-datepicker-trigger")).sendKeys(Keys.TAB);
					driver.findElement(By.className("ui-datepicker-trigger")).sendKeys(Keys.TAB);
					driver.findElement(By.className("ui-datepicker-trigger")).sendKeys(Keys.TAB);
					break;
			    }	
				else
		        {
			    i++;
		        }
			}	
		}
		else
		{
				for(int i=1; i<driver.findElements(By.tagName("iframe")).size();i++)
				{
					driver.switchTo().frame(i);
					//Thread.sleep(2000);
					count= driver.findElements(By.className("ui-datepicker-trigger")).size();
				
					if(count!=0)
					{
						System.out.println(i);
						driver.findElement(By.className("ui-datepicker-trigger")).sendKeys(Keys.TAB);
						driver.findElement(By.className("ui-datepicker-trigger")).sendKeys(Keys.TAB);
						driver.findElement(By.className("ui-datepicker-trigger")).sendKeys(Keys.TAB);
						break;
					}	
					else
					{
						i++;
					}
				}	
		}
	}
	
	//select checkOutDate
	public void getCheckOutDay()
	{
		int size= driver.findElements(By.className("ui-state-default")).size();
		
		for(int i=0; i< size; i++)
		{
			String text= driver.findElements(By.className("ui-state-default")).get(i).getText();
			
			if(text.equalsIgnoreCase("26"))
			{
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}
	}
		
	//select 2 adults
	public WebElement getAdults() throws InterruptedException
	{
		
		int count=0;
		int size= driver.findElements(By.tagName("iframe")).size();
		
		if(size==3)
		{
			for(int i=0; i< size; i++) 
			{
				driver.switchTo().frame(i);
				//Thread.sleep(2000);
				count= driver.findElements(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div[2]/button[2]")).size();
				
				if(count!=0)
				{
					System.out.println("element found");
					break;
				}
				else
				{
					i++;
				}
			}
			return driver.findElement(adults);
		}
		else
		{
			for(int i=1; i< size; i++)
			{
				driver.switchTo().frame(i);
				//Thread.sleep(2000);
				count= driver.findElements(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div[2]/button[2]")).size();
				
				if(count!=0)
				{
					//System.out.println("element found");
					break;
				}
				else
				{
					i++;
				}
			}
		return driver.findElement(adults);
		}
	}
	
	//select 1 child.
	public WebElement getChilds()
	{
		int count=0;
		int size= driver.findElements(By.tagName("iframe")).size();
		
		if(size==3)
		{
			for(int i=0; i< size; i++) 
			{
				driver.switchTo().frame(i);
				count= driver.findElements(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[3]/div[2]/button[2]")).size();
				
				if(count!=0)
				{
					//System.out.println("element found");
					break;
				}
			}
			return driver.findElement(childs);
		}
		else
		{
			for(int i=1; i< size; i++) 
			{
				driver.switchTo().frame(i);
				count= driver.findElements(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[3]/div[2]/button[2]")).size();
				
				if(count!=0)
				{
					//System.out.println("element found");
					break;
				}
			}
		return driver.findElement(childs);
	}
	}
	
	public void getChildAge() throws InterruptedException
	{
		int size= driver.findElements(By.tagName("iframe")).size();
		int count=0;
		
		if(size==3)
		{
			for(int i=0; i< size; i++) 
			{
				driver.switchTo().frame(i);
				Thread.sleep(2000);
				count= driver.findElements(By.tagName("select")).size();
				
				if(count!=0)
				{
				Select s= new Select(driver.findElement(By.name("age")));
				s.selectByValue("9");
				break;
				}
				else
				{
					i++;
				}
			}
		}
		else
		{
			for(int i=1; i< size; i++) 
			{
				driver.switchTo().frame(i);
				Thread.sleep(2000);
				count= driver.findElements(By.tagName("select")).size();
				
				if(count!=0)
				{
				Select s= new Select(driver.findElement(By.name("age")));
				s.selectByValue("9");
				break;
				}
				else
				{
					i++;
				}	
			}
		}
	}
	
	public void getSubmitBtn() throws InterruptedException
	{
		int size= driver.findElements(By.tagName("iframe")).size();
		int count=0;
		
		if(size==3)
		{
			for(int i=0; i< size; i++) 
			{
				driver.switchTo().frame(i);
				Thread.sleep(2000);
				count= driver.findElements(By.name("submit")).size();
				if(count!=0)
				{
					driver.findElement(submitBtn).click();
					break;
				}
			}
		}
		else
		{
			for(int i=1; i< size; i++) 
			{
				driver.switchTo().frame(i);
				count= driver.findElements(By.name("submit")).size();
				if(count!=0)
				{
					driver.findElement(submitBtn).click();
					break;
				}
			}
		}
	}
}
	
