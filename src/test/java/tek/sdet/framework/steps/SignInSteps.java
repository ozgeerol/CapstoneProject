package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	click(factory.homePage().signInButton);
	logger.info("User clicked on Sign in Option");
	
	}
	@When("User enter email email {string} and password {string}")
	public void userEnterEmailEmailAndPassword(String emailValue, String passwordValue) {
	sendText(factory.signIn().emailField, emailValue);
	sendText(factory.signIn().passwordField, passwordValue);
	logger.info("user entered email " + emailValue+ " and password " + passwordValue);

	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	click(factory.signIn().loginPageButton);
	logger.info("user clicked on login button");

	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));	

	}
}