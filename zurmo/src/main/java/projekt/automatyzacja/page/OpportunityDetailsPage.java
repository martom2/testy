package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityDetailsPage {

WebDriver driver;
	
	public OpportunityDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS	
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
	WebElement name;
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)")
	WebElement amount;
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)")
	WebElement account;
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2)")
	WebElement closeDate;
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)")
	WebElement stage;
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(2)")
	WebElement probability;
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(2)")
	WebElement source;
	
	@FindBy(css="div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(2)")
	WebElement description;
	
	
//METHODS ON OBJECTS
	
    public String readName(){
		return this.name.getText();
	}
	
	public String readAmount() {
		return this.amount.getText();
	}
	
	public String readAccount() {
		return this.account.getText();
	}
	
	public String readCloseDate() {
		return this.closeDate.getText();
	}
	
	public String readStage() {
		return this.stage.getText();
	}
	
	public String readProbability() {
		return this.probability.getText();
	}
	
	public String readSource() {
		return this.source.getText();
	}
	
	public String readDescription() {
		return this.description.getText();
	}
	
}
