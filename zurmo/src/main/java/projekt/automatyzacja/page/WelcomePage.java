package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

	WebDriver driver;
	
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	
// METHODS ON OBJECTS
	
    public String getPageTitle() {
    	return driver.getTitle();
    }
	
}
