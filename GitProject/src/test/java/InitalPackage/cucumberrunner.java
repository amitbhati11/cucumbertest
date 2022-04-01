package InitalPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class cucumberrunner {

	//Datadrivern testing
	//Parameteriaztion with cucumber
	
	WebDriver driver=null;
	
	@Given("open the browser")
	public void open_the_browser() {
		String geckopath="C:\\Users\\Admin_SRV\\git\\cucumbertest\\GitProject\\drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",geckopath);
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  
	}

	@And("enter the url")
	public void enter_the_url() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://example.testproject.io/web/");
	
	  
	}

	@When("^open login page and enter (.*) and (.*)$")
	public void open_login_page_and_enter_username_and_password(String username,String password) throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
	   
	
	}

	@Then("navigate to nextpage")
	public void navigate_to_nextpage() throws InterruptedException {
		
		driver.findElement(By.id("logout")).isDisplayed();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	
		
	    
	}
}
 