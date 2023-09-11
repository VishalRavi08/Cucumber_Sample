package org.pro.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Redbus extends BaseClass{
	
	@Given("user Gets The Browser")
	public void user_Gets_The_Browser() {
		launchBrowser();
	}

	@When("user Gives The Url")
	public void user_Gives_The_Url() {
		launchUrl("https://www.redbus.in/");
		windowMaximize();
	}

	@Then("user Enters From")
	public void user_Enters_From() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Trichy");
	}

	@Then("user Enters To")
	public void user_Enters_To() {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Chennai");
	}

	@Then("user Gives The Date")
	public void user_Gives_The_Date() throws InterruptedException {
		Thread.sleep(3000);
	}

	@Then("user Searches Availability")
	public void user_Searches_Availability() {
		driver.findElement(By.id("search_button")).click();
	}

	@Then("user Closes The Application")
	public void user_Closes_The_Application() {
		closeEntireBrowser();
	}

}
