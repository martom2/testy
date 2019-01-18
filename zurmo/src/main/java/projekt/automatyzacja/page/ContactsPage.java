package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage {

	WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By searchBar = By.id("ContactsSearchForm_anyMixedAttributes");
	
	By firstTableCheckbox = By.cssSelector("tr.odd:nth-child(1) > td:nth-child(1) > label:nth-child(1)");
	
	By tableFirsyNamePosition = By.cssSelector("tr.odd:nth-child(1) > td:nth-child(3) > a:nth-child(1)");
	
//	list-preloader

// METHODS ON OBJECTS
	
	public void textSearchBar(String searchText) {
		driver.findElement(this.searchBar).sendKeys(searchText);
	}
	
	public void clickSearchBar(){
		driver.findElement(this.searchBar).click();
	}
	
	public void selectFirstTableCheckbox() {
		driver.findElement(this.firstTableCheckbox).click();
	}
	
	public String readTableFirstNamePosition() {
		return driver.findElement(this.tableFirsyNamePosition).getText();
	}
	
	public WebElement returnTableFirstNamePositionElement() {
		return driver.findElement(tableFirsyNamePosition);
	}
	
	public void clickTableFirstNamePosition() {
		driver.findElement(this.tableFirsyNamePosition).click();
	}
	
}
