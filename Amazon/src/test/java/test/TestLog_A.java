package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.BaseClass.BaseClass;
import com.keywords.ConfigurationReader;
import com.pom.PageElement;

public class TestLog_A extends BaseClass {
	static WebDriver driver;
	static PageElement pom;
	static ConfigurationReader keyword;

	@Test()
	public static void test_A1() throws IOException {
        keyword=new ConfigurationReader();
		driver = openBrowser(keyword.getBrowser());
		openUrl(keyword.getUrl());
		pom = new PageElement(driver);
		sendValues(pom.getSearchBox(), keyword.getIphone13());
		clickElement(pom.getSearchButton());
		clickElement(pom.getIphone_13());
		switchWindow(1);
		String text = getText(pom.getDiscount());
		Assert.assertEquals(text, keyword.getIphone13_Off()+"%");
		System.out.println("TestCase_A1 Pass");
		
	}
	
	@Test()
	public static void test_A2() throws IOException {
		keyword=new ConfigurationReader();
		driver = openBrowser(keyword.getBrowser());
		openUrl(keyword.getUrl());
		pom = new PageElement(driver);
		sendValues(pom.getSearchBox(), keyword.getIphone14());
		clickElement(pom.getSearchButton());
		clickElement(pom.getIphone_14());
		switchWindow(1);
		String text = getText(pom.getDiscount());
		Assert.assertEquals(text, keyword.getIphone14_Off()+"%");
		System.out.println("TestCase_A2 Pass");
		
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

}
