package Stepdefination;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.fbloginpages;

public class Facebooklogin extends HooksClass {
	public static WebDriver driver;
	fbloginpages obj;
	
	@Before()
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@After()
	public void BrowserClose() {
		driver.close();
	}
	
	
	
	@Given("Testlaunch the browser")
	public void testlaunch_the_browser() {
	
				
//		WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("Test user enters username and password {string}")
	public void test_user_enters_username_and_password(String DATA) throws IOException {
	   obj=new fbloginpages(driver);
		 
		 HashMap myHSData = utilities.Excelreader.getData(DATA);
		 String username = (String) myHSData.get("USERNAME");
		 String password =(String) myHSData.get("PASSWORD");
		 obj.setEnterUsernamePassword(username, password);
	}

	@Then("Test click on login button")
	public void test_click_on_login_button() throws InterruptedException {
	 
		obj.getLogin().click();
		Thread.sleep(1500);
		
		
	}


}
