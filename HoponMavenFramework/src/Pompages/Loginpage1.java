package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	static WebDriver driver;
    //declare the elements
    @FindBy(id="tab:Name")
    WebElement unTB;

    @FindBy(id="tab:Password")
    WebElement pwdTB;

    @FindBy(id="tab:signin")
    WebElement loginbttn;

    //Initialize the elements
	   public Loginpage1(WebDriver driver) {
	   PageFactory.initElements(driver, this);   
   }
    //utilize the elements
	   public void setUsername(String username) {
	   unTB.sendKeys(username);
	   }
	   
	 
	public void setPassWord1(String st2) {
		pwdTB.sendKeys(st2);
		
	}
	public void clickLogin() {
		loginbttn.click();
		
	}	   

}
