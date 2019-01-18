package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpportunityDetailsPage {

WebDriver driver;
	
	public OpportunityDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By name = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)");
	
	By amount = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)");
	
	By account = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)");
	
	By closeDate = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2)");
	
	By stage = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)");
	
	By probability = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(2)");
	
	By source = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(2)");
	
	By description = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(2)");
	
//METHODS ON OBJECTS
	
	public String readName(){
		return driver.findElement(this.name).getText();
	}
	
	public String readAmount() {
		return driver.findElement(this.amount).getText();
	}
	
	public String readAccount() {
		return driver.findElement(this.account).getText();
	}
	
	public String readCloseDate() {
		return driver.findElement(this.closeDate).getText();
	}
	
	public String readStage() {
		return driver.findElement(this.stage).getText();
	}
	
	public String readProbability() {
		return driver.findElement(this.probability).getText();
	}
	
	public String readSource() {
		return driver.findElement(this.source).getText();
	}
	
	public String readDescription() {
		return driver.findElement(this.description).getText();
	}
	
}
