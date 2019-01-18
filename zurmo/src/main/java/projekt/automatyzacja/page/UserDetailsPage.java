package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDetailsPage {

	WebDriver driver;
	
	public UserDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By editButton = By.linkText("Edit");
	
// METHODS ON OBJECTS
	
	public void clickEditButton(){
		driver.findElement(this.editButton).click();
	}
}
