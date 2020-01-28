package VALUELEAF;

import java.awt.AWTException;
import java.util.ArrayList;

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
	    

        //All links stored in Arraylist
	    ArrayList<String> alist = new ArrayList<String>();
	    //link1
	    alist.add("//*[@href='/faqs#licensing--terms']");
	    //link2
	    alist.add("//*[text()='get started for free']");
	   //link3		
	    alist.add("//*[@id='maps']//div[text()=' HERE Android SDK ']");
	   //link4
	    alist.add("//*[@href='/documentation/maps']//*[text()=' JS ']");
	    //link5 
	    alist.add("//*[@id='map_image']//*[text()=' REST ']");
	    //link6
	    alist.add("//*[@id='maps']//*[text()=' HERE iOS SDK ']");
	    //link7
	    alist.add("//*[@id='map_tile']//*[text()=' REST ']");
	    //link8
	    alist.add("//*[@id='map_feedback']//*[text()=' REST ']");
	    //link9
	    alist.add("//*[@id='weather']//*[text()=' REST ']");
	    //link10
	    alist.add("//*[@id='map_feedback']//*[text()=' Mobile SDK ']");
	    //link11
	    alist.add("//*[@id='map_feedback']//*[text()=' Web SDK ']");
	    //link12
	    alist.add("//*[@href='/documentation/maps/dev_guide/topics/geocoding.html']//*[text()=' JS ']");
	    //link13
	    alist.add("//*[@id='geocoder']//div[text()=' HERE Android SDK ']");
	    //link14
	    alist.add("//*[@id='geocoder']//*[text()=' REST ']");
	    //link15
	    alist.add("//*[@id='geocoder']//*[text()=' iOS SDK ']");
	    //link16
	    alist.add("//*[@id='batch_geocoder']//*[text()=' REST ']");
	    //link17
	    alist.add("//*[@id='geocoding_suggestions']//*[text()=' REST ']");
	    //link18
	    alist.add("//*[@id='places']//*[text()=' HERE Android SDK ']");
	    //link19
	    alist.add("//*[@id='places']//*[text()=' REST ']");
	    //link20
	    alist.add("//*[@id='places']//*[text()=' HERE iOS SDK ']");
	    //link21
	    alist.add("//*[@id='routing']//*[text()=' REST ']");
	    //link22
	    alist.add("//*[@id='routing']//*[text()=' HERE Android SDK ']");
	    //link23
	    alist.add("//*[@href='/documentation/maps/dev_guide/topics/routing.html']//*[text()=' JS ']");
	    //link24
	    alist.add("//*[@id='routing']//*[text()=' iOS SDK ']");
	    //link25
	    alist.add("//*[@id='public_transit']//*[text()=' REST ']");
	    //link26
	    alist.add("//*[@id='public_transit']//*[text()=' iOS SDK ']");
	    //link27
	    alist.add("//*[@id='park_and_ride']//*[text()=' REST ']");
	    //link28
	    alist.add("//*[@id='public_transit']//*[text()=' HERE Android SDK ']");
	    //link29
	    alist.add("//*[@id='traffic']//*[text()=' REST ']");
	    //link30
	    alist.add("//*[@id='traffic']//*[text()=' HERE Android SDK ']");
	    //link31
	    alist.add("//*[@href='/documentation/maps/dev_guide/topics/traffic.html']//*[text()=' JS ']");
	    //link32
	    alist.add("//*[@id='traffic']//*[text()=' HERE iOS SDK ']");
	    //link33
	    alist.add("//*[@id='large_matrix_routing']//*[text()=' REST ']");
	    //link34
	    alist.add("//*[@id='fleet_telematics']//*[text()=' REST ']");
	    //link35
	    alist.add("//*[@id='geofencing']//*[text()=' REST ']");
	    //link36
	    alist.add("//*[@id='custom_location_extension']//*[text()=' REST ']");
	    //link37
	    alist.add("//*[@id='custom_location_extension']//*[text()=' HERE Android SDK ']");
	    //link38
	    alist.add("//*[@href='/documentation/maps/dev_guide/topics/fleet-telematics-custom-locations.html']//*[text()=' JS ']");
	    //link39
	    alist.add("//*[@id='custom_location_extension']//*[text()=' HERE iOS SDK ']");
	    //link40
	   alist.add("//*[@id='custom_route_extension']//*[text()=' REST ']");
	    //link41
	   alist.add("//*[@id='platform_data_extension']//*[text()=' REST ']");
	    //link42
	  alist.add("//*[@id='platform_data_extension']//*[text()=' HERE Android SDK ']");
	    //link43
	    alist.add("//*[@href='/documentation/maps/dev_guide/topics/fleet-telematics-advanced-data-sets.html']//*[text()=' JS ']");
	    //link44
	    alist.add("//*[@id='platform_data_extension']//*[text()=' HERE iOS SDK ']");
	    //link45
	   alist.add("//*[@id='route_match_extension']//*[text()=' REST ']");
	    //link46
	    alist.add("//*[@id='toll_cost_extension']//*[text()=' REST ']");
	    //link47
	    alist.add("//*[@id='waypoints_secuence_extension']//*[text()=' REST ']");
	    //link48
	   alist.add("//*[@id='fleet_connectivity_extension']//*[text()=' REST ']");
	    //link49
	    alist.add("//*[@id='geovisualization']//*[text()=' Overview ']");
	    //link50
	   alist.add("//*[@id='geovisualization']//*[text()=' REST ']");
	    //link51
	   alist.add("//*[@href='/documentation/geovisualization/datalens/h-datalens.html']//*[text()=' JS ']");
	    //link52
	    alist.add("//*[@id='advertising_data_services']//*[text()=' REST ']");
	    //link53 
	   alist.add("//*[@id='live_sense_sdk']//*[text()=' Android SDK ']");
	    //link54
	  alist.add("//*[@id='xyz']//*[text()=' Documentation ']");
	    //link55
	  alist.add("//*[@id='live_sense_sdk']//*[text()=' iOS SDK ']");
	    //link56
	   alist.add("//*[@id='olp']//*[text()=' Documentation ']");
	    //link57
	   alist.add("//*[@id='tracking']//*[text()=' REST ']");
	    //link58
	  alist.add("//*[@id='positioning']//*[text()=' HERE Android SDK ']");
	    //link59
	   alist.add("//*[@id='positioning']//*[text()=' REST ']");
	    //link60
	  alist.add("//*[@id='positioning']//*[text()=' HERE iOS SDK ']");
	    //link61
	  alist.add("//*[@id='venue_maps']//*[text()=' REST ']");
	    //link62
	   alist.add("//*[@id='venue_maps']//*[text()=' HERE Android SDK ']");
	    //link63
	  alist.add("//*[@id='on_demand']//*[text()=' REST ']");
	    //link64
	   alist.add("//*[@id='venue_maps']//*[text()=' iOS SDK ']");
	    //link65
	   alist.add("//*[@id='on_demand']//*[text()=' Mobile SDK ']");
	 
	    for(String str : alist)
	    {
	    String xp=str; 
	    System.out.println("xpath for tha above link= "+xp);
	    String actualtitle="Documentation, Code Examples and API References - HERE Developer"; 
	    driver.findElement(By.xpath(xp)).click();
	    Thread.sleep(300);
	    String expectedtitle=driver.getTitle();
	    System.out.println("The expected  of current link title is= "+expectedtitle);
	    
	    if(!actualtitle.contains(expectedtitle))  {
	    	System.out.println(" For the above link  Angular is initialized");
	    	driver.navigate().back();
            }
	    else{
	    	  System.out.println(" For the above link  Angular is not  initialized");
	         }
	    }
}
}