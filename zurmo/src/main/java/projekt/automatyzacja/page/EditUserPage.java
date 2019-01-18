package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EditUserPage {

	WebDriver driver;
	
	public EditUserPage(WebDriver driver){
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By status = By.id("User_userStatus");
	
	By saveButton = By.linkText("Save");
	
// METHODS ON OBJECTS
	
	public void selectStatus(String status){
		new Select(driver.findElement(this.status)).selectByVisibleText(status);
	}
	
	public void clickSaveButton(){
		driver.findElement(this.saveButton).click();
	}
}
