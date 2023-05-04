package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsPopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//Alert box with OK button
		
		//Alert with ok link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		//Alert with OK button
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		//Switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();  //ok button clicked and accepted
		
		//----------------------------------------------------------------------------
		
		//Alert box with OK button
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		//Switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();  //ok button clicked and cancelled
		
	//------------------------------------------------------------------------------------
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
	}

}
