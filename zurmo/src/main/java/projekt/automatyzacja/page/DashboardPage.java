package projekt.automatyzacja.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// LOCATED OBJECTS
	
	@FindBy(id="SocialItem_description")
	WebElement postTextBox;
	
	@FindBy(id="savePost")
	WebElement postButton;
	
// METHODS ON OBJECTS

	public void textPostTextBox(String postText) {
		this.postTextBox.sendKeys(postText);
	}
	
	public void clickPostButton() {
		this.postButton.click();
	}
}
