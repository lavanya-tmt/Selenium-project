package PageObjectModel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegistrationPage
{
	//contains page oblect elements and methids(Contains page object class

	public static void main(String[] args) 
	{
		
		WebDriver driver;
		
//		POM method-1
		By RegLink=By.linkText("REGISTER");
		By FirstName=By.name("et_pb_contact_name_0");
//		=================================
//		POM Method of identification-2
//		How to identify Link
		@FindBy(how=How.LINK_TEXT,using="REGISTER")
		WebElement RegLink;
		
		@FindBy(name="firstName")
		WebElement FirstName;
//	===========================================	
		//Constructor:
		RegistrationPage(WebDriver d)
		{
			WebDriver driver = d;
		}
		

	public void clickRegLink() {
		{
			driver.findElement(RegLink).click();
		}
		
	}

	public void setFirstName(String string) {
		{
			driver.findElement(FirstName).sendKeys(fname);
		}
		
	}

}
