package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage {

	WebDriver driver;
	
	public ContactDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By optionsButton = By.cssSelector("#ContactDetailsAndRelationsView_11 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
	
	By optionsEditSubButton = By.linkText("Edit");
	
	By switchViewButton = By.id("sliding-panel-toggle");
	
	By name = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)");
	
	By status = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)");
	
	By jobTitle = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)");
	
	By account = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2)");
	
	By department = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)");
	
	By officePhone = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(2)");
	
	By source = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(2)");
	
	By mobilePhone = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(2)");
	
	By officeFax = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(9) > td:nth-child(2)");
	
	By primaryEmail = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(10) > td:nth-child(2) > a:nth-child(1)");
	
	By secondaryEmail = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(11) > td:nth-child(2) > a:nth-child(1)");
	
	By primaryAddressAll = By.id("Contact_primaryAddress_MapLink");
	
	By secondaryAddressAll = By.cssSelector("#Contact_secondaryAddress_MapLink");
	
	By description = By.cssSelector("#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(14) > td:nth-child(2)");
	
//METHODS ON OBJECTS
	
	public void clickOptionsButton() {
		driver.findElement(this.optionsButton).click();
	}
	
	public void clickOptionsEditSubButton() {
		driver.findElement(this.optionsEditSubButton).click();
	}
	
	public void clickSwitchViewButton() {
		driver.findElement(this.switchViewButton);
	}
	
	public String readName(){
		return driver.findElement(name).getText();
	}
	
	public String readStatus() {
		return driver.findElement(status).getText();
	}
	
	public String readJobTitle() {
		return driver.findElement(jobTitle).getText();
	}
	
	public String readAccount() {
		return driver.findElement(account).getText();
	}
	
	public String readDepartment() {
		return driver.findElement(department).getText();
	}
	
	public String readOfficePhone() {
		return driver.findElement(officePhone).getText();
	}
	
	public String readSource() {
		return driver.findElement(source).getText();
	}
	
	public String readMobilePhone() {
		return driver.findElement(mobilePhone).getText();
	}
	
	public String readOfficeFax() {
		return driver.findElement(officeFax).getText();
	}
	
	public String readPrimaryEmail() {
		return driver.findElement(primaryEmail).getText();
	}
	
	public String readSecondaryEmail() {
		return driver.findElement(secondaryEmail).getText();
	}
	
	public String readPrimaryAddressAll() {
		return driver.findElement(primaryAddressAll).getText();
	}
	
	public String readPrimaryAddressStreet1() {
		String readPrimaryAddressAll = this.readPrimaryAddressAll();
		String[] readPrimaryAddressLines = readPrimaryAddressAll.split("\\n");
		
		return readPrimaryAddressLines[0];
	}
	
	public String readPrimaryAddressStreet2() {
		String readPrimaryAddressAll = this.readPrimaryAddressAll();
		String[] readPrimaryAddressLines = readPrimaryAddressAll.split("\\n");
		
		return readPrimaryAddressLines[1];
	}
	
	public String readPrimaryAddressCity() {
		String readPrimaryAddressAll = this.readPrimaryAddressAll();
		String[] readPrimaryAddressLines = readPrimaryAddressAll.split("\\n");
		String[] readPrimaryAddressAllThridLine = readPrimaryAddressLines[2].split(" ");
		
		return readPrimaryAddressAllThridLine[0];
	}
	
	public String readPrimaryAddressState() {
		String readPrimaryAddressAll = this.readPrimaryAddressAll();
		String[] readPrimaryAddressLines = readPrimaryAddressAll.split("\\n");
		String[] readPrimaryAddressAllThridLine = readPrimaryAddressLines[2].split(" ");
		
		return readPrimaryAddressAllThridLine[1].substring(0, readPrimaryAddressAllThridLine[1].length()-1);
	}
	
	public String readPrimaryAddressPostalCode() {
		String readPrimaryAddressAll = this.readPrimaryAddressAll();
		String[] readPrimaryAddressLines = readPrimaryAddressAll.split("\\n");
		String[] readPrimaryAddressAllThridLine = readPrimaryAddressLines[2].split(" ");
		
		return readPrimaryAddressAllThridLine[2];
	}
	
	public String readPrimaryAddressCountry() {
		String readPrimaryAddressAll = this.readPrimaryAddressAll();
		String[] readPrimaryAddressLines = readPrimaryAddressAll.split("\\n");
		
		return readPrimaryAddressLines[3];
	}
	
	public String readSecondaryAddressAll() {
		return driver.findElement(secondaryAddressAll).getText();
	}
	
	public String readSecondaryAddressStreet1() {
		String readSecondaryAddressAll = this.readSecondaryAddressAll();
		String[] readSecondaryAddressLines = readSecondaryAddressAll.split("\\n");
		
		return readSecondaryAddressLines[0];
	}
	
	public String readSecondaryAddressStreet2() {
		String readSecondaryAddressAll = this.readSecondaryAddressAll();
		String[] readSecondaryAddressLines = readSecondaryAddressAll.split("\\n");
		
		return readSecondaryAddressLines[1];
	}
	
	public String readSecondaryAddressCity() {
		String readSecondaryAddressAll = this.readSecondaryAddressAll();
		String[] readSecondaryAddressLines = readSecondaryAddressAll.split("\\n");
		String[] readSecondaryAddressAllThridLine = readSecondaryAddressLines[2].split(" ");
		
		return readSecondaryAddressAllThridLine[0];
	}
	
	public String readSecondaryAddressState() {
		String readSecondaryAddressAll = this.readSecondaryAddressAll();
		String[] readSecondaryAddressLines = readSecondaryAddressAll.split("\\n");
		String[] readSecondaryAddressAllThridLine = readSecondaryAddressLines[2].split(" ");
		
		return readSecondaryAddressAllThridLine[1].substring(0, readSecondaryAddressAllThridLine[1].length()-1);
	}
	
	public String readSecondaryAddressPostalCode() {
		String readSecondaryAddressAll = this.readSecondaryAddressAll();
		String[] readSecondaryAddressLines = readSecondaryAddressAll.split("\\n");
		String[] readSecondaryAddressAllThridLine = readSecondaryAddressLines[2].split(" ");
		
		return readSecondaryAddressAllThridLine[2];
	}
	
	public String readSecondaryAddressCountry() {
		String readSecondaryAddressAll = this.readSecondaryAddressAll();
		String[] readSecondaryAddressLines = readSecondaryAddressAll.split("\\n");
		
		return readSecondaryAddressLines[3];
	}
	
	public String readDescription() {
		return driver.findElement(description).getText();
	}
}
