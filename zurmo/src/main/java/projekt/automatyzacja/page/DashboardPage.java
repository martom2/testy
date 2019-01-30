package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By postTextBox = By.id("SocialItem_description");
	By postButton = By.id("savePost");
	
// METHODS ON OBJECTS

	public void textPostTextBox(String postText) {
		driver.findElement(this.postTextBox).sendKeys(postText);
	}
	
	public void clickPostButton() {
		driver.findElement(postButton).click();
	}
}
