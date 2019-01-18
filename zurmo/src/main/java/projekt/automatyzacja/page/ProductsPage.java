package projekt.automatyzacja.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By products = By.linkText("Products");
	By createProduct = By.linkText("Create Product");
	
	By catalogItems = By.linkText("Catalog Items");
	By createCatalogItem = By.linkText("Create Catalog Item");
	
	By categories = By.linkText("Categories");
	By createCategory = By.linkText("Create Category");
	
// METHODS ON OBJECTS
	
	public void clickProducs(){
		driver.findElement(this.products).click();
	}
	
	public void clickCreateProduct() {
		WebElement el = driver.findElement(this.createProduct);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", el);
	}
	
	public void clickCatalogItems(){
		driver.findElement(this.catalogItems).click();
	}
	
	public void clickCreateCatalogItem() {
		WebElement el = driver.findElement(this.createCatalogItem);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", el);
	}
	
	public void clickCategories(){
		driver.findElement(this.categories).click();
	}
	
	public void clickCreateCategory() {
		WebElement el = driver.findElement(this.createCategory);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", el);
	}
}
