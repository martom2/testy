package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogItemDetailsPage {

	WebDriver driver;
	
	public CatalogItemDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By name = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)");
	
	By description = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)");
	
	By categories = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)");
	
	By status = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2)");
	
	By type = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)");
	
	By priceFrequency = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(2)");
	
	By sellPriceFormula = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(2)");
	
	By cost = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(2)");
	
	By listPrice = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(9) > td:nth-child(2)");
	
	By sellPrice = By.cssSelector(".form-fields > tbody:nth-child(2) > tr:nth-child(10) > td:nth-child(2)");

	
// METHODS ON LOCATED OBJECTS
	
	public String readName() {
		return driver.findElement(this.name).getText();
	}
	
	public String readDescription() {
		return driver.findElement(this.description).getText();
	}
	
	public String readCategories() {
		return driver.findElement(this.categories).getText();
	}
	
	public String readStatus() {
		return driver.findElement(this.status).getText();
	}
	
	public String readType() {
		return driver.findElement(this.type).getText();
	}
	
	public String readPriceFrequency() {
		return driver.findElement(this.priceFrequency).getText();
	}
	
	public String readSellPriceFormula() {
		return driver.findElement(this.sellPriceFormula).getText();
	}
	
	public String readCost() {
		return driver.findElement(this.cost).getText();
	}
	
	public String readListPrice() {
		return driver.findElement(this.listPrice).getText();
	}
	
	public String readSellPrice() {
		return driver.findElement(this.sellPrice).getText();
	}
	
	
}
