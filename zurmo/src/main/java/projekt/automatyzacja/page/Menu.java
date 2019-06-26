package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

	WebDriver driver;
	
	public Menu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS	
	
	@FindBy(linkText="Home")
	WebElement homeButton;
	
	@FindBy(partialLinkText="Inbox")
	WebElement inboxButton;
	
	@FindBy(linkText="Accounts")
	WebElement accountsButton;
	
	@FindBy(linkText="Leads")
	WebElement leadsButton;
	
	@FindBy(linkText="Contacts")
	WebElement contactsButton;
	
	@FindBy(linkText="Opportunities")
	WebElement opportunitiesButton;
	
	@FindBy(className="toggle-hidden-nav-items")
	WebElement dotsButton;
	
	@FindBy(linkText="Marketing")
	WebElement marketingButton;
	
	@FindBy(linkText="Projects")
	WebElement projectsButton;
	
	@FindBy(linkText="Products")
	WebElement productsButton;
	
	@FindBy(linkText="Reports")
	WebElement reportsButton;
	
	
//METHODS ON OBJECTS
	
	public void homeButtonClick() {
		this.homeButton.click();
	}
	
	public void inboxButtonClick() {
		this.inboxButton.click();
	}
	
	public void accountsButtonClick() {
		this.accountsButton.click();
	}
	
	public void leadsButtonClick() {
		this.leadsButton.click();
	}
	
	public void contactsButtonClick() {
		this.contactsButton.click();
	}
	
	public void opportunitiesButtonClick() {
		this.opportunitiesButton.click();
	}
	
	public void dotsButtonClick() {
		this.dotsButton.click();
	}
	
	public void marketingButtonClick() {
		this.marketingButton.click();
	}
	
	public void projectsButtonClick() {
		this.projectsButton.click();
	}
	
	public void productsButtonClick() {
		this.productsButton.click();
	}
	
	public void reportsButtonClick() {
		this.reportsButton.click();
	}

}
