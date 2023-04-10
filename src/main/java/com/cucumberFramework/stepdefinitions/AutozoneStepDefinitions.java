package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AutozonePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class AutozoneStepDefinitions extends TestBase {

	AutozonePage loginPage = new AutozonePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the home page URL \"([^\"]*)\"$")
	public void i_am_on_the_home_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		//waitHelper = new WaitHelper(driver);
	}

	@Then("^I click on add vehicle button$")
	public void i_click_on_add_vehicle_button() throws Throwable {
		loginPage.clickAddVehicleButton();
	}

	@Then("^I select vehicle year$")
	public void select_vehicle_year() throws Throwable {
		loginPage.clickVehicleYearInput();
		waitHelper.WaitForElement(loginPage.vehicleYearDropdownList, 2);
		loginPage.selectVehicleYear("2020");
	}

	@Then("^I select vehicle make$")
	public void select_vehicle_make() throws Throwable {
		loginPage.clickVehicleMakeInput();
		waitHelper.WaitForElement(loginPage.vehicleMakeDropdownList, 2);
		loginPage.selectVehicleMake("Audi");
	}

	@Then("^I select vehicle model$")
	public void select_vehicle_model() throws Throwable {
		loginPage.clickVehicleModelInput();
		waitHelper.WaitForElement(loginPage.vehicleModelDropdownList, 2);
		loginPage.selectVehicleModel("A3 Premium");
	}

	@Then("^I search item$")
	public void search_item() throws Throwable {
		waitHelper.WaitForElement(loginPage.selectedVehicleImage, 20);
		loginPage.searchItem();
	}

	@Then("^I click on item \"([^\"]*)\"$")
	public void click_on_item(String itemName) throws Throwable {
		loginPage.findAndClickItem(itemName);
	}

	@Then("^I add item to cart$")
	public void add_item_to_cart() throws Throwable {
		loginPage.addToCartAndContinue();
	}
//	@When("^I goto Cart and click Checkout$")
//	public void i_goto_Cart_and_click_Checkout() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^I click on Continue As Guest$")
//	public void i_click_on_Continue_As_Guest() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^I click on Continue button$")
//	public void i_click_on_Continue_button() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^I enter card details, billing address and complete payment$")
//	public void i_enter_card_details_billing_address_and_complete_payment() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^Payment should be successfull$")
//	public void payment_should_be_successfull() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
	
}