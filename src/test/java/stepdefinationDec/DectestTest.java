package stepdefinationDec;

import com.decTest.pages.DecTestPage;
import com.driverDec.MyDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class DectestTest {
	
	public DecTestPage dectestPg;
		
	public DectestTest()
	{
		this.dectestPg = new DecTestPage(MyDriver.getDriver());
//		this.dectestPg = new DecTestPage(MyDriver.getDriver());
	}
	
	
	@Given("Enter the Text as {string}")
	public void enter_the_text_as(String string) {
	    
	   System.out.println("$$$$$$$$$$$$$$"+string);
	}
	
	@Given("Enter the Url as {string}")
	public void enter_the_url_as(String tst) {
		dectestPg.enterUrl(tst);
	}
	
	@Then("Enter the text as {string}")
	public void enter_thetext_as(String string) {
	    dectestPg.enterText(string);
	}
	
	@Given("Check The Resultant List")
	public void check_the_resultant_list() {
	    dectestPg.checkResultList();
	}
}
//	public static void main(String[] args)
//	{
//		System.setProperty("webdriver.chrome.driver",".\\src\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//	}
