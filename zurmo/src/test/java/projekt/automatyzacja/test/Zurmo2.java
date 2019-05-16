package projekt.automatyzacja.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import projekt.automatyzacja.page.ContactDetailsPage;
import projekt.automatyzacja.page.DashboardPage;
import projekt.automatyzacja.page.EditUserPage;
import projekt.automatyzacja.page.ProductsPage;
import projekt.automatyzacja.page.TopMenuPage;
import projekt.automatyzacja.page.UserDetailsPage;
import projekt.automatyzacja.page.UsersPage;
import projekt.automatyzacja.utility.ExcelUtil;

public class Zurmo2 {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "C:\\javalibs\\geckodriver-v0.20.1-win32\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		String baseUrl = "http://localhost/zurmo/app/index.php";
//		driver.get(baseUrl);
//	
//		LoginAction.login(driver, "super", "super");
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
//		TopMenuPage page = new TopMenuPage(driver);
//		page.clickUsersLink();
//		
//		UsersPage upage = new UsersPage(driver);
//		String searchText = "Kamil Nowak";
//		upage.textSearchBar(searchText);
//		upage.clickSearchBar();
//		 (new WebDriverWait(driver, 60)).until(ExpectedConditions.textToBePresentInElement(By.cssSelector(".odd > td:nth-child(2) > a:nth-child(1)"), searchText));
//		upage.clickTableFirstNamePosition();
//		
//		UserDetailsPage udpage = new UserDetailsPage(driver);
//		udpage.clickEditButton();
//		
//		EditUserPage epage = new EditUserPage(driver);
//		epage.selectStatus("Inactive");
//		epage.clickSaveButton();
//		
//		(new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id("sliding-panel-toggle")));
//		
//		page.clickSignOutLink();
		
		ExcelUtil excel = new ExcelUtil("plikexcel.xlsx", "Arkusz1");
		System.out.println("lalala");
		System.out.println(excel.getCellData(0, 1));
		System.out.println("dadada");
	
		
	}
	
}
