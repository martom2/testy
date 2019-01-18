package projekt.automatyzacja.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.*;
import projekt.automatyzacja.page.*;

public class LoginTC {

	WebDriver driver;
    LoginPage loginPage;
    WelcomePage welcomePage;

    @BeforeClass
    public void setup(){
    	System.setProperty("webdriver.gecko.driver", "C:\\javalibs\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		
    	FirefoxProfile profile = new FirefoxProfile();
    	profile.setPreference("security.sandbox.content.level", 5);
    	DesiredCapabilities cap = DesiredCapabilities.firefox();
    	cap.setCapability(FirefoxDriver.PROFILE, profile);
    	FirefoxOptions opt = new FirefoxOptions();
    	opt.merge(cap);
    	driver = new FirefoxDriver(opt);
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        String baseUrl = "http://localhost/zurmo";
		driver.get(baseUrl);
    }

    /**
     * This test case will login in http://localhost/zurmo
     * Verify login page title
     * Login to application
     * Verify the home page
     */

    @Test(priority=0)
    public void loginToZurmo() {
      loginPage = new LoginPage(driver);
	  String loginPageTitle = loginPage.getPageTitle();
	  Assert.assertTrue(loginPageTitle.toLowerCase().contains("zurmocrm - sign in"));
	   
	  loginPage.login("super", "super");

	  //Verify home page
	  welcomePage = new WelcomePage(driver);
	  	
	  //Wait until
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home")));
	  System.out.println("a: "+welcomePage.getPageTitle().toLowerCase());
	  Assert.assertTrue(welcomePage.getPageTitle().toLowerCase().contains("zurmocrm - home"));
    }	
    
    @AfterClass
    public void quitBrowser() {
    //	driver.close();
    }
}
