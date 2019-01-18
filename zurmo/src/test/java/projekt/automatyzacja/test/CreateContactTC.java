package projekt.automatyzacja.test;

import org.testng.annotations.Test;

import projekt.automatyzacja.page.ContactDetailsPage;
import projekt.automatyzacja.page.CreateContactPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.SpecificMenu;
import projekt.automatyzacja.testcase.LoginAction;

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

public class CreateContactTC {
	
	WebDriver driver;
	Menu menu;
	SpecificMenu specificMenu;
	CreateContactPage createContactPage;
	ContactDetailsPage contactDetailsPage;
	
	String politeReturn = "Mr.";
	String firstName = "Jacek";
	String lastName = "Pietrus";
	String status = "Customer";
	String jobTitle = "Sales Manager";
	String department = "Sales Department";
	String officePhone = "+48 71 789 22 56";
	String source = "Tradeshow";
	String mobilePhone = "+48 798 502 456";
	String officeFax = "+48 124 25 89";
	String primaryEmail = "jacek.pietrus@gmail.com";
	String secondaryEmail = "jacp@wp.pl";
	String primaryAddressStreet1 = "ul. Lubińska";
	String primaryAddressStreet2 = "18/8";
	String primaryAddressCity = "Gdynia";
	String primaryAddressState = "Pomorskie";
	String primaryAddressPostalCode = "68-698";
	String primaryAddressCountry = "Polska";
	String secondaryAddressStreet1 = "ul. Jodlana";
	String secondaryAddressStreet2 = "26/3";
	String secondaryAddressCity = "Wrocław";
	String secondaryAddressState = "Dolnośląskie";
	String secondaryAddressPostalCode = "50-698";
	String secondaryAddressCountry = "Polska";
	String description = "Menedżer sprzedaży samochodów";
	
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
  public void createContact() {
	  menu = new Menu(driver);
	  menu.contactsButtonClick();
	  
      specificMenu = new SpecificMenu(driver);
	  specificMenu.clickCreate();
	  
	  createContactPage = new CreateContactPage(driver);
	  createContactPage.selectPoliteReturn(this.politeReturn);
	  createContactPage.textFirstName(this.firstName);
	  createContactPage.textLastName(this.lastName);
	  createContactPage.selectStatus(this.status);
	  createContactPage.textJobTitle(this.jobTitle);
	  createContactPage.textDepartment(this.department);
	  createContactPage.textOfficePhone(this.officePhone);
	  createContactPage.selectSource(this.source);
	  createContactPage.textMobilePhone(this.mobilePhone);
	  createContactPage.textOfficeFax(this.officeFax);
	  createContactPage.textPrimaryEmail(this.primaryEmail);
	  createContactPage.textSecondaryEmail(this.secondaryEmail);
	  createContactPage.textPrimaryAddressStreet1(this.primaryAddressStreet1);
	  createContactPage.textPrimaryAddressStreet2(this.primaryAddressStreet2);
	  createContactPage.textPrimaryAddressCity(this.primaryAddressCity);
	  createContactPage.textPrimaryAddressState(this.primaryAddressState);
	  createContactPage.textPrimaryAddressPostalCode(this.primaryAddressPostalCode);
	  createContactPage.textPrimaryAddressCountry(this.primaryAddressCountry);
	  createContactPage.textSecondaryAddressStreet1(this.secondaryAddressStreet1);
	  createContactPage.textSecondaryAddressStreet2(this.secondaryAddressStreet2);
	  createContactPage.textSecondaryAddressCity(this.secondaryAddressCity);
	  createContactPage.textSecondaryAddressState(this.secondaryAddressState);
	  createContactPage.textSecondaryAddressPostalCode(this.secondaryAddressPostalCode);
	  createContactPage.textSecondaryAddressCountry(this.secondaryAddressCountry);
	  createContactPage.textDescription(this.description);
	  createContactPage.clickSaveButton();

	  try {
	  WebElement saveDuplicates = (new WebDriverWait(driver, 30))
			  .until(ExpectedConditions.presenceOfElementLocated(By.linkText("click here")));
	  saveDuplicates.click();
	  } catch (TimeoutException e) {
		  e.printStackTrace();
	  }
	  
  }
  

  @Test(priority=1, dependsOnMethods={"createContact"})
  public void verifyCreatedContact() {
	  
	  contactDetailsPage = new ContactDetailsPage(driver);
	  
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)"))); 
	  
	  
	  Assert.assertEquals(contactDetailsPage.readName(), this.politeReturn+" "+this.firstName+" "+this.lastName);
	  Assert.assertEquals(contactDetailsPage.readStatus(), this.status);
	  Assert.assertEquals(contactDetailsPage.readJobTitle(), this.jobTitle);
	  Assert.assertEquals(contactDetailsPage.readDepartment(), this.department);
	  Assert.assertEquals(contactDetailsPage.readOfficePhone(), this.officePhone);
	  Assert.assertEquals(contactDetailsPage.readSource(), this.source);
	  Assert.assertEquals(contactDetailsPage.readMobilePhone(), this.mobilePhone);
	  Assert.assertEquals(contactDetailsPage.readOfficeFax(), this.officeFax);
	  Assert.assertEquals(contactDetailsPage.readPrimaryEmail(), this.primaryEmail);
	  Assert.assertEquals(contactDetailsPage.readSecondaryEmail(), this.secondaryEmail);
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressStreet1(), this.primaryAddressStreet1);
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressStreet2(), this.primaryAddressStreet2);
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressCity(), this.primaryAddressCity);
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressState(), this.primaryAddressState);
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressPostalCode(), this.primaryAddressPostalCode);
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressStreet1(), this.secondaryAddressStreet1);
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressStreet2(), this.secondaryAddressStreet2);
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressCity(), this.secondaryAddressCity);
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressState(), this.secondaryAddressState);
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressPostalCode(), this.secondaryAddressPostalCode);
	  Assert.assertEquals(contactDetailsPage.readDescription(), this.description);
	
	  

  }
  
  @AfterClass
  public void afterSuite() {
	 // driver.quit();
  }

}
