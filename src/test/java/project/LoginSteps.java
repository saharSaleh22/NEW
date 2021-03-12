package project;

import cucumber.Admin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	Admin admin;
	boolean loginFlag;
	
	@Given("browser is open and the user in login page")
	public void browser_is_open_and_the_user_in_login_page() {
	   System.out.println("Step1: the user in login page now ");
	}

	@When("user  enters valid credentials and he entered {string} and {string}")
	public void user_enters_valid_credentials_and_he_entered_and(String name, String password) {
		 System.out.println("the user enterd his credentials \nUsername: "+name+", Password: "+ password);
               admin = new Admin(name,password);
	}

	@Then("the student should be loged in")
	public void the_student_should_be_loged_in() {
		 System.out.println("the user logged in successfully ");
		 System.out.println();
         loginFlag=true;
	}

	@Given("admin on login page")
	public void admin_on_login_page() {
		   System.out.println("Step2: the user in the login page now ");

	}

	@When("Admin enters {string} and wrong {string}")
	public void admin_enters_and_wrong(String name, String password) {
		 System.out.println("the user enterd his credentials \nUsername: "+name+", Password: "+ password);


	}

	@Then("show error message and still on login page")
	public void show_error_message_and_still_on_login_page() {
		 System.out.println("the user entered invalid credintials");
		 System.out.println();

	}
}
