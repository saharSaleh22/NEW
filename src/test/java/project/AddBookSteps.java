package project;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import cucumber.Admin;
import cucumber.Book;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AddBookSteps {


	
		Admin admin=new Admin("sahar","11821693");
		//admin.loginAdmin=true;
		
		
		Boolean addbookbyadmin ;
		 ArrayList<Book>lib=new ArrayList<Book>();
		 Book  b4;
		@Given("Admin is login")
		public void admin_is_login() {
			//b1 =new Book("","","","");
		    // Write code here that turns the phrase above into concrete actions
			admin.loginAdmin=true;
			Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
			Book  b2 =new Book("caste","isable","0593230256","2003");
			Book  b3 =new Book("promised man","barak","1338680455","2004");
		//	Book  b5 =new Book("promised man","barak","1338689455","2004");
			lib.add(b1);
			lib.add(b2);
			lib.add(b3);
			//b5.addBook(lib, b5);
		
		}

		@When("user enters valid information about book {string} and {string} and {string} and {string}")
		public void user_enters_valid_information_about_book_and_and_and(String title, String isbn, String sign , String author) {
		   if(admin.loginAdmin==true)
		   {
			    b4 =new Book(author,title,isbn,sign);
			   
			  
		   }
		}

		@Then("add book to the list")
		public void add_book_to_the_list() {
			b4.addBook(lib, b4);
			addbookbyadmin=true;
			 b4.printBook(lib);
			 assertTrue(addbookbyadmin==true);
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}
		@Given("Admin is not login")
		public void admin_is_not_login() {
		    // Write code here that turns the phrase above into concrete actions
			admin.loginAdmin=false;
		}
		@When("user enters information about book {string} and {string} and {string} and {string}")
		public void user_enters_information_about_book_and_and_and(String title, String isbn, String sign , String author) {
			 b4 =new Book(author,title,isbn,sign);
			//if(admin.loginAdmin==false)
				System.out.print(admin.loginAdmin+"\n");
			 System.out.println("the admin is not login we cant add book");
		    Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
			Book  b2 =new Book("caste","isable","0593230256","2003");
			Book  b3 =new Book("promised man","barak","1338680455","2004");
			lib.add(b1);
			lib.add(b2);
			lib.add(b3);
		
		}

		@Then("book dose not add to the list")
		public void book_dose_not_add_to_the_list() {
			addbookbyadmin=false;
			 b4.printBook(lib);
			 assertTrue(addbookbyadmin==false);
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			
		}
	}

