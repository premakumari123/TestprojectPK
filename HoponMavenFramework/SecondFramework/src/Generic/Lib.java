package Generic;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Lib implements IAutocontant {
	public static Workbook wb;
	   // setting chrome.exe FILE AND PROPERTY FILE 
	    public static String getProperty(String CONFIG_PATH, String key) {
		String property="";
		Properties prop= new  Properties();
		try
		{
			prop.load(new FileInputStream(CONFIG_PATH));
	        property= prop.getProperty(key);
		}catch(Exception e) {
		}
	    return property;	 		
		
	}
	    
	   public static String getCellValue(String EXCEL_PATH,String Sheet,int row,int col) {
		   String value="";
		   
		   try {
		   wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		   value=wb.getSheet(Sheet).getRow(row).getCell(col).toString();
	          } catch(Exception e) {
		   
	          System.out.println("Error occured while setting parameter");
	        }
		   
		   return  value;
				   }
	  
	  
	   public static int getRowcount(String EXCEL_PATH,String Sheet) {
		  int rowcount=0;
		   try {
		   wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		   rowcount=wb.getSheet(Sheet).getLastRowNum();
	          } catch(Exception e) {
		      }
		return  rowcount;
	    
	   }
	  
	   public static  void TakesScreenShot(WebDriver driver, String testMethodName)throws  IOException {
	  
	   TakesScreenshot ts=(TakesScreenshot) driver;
	   File srcFile=ts.getScreenshotAs(OutputType.FILE);
	   File destFile=new File("./screenshots/"+testMethodName+"_"+"screenshot.png");
	   FileUtils.copyFile(srcFile, destFile);
	   
	   }

	   
	 

	public static double getIntvalue(String EXCEL_PATH ,String sheet,int row,int col) {
		double num=0;
		try {
			   wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			  num=(double) wb.getSheet(sheet).getRow(row).getCell(col).getNumericCellValue();
		          } catch(Exception e) {
			   
		          System.out.println("Error occured while setting parameter");
		        }
			   
			   return num;
	}

}
