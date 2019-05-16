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
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;


public class CreateContactTC4 {
	
	WebDriver driver;
	ExcelUtil excel;
	Menu menu;
	SpecificMenu specificMenu;
	CreateContactPage createContactPage;
	ContactDetailsPage contactDetailsPage;
	
	// number of a row in the excel test data file
	int row;
	
  
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
	
    excel = new ExcelUtil("createContact.xlsx", "Arkusz1");
    
  }
	
  /**
   * This test case will create new contact
   */
  
  @Test(priority=0, dataProvider ="getData")
  public void createContact(int row) {
	  menu = new Menu(driver);
	  menu.contactsButtonClick();
	  
      specificMenu = new SpecificMenu(driver);
	  specificMenu.clickCreate();
	  
	  System.out.println("ROW in createContact: "+row);
	  
	  createContactPage = new CreateContactPage(driver);
	  createContactPage.selectPoliteReturn(excel.getCellData(row, 0));
	  createContactPage.textFirstName(excel.getCellData(row, 1));
	  createContactPage.textLastName(excel.getCellData(row, 2));
	  createContactPage.selectStatus(excel.getCellData(row, 3));
	  createContactPage.textJobTitle(excel.getCellData(row, 4));
	  createContactPage.textDepartment(excel.getCellData(row, 5));
	  createContactPage.textOfficePhone(excel.getCellData(row, 6));
	  createContactPage.selectSource(excel.getCellData(row, 7));
	  createContactPage.textMobilePhone(excel.getCellData(row, 8));
	  createContactPage.textOfficeFax(excel.getCellData(row, 9));
	  createContactPage.textPrimaryEmail(excel.getCellData(row, 10));
	  createContactPage.textSecondaryEmail(excel.getCellData(row,11));
	  createContactPage.textPrimaryAddressStreet1(excel.getCellData(row, 12));
	  createContactPage.textPrimaryAddressStreet2(excel.getCellData(row, 13));
	  createContactPage.textPrimaryAddressCity(excel.getCellData(row, 14));
	  createContactPage.textPrimaryAddressState(excel.getCellData(row, 15));
	  createContactPage.textPrimaryAddressPostalCode(excel.getCellData(row, 16));
	  createContactPage.textPrimaryAddressCountry(excel.getCellData(row, 17));
	  createContactPage.textSecondaryAddressStreet1(excel.getCellData(row, 18));
	  createContactPage.textSecondaryAddressStreet2(excel.getCellData(row, 19));
	  createContactPage.textSecondaryAddressCity(excel.getCellData(row, 20));
	  createContactPage.textSecondaryAddressState(excel.getCellData(row, 21));
	  createContactPage.textSecondaryAddressPostalCode(excel.getCellData(row, 22));
	  createContactPage.textSecondaryAddressCountry(excel.getCellData(row, 23));
	  createContactPage.textDescription(excel.getCellData(row, 24));
	  createContactPage.clickSaveButton();

	  try {
	  WebElement saveDuplicates = (new WebDriverWait(driver, 30))
			  .until(ExpectedConditions.presenceOfElementLocated(By.linkText("click here")));
	  saveDuplicates.click();
	  } catch (TimeoutException e) {
		  e.printStackTrace();
	  }
	  
  }
  

  @Test(priority=1, dataProvider ="getData", dependsOnMethods={"createContact"})
  public void verifyCreatedContact(int row) {
	  
	  contactDetailsPage = new ContactDetailsPage(driver);
	  
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)"))); 
	  
	  System.out.println("ROW in verifyContact: "+row);
	  
	  Assert.assertEquals(contactDetailsPage.readName(), excel.getCellData(row, 0)+" "+excel.getCellData(row, 1)+" "+excel.getCellData(row, 2));
	  Assert.assertEquals(contactDetailsPage.readStatus(), excel.getCellData(row, 3));
	  Assert.assertEquals(contactDetailsPage.readJobTitle(), excel.getCellData(row, 4));
	  Assert.assertEquals(contactDetailsPage.readDepartment(), excel.getCellData(row, 5));
	  Assert.assertEquals(contactDetailsPage.readOfficePhone(), excel.getCellData(row, 6));
	  Assert.assertEquals(contactDetailsPage.readSource(), excel.getCellData(row, 7));
	  Assert.assertEquals(contactDetailsPage.readMobilePhone(), excel.getCellData(row, 8));
	  Assert.assertEquals(contactDetailsPage.readOfficeFax(), excel.getCellData(row, 9));
	  Assert.assertEquals(contactDetailsPage.readPrimaryEmail(), excel.getCellData(row, 10));
	  Assert.assertEquals(contactDetailsPage.readSecondaryEmail(), excel.getCellData(row, 11));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressStreet1(), excel.getCellData(row, 12));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressStreet2(), excel.getCellData(row, 13));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressCity(), excel.getCellData(row, 14));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressState(), excel.getCellData(row, 15));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressPostalCode(), excel.getCellData(row, 16));
	  Assert.assertEquals(contactDetailsPage.readPrimaryAddressCountry(), excel.getCellData(row, 17));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressStreet1(), excel.getCellData(row, 18));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressStreet2(), excel.getCellData(row, 19));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressCity(), excel.getCellData(row, 20));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressState(), excel.getCellData(row, 21));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressPostalCode(), excel.getCellData(row, 22));
	  Assert.assertEquals(contactDetailsPage.readSecondaryAddressCountry(), excel.getCellData(row, 23));
	  Assert.assertEquals(contactDetailsPage.readDescription(), excel.getCellData(row, 24));
	
  }
  
  @AfterClass
  public void afterSuite() {
	 // driver.quit();
  }
  
  @DataProvider
  private static Integer[][] getData(ITestContext context) {
      String parameter = context.getCurrentXmlTest().getLocalParameters().get("excelRowNumber");
   //   System.out.println("Locacl parameters: "+context.getCurrentXmlTest().getLocalParameters());
    //  System.out.println("Parameter: "+parameter);
      String[] excelRowNumberParameter = parameter.split(",");
      Integer[][] returnValues = new Integer[excelRowNumberParameter.length][1];
      int index = 0;
      for (Object[] each : returnValues) {
         // each[0] = excelRowNumberParameter[index++].trim();
          each[0] = Integer.parseInt((excelRowNumberParameter[index++].trim()).toString());
      }
      
      return returnValues;   
  }
  

}
