package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {

	WebDriver driver;
	
	public Menu(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By homeButton = By.linkText("Home");
	
	By inboxButton = By.partialLinkText("Inbox");
	
	By accountsButton = By.linkText("Accounts");
	
	By leadsButton = By.linkText("Leads");
	
	By contactsButton = By.linkText("Contacts");
	
	By opportunitiesButton = By.linkText("Opportunities");
	
	By dotsButton = By.className("toggle-hidden-nav-items");
	
	By marketingButton = By.linkText("Marketing");
	
	By projectsButton = By.linkText("Projects");
	
	By productsButton = By.linkText("Products");
	
	By reportsButton = By.linkText("Reports");
	
	
//METHODS ON OBJECTS
	
	public void homeButtonClick() {
		driver.findElement(homeButton).click();
	}
	
	public void inboxButtonClick() {
		driver.findElement(inboxButton).click();
	}
	
	public void accountsButtonClick() {
		driver.findElement(accountsButton).click();
	}
	
	public void leadsButtonClick() {
		driver.findElement(leadsButton).click();
	}
	
	public void contactsButtonClick() {
		driver.findElement(contactsButton).click();
	}
	
	public void opportunitiesButtonClick() {
		driver.findElement(opportunitiesButton).click();
	}
	
	public void dotsButtonClick() {
		driver.findElement(dotsButton).click();
	}
	
	public void marketingButtonClick() {
		driver.findElement(marketingButton).click();
	}
	
	public void projectsButtonClick() {
		driver.findElement(projectsButton).click();
	}
	
	public void productsButtonClick() {
		driver.findElement(productsButton).click();
	}
	
	public void reportsButtonClick() {
		driver.findElement(reportsButton).click();
	}

}
