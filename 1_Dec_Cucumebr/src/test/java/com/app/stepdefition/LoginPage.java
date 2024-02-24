package com.app.stepdefition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.app.pageexe.LoginPage_Exe;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class LoginPage extends LoginPage_Exe {
	/*@Given("Launch the URL")
	public void launch_the_url() {
	  browserlaunch();
	  driver.get("https://adactinhotelapp.com/");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		username(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	 password(pass);
	}

	@When("Click the login button")
	public void click_the_login_button() {
	  login_button();
	}

	@Then("Validate the HomePage")
	public void validate_the_home_page() {
	  System.out.println("HomePage");
	}

	// scenario outline 
	@When("Enter the user {string}")
	public void enter_the_user(String data) {
		username(data);
	}
	@When("Enter the pass {string}")
	public void enter_the_pass(String data) {
		password(data);
	}*/
	
	// asList
	/*@When("Enter the username as passing datatbale")
	public void enter_the_username_as_passing_datatbale(DataTable data) {
		List<String> asList = data.asList();
		System.out.println(asList.get(0));
		System.out.println(asList.get(2));
		
	    
	}*/
	//asLists
	/*@When("Enter the username as passing datatbale")
	public void enter_the_username_as_passing_datatbale(DataTable data) {
		List<List<String>> asLists = data.asLists();
		System.out.println(asLists.get(0).get(1));
		
	}*/
	//asMap
	/*@When("Enter the username as passing datatbale")
	public void enter_the_username_as_passing_datatbale1(DataTable data) {
		Map<String, String> asMap = data.asMap(String.class, String.class);
		LoginPage_Exe.studentReg("Email", asMap.get("Email"));
		LoginPage_Exe.studentReg("Name", asMap.get("Name"));
	}
		
	//asMaps
	@When("Enter the username as passing datatbale")
	public void enter_the_username_as_passing_datatbale(DataTable data) {
		List<Map<String,String>> asMaps = data.asMaps();
		System.out.println(asMaps.get(0).get("data1"));
		
		
		
	}*/
	
	@Given("Launch the URL")
	public void launch_the_URL() {
	    System.out.println("Launch");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		System.out.println(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		System.out.println(pass);
		Assert.assertEquals(pass, "12344");
	}

	@When("Click the login button")
	public void click_the_login_button() {
	   System.out.println("login button");
	}

	@Then("Validate the HomePage")
	public void validate_the_HomePage() {
	   System.out.println("Home page");
	}

}
