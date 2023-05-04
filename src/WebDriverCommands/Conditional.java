package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conditional {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.name("firstname")).sendKeys("abc");  //is displayed
		System.out.println(driver.findElement(By.name("firstname")).isDisplayed()); //is displayed
		System.out.println(driver.findElement(By.name("websubmit")).isEnabled());  //is enabled
		System.out.println(driver.findElement(By.name("websubmit")).isSelected());
		
		
		
		
		
		
		
		
	
//		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).click());)
//		/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input
//		System.out.println(driver.findElement(By.id("u_0_4_n8")).isSelected());
		
//		System.out.println(driver.findElement(By.name("websubmit")).isEnabled());   //is enabled
//		
//		driver.findElement(By.id("u_0_4_n8")).click();	
//		
//		System.out.println(driver.findElement(By.id("u_0_4_n8")).isSelected());  //is selected ---selected
//		
//		
//		System.out.println(driver.findElement(By.id("u_0_5_9w")).isSelected());  //unselected
}
}
	
