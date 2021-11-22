package StepDefinations;

import java.util.List;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import reusablecomponents.ReadPropertyFile;
import uistore.SearchPageDetails;
import uistore.SigninPageDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination extends ReadPropertyFile {

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {

		driver = DriverInitialisation();

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {

		driver.get(strArg1);

	}

	@And("^click on sign link in home page to land on secure sign in page$")
	public void click_on_sign_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		SigninPageDetails s = new SigninPageDetails(driver);
		s.getSignin().click();
	}

	@When("^User enters (.+) and (.+) and sign in$")
	public void user_enters_and_and_sign_in(String email, String password) throws Throwable {

		SigninPageDetails s = new SigninPageDetails(driver);
		s.getEmail().sendKeys(email);

		s.getPassword().sendKeys(password);
		s.getSigninButton().click();

	}

	@And("^Close the driver$")
	public void close_the_driver() throws Throwable {
		driver.close();

	}
	
	@And("^Click on wish list$")
	public void click_on_wish_list() throws Throwable {
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class='link_text'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='swym-welcome-button']")).click();
	}

	@And("^Click on settings$")
	public void click_on_settings() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"swym-tabs-nav\"]/li[4]/a")).click();
	}

	@Then("^Enter \"([^\"]*)\" in the box$")
	public void enter_something_in_the_box(String strArg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\'swym-email-auth-input\']")).sendKeys(strArg1);
		Thread.sleep(3000);
	}

	@And("^click on connect$")
	public void click_on_connect() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\'swym-email-auth-button\']")).click();
	}
	
	@And("Click on Gift Card")
	public void click_on_gift_card() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//span[@class='link_text'])[3]")).click();
	}

	@Then("enter {string}")
	public void enter(String string) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\'PostalCode\']")).sendKeys(string);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cod-cheker\"]/button")).click();
	}

	@And("^check the COD availability$")
	public void check_the_cod_availability() throws Throwable {

		System.out.println(driver.findElement(By.xpath("//*[@id=\"PostalCodeCheckerAvailability\"]")).getText());

	}
}