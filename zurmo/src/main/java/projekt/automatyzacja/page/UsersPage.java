package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage {
	
	WebDriver driver;
	
	public UsersPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By searchBar = By.id("UsersSearchForm_anyMixedAttributes");
	
	By tableFirstNamePosition = By.cssSelector(".odd > td:nth-child(2) > a:nth-child(1)");
	
// METHODS ON OBJECTS
	
	public void textSearchBar(String searchText) {
		driver.findElement(this.searchBar).sendKeys(searchText);
	}
	
	public void clickSearchBar(){
		driver.findElement(this.searchBar).click();
	}
	
	public void clickTableFirstNamePosition() {
		driver.findElement(this.tableFirstNamePosition).click();
	}

}
