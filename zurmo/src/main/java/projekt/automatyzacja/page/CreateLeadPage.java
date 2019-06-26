package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {

	WebDriver driver;
	
	public CreateLeadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS	
	
	@FindBy(id="Contact_title_value")
	WebElement politeReturn;
	
	@FindBy(id="Contact_firstName")
	WebElement firstName;
	
	@FindBy(id="Contact_lastName")
	WebElement lastName;
	
	@FindBy(id="Contact_state_id")
	WebElement status;
	
	@FindBy(id="Contact_jobTitle")
	WebElement jobTitle;
	
	@FindBy(id="Contact_companyName")
	WebElement companyName;
	
	@FindBy(id="Contact_department")
	WebElement department;
	
	@FindBy(id="Contact_officePhone")
	WebElement officePhone;
	
	@FindBy(id="Contact_source_value")
	WebElement source;
	
	@FindBy(id="Contact_mobilePhone")
	WebElement mobilePhone;
	
	@FindBy(id="Contact_officeFax")
	WebElement officeFax;
	
	@FindBy(id="Contact_primaryEmail_emailAddress")
	WebElement primaryEmail;
	
	@FindBy(id="Contact_primaryEmail_optOut")
	WebElement primaryEmailCheckbox;
	
	@FindBy(id="Contact_secondaryEmail_emailAddress")
	WebElement secondaryEmail;
	
	@FindBy(id="Contact_primaryAddress_street1")
	WebElement primaryAddressStreet1;
	
	@FindBy(id="Contact_primaryAddress_street2")
	WebElement primaryAddressStreet2;
	
	@FindBy(id="Contact_primaryAddress_city")
	WebElement primaryAddressCity;
	
	@FindBy(id="Contact_primaryAddress_state")
	WebElement primaryAddressState;
	
	@FindBy(id="Contact_primaryAddress_postalCode")
	WebElement primaryAddressPostalCode;
	
	@FindBy(id="Contact_primaryAddress_country")
	WebElement primaryAddressCountry;
	
	@FindBy(id="Contact_secondaryAddress_street1")
	WebElement secondaryAddressStreet1;
	
	@FindBy(id="Contact_secondaryAddress_street2")
	WebElement secondaryAddressStreet2;
	
	@FindBy(id="Contact_secondaryAddress_city")
	WebElement secondaryAddressCity;
	
	@FindBy(id="Contact_secondaryAddress_state")
	WebElement secondaryAddressState;
	
	@FindBy(id="Contact_secondaryAddress_postalCode")
	WebElement secondaryAddressPostalCode;
	
	@FindBy(id="Contact_secondaryAddress_country")
	WebElement secondaryAddressCountry;
	
	@FindBy(id="Contact_industry_value")
	WebElement industry;
	
	@FindBy(id="Contact_website")
	WebElement website;
	
	@FindBy(id="Contact_description")
	WebElement description;
	
	@FindBy(linkText="Save")
	WebElement saveButton;
	
	@FindBy(linkText="Cancel")
	WebElement cancelButton;
	
	
	
//METHODS ON OBJECTS
	
	public void selectPoliteReturn(int index) {
		new Select(this.politeReturn).selectByIndex(index);
	}
	
	public void selectPoliteReturn(String politeReturn) {
		new Select(this.politeReturn).selectByVisibleText(politeReturn);
	}
	
	public void textFirstName(String first_name) {
		this.firstName.sendKeys(first_name);
	}
	
	public void textLastName(String last_name) {
		this.lastName.sendKeys(last_name);
	}

	public void selectStatus(int index) {
		new Select(this.status).selectByIndex(index);
	}
	
	public void selectStatus(String status) {
		new Select(this.status).selectByVisibleText(status);
	}
	
	public void textJobTitle(String job_title) {
		this.jobTitle.sendKeys(job_title);
	}
	
	public void textCompanyName(String compName) {
		this.companyName.sendKeys(compName);
	}
	
	public void textDepartment(String dep) {
		this.department.sendKeys(dep);
	}
	
	public void textOfficePhone(String officePh) {
		this.officePhone.sendKeys(officePh);
	}
	
	public void selectSource(int index) {
		new Select(this.source).selectByIndex(index);
	}
	
	public void selectSource(String source) {
		new Select(this.source).selectByVisibleText(source);
	}
	
	public void textMobilePhone(String mobilePh) {
		this.mobilePhone.sendKeys(mobilePh);
	}
	
	public void textOfficeFax(String fax) {
		this.officeFax.sendKeys(fax);
	}
	
	public void textPrimaryEmail(String primEmail) {
		this.primaryEmail.sendKeys(primEmail);
	}
	
	public void tickPrimaryEmailCheckbox() {
		this.primaryEmailCheckbox.click();
	}
	
	public void textSecondaryEmail(String seconEmail) {
		this.secondaryEmail.sendKeys(seconEmail);
	}
	
	public void textPrimaryAddressStreet1(String street1) {
		this.primaryAddressStreet1.sendKeys(street1);
	}
	
	public void textPrimaryAddressStreet2(String street2) {
		this.primaryAddressStreet2.sendKeys(street2);
	}
	
	public void textPrimaryAddressCity(String city) {
		this.primaryAddressCity.sendKeys(city);
	}
	
	public void textPrimaryAddressState(String state) {
		this.primaryAddressState.sendKeys(state);
	}
	
	public void textPrimaryAddressPostalCode(String postalCode) {
		this.primaryAddressPostalCode.sendKeys(postalCode);
	}
	
	public void textPrimaryAddressCountry(String country) {
		this.primaryAddressCountry.sendKeys(country);
	}
	
	public void textSecondaryAddressStreet1(String street1) {
		this.secondaryAddressStreet1.sendKeys(street1);
	}
	
	public void textSecondaryAddressStreet2(String street2) {
		this.secondaryAddressStreet2.sendKeys(street2);
	}
	
	public void textSecondaryAddressCity(String city) {
		this.secondaryAddressCity.sendKeys(city);
	}
	
	public void textSecondaryAddressState(String state) {
		this.secondaryAddressState.sendKeys(state);
	}
	
	public void textSecondaryAddressPostalCode(String postalCode) {
		this.secondaryAddressPostalCode.sendKeys(postalCode);
	}
	
	public void textSecondaryAddressCountry(String country) {
		this.secondaryAddressCountry.sendKeys(country);
	}
	
	public void selectIndustry(int index) {
		new Select(this.industry).selectByIndex(index);
	}
	
	public void selectIndustry(String industry) {
		new Select(this.industry).selectByVisibleText(industry);
	}
	
	public void textWebsite(String website) {
		this.website.sendKeys(website);
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
