package WebElements;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		//Text
//		driver.findElement(By.cssSelector("input[ng-model=\"FirstName\"]")).sendKeys("Lavanya");
//		driver.findElement(By.cssSelector("input[ng-model=\"LastName\"]")).sendKeys("Lavanya");
//		
//		//Radiobutton
//		System.out.println(driver.findElement(By.cssSelector("input[value=\"Male\"]")).isSelected());
//		driver.findElement(By.cssSelector("input[value=\"FeMale\"]")).click();
//		System.out.println(driver.findElement(By.cssSelector("input[value=\"FeMale\"]")).isSelected());
//		
//		//Checkbox
//		driver.findElement(By.id("checkbox1")).click();
//		System.out.println(driver.findElement(By.id("checkbox1")).isSelected());
////		driver.findElement(By.id("checkbox2")).click();
//		
//		System.out.println(driver.findElement(By.id("checkbox2")).isSelected());
//		System.out.println(driver.findElement(By.id("checkbox3")).isSelected());
//		
////		//Dropdown
////		WebElement Skills=driver.findElement(By.cssSelector("option[value=\"Android\"]"));
////		Select s=new Select(Skills);
//////		s.selectByIndex(1);  //By Index
//////		System.out.println(s);
//////		s.selectByValue("Android");  //By value
////		s.selectByVisibleText("Android");
////		
//////		Select dropcountry=new Select(driver.findElement(By.name("country")));
//////		dropcountry.selectByVisibleText(Country);
//////				
//
//
//		WebElement year=driver.findElement(By.id("yearbox"));
//		Select y=new Select(year);
//		y.selectByIndex(1);
//		
//		
	}

}
