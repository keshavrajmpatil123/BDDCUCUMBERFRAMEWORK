/*package stepsforhooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemosteps {
	WebDriver driver=null;
	@Before
	public void browsersetup() {
		System.out.println("i am inside browser setup");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver-win64/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    

	}
	@After
	public void teardown() {
		System.out.println("i am inside teardown");
		
		driver.quit();
	}
	@BeforeStep
	public  void beforeSteps() {
		System.out.println("i am inside before steps-----");
	}
	@AfterStep
	public void afterSteps() {
		System.out.println("i am inside after steps----");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    
	}
	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	   
	}
	
}*/

