package WebDriverCommands;
http://newtours.demoaut.com/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
		String text=driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println(text);
		
		
		
		

	}

}
