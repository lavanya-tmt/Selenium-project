package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		
		//creating browser profile
		FirefoxProfile profile=new FirefoxProfile();
		
		//Set Preference to not show download confirmation dialoge using
		profile.setPreference("browser.helperApps.neverAsk","text/plain"); //set MIME types
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		//intialize  firefox driver
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		//Download text file
		driver.findElement(By.id("textbox")).sendKeys("Text"); //Enter text in textbox
		System.out.println("Entered text1");
//		Thread.sleep(2000);
		driver.findElement(By.id("createTxt")). click();
		System.out.println("clicked on generate1");
//		Thread.sleep(2000);
		driver.findElement(By.id("link-to-download1")).click();
		System.out.println("clicked on download");
		
//		//Download pdf file
//		driver.findElement(By.id("pdfbox")).sendKeys(" Pdf Text"); //Enter text in textbox
//		System.out.println("Entered text2");
//		driver.findElement(By.id("createPdf")).click();
//		System.out.println("clicked on generate2");
//		driver.findElement(By.id("pdf-link-to-download")).click();
//		System.out.println("clicked on download2");

	}

}
