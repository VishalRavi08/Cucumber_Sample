package org.pro.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.fbpojo.FBPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FBCreation extends BaseClass{
	
	FBPojo f;
	
	@Given("user Launches The Browser")
	public void user_Launches_The_Browser() {
		launchBrowser();
	}

	@When("user Launches The Application")
	public void user_Launches_The_Application() {
		launchUrl("https://www.facebook.com/");
		windowMaximize();
	}

	@When("user Clicks The Create New Account")
	public void user_Clicks_The_Create_New_Account() {
		f = new FBPojo();
		clickBtn(f.getCreatNew());
	}

	@When("user Enters The First Name")
	public void user_Enters_The_First_Name(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> list1d = d.asList();
		f = new FBPojo();
		passText(list1d.get(0), f.getFirstName());
	}

	@When("user Enters The Second Name")
	public void user_Enters_The_Second_Name(DataTable d) {
		List<List<String>> list2d = d.asLists();
		f = new FBPojo();
		passText(list2d.get(1).get(1), f.getSecondName());
	}


	@Then("User Enters The Email Or Mobile")
	public void user_Enters_The_Email_Or_Mobile(DataTable d) {
		Map<String, String> map1d = d.asMap(String.class, String.class);
		f = new FBPojo();
		passText(map1d.get("email2"), f.getMobOrEmail());
	}

	@Then("user Enters The Passord")
	public void user_Enters_The_Passord(DataTable d) {
		List<Map<String, String>> map2d = d.asMaps(String.class, String.class);
		f = new FBPojo();
		passText(map2d.get(1).get("password2"), f.getPassword());
	}
	
	@Then("user Closes The Browser")
	public void user_Closes_The_Browser() {
		closeEntireBrowser();
	}

}
