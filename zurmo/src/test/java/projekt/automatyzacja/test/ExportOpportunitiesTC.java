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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.OpportunitiesPage;
import projekt.automatyzacja.page.SpecificMenu;
import projekt.automatyzacja.testcase.LoginAction;

public class ExportOpportunitiesTC {
	
	WebDriver driver;
	Menu menu;
	SpecificMenu specificMenu;
	OpportunitiesPage opportunitiesPage;
	
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
		
		LoginAction.login(driver, "super", "super");
		
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home")));
		  
	}

  /**
   * This test case will export an existing opportunity to excel file.
   */

  @Test(priority=0)
  public void exportOpportunity() {
	 menu = new Menu(driver);
	 menu.opportunitiesButtonClick();
	 
	 opportunitiesPage = new OpportunitiesPage(driver);
	 String searchText = "Kurs językowy";
	 opportunitiesPage.textSearchBar(searchText);
	 opportunitiesPage.clickSearchBar();
	  
     (new WebDriverWait(driver, 60)).until(ExpectedConditions.textToBePresentInElement(By.cssSelector("tr.odd:nth-child(1) > td:nth-child(3) > a:nth-child(1)"), searchText));

     opportunitiesPage.selectFirstTableCheckbox();
     
	 specificMenu = new SpecificMenu(driver);
	 specificMenu.clickExportSelected();
	  
  }
  
  @AfterClass
  public void afterClass() {
  }
}
