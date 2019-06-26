package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS	
	
	@FindBy(id="Account_name")
	WebElement name;
	
	@FindBy(id="Account_officePhone")
	WebElement officePhone;
	
	@FindBy(id="Account_industry_value")
	WebElement industry;
	
	@FindBy(id="Account_officeFax")
	WebElement officeFax;
	
	@FindBy(id="Account_employees")
	WebElement employees;
	
	@FindBy(id="Account_annualRevenue")
	WebElement annualRevenue;
	
	@FindBy(id="Account_type_value")
	WebElement type;
	
	@FindBy(id="Account_website")
	WebElement website;
	
	@FindBy(id="Account_billingAddress_street1")
	WebElement billingAddressStreet1;
	
	@FindBy(id="Account_billingAddress_street2")
	WebElement billingAddressStreet2;
	
	@FindBy(id="Account_billingAddress_city")
	WebElement billingAddressCity;
	
	@FindBy(id="Account_billingAddress_state")
	WebElement billingAddressState;
	
	@FindBy(id="Account_billingAddress_postalCode")
	WebElement billingAddressPostalCode;
	
	@FindBy(id="Account_billingAddress_country")
	WebElement billingAddressCountry;
	
	@FindBy(id="Account_shippingAddress_street1")
	WebElement shippingAddressStreet1;
	
	@FindBy(id="Account_shippingAddress_street2")
	WebElement shippingAddressStreet2;
	
	@FindBy(id="Account_shippingAddress_city")
	WebElement shippingAddressCity;
	
	@FindBy(id="Account_shippingAddress_state")
	WebElement shippingAddressState;
	
	@FindBy(id="Account_shippingAddress_postalCode")
	WebElement shippingAddressPostalCode;
	
	@FindBy(id="Account_shippingAddress_country")
	WebElement shippingAddressCountry;
	
	@FindBy(id="Account_description")
	WebElement description;
	
	@FindBy(linkText="Save")
	WebElement saveButton;
	
	@FindBy(linkText="Cancel")
	WebElement cancelButton;

	
// METHODS ON OBJECTS
	
	public void textName(String name) {
		this.name.sendKeys(name);
	}
	
	public void textOfficePhone(String officePh) {
		this.officePhone.sendKeys(officePh);
	}
	
	public void selectIndustry(int index) {
		new Select(this.industry).selectByIndex(index);
	}
	
	public void selectIndustry(String industry) {
		new Select(this.industry).selectByValue(industry);
	}
	
	public void textOfficeFax(String fax) {
		this.officeFax.sendKeys(fax);
	}
	
	public void textEmployees(String employees) {
		this.employees.sendKeys(employees);
	}
	
	public void textAnnualRevenue(String annualRevenue) {
		this.annualRevenue.sendKeys(annualRevenue);
	}
	
	public void selectType(int index) {
		new Select(this.industry).selectByIndex(index);
	}
	
	public void selectType(String type) {
		new Select(this.type).selectByValue(type);
	}
	
	public void textWebsite(String website) {
		this.website.sendKeys(website);
	}
	
	public void textBillingAddressStreet1(String street1) {
		this.billingAddressStreet1.sendKeys(street1);
	}
	
	public void textBillingAddressStreet2(String street2) {
		this.billingAddressStreet2.sendKeys(street2);
	}
	
	public void textBillingAddressCity(String city) {
		this.billingAddressCity.sendKeys(city);
	}
	
	public void textBillingAddressState(String state) {
		this.billingAddressState.sendKeys(state);
	}
	
	public void textBillingAddressPostalCode(String postalCode) {
		this.billingAddressPostalCode.sendKeys(postalCode);
	}
	
	public void textBillingAddressCountry(String country) {
		this.billingAddressCountry.sendKeys(country);
	}
	
	public void textShippingAddressStreet1(String street1) {
		this.shippingAddressStreet1.sendKeys(street1);
	}
	
	public void textShippingAddressStreet2(String street2) {
		this.shippingAddressStreet2.sendKeys(street2);
	}
	
	public void textShippingAddressCity(String city) {
		this.shippingAddressCity.sendKeys(city);
	}
	
	public void textShippingAddressState(String state) {
		this.shippingAddressState.sendKeys(state);
	}
	
	public void textShippingAddressPostalCode(String postalCode) {
		this.shippingAddressPostalCode.sendKeys(postalCode);
	}
	
	public void textShippingAddressCountry(String country) {
		this.shippingAddressCountry.sendKeys(country);
	}
	
	public void textDescription(String desc) {
		this.description.sendKeys(desc);
	}
	
	public void clickSaveButton() {
		this.saveButton.click();
	}
	
	public void clickCancelButton() {
		this.cancelButton.click();
	}
	
}
