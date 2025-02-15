package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="Bipin";
		
		//Chrome Browser
		//System.setProperty("webdriver.chrome.driver", "/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//firfox browser
		//System.setProperty("webdriver.gecko.driver", "/Users/HP/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge Browser
		System.setProperty("webdriver.edge.driver", "/Users/HP/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//id locator
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		//name locator
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		//ClassName locator
		driver.findElement(By.className("submit")).click();
		//css locator
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name +",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
	public static String getPassword(WebDriver driver) throws InterruptedException



	{

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.linkText("Forgot your password?")).click();

	Thread.sleep(1000);

	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	String passwordText =driver.findElement(By.cssSelector("form p")).getText();

	//Please use temporary password 'rahulshettyacademy' to Login.

	String[] passwordArray = passwordText.split("'");

	// String[] passwordArray2 = passwordArray[1].split("'");

	// passwordArray2[0]

	String password = passwordArray[1].split("'")[0];

	return password;

	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.


	//0th index - rahulshettyacademy

	//1st index - to Login.

    }


}
