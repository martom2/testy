package projekt.automatyzacja.test;

import org.testng.annotations.Test;

import projekt.automatyzacja.page.AccountDetailsPage;
import projekt.automatyzacja.page.AccountsPage;
import projekt.automatyzacja.page.CreateAccountPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.SpecificMenu;
import projekt.automatyzacja.testcase.LoginAction;
import projekt.automatyzacja.utility.ExcelUtil;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CreateAccountTC2 {

	WebDriver driver;
	Menu menu;
	SpecificMenu specificMenu;
	AccountsPage accountsPage;
	CreateAccountPage createAccountPage;
	AccountDetailsPage accountDetailsPage;
	ExcelUtil excel;
	int row;
	
    String name = "Kamil Czaja";
    String officePhone = "+48 29 458 74 23";
    String industry = "Banking";
    String officeFax = "+48 256 15 72";
    String employees = "5";
    String annualRevenue = "100";
    String type = "Vendor";
    String website = "http://www.kamil-czaja.org";
    String billingAddressStreet1 = "ul. Zielna";
    String billingAddressStreet2 = "18/2";
    String billingAddressCity = "Warszawa";
    String billingAddressState = "Mazowieckie";
    String billingAddressPostalCode = "10-158";
    String billingAddressCountry = "Polska";
    String shippingAddressStreet1 = "ul. Skrzydlata";
    String shippingAddressStreet2 = "2A/5";
    String shippingAddressCity = "Wrocław";
    String shippingAddressState = "Dolnośląskie";
    String shippingAddressPostalCode = "51-745";
    String shippingAddressCountry = "Polska";
    String description = "konto Kamila";    
    
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
	
	excel = new ExcelUtil("createAccount2.xlsx", "Arkusz1");
	this.row = excelRowNumber;
  }
  
  /**
   * This test case will create a new account
   */
  
  @Test(priority=0)
  public void createAccount() {
	  menu = new Menu(driver);
	  menu.accountsButtonClick();
	  
      specificMenu = new SpecificMenu(driver);
	  specificMenu.clickCreate();
	  System.out.println("ROW: "+row);
	  createAccountPage = new CreateAccountPage(driver);
	  createAccountPage.textName(excel.getCellData(row, 0));
	  createAccountPage.textOfficePhone(excel.getCellData(row, 1));
	  createAccountPage.selectIndustry(excel.getCellData(row, 2));
	  createAccountPage.textOfficeFax(excel.getCellData(row, 3));
	  createAccountPage.textEmployees(excel.getCellData(row, 4));
	  createAccountPage.textAnnualRevenue(excel.getCellData(row, 5));
	  createAccountPage.selectType(excel.getCellData(row, 6));
	  createAccountPage.textWebsite(excel.getCellData(row, 7));
	  createAccountPage.textBillingAddressStreet1(excel.getCellData(row, 8));
	  createAccountPage.textBillingAddressStreet2(excel.getCellData(row, 9));
	  createAccountPage.textBillingAddressCity(excel.getCellData(row, 10));
	  createAccountPage.textBillingAddressState(excel.getCellData(row, 11));
	  createAccountPage.textBillingAddressPostalCode(excel.getCellData(row, 12));
	  createAccountPage.textBillingAddressCountry(excel.getCellData(row, 13));
	  createAccountPage.textShippingAddressStreet1(excel.getCellData(row, 14));
	  createAccountPage.textShippingAddressStreet2(excel.getCellData(row, 15));
	  createAccountPage.textShippingAddressCity(excel.getCellData(row, 16));
	  createAccountPage.textShippingAddressState(excel.getCellData(row, 17));
	  createAccountPage.textShippingAddressPostalCode(excel.getCellData(row, 18));
	  createAccountPage.textShippingAddressCountry(excel.getCellData(row, 19));
	  createAccountPage.textDescription(excel.getCellData(row, 20));
	  createAccountPage.clickSaveButton();

	  try {
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("click here")));
//	  saveDuplicates.click();
	  } catch (TimeoutException e) {
		  e.printStackTrace();
	  }
	  
  }
  

  @Test(priority=1, dependsOnMethods={"createAccount"})
  public void verifyCreatedAccount() {
	  
	  accountDetailsPage = new AccountDetailsPage(driver);
	  
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)"))); 
	  
	  Assert.assertEquals(accountDetailsPage.readName(), this.name);
	  Assert.assertEquals(accountDetailsPage.readOfficePhone(), this.officePhone);
	  Assert.assertEquals(accountDetailsPage.readIndustry(), industry);
	  Assert.assertEquals(accountDetailsPage.readOfficeFax(), this.officeFax);
	  Assert.assertEquals(accountDetailsPage.readEmployees(), this.employees);
	  Assert.assertEquals(accountDetailsPage.readAnnualRevenue(), this.annualRevenue);
	  Assert.assertEquals(accountDetailsPage.readType(), this.type);
	  Assert.assertEquals(accountDetailsPage.readWebsite(), this.website);
	  Assert.assertEquals(accountDetailsPage.readBillingAddressStreet1(), this.billingAddressStreet1);
	  Assert.assertEquals(accountDetailsPage.readBillingAddressStreet2(), this.billingAddressStreet2);
	  Assert.assertEquals(accountDetailsPage.readBillingAddressCity(), this.billingAddressCity);
	  Assert.assertEquals(accountDetailsPage.readBillingAddressState(), this.billingAddressState);
	  Assert.assertEquals(accountDetailsPage.readBillingAddressPostalCode(), this.billingAddressPostalCode);
	  Assert.assertEquals(accountDetailsPage.readShippingAddressStreet1(), this.shippingAddressStreet1);
	  Assert.assertEquals(accountDetailsPage.readShippingAddressStreet2(), this.shippingAddressStreet2);
	  Assert.assertEquals(accountDetailsPage.readShippingAddressCity(), this.shippingAddressCity);
	  Assert.assertEquals(accountDetailsPage.readShippingAddressState(), this.shippingAddressState);
	  Assert.assertEquals(accountDetailsPage.readShippingAddressPostalCode(), this.shippingAddressPostalCode);
	  Assert.assertEquals(accountDetailsPage.readDescription(), this.description);
	  

  }
  
  @AfterClass
  public void afterSuite() {
	 // driver.quit();
  }

}
