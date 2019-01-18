package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOpportunityPage {

WebDriver driver;
	
	public CreateOpportunityPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	

	By name = By.id("Opportunity_name");
	
	By amountCurrency = By.id("Opportunity_amount_currency_id");
	By amountValue = By.id("Opportunity_amount_value");
	
	By account = By.id("Opportunity_account_name");
	By accountSearch = By.id("Opportunity_account_SelectLink");
	
	By closeDate = By.id("Opportunity_closeDate");
	By closeDateCalendar = By.className("ui-datepicker-trigger");
	
	By stage = By.id("Opportunity_stage_value");
	
	By probability = By.id("Opportunity_probability");
	
	By source = By.id("Opportunity_source_value");
	
	By description = By.id("Opportunity_description");
	
	By saveButton = By.linkText("Save");
	
	By cancelButton = By.linkText("Cancel");
	
	
	
//METHODS ON OBJECTS
	
	public void textName(String name) {
		driver.findElement(this.name).sendKeys(name);
	}
	
	public void selectAmountCurrency(int index) {
		new Select(driver.findElement(this.amountCurrency)).selectByIndex(index);
	}
	
	public void selectAmountCurrency(String currency) {
		new Select(driver.findElement(this.amountCurrency)).selectByVisibleText(currency);
	}
	
	public void textAmountValue(String amount) {
		driver.findElement(this.amountValue).sendKeys(amount);
	}
	
	public void clearAmountValue() {
		driver.findElement(this.amountValue).clear();
	}
	
	public void textAccount(String acc) {
		driver.findElement(this.account).sendKeys(acc);
	}
	
	public void selectAccountSearch() {
		driver.findElement(this.accountSearch).click();
	}
	
	public void textCloseDate(String closeDate) {
		driver.findElement(this.closeDate).sendKeys(closeDate);
	}
	
	public void selectCloseDateCalendar() {
		driver.findElement(this.closeDateCalendar).click();
	}
	
	
	public void selectStage(int index) {
		new Select(driver.findElement(this.stage)).selectByIndex(index);
	}
	
	public void selectStage(String stage) {
		new Select(driver.findElement(this.stage)).selectByVisibleText(stage);
	}
	
	public void textProbability(String probability) {
		driver.findElement(this.probability).sendKeys(probability);
	}
	
	public void selectSource(int index) {
		new Select(driver.findElement(source)).selectByIndex(index);
	}
	
	public void selectSource(String source) {
		new Select(driver.findElement(this.source)).selectByVisibleText(source);;
	}
	
	public void textDescription(String desc) {
		driver.findElement(description).sendKeys(desc);
	}
	
	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}
	
	public void clickCancelButton() {
		driver.findElement(cancelButton).click();
	}
	
}
