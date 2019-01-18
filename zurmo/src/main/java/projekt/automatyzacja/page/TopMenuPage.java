package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TopMenuPage {

	WebDriver driver;
	
	public TopMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS
	
	By signOutLink = By.linkText("Sign out");
	
	By administrationIcon = By.linkText("Administration");
	
	By usersLink = By.linkText("Users");
	
	
// METHODS ON OBJECTS
	
	public void clickAdministrationIcon(){
		driver.findElement(this.administrationIcon).click();
	}
	
	public void clickUsersLink(){
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(this.usersLink));
	}
	
	public void clickSignOutLink(){
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(this.signOutLink));
	}
	
}
