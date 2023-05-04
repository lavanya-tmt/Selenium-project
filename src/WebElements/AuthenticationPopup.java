package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
//		http://username:password@test.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
		

	}

}
