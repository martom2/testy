package projekt.automatyzacja.test;

import org.testng.annotations.Test;

import projekt.automatyzacja.page.DashboardPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.testcase.LoginAction;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AddPost {
 
	WebDriver driver;
	Menu menu;
	DashboardPage dashboardPage;
	
	String postText = "everything is fine";

	
  @BeforeClass
  public void setUp() {
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
		
		LoginAction.login(driver, "super", "super");
		
	    (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home")));
		  
	  }
  
  /**
   * This test case will add a post on dashboard
   */
  
  @Test(priority=0)
  public void addPost() {
	  menu = new Menu(driver);
	  menu.homeButtonClick(); 	  
	  
	  dashboardPage = new DashboardPage(driver);
	  dashboardPage.textPostTextBox(this.postText);
	  dashboardPage.clickPostButton();
  }

  @Test(priority=1, dependsOnMethods={"addPost"})
  public void verifyAddedPost() {
	  dashboardPage = new DashboardPage(driver);
	 
	  String commentContent = driver.findElement(By.className("comment-content")).getText();
	  String[] commentContentLines = commentContent.split("\\n");
	  String commentContentLine2 = commentContentLines[1];
	  
	  Assert.assertEquals(commentContentLine2, this.postText);
  }
  
  @AfterClass
  public void afterClass() {
  }

}
