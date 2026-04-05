/*package com.stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Orangehrm_pagefactory_Login;

public class LoginSteps2_PageFactory {
	WebDriver driver=null;
    Orangehrm_pagefactory_Login login;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("inside step-browser is open");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver-win64/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	
		driver.manage().window().maximize();
		 login = new Orangehrm_pagefactory_Login(driver);

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside step-user is on login page");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		login.enterUsername(username);
		login.enterPassword(password);
		
		System.out.println("inside step-user enters username and password");
		//driver.findElement(By.name("username")).sendKeys(username);
		//driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		
	}
	

	@And("user click on login page")
	public void user_click_on_login_page() throws InterruptedException {
		login.clickLogin();
		System.out.println("inside step-user click on login page");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		System.out.println("inside step-user navigated to home page");
		driver.quit();
		
		

	}
	
	}*/




