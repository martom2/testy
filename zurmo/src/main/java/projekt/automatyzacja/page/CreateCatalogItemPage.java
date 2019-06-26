package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCatalogItemPage {

	WebDriver driver;
	
	public CreateCatalogItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS
	
	@FindBy(id="ProductTemplate_name")
	WebElement name;
	
	@FindBy(id="ProductTemplate_description")
	WebElement description;
	
	@FindBy(id="token-input-ProductTemplateCategoriesForm_ProductCategory_ids")
	WebElement categories;
	
	@FindBy(id="ProductTemplate_status_value")
	WebElement status;
	
	@FindBy(id="ProductTemplate_status_value")
	WebElement type;
	
	@FindBy(id="ProductTemplate_priceFrequency_value")
	WebElement priceFrequency;
	
	@FindBy(id="ProductTemplate_sellPriceFormula_type")
	WebElement sellPriceFormula;
	
	@FindBy(id="ProductTemplate_cost_currency_id")
	WebElement costCurrency;
	
	@FindBy(id="ProductTemplate_cost_value")
	WebElement costValue;
	
	@FindBy(id="ProductTemplate_listPrice_currency_id")
	WebElement listPriceCurrency;
	
	@FindBy(id="ProductTemplate_listPrice_value")
	WebElement listPriceValue;
	
	@FindBy(id="ProductTemplate_sellPrice_currency_id")
	WebElement sellPriceCurrency;
	
	@FindBy(id="ProductTemplate_sellPrice_value")
	WebElement sellPriceValue;
	
	@FindBy(linkText="Save")
	WebElement saveButton;
	
	@FindBy(linkText="Cancel")
	WebElement cancelButton;
	
	
// METHODS ON LOCATED OBJECTS
	
	public void textName(String name) {
		this.name.sendKeys(name);
	}
	
	public void textDescription(String description) {
		this.description.sendKeys(description);
	}
	
	public void textCategories(String categories) {
		this.categories.sendKeys(categories);
	}
	
	public void selectStatus(int index) {
		new Select(this.status).selectByIndex(index);
	}
	
	public void selectSource(String status) {
		new Select(this.status).selectByVisibleText(status);
	}

	public void selectType(int index) {
		new Select(this.type).selectByIndex(index);
	}
	
	public void selectType(String type) {
		new Select(this.type).selectByVisibleText(type);
	}
	
	public void selectPriceFrequency(int index) {
		new Select(this.priceFrequency).selectByIndex(index);
	}
	
	public void selectPriceFrequency(String priceFrequency) {
		new Select(this.priceFrequency).selectByVisibleText(priceFrequency);
	}
	
	public void selectSellPriceFormula(int index) {
		new Select(this.sellPriceFormula).selectByIndex(index);
	}
	
	public void selectSellPriceFormula(String sellPriceFormula) {
		new Select(this.sellPriceFormula).selectByVisibleText(sellPriceFormula);
	}
	
	public void selectCostCurrency(int index) {
		new Select(this.costCurrency).selectByIndex(index);
	}
	
	public void selectCostCurrency(String costCurrency) {
		new Select(this.costCurrency).selectByVisibleText(costCurrency);
	}
	
	public void textCostValue(String costValue) {
		this.costValue.sendKeys(costValue);
	}
	
	public void selectListPriceCurrency(int index) {
		new Select(this.listPriceCurrency).selectByIndex(index);
	}
	
	public void selecListPriceCurrency(String listPriceCurrency) {
		new Select(this.listPriceCurrency).selectByVisibleText(listPriceCurrency);
	}
	
	public void textListPriceValue(String listPriceValue) {
		this.listPriceValue.sendKeys(listPriceValue);
	}
	
	public void selectSellPriceCurrency(int index) {
		new Select(this.sellPriceCurrency).selectByIndex(index);
	}
	
	public void selectSellPriceCurrency(String sellPriceCurrency) {
		new Select(this.sellPriceCurrency).selectByVisibleText(sellPriceCurrency);
	}
	
	public void textSellPriceValue(String sellPriceValue) {
		this.sellPriceValue.sendKeys(sellPriceValue);
	}
	
	public void clickSave() {
		saveButton.click();
	}
	
	public void clickCancel() {
		cancelButton.click();
	}
	
}
