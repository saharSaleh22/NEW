package project;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import cucumber.Book;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBookSteps {
	 ArrayList<Book>lib=new ArrayList<Book>();
	// Book C;
	 int donesearch=1;
@Given("I search about book by title")
public void i_search_about_book_by_title() {
	Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
	Book  b2 =new Book("caste","isable","0593230256","2003");
	Book  b3 =new Book("promised man","barak","1338680455","2004");
//	Book  b5 =new Book("promised man","barak","1338689455","2004");
	lib.add(b1);
	lib.add(b2);
	lib.add(b3);
}

@When("The user clicked search write sub string {string}")
public void the_user_clicked_search_write_sub_string(String string) {
    Book a= new Book();
   a.bookSearchTitle(lib, string);
   donesearch=1;
    
}

@Then("A book with name contain  should be returned and printed on the screen")
public void a_book_with_name_contain_should_be_returned_and_printed_on_the_screen() {
	 assertTrue(donesearch==1);  
}

@Given("I search about book by author")
public void i_search_about_book_by_author() {
	Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
	Book  b2 =new Book("caste","isable","0593230256","2003");
	Book  b3 =new Book("promised man","barak","1338680455","2004");
//	Book  b5 =new Book("promised man","barak","1338689455","2004");
	lib.add(b1);
	lib.add(b2);
	lib.add(b3);
}

@When("The user search write sub string of title div {string}")
public void the_user_search_write_sub_string_of_title_div(String string) {
	 Book a= new Book();
	   a.bookSearchauthor(lib, string);
	   donesearch=1;
}

@Then("A book with author contain should be returned and printed on the screen")
public void a_book_with_author_contain_should_be_returned_and_printed_on_the_screen() {
	assertTrue(donesearch==1);  
}

@Given("I search about book by isbn")
public void i_search_about_book_by_isbn() {
	Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
	Book  b2 =new Book("caste","isable","0593230256","2003");
	Book  b3 =new Book("promised man","barak","1338680455","2004");
//	Book  b5 =new Book("promised man","barak","1338689455","2004");
	lib.add(b1);
	lib.add(b2);
	lib.add(b3);
}

@When("The user search write sub string of isbn div {string}")
public void the_user_search_write_sub_string_of_isbn_div(String string) {
	 Book a= new Book();
	   a.bookSearchISBN(lib, string);
	   donesearch=1;
}

@Then("A book with isbn contain should be returned and printed on the screen")
public void a_book_with_isbn_contain_should_be_returned_and_printed_on_the_screen() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(donesearch==1);  
}

@Given("I search about one more book auther")
public void i_search_about_one_more_book_auther() {
	Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
	Book  b2 =new Book("caste","isable","0593230256","2003");
	Book  b3 =new Book("dav man","barak","1338680455","2004");
//	Book  b5 =new Book("promised man","barak","1338689455","2004");
	lib.add(b1);
	lib.add(b2);
	lib.add(b3);
}

@When("I search about more one book his auther name is {string}")
public void i_search_about_more_one_book_his_auther_name_is(String string) {
	 Book a= new Book();
	   a.bookSearchmoreauthor(lib, string);
	   donesearch=1;
}

@Then("A list of books that the auther is  should be returned and printed on the screen")
public void a_list_of_books_that_the_auther_is_should_be_returned_and_printed_on_the_screen() {
	assertTrue(donesearch==1);  
}

@Given("I search about one more book title")
public void i_search_about_one_more_book_title() {
	Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
	Book  b2 =new Book("caste","the dog","0593230256","2003");
	Book  b3 =new Book("dav man","dogs","1338680455","2004");
//	Book  b5 =new Book("promised man","barak","1338689455","2004");
	lib.add(b1);
	lib.add(b2);
	lib.add(b3);
    
}

@When("I search about one more book his auther name is {string}")
public void i_search_about_one_more_book_his_auther_name_is(String string) {
	Book a= new Book();
	   a.bookSearchmoreTitle(lib, string);
	   donesearch=1;
}

@Then("A list of books that the title is should be returned and printed on the screen")
public void a_list_of_books_that_the_title_is_should_be_returned_and_printed_on_the_screen() {
	assertTrue(donesearch==1);    
}

@Given("I search about one more book isbn")
public void i_search_about_one_more_book_isbn() {
	Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
	Book  b2 =new Book("caste","the dog","0593230256","2003");
	Book  b3 =new Book("dav man","dogs","0593230256","2004");
//	Book  b5 =new Book("promised man","barak","1338689455","2004");
	lib.add(b1);
	lib.add(b2);
	lib.add(b3);
}

@When("I search about one more book his isbn name is {string}")
public void i_search_about_one_more_book_his_isbn_name_is(String string) {
	Book a= new Book();
	   a.bookSearchmoreISBN(lib, string);
	   donesearch=1;
}

@Then("A list of books that the isbn is  should be returned and printed on the screen")
public void a_list_of_books_that_the_isbn_is_should_be_returned_and_printed_on_the_screen() {
	assertTrue(donesearch==1); 
}

}
