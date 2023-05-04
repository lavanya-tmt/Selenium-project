package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) {
System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.selenium143.blogspot.com/");
		
		
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div[2]/div[1]/table/tbody/tr/td[1]/ol/li[1]/b/a\");\r\n"));
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
	
	}

}
