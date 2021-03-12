package project;

import static org.junit.Assert.assertTrue;

import javax.swing.JOptionPane;

import cucumber.Admin;
import cucumber.LogoutFF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

	LogoutFF f=new LogoutFF();
	Admin ad=new Admin("sahar","11821693");
	//Boolean log= false;
	@Given("I am logged in")
	public void i_am_logged_in() {
		ad.loginAdmin=true;
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("browser is open and the user in log out page")
	public void browser_is_open_and_the_user_in_log_out_page() {
	    // Write code here that turns the phrase above into concrete actions
		if(ad.loginAdmin)
		System.out.print("you are in log out page");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("admin is choose logout")
	public void admin_is_choose_logout() {
		 if(ad.loginAdmin==false)
			 System.out.print("you are not logged in to log out");
		 // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the Admin should be loged out")
	public void the_admin_should_be_loged_out() {
		if(ad.loginAdmin) {
		f.islogout();
		ad.loginAdmin=false;
		}
		assertTrue(ad.loginAdmin==false);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("return to login page")
	public void return_to_login_page() {
	    System.out.print("you are in log in page now \n");
	
	}
}
	    

	  
	
	    
	  
	  
	

