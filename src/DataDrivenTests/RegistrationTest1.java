package DataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class RegistrationTest1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//Getting Data from Excel
		FileInputStream file= new FileInputStream("F://Lavanya//Selenium Test Data//Registration Data.xlsx");
		
		//Get the workbook instance for XLS file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//Get required (First here) sheet from the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Get Last row from the Sheet
		int noOfRows=sheet.getLastRowNum();
		
		System.out.println("No of Records in the Excel Sheet:" + noOfRows);
		
		for(int row=1;row<=noOfRows;row++)
		{
			XSSFRow current_row=sheet.getRow(row);
			
			String First_name=current_row.getCell(0).getStringCellValue();
			String Last_Name=current_row.getCell(1).getStringCellValue();
			String Phone=current_row.getCell(2).toString();
			String Email=current_row.getCell(3).getStringCellValue();
			String Address=current_row.getCell(4).getStringCellValue();
			String City=current_row.getCell(5).getStringCellValue();
			String State=current_row.getCell(6).getStringCellValue();
			String PostelCode=current_row.getCell(7).toString();
			String Country=current_row.getCell(8).getStringCellValue();
			String UserName=current_row.getCell(9).getStringCellValue();
			String Password=current_row.getCell(10).getStringCellValue();
			
			//Registration Process
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Entering Contact Information:
			driver.findElement(By.name("firstName")).sendKeys(First_name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			//Entering Mailing Information:
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(PostelCode);
			
			//Country selection
			Select dropcountry=new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			
			//Entering User Information:
			driver.findElement(By.name("email")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			//Clicking on Submit
			driver.findElement(By.name("submit")).click();
			
			if(driver.getPageSource().contains("Thank you for registering")) {
				System.out.println("Registration is completed for "+ row + " record");
			
			}
			
			else {
				System.out.println("Registration is Failed for " + row + " record");
			}
		}
	}

}
