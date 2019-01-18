package projekt.automatyzacja.test;

import org.testng.annotations.Test;

import projekt.automatyzacja.page.ContactDetailsPage;
import projekt.automatyzacja.page.ContactsPage;
import projekt.automatyzacja.page.CreateContactPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.SpecificMenu;
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

public class EditContactTC {
  
	WebDriver driver;
	Menu menu;
	SpecificMenu specificMenu;
	ContactsPage contactsPage;
	CreateContactPage createContactPage;
	ContactDetailsPage contactDetailsPage;
	
	String status = "Qualified";
	String jobTitle = "Sales Director";
	String department = "CEO";
	String officePhone = "+48 71 487 78 41";
	String source = "Word of Mouth";
	String mobilePhone = "+48 258 987 456";
	String officeFax = "+48 785 48 36";
	String primaryEmail = "pietrus@gmail.com";
	String secondaryEmail = "jacp@interia.pl";
	String primaryAddressStreet1 = "ul. Skandynawksa";
	String primaryAddressStreet2 = "5/18";
	String primaryAddressCity = "Zakopane";
	String primaryAddressState = "Małopolskie";
	String primaryAddressPostalCode = "47-987";
	String primaryAddressCountry = "Polska";
	String secondaryAddressStreet1 = "ul. Długa";
	String secondaryAddressStreet2 = "8/43";
	String secondaryAddressCity = "Opole";
	String secondaryAddressState = "Opolskie";
	String secondaryAddressPostalCode = "78-478";
	String secondaryAddressCountry = "Polska";
	String description = "Dyrektor sprzedaży samochodów";
	
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
   * This test case will edit an existing contact
   */
  
  @Test
  public void editContact() {
	  menu = new Menu(driver);
	  menu.contactsButtonClick();
	  
	  contactsPage = new ContactsPage(driver);
	  
	  String searchText = "Jacek Pietrus";
	  contactsPage.textSearchBar(searchText);
	  contactsPage.clickSearchBar();

	  (new WebDriverWait(driver, 60)).until(ExpectedConditions.textToBePresentInElement(By.cssSelector("tr.odd:nth-child(1) > td:nth-child(3) > a:nth-child(1)"), searchText));
	  
	  contactsPage.clickTableFirstNamePosition();
	  
	  contactDetailsPage = new ContactDetailsPage(driver);
	  contactDetailsPage.clickOptionsButton();
	  (new WebDriverWait(driver, 60)).until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
	  contactDetailsPage.clickOptionsEditSubButton();
	
	  createContactPage = new CreateContactPage(driver);
	  createContactPage.selectStatus(this.status);
	  createContactPage.clearJobTitle();
	  createContactPage.textJobTitle(this.jobTitle);
	  createContactPage.clearDepartment();
	  createContactPage.textDepartment(this.department);
	  createContactPage.clearOfficePhone();
	  createContactPage.textOfficePhone(this.officePhone);
	  createContactPage.selectSource(this.source);
	  createContactPage.clearMobilePhone();
	  createContactPage.textMobilePhone(this.mobilePhone);
	  createContactPage.clearOfficeFax();
	  createContactPage.textOfficeFax(this.officeFax);
	  createContactPage.clearPrimaryEmail();
	  createContactPage.textPrimaryEmail(this.primaryEmail);
	  createContactPage.clearSecondaryEmail();
	  createContactPage.textSecondaryEmail(this.secondaryEmail);
	  createContactPage.clearPrimaryAddressStreet1();
	  createContactPage.textPrimaryAddressStreet1(this.primaryAddressStreet1);
	  createContactPage.clearPrimaryAddressStreet2();
	  createContactPage.textPrimaryAddressStreet2(this.primaryAddressStreet2);
	  createContactPage.clearPrimaryAddressCity();
	  createContactPage.textPrimaryAddressCity(this.primaryAddressCity);
	  createContactPage.clearPrimaryAddressState();
	  createContactPage.textPrimaryAddressState(this.primaryAddressState);
	  createContactPage.clearPrimaryAddressPostalCode();
	  createContactPage.textPrimaryAddressPostalCode(this.primaryAddressPostalCode);
	  createContactPage.clearPrimaryAddressCountry();
	  createContactPage.textPrimaryAddressCountry(this.primaryAddressCountry);
	  createContactPage.clearSecondaryAddressStreet1();
	  createContactPage.textSecondaryAddressStreet1(this.secondaryAddressStreet1);
	  createContactPage.clearSecondaryAddressStreet2();
	  createContactPage.textSecondaryAddressStreet2(this.secondaryAddressStreet2);
	  createContactPage.clearSecondaryAddressCity();
	  createContactPage.textSecondaryAddressCity(this.secondaryAddressCity);
	  createContactPage.clearSecondaryAddressState();
	  createContactPage.textSecondaryAddressState(this.secondaryAddressState);
	  createContactPage.clearSecondaryAddressPostalCode();
	  createContactPage.textSecondaryAddressPostalCode(this.secondaryAddressPostalCode);
	  createContactPage.clearSecondaryAddressCountry();
	  createContactPage.textSecondaryAddressCountry(this.secondaryAddressCountry);
	  createContactPage.clearDescription();
	  createContactPage.textDescription(this.description);
	  createContactPage.clickSaveButton();
	  
  }

  @Test(priority=1, dependsOnMethods={"editContact"})
  public void verifyEditedContact() {
contactDetailsPage = new ContactDetailsPage(driver);
	  
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)"))); 
	  
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
  public void afterClass() {
  }

}
