package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MassDeleteLeadsPage {

	WebDriver driver;
	
	public MassDeleteLeadsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	By deleteButton = By.id("deleteyt2");
	
// METHODSD ON LOCATED OBJECTS
	public void clickDeleteButton() {
		driver.findElement(this.deleteButton).click();
	}
}
