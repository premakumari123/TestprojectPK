package Scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseTest;
import Generic.Lib;
import Pompages.Loginpage1;

public class TestInvalidLogin  extends BaseTest {
	
private static final String EXCEL_PATH = null;

@Test
public void testInavalidLogin() throws InterruptedException {

	Loginpage1 lp=new Loginpage1(driver);
	int rowcount = Lib.getRowcount(EXCEL_PATH, "InvalidLogin");
	for (int i =1; i<=rowcount; i++) {
	String username= Lib.getCellValue(EXCEL_PATH,"InvalidLogin",i,0);
	lp.setUsername(username);
		
	double st1=Lib.getIntvalue(EXCEL_PATH,"InvalidLogin",i,1);
	int a=(int) st1;
	String st2= Integer.toString(a);
	lp.setPassWord1(st2);
	Thread.sleep(3000);
		 
    lp.clickLogin();
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.titleIs("Trip sheet"));
			
	SoftAssert s= new SoftAssert();
	s.assertEquals(driver.getTitle(),"Trip sheet");
	s.assertAll();
		
	}
  }

}
