package org.pro.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearch extends BaseClass{
	
	@Given("user Starts The Browser")
	public void user_Starts_The_Browser() {
		launchBrowser();
	}

	@When("user Enters The Url")
	public void user_Enters_The_Url() {
		launchUrl("https://www.amazon.in/");
		windowMaximize();
	}

	@When("user Enters The Product")
	public void user_Enters_The_Product() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	}

	@When("user Clicks The Search Icon")
	public void user_Clicks_The_Search_Icon() throws InterruptedException {
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
	}

	@Then("user Quits The Browser")
	public void user_Quits_The_Browser() {
		closeEntireBrowser();
	}

}
