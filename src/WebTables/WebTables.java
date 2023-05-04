package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Opened url");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
		
//		driver.wait(3000);
		
		driver.findElement(By.cssSelector("input.oxd-input oxd-input--active")).sendKeys("Admin");
		
	}

}
