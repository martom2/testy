package projekt.automatyzacja.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import projekt.automatyzacja.page.CreateOpportunityPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.OpportunityDetailsPage;
import projekt.automatyzacja.page.SpecificMenu;
import projekt.automatyzacja.testcase.LoginAction;

public class CreateOpportunityTC {

	WebDriver driver;
	Menu menu;
	SpecificMenu specificMenu;
	CreateOpportunityPage createOpportunityPage;
	OpportunityDetailsPage opportunityDetailsPage;
	
    String name = "Kurs językowy";
    String amountCurrency = "USD";
    String amountValue = "250";
    String closeDate = "12/3/18";
    String stage = "Verbal";
    String probability = "";
    String source = "Self-Generated";
    String description = "świetna okazja";
	
	
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
   * This test case will create a new opportunity
   */
  
  @Test(priority=0)
  public void createOpportunity() {
	  menu = new Menu(driver);
	  menu.opportunitiesButtonClick();
	  
      specificMenu = new SpecificMenu(driver);
	  specificMenu.clickCreate();
	  
	  createOpportunityPage = new CreateOpportunityPage(driver);
	  createOpportunityPage.textName(this.name);
	  createOpportunityPage.selectAmountCurrency(this.amountCurrency);
	  createOpportunityPage.clearAmountValue();
	  createOpportunityPage.textAmountValue(this.amountValue);
	  createOpportunityPage.textCloseDate(this.closeDate);
	  createOpportunityPage.selectStage(this.stage);
	  createOpportunityPage.selectSource(this.source);
	  createOpportunityPage.textDescription(this.description);
	  createOpportunityPage.clickSaveButton();

//	  try {
//	  WebElement saveDuplicates = (new WebDriverWait(driver, 30))
//			  .until(ExpectedConditions.presenceOfElementLocated(By.linkText("click here")));
//	  saveDuplicates.click();
//	  } catch (TimeoutException e) {
//		  e.printStackTrace();
//	  }
	  
  }
  

  @Test(priority=1, dependsOnMethods={"createOpportunity"})
  public void verifyCreatedOpportunity() {
	  
	  opportunityDetailsPage = new OpportunityDetailsPage(driver);
	  
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > th:nth-child(1)"))); 
	  
	  Assert.assertEquals(opportunityDetailsPage.readName(), this.name);
	  Assert.assertEquals(opportunityDetailsPage.readAmount(), "$"+this.amountValue+".00");
	//  Assert.assertEquals(opportunityDetailsPage.readIndustry() this.account);
	  Assert.assertEquals(opportunityDetailsPage.readCloseDate(), this.closeDate);
	  Assert.assertEquals(opportunityDetailsPage.readStage(), this.stage);
	//  Assert.assertEquals(opportunityDetailsPage.readAnnualRevenue(), this.probability);
	  Assert.assertEquals(opportunityDetailsPage.readSource(), this.source);
	  Assert.assertEquals(opportunityDetailsPage.readDescription(), this.description);
	  

  }
  
  @AfterClass
  public void afterSuite() {
	 // driver.quit();
  }
	
}
