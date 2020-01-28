package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	static WebDriver driver;
	//declare the elements
	@FindBy(id="tab:Name")
	WebElement unTB;
	
	@FindBy(id="tab:Password")
	WebElement pwdTB;
	
	@FindBy(id="tab:signin")
	WebElement loginbttn;
	
	//Initialize the elements
		public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
		//utilize the elements
	    public void setUsername(String username) {
	    unTB.sendKeys(username);
	    }
	    public void setPassWord1(String st1) {
	    	pwdTB.sendKeys(st1);
	     }
	   
	      public void clickLogin() {
		   loginbttn.click();
}
}