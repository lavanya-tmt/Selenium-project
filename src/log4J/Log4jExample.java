package log4J;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.fabric8.kubernetes.api.model.Pod;
//import io.fabric8.kubernetes.client.DefaultKubernetesClient;
//import io.fabric8.kubernetes.client.KubernetesClient;


//import Selenium.WebElement;

public class Log4jExample {

	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("Log4jExample");
		DOMConfigurator.configure("Log4j.xml");
		
		System.setProperty("webdriver.firefox.marionette","F://Lavanya//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		logger.info("browser opened");
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
//		driver.manage().window().maximize(); //maximises the window
//		
//		logger.info("Contact details");
////		WebElement usernametext=driver.findElement(By.name("userName"));
//		driver.findElement(By.name("userName")).sendKeys("mercury");
//		driver.findElement(By.name("password")).sendKeys("mercury");
//		driver.findElement(By.name("submit")).click();

	}

}
