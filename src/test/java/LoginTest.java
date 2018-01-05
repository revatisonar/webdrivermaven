


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	

	public static WebDriver driver;
	
	@Before
	public void setup(){
	System.setProperty("webdriver.chrome.driver","F:\\Selenium Videos\\Llibrary\\Library\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test
	public void Login(){
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("9158251018");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Revamit143");
	driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
}
	@After
	public void tearDown(){
		driver.quit();
		}
	}
