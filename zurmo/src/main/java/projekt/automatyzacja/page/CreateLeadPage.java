package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {

	WebDriver driver;
	
	public CreateLeadPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By politeReturn = By.id("Contact_title_value");
	By firstName = By.id("Contact_firstName");
	By lastName = By.id("Contact_lastName");
	
	By status = By.id("Contact_state_id");
	
	By jobTitle = By.id("Contact_jobTitle");
	
	By companyName = By.id("Contact_companyName");
	
	By department = By.id("Contact_department");
	
	By officePhone = By.id("Contact_officePhone");
	
	By source = By.id("Contact_source_value");
	
	By mobilePhone = By.id("Contact_mobilePhone");
	
	By officeFax = By.id("Contact_officeFax");
	
	By primaryEmail = By.id("Contact_primaryEmail_emailAddress");
	
	By primaryEmailCheckbox = By.id("Contact_primaryEmail_optOut");
	
	By secondaryEmail = By.id("Contact_secondaryEmail_emailAddress");
	
	By primaryAddressStreet1 = By.id("Contact_primaryAddress_street1");
	
	By primaryAddressStreet2 = By.id("Contact_primaryAddress_street2");
	
	By primaryAddressCity = By.id("Contact_primaryAddress_city");
	
	By primaryAddressState = By.id("Contact_primaryAddress_state");
	
	By primaryAddressPostalCode = By.id("Contact_primaryAddress_postalCode");
	
	By primaryAddressCountry = By.id("Contact_primaryAddress_country");
	
	By secondaryAddressStreet1 = By.id("Contact_secondaryAddress_street1");
	
	By secondaryAddressStreet2 = By.id("Contact_secondaryAddress_street2");
	
	By secondaryAddressCity = By.id("Contact_secondaryAddress_city");
	
	By secondaryAddressState = By.id("Contact_secondaryAddress_state");
	
	By secondaryAddressPostalCode = By.id("Contact_secondaryAddress_postalCode");
	
	By secondaryAddressCountry = By.id("Contact_secondaryAddress_country");
	
	By industry = By.id("Contact_industry_value");
	
	By website = By.id("Contact_website");
	
	By description = By.id("Contact_description");
	
	By saveButton = By.linkText("Save");
	
	By cancelButton = By.linkText("Cancel");
	
	
	
//METHODS ON OBJECTS
	
	public void selectPoliteReturn(int index) {
		new Select(driver.findElement(this.politeReturn)).selectByIndex(index);
	}
	
	public void selectPoliteReturn(String politeReturn) {
		new Select(driver.findElement(this.politeReturn)).selectByVisibleText(politeReturn);
	}
	
	public void textFirstName(String first_name) {
		driver.findElement(this.firstName).sendKeys(first_name);
	}
	
	public void textLastName(String last_name) {
		driver.findElement(this.lastName).sendKeys(last_name);
	}

	public void selectStatus(int index) {
		new Select(driver.findElement(this.status)).selectByIndex(index);
	}
	
	public void selectStatus(String status) {
		new Select(driver.findElement(this.status)).selectByVisibleText(status);
	}
	
	public void textJobTitle(String job_title) {
		driver.findElement(this.jobTitle).sendKeys(job_title);
	}
	
	public void textCompanyName(String compName) {
		driver.findElement(this.companyName).sendKeys(compName);
	}
	
	public void textDepartment(String dep) {
		driver.findElement(this.department).sendKeys(dep);
	}
	
	public void textOfficePhone(String officePh) {
		driver.findElement(this.officePhone).sendKeys(officePh);
	}
	
	public void selectSource(int index) {
		new Select(driver.findElement(this.source)).selectByIndex(index);
	}
	
	public void selectSource(String source) {
		new Select(driver.findElement(this.source)).selectByVisibleText(source);
	}
	
	public void textMobilePhone(String mobilePh) {
		driver.findElement(this.mobilePhone).sendKeys(mobilePh);
	}
	
	public void textOfficeFax(String fax) {
		driver.findElement(this.officeFax).sendKeys(fax);
	}
	
	public void textPrimaryEmail(String primEmail) {
		driver.findElement(this.primaryEmail).sendKeys(primEmail);
	}
	
	public void tickPrimaryEmailCheckbox() {
		driver.findElement(this.primaryEmailCheckbox).click();
	}
	
	public void textSecondaryEmail(String seconEmail) {
		driver.findElement(this.secondaryEmail).sendKeys(seconEmail);
	}
	
	public void textPrimaryAddressStreet1(String street1) {
		driver.findElement(this.primaryAddressStreet1).sendKeys(street1);
	}
	
	public void textPrimaryAddressStreet2(String street2) {
		driver.findElement(this.primaryAddressStreet2).sendKeys(street2);
	}
	
	public void textPrimaryAddressCity(String city) {
		driver.findElement(this.primaryAddressCity).sendKeys(city);
	}
	
	public void textPrimaryAddressState(String state) {
		driver.findElement(this.primaryAddressState).sendKeys(state);
	}
	
	public void textPrimaryAddressPostalCode(String postalCode) {
		driver.findElement(this.primaryAddressPostalCode).sendKeys(postalCode);
	}
	
	public void textPrimaryAddressCountry(String country) {
		driver.findElement(this.primaryAddressCountry).sendKeys(country);
	}
	
	public void textSecondaryAddressStreet1(String street1) {
		driver.findElement(this.secondaryAddressStreet1).sendKeys(street1);
	}
	
	public void textSecondaryAddressStreet2(String street2) {
		driver.findElement(this.secondaryAddressStreet2).sendKeys(street2);
	}
	
	public void textSecondaryAddressCity(String city) {
		driver.findElement(this.secondaryAddressCity).sendKeys(city);
	}
	
	public void textSecondaryAddressState(String state) {
		driver.findElement(this.secondaryAddressState).sendKeys(state);
	}
	
	public void textSecondaryAddressPostalCode(String postalCode) {
		driver.findElement(this.secondaryAddressPostalCode).sendKeys(postalCode);
	}
	
	public void textSecondaryAddressCountry(String country) {
		driver.findElement(this.secondaryAddressCountry).sendKeys(country);
	}
	
	public void selectIndustry(int index) {
		new Select(driver.findElement(this.industry)).selectByIndex(index);
	}
	
	public void selectIndustry(String industry) {
		new Select(driver.findElement(this.industry)).selectByVisibleText(industry);
	}
	
	public void textWebsite(String website) {
		driver.findElement(this.website).sendKeys(website);
	}
	
	public void textDescription(String desc) {
		driver.findElement(this.description).sendKeys(desc);
	}
	
	public void clickSaveButton() {
		driver.findElement(this.saveButton).click();
	}
	
	public void clickCancelButton() {
		driver.findElement(this.cancelButton).click();
	}
	
}
