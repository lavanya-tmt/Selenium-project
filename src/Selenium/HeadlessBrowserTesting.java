package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		
		FirefoxOptions options=new FirefoxOptions();
//		options.setHeadless(true);
		
		options.addArguments("--headless");
		
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println("Title of the page:" + driver.getTitle());

	}

}
