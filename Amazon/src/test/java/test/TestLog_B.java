package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.keywords.ConfigurationReader;
import com.pom.PageElement;

public class TestLog_B extends BaseClass {
	static WebDriver driver;
	static PageElement pom;
	static ConfigurationReader keyword;

	@Test()
	public static void test_B1() throws IOException {
	    keyword=new	ConfigurationReader();
		driver = openBrowser(keyword.getBrowser());
		openUrl(keyword.getUrl());
		pom = new PageElement(driver);
		sendValues(pom.getSearchBox(), keyword.getNike());
		clickElement(pom.getSearchButton());
		clickElement(pom.getNike());
		switchWindow(1);
		String text = getText(pom.getDiscount());
		Assert.assertEquals(text,keyword.getNike_Off()+"%");
		System.out.println("TestCase_B1 Pass");
		
	}
	
	@Test()
	public static void test_B2() throws IOException {
		keyword=new	ConfigurationReader();
		driver = openBrowser(keyword.getBrowser());
		openUrl(keyword.getUrl());
		pom = new PageElement(driver);
		sendValues(pom.getSearchBox(), keyword.getAdidas());
		clickElement(pom.getSearchButton());
		clickElement(pom.getAdidas());
		switchWindow(1);
		String text = getText(pom.getDiscount());
		Assert.assertEquals(text, keyword.getAdidas_Off()+"%");
		System.out.println("TestCase_B2 Pass");
		
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

}
