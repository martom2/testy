package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificMenu {
	
	WebDriver driver;
	
	public SpecificMenu(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By createButton = By.cssSelector(".button-action");
	
	By updateMenuButton = By.linkText("Update");
	By updateSelectedSubButton = By.id("list-view-massActionSelected");
	By updateAllSubButton = By.id("list-view-massActionAll");
	
	By exportMenuButton = By.linkText("Export");
	By exportSelectedSubButton = By.id("list-view-exportActionSelected");
	By exportAllSubButton = By.id("list-view-exportActionAll");
	
	By deleteMenuButton = By.linkText("Delete");
	By deleteSelectedSubButton = By.id("list-view-deleteMassActionSelected");
	By deleteAllSubButton = By.id("list-view-deleteMassActionAll");
	
	By subscribeMenuButton = By.linkText("Subscribe");
	By subscribeSelectedSubButton = By.id("list-view-subscribeMassActionSelected");
	By subscribeAllSubButton = By.id("list-view-subscribeMassActionAll");
	
	By mergeMenuButton = By.linkText("Merge");
	By mergeSelectedSubButton = By.id("list-view-listViewMergeSelected");

	
	
// METHODS ON OBJECTS
	
	public void clickCreate() {
		driver.findElement(createButton).click();
	}

	public void clickUpdateSelected() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(this.updateSelectedSubButton));
	}
	
	public void clickUpdateAll() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", updateAllSubButton);
	}
	
	public void clickExportSelected() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(this.exportSelectedSubButton));
	}
	
	public void clickExportAll() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", exportAllSubButton);
	}
	
	public void clickDeleteSelected() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(this.deleteSelectedSubButton));
	}
	
	public void clickDeleteAll() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", deleteAllSubButton);
	}
	
	public void clickSubscribeSelected() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", subscribeSelectedSubButton);
	}
	
	public void clickSubscribeAll() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", subscribeAllSubButton);
	}
	
	public void clickMergeSelected() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", mergeSelectedSubButton);
	}
}
