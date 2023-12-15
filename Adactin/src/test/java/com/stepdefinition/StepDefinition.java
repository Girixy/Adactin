package com.stepdefinition;

import java.util.List;

import com.baseclass.BaseClass;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;
import com.pom.PomPage04;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PomPage01 a=new PomPage01(driver);
	PomPage02 b=new PomPage02(driver);
	PomPage03 c=new PomPage03(driver);
	PomPage04 d=new PomPage04(driver);
	
	@Given("User Launch for Url")
	public void user_launch_for_url() {
	   getUrl("https://adactinhotelapp.com/");
	}

	@When("User Enter the User name")
	public void user_enter_the_user_name() {
	  a.getUsername().sendKeys("girimeenakshi");
	}

	@When("User Enter the Password")
	public void user_enter_the_password() {
	 a.getPassword().sendKeys("K675Q6");
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		a.getLogin().click();
	}

	@Then("Next Page Shown")
	public void next_page_shown1() {
	  getTitle();
	}
	
	@When("user fill all the details")
	public void user_fill_all_the_details(io.cucumber.datatable.DataTable dataTable) {
	   
		List<List<String>> li = dataTable.asLists();
		b.getLocation().sendKeys(li.get(0).get(0));
		b.getHotel().sendKeys(li.get(0).get(1));
		b.getRoomtype().sendKeys(li.get(0).get(2));
		b.getStart().sendKeys(li.get(0).get(3));
		b.getEnd().sendKeys(li.get(0).get(4));
		b.getAdult().sendKeys(li.get(0).get(5));
		b.getChild().sendKeys(li.get(0).get(6));
	}

	@When("user click search button")
	public void user_click_search_button() {
	    b.getSubmit().click();
	}

	@Then("next page shown")
	public void next_page_shown() {
	    getTitle();
	}
	
	@When("user click the agree button")
	public void user_click_the_agree_button() {
	    c.getAgree().click();
	}

	@When("user click the continue button")
	public void user_click_the_continue_button() {
	    c.getNext().click();
	}

	@Then("next page3 shown")
	public void next_page3_shown() {
	    
	}

	@When("user enter the details")
	public void user_enter_the_details(io.cucumber.datatable.DataTable dataTable) {
	    
		List<List<String>> li = dataTable.asLists();
		d.getFirstname().sendKeys(li.get(0).get(0));
		d.getLastname().sendKeys(li.get(0).get(1));
		d.getAddress().sendKeys(li.get(0).get(2));
		d.getCardno().sendKeys(li.get(0).get(3));
		d.getCardtype().sendKeys(li.get(0).get(4));
		d.getMonth().sendKeys(li.get(0).get(5));
		d.getYear().sendKeys(li.get(0).get(6));
		d.getCvvnumber().sendKeys(li.get(0).get(7));
		
	}

	@When("user click booking button")
	public void user_click_booking_button() {
	   d.getBooknow().click();
	}
	
}
