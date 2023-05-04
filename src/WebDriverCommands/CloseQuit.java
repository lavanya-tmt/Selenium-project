package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
//		driver.close(); //closes first page
		driver.quit(); //closes all the opened windows

	}

}
