package stepdefinationDec;

import com.driverDec.MyDriver;
import com.flipkart.pages.FlipkartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlipkartTest {
	FlipkartPage flipkrtpge;
	public FlipkartTest()
	{		
		 flipkrtpge = new FlipkartPage(MyDriver.getDriver());
	}
	
	@Given("Enter Url of Flipkart {string}")
	public void enter_url_of_flipkart(String string) {
		flipkrtpge.enterUrl(string);
	}

	@Given("Search My Mobile as {string}")
	public void search_my_mobile_as(String string) {
		flipkrtpge.srchMyMob(string);
	}

	@Then("Count the Resultant Mobiles")
	public void count_the_resultant_mobiles() {	      
		flipkrtpge.countResult();
	}
	
	@Given("Hovar on Menu as Men")
	public void hovar_on_menu_as_men() {
	   flipkrtpge.handleTopMenu();
	}

}