package VALUELEAF;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Astiinfotech {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(500);
		driver.get("https://developer.here.com/documentation");
		String title = driver.getTitle();
	    System.out.println("the title of the page is:= "+title);
	    Thread.sleep(500);
//link for Licensing & Terms FAQs
	    driver.findElement(By.xpath("//*[@href='/faqs#licensing--terms']")).click();
	    String actualtitle1 = driver.getTitle();
	    String expectedtitle1="HERE Developer";
	    System.out.println("the title(Link for license)of the page is:="+actualtitle1);
	    if(actualtitle1.contains(expectedtitle1))  {
	    	System.out.println(" For link1 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link1 Angular is not  initialized");
	    	 }
	    driver.navigate().back();
//link forget started for free.
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[text()='get started for free'] ")).click();
	    String actualtitle2 = driver.getTitle();
	    System.out.println("the title of the page is:="+actualtitle2 );
	    String expectedtitle2="HERE Developer";
	    if(actualtitle2.contains(expectedtitle2))  {
	    	System.out.println("For link2 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link2 Angular is not  initialized");
	    	 }
	    driver.navigate().back();
//link JS UNDER Interactive Maps.
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@href='/documentation/maps']//*[text()=' JS ']")).click();
	    String actualtitle3 = driver.getTitle();
	    System.out.println("the title of the page is:"   +actualtitle3 );
	    String expectedtitle3="Maps API for JavaScript v3.1.8.1 Developer's Guide";
	    if(actualtitle3.contains(expectedtitle3))  {
	    	System.out.println("For link3 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link3 Angular is not  initialized");
	    	  }
	    driver.navigate().back();
//link Andriod SDK UNDER Interactive Maps
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='maps']//div[text()=' HERE Android SDK ']")).click();
	    String actualtitle4 = driver.getTitle();
	    System.out.println("the title of the page is:"   +actualtitle4);
	    String expectedtitle4="SDK FOR Android";
	    if(actualtitle4.contains(expectedtitle4))  {
	    	System.out.println("For link4 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link4 Angular is not  initialized");
	    	 }
//link IOS SDK UNDER Interactive Maps
	    driver.findElement(By.xpath("//*[text()='get started for free'] ")).click();
	    driver.navigate().back();
        Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='maps']//*[text()=' HERE iOS SDK ']")).click();
	    String actualtitle5 = driver.getTitle();
	    System.out.println("the title of the page is:"   +actualtitle5);
	    String expectedtitle5="SDK FOR IOS";
	    if(actualtitle5.contains(expectedtitle5))  {
	    	System.out.println("For link5 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link5 Angular is not  initialized");
	    	 }
//link REST UNDER  Map Image
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='map_image']//*[text()=' REST ']")).click();
	    String actualtitle6 = driver.getTitle();
	    System.out.println("the title of the page is:"   +actualtitle6);
	    String expectedtitle6=" Map Image API - HERE Developer";
	    if(actualtitle6.contains(expectedtitle6))  {
	    	System.out.println("For link6 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link6 Angular is not  initialized");
	    	 }
	    driver.navigate().back();
//link REST UNDER  Map Title
	    driver.findElement(By.xpath("//*[@id='map_tile']//*[text()=' REST ']")).click();
	    String actualtitle7 = driver.getTitle();
	    System.out.println("the title of the page is:" +actualtitle7);
	    String expectedtitle7=" HERE Developer";
	    if(actualtitle7.contains(expectedtitle7))  {
	    	System.out.println("For link7 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link7 Angular is not  initialized");
	    	 }
	    driver.navigate().back();
//link REST UNDER  weather
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='weather']//*[text()=' REST ']")).click();
	    String actualtitle8 = driver.getTitle();
	    System.out.println("the title of the page is:" +actualtitle8);
	    String expectedtitle8=" HERE Developer";
	    if(actualtitle8.contains(expectedtitle8))  {
	    	System.out.println("For link8 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link8 Angular is not  initialized");
	    	 }
	    driver.navigate().back();
//link REST UNDER  Map feedback
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='map_feedback']//*[text()=' REST ']")).click();
	    String actualtitle9 = driver.getTitle();
	    System.out.println("the title of the page is:" +actualtitle9);
	    String expectedtitle9=" HERE Developer";
	    if(actualtitle9.contains(expectedtitle9))  {
	    	System.out.println("For link9 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link9 Angular is not  initialized");}
	    driver.navigate().back();
//link REST UNDER  Map feedback
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='map_feedback']//*[text()=' REST ']")).click();
	    String actualtitle10 = driver.getTitle();
	    System.out.println("the title of the page is:" +actualtitle10);
	    String expectedtitle10=" HERE Developer";
	    if(actualtitle10.contains(expectedtitle10))  {
	    	System.out.println("For link10 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link10 Angular is not  initialized");}
//link mobile SDK UNDER  Map feedback
	    Thread.sleep(500);	 
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='map_feedback']//*[text()=' Mobile SDK ']")).click();
	    String actualtitle11 = driver.getTitle();
	    System.out.println("the title of the page is:" +actualtitle11);
	    String expectedtitle11=" HERE Developer";
	    if(actualtitle11.contains(expectedtitle11))  {
	    	System.out.println("For link11 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link11 Angular is not  initialized");}
//link WEB SDK UNDER  Map feedback
	    Thread.sleep(1000);	 
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='map_feedback']//*[text()=' Web SDK ']")).click();
	    String actualtitle12 = driver.getTitle();
	    System.out.println("the title of the page is:" +actualtitle12);
	    String expectedtitle12=" HERE Developer";
	    if(actualtitle12.contains(expectedtitle12))  {
	    	System.out.println("For link12 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link12 Angular is not  initialized");}
//link JS Under  Geocoding
	    Thread.sleep(500);	 
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@href='/documentation/maps/dev_guide/topics/geocoding.html']//*[text()=' JS ']")).click();
	    Thread.sleep(500);
	    String actualtitle13 = driver.getTitle();
	    System.out.println("the title (FOR Link13) of the page is:" +actualtitle13);
	    String expectedtitle13="Geocoding · Maps API for JavaScript";
	    if(actualtitle13.contains(expectedtitle13))  {
	    	System.out.println("For link13 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link13 Angular is not  initialized");}
//link REST Under Geocoding
	    Thread.sleep(500);	 
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='geocoder']//*[text()=' REST ']")).click();
	    Thread.sleep(500);
	    String actualtitle14 = driver.getTitle();
	    System.out.println("the title of( FOR link 14) the page is:" +actualtitle14);
	    String expectedtitle14="Guide - Geocoder API - HERE Developer";
	    if(actualtitle14.contains(expectedtitle14))  {
	    	System.out.println("For link14 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link14 Angular is not  initialized");}
//link Andriod SDK Under Geocoding
	   driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='geocoder']//div[text()=' HERE Android SDK ']")).click();
	    String actualtitle15 = driver.getTitle();
	    System.out.println("the title of(for link 15) the page is:= " +actualtitle15);
	    String expectedtitle15="SDK FOR IOS";
	    if(actualtitle15.contains(expectedtitle15))  {
	    	System.out.println("For link15 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link15 Angular is not  initialized");
	    	 }
//link IOS SDK Under Geocoding	    
	    driver.findElement(By.xpath("//*[@id='batch_geocoder']//*[text()=' REST ']")).click();
	    driver.navigate().back();
         Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='geocoder']//*[text()=' iOS SDK ']")).click();
	    String actualtitle16 = driver.getTitle();
	    System.out.println("the title of(for link 16) the page is:= "  +actualtitle16);
	    String expectedtitle16="SDK FOR IOS";
	    if(actualtitle16.contains(expectedtitle16))  {
	    	System.out.println("For link16 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link16 Angular is not  initialized");
	    	 }
//link REST Under Geocoding	AUTO
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='geocoding_suggestions']//*[text()=' REST ']")).click();
	    String actualtitle17 = driver.getTitle();
	    System.out.println("the title of (for link 17)the page is:= "+actualtitle17);
	    String expectedtitle17="Guide - Geocoder Autocomplete API - HERE Developer";
	    if(actualtitle17.contains(expectedtitle17))  {
	    	System.out.println("For link17 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link17 Angular is not  initialized");}
//link REST Under  BatchGeocoding
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='batch_geocoder']//*[text()=' REST ']")).click();
	    String actualtitle18 = driver.getTitle();
	    System.out.println("the title of(for link 18) the page is:= "+actualtitle18);
	    String expectedtitle18="Guide - Batch Geocoder API - HERE Developer";
	    if(actualtitle18.contains(expectedtitle18))  {
	    	System.out.println("For link18 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link18 Angular is not  initialized");}
//link REST Under  places
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='places']//*[text()=' REST ']")).click();
	    Thread.sleep(500);
	    String actualtitle19 = driver.getTitle();
	    System.out.println("the title of(for link 19) the page is:= "+actualtitle19);
	    String expectedtitle19="Guide - Places (Search) API - HERE Developer";
	    if(actualtitle19.contains(expectedtitle19))  {
	    	System.out.println("For link19 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link19 Angular is not  initialized");}
//link ANDRIOD SDK Under  places
	   driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='places']//*[text()=' HERE Android SDK ']")).click();
	    Thread.sleep(500);
	    String actualtitle20 = driver.getTitle();
	    System.out.println("the title of(for link 20) the page is:= "+actualtitle20);
	    String expectedtitle20="Andriod SDK";
	    if(actualtitle20.contains(expectedtitle20))  {
	    	System.out.println("For link20 Angular is initialized");
	    }
	    else{
	    	  System.out.println(" For link20 Angular is not  initialized");} 
//link IOS SDK Under  places
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='routing']//*[text()=' REST ']")).click();
	    Thread.sleep(500);
	    String actualtitle21 = driver.getTitle();
	    System.out.println("the title of(for link 21) the page is:= "+actualtitle21);
	    String expectedtitle21="Guide - Routing API - HERE Developer";
	    if(actualtitle21.contains(expectedtitle21))  {
	    	System.out.println("For link21 Angular is initialized");
	    }
	    else{
	     System.out.println(" For link21 Angular is not  initialized");}
//link JS Under routing
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@href='/documentation/maps/dev_guide/topics/routing.html']//*[text()=' JS ']")).click();
	    Thread.sleep(500);
	    String actualtitle22= driver.getTitle();
	    System.out.println("the title of(for link 22) the page is:= "+actualtitle22);
	    String expectedtitle22="Routing · Maps API for JavaScript";
	    if(actualtitle22.contains(expectedtitle22))  {
	     System.out.println("For link22 Angular is initialized");}
	    else{
	    System.out.println(" For link22 Angular is not  initialized");} 
//link for andriod sdk under routing
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='routing']//*[text()=' HERE Android SDK ']")).click();
	    Thread.sleep(500);
	    String actualtitle23= driver.getTitle();
	    System.out.println("the title of(for link 23) the page is:= "+actualtitle23);
	    String expectedtitle23="Andriod SDK";
	    if(actualtitle23.contains(expectedtitle23))  {
	    System.out.println("For link23 Angular is initialized");}
	    else{
	    System.out.println(" For link23 Angular is not  initialized");} 
//link for ios sdk under routing
	    driver.findElement(By.xpath("//*[@id='park_and_ride']//*[text()=' REST ']")).click();
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='routing']//*[text()=' iOS SDK ']")).click();
	    Thread.sleep(500);
	    String actualtitle24= driver.getTitle();
	    System.out.println("the title of(for link 24) the page is:= "+actualtitle24);
	    String expectedtitle24="IOS SDK";
	    if(actualtitle24.contains(expectedtitle24))  {
	    System.out.println("For link24 Angular is initialized");}
	    else{
	    System.out.println(" For link24 Angular is not  initialized");} 
//link for REST under Transit
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='public_transit']//*[text()=' REST ']")).click();
	    Thread.sleep(500);
	    String actualtitle25= driver.getTitle();
	    System.out.println("the title of(for link 25) the page is:= "+actualtitle25);
	    String expectedtitle25="Guide - Public Transit API - HERE Developer";
	    if(actualtitle25.contains(expectedtitle25))  {
	    System.out.println("For link25 Angular is initialized");}
	    else{
	    System.out.println(" For link25 Angular is not  initialized");} 
//link for andriod sdk  Transit
	    Thread.sleep(500);
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='public_transit']//*[text()=' HERE Android SDK ']")).click();
	    Thread.sleep(500);
	    String actualtitle26= driver.getTitle();
	    System.out.println("the title of(for link 26) the page is:= "+actualtitle26);
	    String expectedtitle26="Android SDK";
	    if(actualtitle26.contains(expectedtitle26))  {
	    System.out.println("For link26 Angular is initialized");}
	    else{
	    System.out.println(" For link26 Angular is not  initialized");} 
//link for ios sdk Transit.
	    driver.findElement(By.xpath("//*[@id='routing']//*[text()=' REST ']")).click();
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='public_transit']//*[text()=' iOS SDK ']")).click();
	    Thread.sleep(500);
	    String actualtitle27= driver.getTitle();
	    System.out.println("the title of(for link 27) the page is:= "+actualtitle27);
	    String expectedtitle27="IOS SDK";
	    if(actualtitle27.contains(expectedtitle27))  {
	    System.out.println("For link27 Angular is initialized");}
	    else{
	    System.out.println(" For link27Angular is not  initialized");} 
 //link REST UNDER Intermodel routing.
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='park_and_ride']//*[text()=' REST ']")).click();
	    Thread.sleep(500);
	    String actualtitle28= driver.getTitle();
	    System.out.println("the title of(for link 28) the page is:= "+actualtitle28);
	    String expectedtitle28="Guide - Intermodal Routing API - HERE Developer";
	    if(actualtitle28.contains(expectedtitle28))  {
	    System.out.println("For link28 Angular is initialized");}
	    else{
	    System.out.println(" For link28 Angular is not  initialized");} 
//link REST UNDER Traffic.
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='traffic']//*[text()=' REST ']")).click();
	    Thread.sleep(500);
	    String actualtitle29= driver.getTitle();
	    System.out.println("the title of(for link 29) the page is:= "+actualtitle29);
	    String expectedtitle29="Guide - Traffic API - HERE Developer";
	    if(actualtitle29.contains(expectedtitle29))  {
	    System.out.println("For link29 Angular is initialized");}
	    else{
	    System.out.println(" For link29 Angular is not  initialized");} 
//link JS UNDER Traffic.
	    driver.navigate().back();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@href='/documentation/maps/dev_guide/topics/traffic.html']//*[text()=' JS ']")).click();
	    Thread.sleep(500);
	    String actualtitle30= driver.getTitle();
	    System.out.println("the title of(for link 30) the page is:= "+actualtitle30);
	    String expectedtitle30="Traffic · Maps API for JavaScript";
	    if(actualtitle30.contains(expectedtitle30))  {
	    System.out.println("For link30 Angular is initialized");}
	    else{
	    System.out.println(" For link30 Angular is not  initialized");} 
//link JS UNDER Traffic.
	    
}
}