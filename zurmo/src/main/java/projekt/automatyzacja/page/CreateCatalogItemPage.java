package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCatalogItemPage {

	WebDriver driver;
	
	public CreateCatalogItemPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By name = By.id("ProductTemplate_name");
	
	By description = By.id("ProductTemplate_description");
	
	By categories = By.id("token-input-ProductTemplateCategoriesForm_ProductCategory_ids");
	
	By status = By.id("ProductTemplate_status_value");
	
	By type = By.id("ProductTemplate_status_value");
	
	By priceFrequency = By.id("ProductTemplate_priceFrequency_value");
	
	By sellPriceFormula = By.id("ProductTemplate_sellPriceFormula_type");
	
	By costCurrency = By.id("ProductTemplate_cost_currency_id");
	By costValue = By.id("ProductTemplate_cost_value");
	
	By listPriceCurrency = By.id("ProductTemplate_listPrice_currency_id");
	By listPriceValue = By.id("ProductTemplate_listPrice_value");
	
	By sellPriceCurrency = By.id("ProductTemplate_sellPrice_currency_id");
	By sellPriceValue = By.id("ProductTemplate_sellPrice_value");
	
	By saveButton = By.linkText("Save");
	
	By cancelButton = By.linkText("Cancel");
	
	
// METHODS ON LOCATED OBJECTS
	
	public void textName(String name) {
		driver.findElement(this.name).sendKeys(name);
	}
	
	public void textDescription(String description) {
		driver.findElement(this.description).sendKeys(description);
	}
	
	public void textCategories(String categories) {
		driver.findElement(this.categories).sendKeys(categories);
	}
	
	public void selectStatus(int index) {
		new Select(driver.findElement(this.status)).selectByIndex(index);
	}
	
	public void selectSource(String status) {
		new Select(driver.findElement(this.status)).selectByVisibleText(status);
	}

	public void selectType(int index) {
		new Select(driver.findElement(this.type)).selectByIndex(index);
	}
	
	public void selectType(String type) {
		new Select(driver.findElement(this.type)).selectByVisibleText(type);
	}
	
	public void selectPriceFrequency(int index) {
		new Select(driver.findElement(this.priceFrequency)).selectByIndex(index);
	}
	
	public void selectPriceFrequency(String priceFrequency) {
		new Select(driver.findElement(this.priceFrequency)).selectByVisibleText(priceFrequency);
	}
	
	public void selectSellPriceFormula(int index) {
		new Select(driver.findElement(this.sellPriceFormula)).selectByIndex(index);
	}
	
	public void selectSellPriceFormula(String sellPriceFormula) {
		new Select(driver.findElement(this.sellPriceFormula)).selectByVisibleText(sellPriceFormula);
	}
	
	public void selectCostCurrency(int index) {
		new Select(driver.findElement(this.costCurrency)).selectByIndex(index);
	}
	
	public void selectCostCurrency(String costCurrency) {
		new Select(driver.findElement(this.costCurrency)).selectByVisibleText(costCurrency);
	}
	
	public void textCostValue(String costValue) {
		driver.findElement(this.costValue).sendKeys(costValue);
	}
	
	public void selectListPriceCurrency(int index) {
		new Select(driver.findElement(this.listPriceCurrency)).selectByIndex(index);
	}
	
	public void selecListPriceCurrency(String listPriceCurrency) {
		new Select(driver.findElement(this.listPriceCurrency)).selectByVisibleText(listPriceCurrency);
	}
	
	public void textListPriceValue(String listPriceValue) {
		driver.findElement(this.listPriceValue).sendKeys(listPriceValue);
	}
	
	public void selectSellPriceCurrency(int index) {
		new Select(driver.findElement(this.sellPriceCurrency)).selectByIndex(index);
	}
	
	public void selectSellPriceCurrency(String sellPriceCurrency) {
		new Select(driver.findElement(this.sellPriceCurrency)).selectByVisibleText(sellPriceCurrency);
	}
	
	public void textSellPriceValue(String sellPriceValue) {
		driver.findElement(this.sellPriceValue).sendKeys(sellPriceValue);
	}
	
	public void clickSave() {
		driver.findElement(saveButton).click();
	}
	
	public void clickCancel() {
		driver.findElement(cancelButton).click();
	}
}
