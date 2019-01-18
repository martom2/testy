package projekt.automatyzacja.test;

import org.testng.annotations.Test;

import projekt.automatyzacja.page.CatalogItemDetailsPage;
import projekt.automatyzacja.page.CreateCatalogItemPage;
import projekt.automatyzacja.page.Menu;
import projekt.automatyzacja.page.ProductsPage;
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

public class CreateCatalogItemTC {
	
	
	WebDriver driver;
	Menu menu;
	ProductsPage productsPage;
	CreateCatalogItemPage createCatalogItemPage;
	CatalogItemDetailsPage catalogItemDetailsPage;
	
	
    String name = "Rower";
    String description = "wyprodukowany w 2018 roku w Polsce";
    String categories = "pojazdy";
    String status = "Active";
   // String type = "Product";
    int type = 0;
    String priceFrequency = "One Time";
    String sellPriceFormula = "Editable";
    String costCurrency = "USD";
    String costValue = "360";
    String listPriceCurrency = "USD";
    String listPriceValue = "120";
    String sellPriceCurrency = "USD";
    String sellPriceValue = "240";

  
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
   * This test case will create a new catalog item
   */
  
  @Test(priority=0)
  public void createCatalogItem() {
	  menu = new Menu(driver);
	  menu.dotsButtonClick();
	  menu.productsButtonClick();
	  
      productsPage = new ProductsPage(driver);
	  productsPage.clickCreateCatalogItem();;
	  
	  createCatalogItemPage = new CreateCatalogItemPage(driver);
	  createCatalogItemPage.textName(this.name);
	  createCatalogItemPage.textDescription(this.description);
	 // createCatalogItemPage.textCategories(this.categories);
	  createCatalogItemPage.selectSource(this.status);
	  createCatalogItemPage.selectType(this.type);
	  createCatalogItemPage.selectPriceFrequency(this.priceFrequency);
	  createCatalogItemPage.selectSellPriceFormula(this.sellPriceFormula);
	  createCatalogItemPage.selectCostCurrency(this.costCurrency);
	  createCatalogItemPage.textCostValue(this.costValue);
	  createCatalogItemPage.selecListPriceCurrency(this.listPriceCurrency);
	  createCatalogItemPage.textListPriceValue(this.listPriceValue);
	  createCatalogItemPage.selectSellPriceCurrency(this.sellPriceCurrency);
	  createCatalogItemPage.textSellPriceValue(this.sellPriceValue);
	  createCatalogItemPage.clickSave();

	  try {
	  WebElement saveDuplicates = (new WebDriverWait(driver, 30))
			  .until(ExpectedConditions.presenceOfElementLocated(By.linkText("click here")));
	  saveDuplicates.click();
	  } catch (TimeoutException e) {
		  e.printStackTrace();
	  }
	  
  }
  
  @Test(priority=1, dependsOnMethods={"createCatalogItem"})
  public void verifyCreatedCatalogItem() {
	  
	  catalogItemDetailsPage = new CatalogItemDetailsPage(driver);
	  
	  (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.className("ellipsis-content"))); 
	  
	  Assert.assertEquals(catalogItemDetailsPage.readName(), this.name);
	  Assert.assertEquals(catalogItemDetailsPage.readDescription(), this.description);
//	  Assert.assertEquals(catalogItemDetailsPage.readCategories(), this.categories);
	  Assert.assertEquals(catalogItemDetailsPage.readStatus(), this.status);
	  Assert.assertEquals(catalogItemDetailsPage.readType(), "Product");
	  Assert.assertEquals(catalogItemDetailsPage.readPriceFrequency(), this.priceFrequency);
	  Assert.assertEquals(catalogItemDetailsPage.readSellPriceFormula(), "NA");
	  Assert.assertEquals(catalogItemDetailsPage.readCost(), "$"+this.costValue+".00");
	  Assert.assertEquals(catalogItemDetailsPage.readListPrice(), "$"+this.listPriceValue+".00");
	  Assert.assertEquals(catalogItemDetailsPage.readSellPrice(), "$"+this.sellPriceValue+".00");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
