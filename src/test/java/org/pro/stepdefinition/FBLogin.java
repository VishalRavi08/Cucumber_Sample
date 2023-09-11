package org.pro.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLogin extends BaseClass{
	
	@Given("user Initiates The Browser")
	public void user_Initiates_The_Browser() {
		launchBrowser();
	}

	@When("user Launches The Webapplication")
	public void user_Launches_The_Webapplication() {
		launchUrl("https://www.facebook.com/");
		windowMaximize();
	}

	@When("user Enters The {string} Username")
	public void user_Enters_The_Username(String e) {
		driver.findElement(By.id("email")).sendKeys(e);
	}

	@When("user Enters The {string} Password")
	public void user_Enters_The_Password(String p) {
		driver.findElement(By.id("pass")).sendKeys(p);
	}

	@When("user Clicks The Login")
	public void user_Clicks_The_Login() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@Then("user Ends The Browser")
	public void user_Ends_The_Browser() {
		closeEntireBrowser();
	}
	

}
