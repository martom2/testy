package projekt.automatyzacja.test;

import org.testng.annotations.Test;

import projekt.automatyzacja.page.ContactDetailsPage;
import projekt.automatyzacja.page.CreateContactPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.SpecificMenu;
import projekt.automatyzacja.testcase.LoginAction;
import projekt.automatyzacja.utility.ExcelUtil;

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
import org.testng.annotations.Parameters;

public class CreateContactTC2 {
	
	WebDriver driver;
	ExcelUtil excel;
	Menu menu;
	SpecificMenu specificMenu;
	CreateContactPage createContactPage;
	ContactDetailsPage contactDetailsPage;
	
	// number of a row in the excel test data file
	int row;
	
  @Parameters({"excelRowNumber"})
  @BeforeClass
  public void setUp(int excelRowNumber) {
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
	
    excel = new ExcelUtil("createContact.xlsx", "Arkusz1");
    this.row = excelRowNumber;
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
	  createContactPage.selectPoliteReturn(excel.getCellData(row, 0));
	  createContactPage.textFirstName(excel.getCellData(row, 1));
	  createContactPage.textLastName(excel.getCellData(row, 2));
	  createContactPage.selectStatus(excel.getCellData(row, 3));
	  createContactPage.textJobTitle(excel.getCellData(row, 4));
	  createContactPage.textDepartment(excel.getCellData(row, 5));
	  createContactPage.textOfficePhone(excel.getCellData(1, 6));
	  createContactPage.selectSource(excel.getCellData(1, 7));
	  createContactPage.textMobilePhone(excel.getCellData(1, 8));
	  createContactPage.textOfficeFax(excel.getCellData(1, 9));
	  createContactPage.textPrimaryEmail(excel.getCellData(1, 10));
	  createContactPage.textSecondaryEmail(excel.getCellData(1,11));
	  createContactPage.textPrimaryAddressStreet1(excel.getCellData(1, 12));
	  createContactPage.textPrimaryAddressStreet2(excel.getCellData(1, 13));
	  createContactPage.textPrimaryAddressCity(excel.getCellData(1, 14));
	  createContactPage.textPrimaryAddressState(excel.getCellData(1, 15));
	  createContactPage.textPrimaryAddressPostalCode(excel.getCellData(1, 16));
	  createContactPage.textPrimaryAddressCountry(excel.getCellData(1, 17));
	  createContactPage.textSecondaryAddressStreet1(excel.getCellData(1, 18));
	  createContactPage.textSecondaryAddressStreet2(excel.getCellData(1, 19));
	  createContactPage.textSecondaryAddressCity(excel.getCellData(1, 20));
	  createContactPage.textSecondaryAddressState(excel.getCellData(1, 21));
	  createContactPage.textSecondaryAddressPostalCode(excel.getCellData(1, 22));
	  createContactPage.textSecondaryAddressCountry(excel.getCellData(1, 23));
	  createContactPage.textDescription(excel.getCellData(1, 24));
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
	  
	  
	  Assert.assertEquals(contactDetailsPage.readName(), excel.getCellData(1, 0)+" "+excel.getCellData(1, 1)+" "+excel.getCellData(1, 2));
	  Assert.assertEquals(contactDetailsPage.readStatus(), excel.getCellData(1, 3));
	  Assert.assertEquals(contactDetailsPage.readJobTitle(), excel.getCellData(1, 4));
	  Assert.assertEquals(contactDetailsPage.readDepartment(), excel.getCellData(1, 5));
	  Assert.assertEquals(contactDetailsPage.readOfficePhone(), excel.getCellData(1, 6));
	  Assert.assertEquals(contactDetailsPage.readSource(), excel.getCellData(1, 7));
	  Assert.assertEquals(contactDetailsPage.readMobilePhone(), excel.getCellData(1, 8));
	  Assert.assertEquals(contactDetailsPage.readOfficeFax(), excel.getCellData(1, 9));
	  Assert.assertEquals(contactDetailsPage.readPrimaryEmail(), excel.getCellData(1, 10));
	  Assert.assertEquals(contactDetailsPage.readSecondaryEmail(), excel.getCellData(1, 11));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressStreet1(), excel.getCellData(1, 12));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressStreet2(), excel.getCellData(1, 13));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressCity(), excel.getCellData(1, 14));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressState(), excel.getCellData(1, 15));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressPostalCode(), excel.getCellData(1, 16));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressCountry(), excel.getCellData(1, 17));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressStreet1(), excel.getCellData(1, 18));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressStreet2(), excel.getCellData(1, 19));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressCity(), excel.getCellData(1, 20));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressState(), excel.getCellData(1, 21));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressPostalCode(), excel.getCellData(1, 22));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressCountry(), excel.getCellData(1, 23));
	  Assert.assertEquals(contactDetailsPage.readDescription(), excel.getCellData(1, 24));
	
	  

  }
  
  @AfterClass
  public void afterSuite() {
	 // driver.quit();
  }

}
