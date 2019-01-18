package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage {

	WebDriver driver;
	
	public AccountDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By switchViewButton = By.id("sliding-panel-toggle");
	
	By name = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)");
	
	By officePhone = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)");
	
	By industry = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)");
	
	By officeFax = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2)");
	
	By employees = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)");
	
	By annualRevenue = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(2)");
	
	By type = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(2)");
	
	By website = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(2)");
	
	By billingAddressAll = By.id("Account_billingAddress_MapLink");
	
	By shippingAddressAll = By.id("Account_shippingAddress_MapLink");
	
	By description = By.cssSelector("div.left-column:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(11) > td:nth-child(2)");
	
	
// METHODS ON LOCATED OBJECTS

	public void clickSwitchViewButton() {
		driver.findElement(switchViewButton);
	}
	
	public String readName(){
		return driver.findElement(name).getText();
	}
	
	public String readOfficePhone() {
		return driver.findElement(officePhone).getText();
	}
	
	public String readIndustry() {
		return driver.findElement(industry).getText();
	}
	
	public String readOfficeFax() {
		return driver.findElement(officeFax).getText();
	}
	
	public String readEmployees() {
		return driver.findElement(employees).getText();
	}
	
	public String readAnnualRevenue() {
		return driver.findElement(annualRevenue).getText();
	}
	
	public String readType() {
		return driver.findElement(type).getText();
	}
	
	public String readWebsite() {
		return driver.findElement(website).getText();
	}
	
	public String readBillingAddressAll() {
		return driver.findElement(billingAddressAll).getText();
	}
	
	public String readBillingAddressStreet1() {
		String readBillingAddressAll = this.readBillingAddressAll();
		String[] readBillingAddressLines = readBillingAddressAll.split("\\n");
		
		return readBillingAddressLines[0];
	}
	
	public String readBillingAddressStreet2() {
		String readBillingAddressAll = this.readBillingAddressAll();
		String[] readBillingAddressLines = readBillingAddressAll.split("\\n");
		
		return readBillingAddressLines[1];
	}
	
	
	public String readBillingAddressCity() {
		String readBillingAddressAll = this.readBillingAddressAll();
		String[] readBillingAddressLines = readBillingAddressAll.split("\\n");
		String[] readBillingAddressAllThridLine = readBillingAddressLines[2].split(" ");
		
		return readBillingAddressAllThridLine[0];
	}
	
	public String readBillingAddressState() {
		String readBillingAddressAll = this.readBillingAddressAll();
		String[] readBillingAddressLines = readBillingAddressAll.split("\\n");
		String[] readBillingAddressAllThridLine = readBillingAddressLines[2].split(" ");
		
		return readBillingAddressAllThridLine[1].substring(0, readBillingAddressAllThridLine[1].length()-1);
	}
	
	public String readBillingAddressPostalCode() {
		String readBillingAddressAll = this.readBillingAddressAll();
		String[] readBillingAddressLines = readBillingAddressAll.split("\\n");
		String[] readBillingAddressAllThridLine = readBillingAddressLines[2].split(" ");
		
		return readBillingAddressAllThridLine[2];
	}
	
	public String readShippingAddressAll() {
		return driver.findElement(shippingAddressAll).getText();
	}
	
	public String readShippingAddressStreet1() {
		String readShippingAddressAll = this.readShippingAddressAll();
		String[] readShippingAddressLines = readShippingAddressAll.split("\\n");
		
		return readShippingAddressLines[0];
	}
	
	public String readShippingAddressStreet2() {
		String readShippingAddressAll = this.readShippingAddressAll();
		String[] readShippingAddressLines = readShippingAddressAll.split("\\n");
		
		return readShippingAddressLines[1];
	}
	
	
	public String readShippingAddressCity() {
		String readShippingAddressAll = this.readShippingAddressAll();
		String[] readShippingAddressLines = readShippingAddressAll.split("\\n");
		String[] readShippingAddressAllThridLine = readShippingAddressLines[2].split(" ");
		
		return readShippingAddressAllThridLine[0];
	}
	
	public String readShippingAddressState() {
		String readShippingAddressAll = this.readShippingAddressAll();
		String[] readShippingAddressLines = readShippingAddressAll.split("\\n");
		String[] readShippingAddressAllThridLine = readShippingAddressLines[2].split(" ");
		
		return readShippingAddressAllThridLine[1].substring(0, readShippingAddressAllThridLine[1].length()-1);
	}
	
	public String readShippingAddressPostalCode() {
		String readShippingAddressAll = this.readShippingAddressAll();
		String[] readShippingAddressLines = readShippingAddressAll.split("\\n");
		String[] readShippingAddressAllThridLine = readShippingAddressLines[2].split(" ");
		
		return readShippingAddressAllThridLine[2];
	}
	
	public String readDescription() {
		return driver.findElement(description).getText();
	}
	
}
