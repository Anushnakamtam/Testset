package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fbloginpages {

	WebDriver driver;

	By email = (By.id("email"));
	By password = (By.id("pass"));
	By login = (By.xpath("//button[@type='submit']"));
	


	public fbloginpages(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	
	
	public void setEnterUsernamePassword(String username,String password){
		
		 getEmail().sendKeys(username);
		 getPassword().sendKeys(password);
	}
	
	
	
	
	
	
	

}
