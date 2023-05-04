package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationTest //main class (Test)
{
	public void verifyFlightReg() {
		
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		RegistrationPage RGPage=new RegistrationPage(driver);
		
		//By RGPage object we can access all the objects
		
//		RegistrationPage2 RGPage=new RegistrationPage2(driver)

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit);
		driver.get("https://ultimateqa.com/filling-out-forms/");
//		https://demo.guru99.com/test/newtours/register.php
		RGPage.clickRegLink();
		RGPage.setFirstName("Lavanya");
		
		//Validation
		
			if(driver.getPageSource().contains("Thank you"))
			{
				System.out.println("Registered");
				
			}
			else
				
			{
				System.out.println("Not Registered");
			}
		}



	

}
