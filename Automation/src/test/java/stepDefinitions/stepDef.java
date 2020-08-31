package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDef {

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("Given is here");
	}
	
	@When("^user logins with the username and password$")
	public void user_pass() {
		System.out.println("When is here");
	}
	
	@Then("^user lands on the home page$")
	public void home_page(DataTable data) {
		List<String> dataTb = data.asList();
		System.out.println("Then is here with data | "+dataTb);
	}
	
	@Then("^user lands on the home page for (.+) and (.+)$")
	public void home_page_with_user_data(String u, String p) {
		//List<String> dataTb = data.asList();
		System.out.println("Then is here with data | "+u +"|" + p);
	}
}
