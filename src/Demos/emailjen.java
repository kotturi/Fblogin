package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class emailjen {

	@Test
	public void test() throws InterruptedException
	{
		System.out.println("Welcome");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("jo.kothuri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("girija");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("uiLinkButtonInput")).click();
			
	}
	
	

}
