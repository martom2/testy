package projekt.automatyzacja.page;

import org.openqa.selenium.*;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
// LOCATED OBJECTS	
	
	By userName = By.id("LoginForm_username");

	By password = By.id("LoginForm_password");
	
	By signIn = By.id("Login");
	
	By passwordMessage = By.id("LoginForm_password_em_");
	   
// METHODS ON OBJECTS
	  
    public void setUserName(String strUserName){
        driver.findElement(this.userName).sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
         driver.findElement(this.password).sendKeys(strPassword);
    }

    public void clickSignIn(){
         driver.findElement(this.signIn).click();
    }
    
    public String getPageTitle() {
    	return driver.getTitle();
    }
    
    public String getPasswordMessage() {
    	return driver.findElement(this.passwordMessage).getText();
    }
    
//GROUP METHODS
    
    public void login(String username, String password) {
    	setUserName(username);
    	setPassword(password);
    	clickSignIn();
    }

}

	

