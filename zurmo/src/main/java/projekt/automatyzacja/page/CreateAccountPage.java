package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By name = By.id("Account_name");
	By officePhone = By.id("Account_officePhone");
	By industry = By.id("Account_industry_value");
	By officeFax = By.id("Account_officeFax");
	By employees = By.id("Account_employees");
	By annualRevenue = By.id("Account_annualRevenue");
	By type = By.id("Account_type_value");
	By website = By.id("Account_website");
	By billingAddressStreet1 = By.id("Account_billingAddress_street1");
	By billingAddressStreet2 = By.id("Account_billingAddress_street2");
	By billingAddressCity = By.id("Account_billingAddress_city");
	By billingAddressState = By.id("Account_billingAddress_state");
	By billingAddressPostalCode = By.id("Account_billingAddress_postalCode");
	By billingAddressCountry = By.id("Account_billingAddress_country");
	By shippingAddressStreet1 = By.id("Account_shippingAddress_street1");
	By shippingAddressStreet2 = By.id("Account_shippingAddress_street2");
	By shippingAddressCity = By.id("Account_shippingAddress_city");
	By shippingAddressState = By.id("Account_shippingAddress_state");
	By shippingAddressPostalCode = By.id("Account_shippingAddress_postalCode");
	By shippingAddressCountry = By.id("Account_shippingAddress_country");
	By description = By.id("Account_description");
	By saveButton = By.linkText("Save");
	By cancelButton = By.linkText("Cancel");

	
// METHODS ON OBJECTS
	
	public void textName(String name) {
		driver.findElement(this.name).sendKeys(name);
	}
	
	public void textOfficePhone(String officePh) {
		driver.findElement(officePhone).sendKeys(officePh);
	}
	
	public void selectIndustry(int index) {
		new Select(driver.findElement(industry)).selectByIndex(index);
	}
	
	public void selectIndustry(String industry) {
		new Select(driver.findElement(this.industry)).selectByValue(industry);
	}
	
	public void textOfficeFax(String fax) {
		driver.findElement(officeFax).sendKeys(fax);
	}
	
	public void textEmployees(String employees) {
		driver.findElement(this.employees).sendKeys(employees);
	}
	
	public void textAnnualRevenue(String annualRevenue) {
		driver.findElement(this.annualRevenue).sendKeys(annualRevenue);
	}
	
	public void selectType(int index) {
		new Select(driver.findElement(industry)).selectByIndex(index);
	}
	
	public void selectType(String type) {
		new Select(driver.findElement(this.type)).selectByValue(type);
	}
	
	public void textWebsite(String website) {
		driver.findElement(this.website).sendKeys(website);
	}
	
	public void textBillingAddressStreet1(String street1) {
		driver.findElement(this.billingAddressStreet1).sendKeys(street1);
	}
	
	public void textBillingAddressStreet2(String street2) {
		driver.findElement(this.billingAddressStreet2).sendKeys(street2);
	}
	
	public void textBillingAddressCity(String city) {
		driver.findElement(this.billingAddressCity).sendKeys(city);
	}
	
	public void textBillingAddressState(String state) {
		driver.findElement(this.billingAddressState).sendKeys(state);
	}
	
	public void textBillingAddressPostalCode(String postalCode) {
		driver.findElement(this.billingAddressPostalCode).sendKeys(postalCode);
	}
	
	public void textBillingAddressCountry(String country) {
		driver.findElement(this.billingAddressCountry).sendKeys(country);
	}
	
	public void textShippingAddressStreet1(String street1) {
		driver.findElement(this.shippingAddressStreet1).sendKeys(street1);
	}
	
	public void textShippingAddressStreet2(String street2) {
		driver.findElement(this.shippingAddressStreet2).sendKeys(street2);
	}
	
	public void textShippingAddressCity(String city) {
		driver.findElement(this.shippingAddressCity).sendKeys(city);
	}
	
	public void textShippingAddressState(String state) {
		driver.findElement(this.shippingAddressState).sendKeys(state);
	}
	
	public void textShippingAddressPostalCode(String postalCode) {
		driver.findElement(this.shippingAddressPostalCode).sendKeys(postalCode);
	}
	
	public void textShippingAddressCountry(String country) {
		driver.findElement(this.shippingAddressCountry).sendKeys(country);
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
