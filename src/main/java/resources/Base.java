package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	Properties prop;
	FileInputStream fis;
	public WebDriver driver;
	String path="user.dir";
	String browser;
	
	public WebDriver initialize_driver() throws IOException
	{
	prop=new Properties();
	fis= new FileInputStream(path+"//src//main//java//data.properties");
	prop.load(fis);
	browser=prop.getProperty("browser");
	
	if(browser.equals("CHROME"))
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	return driver;
	}
	
	
}
