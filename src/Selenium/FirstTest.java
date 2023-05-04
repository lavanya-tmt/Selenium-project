package Selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTest {

	public static void main(String[] args) {


//		System.setProperty("webdriver.firefox.driver","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver","C:/Program Files/eclipse/IEDriverServer.exe");
		
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize(); //maximises the window
		
		
		WebElement usernametext=driver.findElement(By.name("userName"));
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String exptitle="Login: Mercury Tours";
		String acttitle=driver.getTitle(); //Returns the title of the page
		
		if(exptitle.equals(acttitle))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.close();  //Close the browser
		
	}

}
