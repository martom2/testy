package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassDeleteLeadsPage {

	WebDriver driver;
	
	public MassDeleteLeadsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS
	
	@FindBy(id="deleteyt2")
	WebElement deleteButton;
	
// METHODSD ON LOCATED OBJECTS
	public void clickDeleteButton() {
		this.deleteButton.click();
	}
}
