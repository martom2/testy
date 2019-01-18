package projekt.automatyzacja.test;

import org.testng.annotations.Test;

import projekt.automatyzacja.page.CreateLeadPage;
import projekt.automatyzacja.page.LeadDetailsPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.SpecificMenu;
import projekt.automatyzacja.testcase.LoginAction;

import org.testng.annotations.BeforeClass;

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

public class CreateLeadTC {

	WebDriver driver;
	Menu menu;
	SpecificMenu specificMenu;
	CreateLeadPage createLeadPage;
	LeadDetailsPage leadDetailsPage;
	
	
	  String politeReturn = "Ms.";
	  String firstName = "Weronika";
	  String lastName = "Rosztyn";
	  String status = "In Progress";
	  String jobTitle = "Senior Architect";
	  String companyName = "Microsoft";
	  String department = "Programming";
	  String officePhone = "+48 71 459 57 12";
	  String source = "Inbound Call";
	  String mobilePhone = "+48 505 236 908";
	  String officeFax = "+48 458 44 56";
	  String primaryEmail = "weronika.rosztyn@gmail.com";
	  String secondaryEmail = "wer@onet.pl";
	  String primaryAddressStreet1 = "ul. Główna";
	  String primaryAddressStreet2 = "28D";
	  String primaryAddressCity = "Bydgoszcz";
	  String primaryAddressState = "Pomorskie";
	  String primaryAddressPostalCode = "78-987";
	  String primaryAddressCountry = "Polska";
	  String secondaryAddressStreet1 = "ul. Różana";
	  String secondaryAddressStreet2 = "3/18";
	  String secondaryAddressCity = "Zgorzelec";
	  String secondaryAddressState = "Dolnośląskie";
	  String secondaryAddressPostalCode = "59-587";
	  String secondaryAddressCountry = "Polska";
	  String website = "www.weronika-rosztyn.com";
	  String description = "Architekt oprogramowania";
	  String industry = "Technology";
	
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
   * This test case will create new contact
   */
  
  @Test(priority=0)
  public void createLead() {
	  menu = new Menu(driver);
	  menu.leadsButtonClick();
	  
      specificMenu = new SpecificMenu(driver);
	  specificMenu.clickCreate();
	  
	  createLeadPage = new CreateLeadPage(driver);
	  createLeadPage.selectPoliteReturn(this.politeReturn);
	  createLeadPage.textFirstName(this.firstName);
	  createLeadPage.textLastName(this.lastName);
	  createLeadPage.selectStatus(this.status);
	  createLeadPage.textJobTitle(this.jobTitle);
	  createLeadPage.textCompanyName(this.companyName);
	  createLeadPage.textDepartment(this.department);
	  createLeadPage.textOfficePhone(this.officePhone);
	  createLeadPage.selectSource(this.source);
	  createLeadPage.textMobilePhone(this.mobilePhone);
	  createLeadPage.textOfficeFax(this.officeFax);
	  createLeadPage.textPrimaryEmail(this.primaryEmail);
	  createLeadPage.textSecondaryEmail(this.secondaryEmail);
	  createLeadPage.textPrimaryAddressStreet1(this.primaryAddressStreet1);
	  createLeadPage.textPrimaryAddressStreet2(this.primaryAddressStreet2);
	  createLeadPage.textPrimaryAddressCity(this.primaryAddressCity);
	  createLeadPage.textPrimaryAddressState(this.primaryAddressState);
	  createLeadPage.textPrimaryAddressPostalCode(this.primaryAddressPostalCode);
	  createLeadPage.textPrimaryAddressCountry(this.primaryAddressCountry);
	  createLeadPage.textSecondaryAddressStreet1(this.secondaryAddressStreet1);
	  createLeadPage.textSecondaryAddressStreet2(this.secondaryAddressStreet2);
	  createLeadPage.textSecondaryAddressCity(this.secondaryAddressCity);
	  createLeadPage.textSecondaryAddressState(this.secondaryAddressState);
	  createLeadPage.textSecondaryAddressPostalCode(this.secondaryAddressPostalCode);
	  createLeadPage.textSecondaryAddressCountry(this.secondaryAddressCountry);
	  createLeadPage.textWebsite(this.website);
	  createLeadPage.textDescription(this.description);
	  createLeadPage.selectIndustry(this.industry);
	  createLeadPage.clickSaveButton();

	  

	  try {
	  WebElement saveDuplicates = (new WebDriverWait(driver, 30))
			  .until(ExpectedConditions.presenceOfElementLocated(By.linkText("click here")));
	  saveDuplicates.click();
	  } catch (TimeoutException e) {
		  e.printStackTrace();
	  }
	  
  }
  

  @Test(priority=1, dependsOnMethods={"createLead"})
  public void verifyCreatedLead() {
	  
	  leadDetailsPage = new LeadDetailsPage(driver);
	  
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)"))); 
	  
	  Assert.assertEquals(leadDetailsPage.readName(), this.politeReturn+" "+this.firstName+" "+this.lastName);
	  Assert.assertEquals(leadDetailsPage.readStatus(), this.status);
	  Assert.assertEquals(leadDetailsPage.readJobTitle(), this.jobTitle);
	  Assert.assertEquals(leadDetailsPage.readDepartment(), this.department);
	  Assert.assertEquals(leadDetailsPage.readOfficePhone(), this.officePhone);
	  Assert.assertEquals(leadDetailsPage.readSource(), this.source);
	  Assert.assertEquals(leadDetailsPage.readMobilePhone(), this.mobilePhone);
	  Assert.assertEquals(leadDetailsPage.readOfficeFax(), this.officeFax);
	  Assert.assertEquals(leadDetailsPage.readPrimaryEmail(), this.primaryEmail);
	  Assert.assertEquals(leadDetailsPage.readSecondaryEmail(), this.secondaryEmail);
	  Assert.assertEquals(leadDetailsPage.readPrimaryAddressStreet1(), this.primaryAddressStreet1);
	  Assert.assertEquals(leadDetailsPage.readPrimaryAddressStreet2(), this.primaryAddressStreet2);
	  Assert.assertEquals(leadDetailsPage.readPrimaryAddressCity(), this.primaryAddressCity);
	  Assert.assertEquals(leadDetailsPage.readPrimaryAddressState(), this.primaryAddressState);
	  Assert.assertEquals(leadDetailsPage.readPrimaryAddressPostalCode(), this.primaryAddressPostalCode);
	  Assert.assertEquals(leadDetailsPage.readSecondaryAddressStreet1(), this.secondaryAddressStreet1);
	  Assert.assertEquals(leadDetailsPage.readSecondaryAddressStreet2(), this.secondaryAddressStreet2);
	  Assert.assertEquals(leadDetailsPage.readSecondaryAddressCity(), this.secondaryAddressCity);
	  Assert.assertEquals(leadDetailsPage.readSecondaryAddressState(), this.secondaryAddressState);
	  Assert.assertEquals(leadDetailsPage.readSecondaryAddressPostalCode(), this.secondaryAddressPostalCode);
	  Assert.assertEquals(leadDetailsPage.readIndustry(), this.industry);
	  Assert.assertEquals(leadDetailsPage.readWebsite(), "http://"+this.website);
	  Assert.assertEquals(leadDetailsPage.readDescription(), this.description);
	  

  }
  
  @AfterClass
  public void afterSuite() {
	 // driver.quit();
  }

}
