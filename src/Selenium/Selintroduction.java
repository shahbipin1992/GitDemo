package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods
		//Chrome Launch
		//Chromedriver
		
		System.setProperty("webdriver.chrome.driver", "/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//Firefox Launch
		//geckodriver -> Methods
		//webdriver.gecko.driver
		
		System.setProperty("webdriver.gecko.driver", "/Users/HP/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://www.rahulshettyacademy.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();
		
		//Microsoft Edge Launch
		//edgedriver-> Methods
		//webdriver.edge.driver
		
		System.setProperty("webdriver.edge.driver", "/Users/HP/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		
		driver2.get("https://www.rahulshettyacademy.com");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
		//driver.quit();
	}

}
