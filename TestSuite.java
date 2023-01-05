package testNGpackagestephen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
	
	WebDriver driver;
	
	@BeforeSuite
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver =new ChromeDriver();
		Thread.sleep(4000);
	}
	
	
	@Test
	public void opengoogle() throws InterruptedException
	{
		driver.get("http://www.google.com");
		Thread.sleep(2000);
	}
	

  @Test
 public void openBing() throws InterruptedException
	{
		driver.get("http://www.bing.com");
		Thread.sleep(5000);
	}
	
	@Test
	public void openyahoo() throws InterruptedException
	{
		driver.get("http://www.yahoo.com");
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
	}
	


}
