package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailsPage {

	WebDriver driver;
	
	public LeadDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS	

	@FindBy(id="sliding-panel-toggle")
	WebElement switchViewButton;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
	WebElement name;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)")
	WebElement status;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)")
	WebElement jobTitle;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2)")
	WebElement companyName;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(2)")
	WebElement department;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(6) > td:nth-child(2)")
	WebElement officePhone;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(7) > td:nth-child(2)")
	WebElement source;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(8) > td:nth-child(2)")
	WebElement mobilePhone;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(9) > td:nth-child(2)")
	WebElement officeFax;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(10) > td:nth-child(2) > a:nth-child(1)")
	WebElement primaryEmail;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(11) > td:nth-child(2) > a:nth-child(1)")
	WebElement secondaryEmail;
	
	@FindBy(id="Contact_primaryAddress_MapLink")
	WebElement primaryAddressAll;
	
	@FindBy(css="#Contact_secondaryAddress_MapLink")
	WebElement secondaryAddressAll;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(14) > td:nth-child(2)")
	WebElement industry;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(15) > td:nth-child(2) > a:nth-child(1)")
	WebElement website;
	
	@FindBy(css="#zurmoView > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(16) > td:nth-child(2)")
	WebElement description;
	
//METHODS ON OBJECTS
	
	public void clickSwitchViewButton() {
		this.switchViewButton.click();
	}
	
	public String readName(){
		return this.name.getText();
	}
	
	public String readStatus() {
		return this.status.getText();
	}
	
	public String readJobTitle() {
		return this.jobTitle.getText();
	}
	
	public String readAccount() {
		return this.companyName.getText();
	}
	
	public String readDepartment() {
		return this.department.getText();
	}
	
	public String readOfficePhone() {
		return this.officePhone.getText();
	}
	
	public String readSource() {
		return this.source.getText();
	}
	
	public String readMobilePhone() {
		return this.mobilePhone.getText();
	}
	
	public String readOfficeFax() {
		return this.officeFax.getText();
	}
	
	public String readPrimaryEmail() {
		return this.primaryEmail.getText();
	}
	
	public String readSecondaryEmail() {
		return this.secondaryEmail.getText();
	}
	
	public String readPrimaryAddressAll() {
		return this.primaryAddressAll.getText();
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
	
	public String readSecondaryAddressAll() {
		return this.secondaryAddressAll.getText();
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
	
	public String readIndustry() {
		return this.industry.getText();
	}
	
	public String readWebsite() {
		return this.website.getText();
	}
	
	public String readDescription() {
		return this.description.getText();
	}
	
}
