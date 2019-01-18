package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpportunitiesPage {

	WebDriver driver;
	
	public OpportunitiesPage(WebDriver driver) {
		this.driver = driver;
	}
	
//LOCATED OBJEDCTS
	
	By searchBar = By.id("OpportunitiesSearchForm_anyMixedAttributes");
	
	By firstTableCheckbox = By.cssSelector("tr.odd:nth-child(1) > td:nth-child(1) > label:nth-child(1)");
	
	By tableFirsyNamePosition = By.cssSelector("tr.odd:nth-child(1) > td:nth-child(3) > a:nth-child(1)");

	
//METHODS ON LOCATED OBJECTS
	
	public void textSearchBar(String searchText) {
		driver.findElement(this.searchBar).sendKeys(searchText);
	}
	
	public void clickSearchBar() {
		driver.findElement(this.searchBar).click();
	}
	
	public void selectFirstTableCheckbox() {
		driver.findElement(this.firstTableCheckbox).click();
	}
	
	public String readTableFirstNamePosition() {
		return driver.findElement(this.tableFirsyNamePosition).getText();
	}
	
	public WebElement returnTableFirstNamePositionElement() {
		return driver.findElement(this.tableFirsyNamePosition);
	}
	
	public void clickTableFirstNamePosition() {
		driver.findElement(this.tableFirsyNamePosition).click();
	}
}
