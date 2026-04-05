package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrm_pagefactory_Login {
	@FindBy(name="username")
	WebElement txt_username;
	@FindBy(name="password")
    WebElement txt_password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login;
	WebDriver driver;
	public Orangehrm_pagefactory_Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clickLogin() {
		btn_login.click();
		
	}

}
