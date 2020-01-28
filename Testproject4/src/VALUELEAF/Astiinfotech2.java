package VALUELEAF;

import java.awt.AWTException;
import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Astiinfotech2 {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		driver.get("https://www.google.com");
		Thread.sleep(500);
		driver.get("https://developer.here.com/documentation");
	   //All links stored in Arraylist
		
	  List<WebElement> links = driver.findElements(By.tagName("a"));
       
        Iterator<WebElement> it = links.iterator();
        
           while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
	}

}
}