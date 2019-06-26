package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOpportunityPage {

WebDriver driver;
	
	public CreateOpportunityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS	

	@FindBy(id="Opportunity_name")
	WebElement name;
	
	@FindBy(id="Opportunity_amount_currency_id")
	WebElement amountCurrency;
	
	@FindBy(id="Opportunity_amount_value")
	WebElement amountValue;
	
	@FindBy(id="Opportunity_account_name")
	WebElement account;
	
	@FindBy(id="Opportunity_account_SelectLink")
	WebElement accountSearch;
	
	@FindBy(id="Opportunity_closeDate")
	WebElement closeDate;
	
	@FindBy(className="ui-datepicker-trigger")
	WebElement closeDateCalendar;
	
	@FindBy(id="Opportunity_stage_value")
	WebElement stage;
	
	@FindBy(id="Opportunity_probability")
	WebElement probability;
	
	@FindBy(id="Opportunity_source_value")
	WebElement source;
	
	@FindBy(id="Opportunity_description")
	WebElement description;
	
	@FindBy(linkText="Save")
	WebElement saveButton;
	
	@FindBy(linkText="Cancel")
	WebElement cancelButton;
	
	
	
//METHODS ON OBJECTS
	
	public void textName(String name) {
		this.name.sendKeys(name);
	}
	
	public void selectAmountCurrency(int index) {
		new Select(this.amountCurrency).selectByIndex(index);
	}
	
	public void selectAmountCurrency(String currency) {
		new Select(this.amountCurrency).selectByVisibleText(currency);
	}
	
	public void textAmountValue(String amount) {
		this.amountValue.sendKeys(amount);
	}
	
	public void clearAmountValue() {
		this.amountValue.clear();
	}
	
	public void textAccount(String acc) {
		this.account.sendKeys(acc);
	}
	
	public void selectAccountSearch() {
		this.accountSearch.click();
	}
	
	public void textCloseDate(String closeDate) {
		this.closeDate.sendKeys(closeDate);
	}
	
	public void selectCloseDateCalendar() {
		this.closeDateCalendar.click();
	}
	
	
	public void selectStage(int index) {
		new Select(this.stage).selectByIndex(index);
	}
	
	public void selectStage(String stage) {
		new Select(this.stage).selectByVisibleText(stage);
	}
	
	public void textProbability(String probability) {
		this.probability.sendKeys(probability);
	}
	
	public void selectSource(int index) {
		new Select(source).selectByIndex(index);
	}
	
	public void selectSource(String source) {
		new Select(this.source).selectByVisibleText(source);;
	}
	
	public void textDescription(String desc) {
		description.sendKeys(desc);
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public void clickCancelButton() {
		cancelButton.click();
	}
	
}
