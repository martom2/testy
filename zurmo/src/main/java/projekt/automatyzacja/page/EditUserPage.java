package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditUserPage {

	WebDriver driver;
	
	public EditUserPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS
	
	@FindBy(id="User_userStatus")
	WebElement status;
	
	@FindBy(linkText="Save")
	WebElement saveButton;
	
// METHODS ON OBJECTS
	
	public void selectStatus(String status){
		new Select(this.status).selectByVisibleText(status);
	}
	
	public void clickSaveButton(){
		this.saveButton.click();
	}
}
