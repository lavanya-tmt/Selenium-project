package Selenium;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDrivertTesting {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println("The tile of the Page:" + driver.getTitle());
		System.out.println("The current URL of the page:" + driver.getCurrentUrl());
		

	}

}
