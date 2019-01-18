package projekt.automatyzacja.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import projekt.automatyzacja.page.EditUserPage;
import projekt.automatyzacja.page.TopMenuPage;
import projekt.automatyzacja.page.UserDetailsPage;
import projekt.automatyzacja.page.UsersPage;
import projekt.automatyzacja.page.WelcomePage;
import projekt.automatyzacja.testcase.LoginAction;

public class ActivateUserTC {

	WebDriver driver;
	TopMenuPage topMenuPage;
	UsersPage usersPage;
	UserDetailsPage usersDetailsPage;
	EditUserPage editUsersPage;
	WelcomePage welcomePage;
	
	
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
	   * This test case will activate an user
	   */
	  
	  @Test(priority=0)
	  public void activateUser() {
		  
	    topMenuPage = new TopMenuPage(driver);
		topMenuPage.clickUsersLink();
		
		usersPage = new UsersPage(driver);
		String searchText = "Kamil Nowak";
		usersPage.textSearchBar(searchText);
		usersPage.clickSearchBar();
		 (new WebDriverWait(driver, 60)).until(ExpectedConditions.textToBePresentInElement(By.cssSelector(".odd > td:nth-child(2) > a:nth-child(1)"), searchText));
		usersPage.clickTableFirstNamePosition();
		
		usersDetailsPage = new UserDetailsPage(driver);
		usersDetailsPage.clickEditButton();
		
		editUsersPage = new EditUserPage(driver);
		editUsersPage.selectStatus("Active");
		editUsersPage.clickSaveButton();
		
		(new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id("sliding-panel-toggle")));
		
		topMenuPage.clickSignOutLink();
		  
	  }
	  
	  @Test(priority=1, dependsOnMethods={"activateUser"})
	  public void verifyInactivationOfUser() {
		  
	      (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id("LoginForm_username")));
			
		  LoginAction.login(driver, "nowak", "nowak");
		  
		  welcomePage = new WelcomePage(driver);
		  	
		  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home")));
		  System.out.println("a: "+welcomePage.getPageTitle().toLowerCase());
		  Assert.assertTrue(welcomePage.getPageTitle().toLowerCase().contains("zurmocrm - home"));
		  
	  }
	  
	
}
