package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContactPage {

	WebDriver driver;
	
	public CreateContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By politeReturn = By.id("Contact_title_value");
	By firstName = By.id("Contact_firstName");
	By lastName = By.id("Contact_lastName");
	
	By status = By.id("Contact_state_id");
	
	By jobTitle = By.id("Contact_jobTitle");
	
	By account = By.id("Contact_account_name");
	By accountSearch = By.id("Contact_account_SelectLink");
	
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
	
	By description = By.id("Contact_description");
	
	By saveButton = By.linkText("Save");
	
	By cancelButton = By.linkText("Cancel");
	
// METHODS ON OBJECTS
	
	public void selectPoliteReturn(int index) {
		new Select(driver.findElement(this.politeReturn)).selectByIndex(index);
	}
	
	public void selectPoliteReturn(String politeReturn){
		new Select(driver.findElement(this.politeReturn)).selectByValue(politeReturn);
	}
	
	public void textFirstName(String first_name) {
		driver.findElement(this.firstName).sendKeys(first_name);
	}
	
	public void clearFirstName() {
		driver.findElement(this.firstName).clear();
	}
	
	public void textLastName(String last_name) {
		driver.findElement(this.lastName).sendKeys(last_name);
	}
	
	public void clearLastName() {
		driver.findElement(this.lastName).clear();
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
	
	public void clearJobTitle() {
		driver.findElement(this.jobTitle).clear();
	}
	
	public void textAccount(String acc) {
		driver.findElement(this.account).sendKeys(acc);
	}
	
	public void clearAccount() {
		driver.findElement(this.account).clear();
	}
	
	public void selectAccountSearch() {
		driver.findElement(this.accountSearch).click();
	}
	
	public void textDepartment(String dep) {
		driver.findElement(this.department).sendKeys(dep);
	}
	
	public void clearDepartment() {
		driver.findElement(this.department).clear();
	}
	
	public void textOfficePhone(String officePh) {
		driver.findElement(this.officePhone).sendKeys(officePh);
	}
	
	public void clearOfficePhone() {
		driver.findElement(this.officePhone).clear();
	}
	
	public void selectSource(int index) {
		new Select(driver.findElement(this.source)).selectByIndex(index);
	}
	
	public void selectSource(String source) {
		new Select(driver.findElement(this.source)).selectByValue(source);
	}
	
	public void textMobilePhone(String mobilePh) {
		driver.findElement(this.mobilePhone).sendKeys(mobilePh);
	}
	
	public void clearMobilePhone() {
		driver.findElement(this.mobilePhone).clear();
	}
	
	public void textOfficeFax(String fax) {
		driver.findElement(this.officeFax).sendKeys(fax);
	}
	
	public void clearOfficeFax() {
		driver.findElement(this.officeFax).clear();
	}
	
	public void textPrimaryEmail(String primEmail) {
		driver.findElement(this.primaryEmail).sendKeys(primEmail);
	}
	
	public void clearPrimaryEmail() {
		driver.findElement(this.primaryEmail).clear();
	}
	
	public void tickPrimaryEmailCheckbox() {
		driver.findElement(this.primaryEmailCheckbox).click();
	}
	
	public void textSecondaryEmail(String seconEmail) {
		driver.findElement(this.secondaryEmail).sendKeys(seconEmail);
	}
	
	public void clearSecondaryEmail() {
		driver.findElement(this.secondaryEmail).clear();
	}
	
	public void textPrimaryAddressStreet1(String street1) {
		driver.findElement(this.primaryAddressStreet1).sendKeys(street1);
	}
	
	public void clearPrimaryAddressStreet1() {
		driver.findElement(this.primaryAddressStreet1).clear();
	}
	
	public void textPrimaryAddressStreet2(String street2) {
		driver.findElement(this.primaryAddressStreet2).sendKeys(street2);
	}
	
	public void clearPrimaryAddressStreet2() {
		driver.findElement(this.primaryAddressStreet2).clear();
	}
	
	public void textPrimaryAddressCity(String city) {
		driver.findElement(this.primaryAddressCity).sendKeys(city);
	}
	
	public void clearPrimaryAddressCity() {
		driver.findElement(this.primaryAddressCity).clear();
	}
	
	public void textPrimaryAddressState(String state) {
		driver.findElement(this.primaryAddressState).sendKeys(state);
	}
	
	public void clearPrimaryAddressState() {
		driver.findElement(this.primaryAddressState).clear();
	}
	
	public void textPrimaryAddressPostalCode(String postalCode) {
		driver.findElement(this.primaryAddressPostalCode).sendKeys(postalCode);
	}
	
	public void clearPrimaryAddressPostalCode() {
		driver.findElement(this.primaryAddressPostalCode).clear();
	}
	
	public void textPrimaryAddressCountry(String country) {
		driver.findElement(this.primaryAddressCountry).sendKeys(country);
	}
	
	public void clearPrimaryAddressCountry() {
		driver.findElement(this.primaryAddressCountry).clear();
	}
	
	public void textSecondaryAddressStreet1(String street1) {
		driver.findElement(this.secondaryAddressStreet1).sendKeys(street1);
	}
	
	public void clearSecondaryAddressStreet1() {
		driver.findElement(this.secondaryAddressStreet1).clear();
	}
	
	public void textSecondaryAddressStreet2(String street2) {
		driver.findElement(this.secondaryAddressStreet2).sendKeys(street2);
	}
	
	public void clearSecondaryAddressStreet2() {
		driver.findElement(this.secondaryAddressStreet2).clear();
	}
	
	public void textSecondaryAddressCity(String city) {
		driver.findElement(this.secondaryAddressCity).sendKeys(city);
	}
	
	public void clearSecondaryAddressCity() {
		driver.findElement(this.secondaryAddressCity).clear();
	}
	
	public void textSecondaryAddressState(String state) {
		driver.findElement(this.secondaryAddressState).sendKeys(state);
	}
	
	public void clearSecondaryAddressState() {
		driver.findElement(this.secondaryAddressState).clear();
	}
	
	public void textSecondaryAddressPostalCode(String postalCode) {
		driver.findElement(this.secondaryAddressPostalCode).sendKeys(postalCode);
	}
	
	public void clearSecondaryAddressPostalCode() {
		driver.findElement(this.secondaryAddressPostalCode).clear();
	}
	
	public void textSecondaryAddressCountry(String country) {
		driver.findElement(this.secondaryAddressCountry).sendKeys(country);
	}
	
	public void clearSecondaryAddressCountry() {
		driver.findElement(this.secondaryAddressCountry).clear();
	}
	
	public void textDescription(String desc) {
		driver.findElement(this.description).sendKeys(desc);
	}
	
	public void clearDescription() {
		driver.findElement(this.description).clear();
	}
	
	public void clickSaveButton() {
		driver.findElement(this.saveButton).click();
	}
	
	public void clickCancelButton() {
		driver.findElement(this.cancelButton).click();
	}	
}
