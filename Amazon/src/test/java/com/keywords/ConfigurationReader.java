package com.keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ConfigurationReader {
	static Workbook wb;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\LENOVO B50-80\\eclipse-workspace\\Amazon\\src\\test\\java\\com\\keywords\\InputData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		wb = WorkbookFactory.create(fis);

	}

	public String getBrowser() {
		String Browser = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		return Browser;
	}

	public String getUrl() {
		String Url = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		return Url;
	}

	public String getIphone13() {
		String Iphone13 = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		return Iphone13;
	}

	public String getIphone14() {
		String Iphone14 = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		return Iphone14;
	}

	public String getNike() {
		String nike = wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		return nike;
	}

	public String getAdidas() {
		String adidas = wb.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
		return adidas;
	}

	public String getIphone13_Off() {
		String Iphone13_Off = wb.getSheet("Sheet1").getRow(6).getCell(1).toString();
		String expectedValue = String.valueOf(Iphone13_Off).replaceAll("\\.0$", "");
		return expectedValue;
	}

	public String getIphone14_Off() {
		String Iphone14_Off = wb.getSheet("Sheet1").getRow(7).getCell(1).toString();
		String expectedValue = String.valueOf(Iphone14_Off).replaceAll("\\.0$", "");
		return expectedValue;
}

	public String getNike_Off() {
		String nike_Off = wb.getSheet("Sheet1").getRow(8).getCell(1).toString();
		String expectedValue = String.valueOf(nike_Off).replaceAll("\\.0$", "");
		return expectedValue;
}

	public String getAdidas_Off() {
		String adidas_Off = wb.getSheet("Sheet1").getRow(9).getCell(1).toString();
		String expectedValue = String.valueOf(adidas_Off).replaceAll("\\.0$", "");
		return expectedValue;
}
}
