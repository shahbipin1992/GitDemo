package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//id locator
		driver.findElement(By.id("inputUsername")).sendKeys("Bipin");
		//name locator
		driver.findElement(By.name("inputPassword")).sendKeys("abcdfeee");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		//ClassName locator
		driver.findElement(By.className("submit")).click();
		//css locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	   // link text locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Harshit");
		//driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Harshit");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("harshitshah@gmail.com");
		//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("harshit@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("harshit@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		
	
	
	}
	

}
