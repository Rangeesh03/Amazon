package com.BaseClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver openBrowser(String browser) {

		switch (browser) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "edge": {
			driver = new EdgeDriver();
			break;
		}

		default: System.out.println("Entered Browser Name Invalid");
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;

	}
	
	public static void openUrl(String url) {
		driver.get(url);
	}
	
	public static void sendValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	public static void switchWindow(int index) {
	Set<String>set=driver.getWindowHandles();
	List<String>list= new ArrayList<String>(set);
	driver.switchTo().window(list.get(index));
	}
	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void backward() {
		driver.navigate().back();
	}
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

}
