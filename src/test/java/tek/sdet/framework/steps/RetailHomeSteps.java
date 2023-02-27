package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailHomeSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	@When("User click on Sign in Option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signin);
		logger.info("user clicked on sign in option succefully");
		
	}
	
	@And("user enter email {string} and password {string}")
	public void userEnterEmailAndPassword (String email,String password) {
		sendText(factory.signIn().emailField,email);
		sendText(factory.signIn().passwordField,password);
		logger.info("user entered email" + email + "and password" + password);
			
	}
	
	@And("User click on Login button")
	public void userClickOnLoginButton () {
		click(factory.signIn().logIn);
		logger.info("user clicked on login button");
			
	}
	
	@And("User should be logged in into account")
	public void userShouldBeLoggedInIntoAccount () {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("User could login successfully");
		
	}
	
	@And("User change the category to {string}")
	public void userChangeThecategorytoSmartHome(String SmartHome) {
		selectByVisibleText(factory.homePage().allDepartments,SmartHome);
		logger.info("All Department changed to" + SmartHome );		
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItemKasaOutdoorSmartHome(String item) {
		sendText(factory.homePage().searchInputField,item);
		logger.info("user entred " + item);	
	}
	
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search button");	
	}
	
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().Kasa);
		logger.info("user clicked on item");
	}
	
	@And("User select quantity {string}")
	public void userSelectQuantity(String adad) {
		sendText(factory.homePage().Quantity,adad);
		logger.info("user selected quantity '2' ");		
	}
	
	@And("User click add to Cart button")
	public void userClickAddToCartBttn() {
		click(factory.homePage().AddToCart);
		logger.info("user clicked on Add To Cart");	
	}
	
	@Then("the cart icon quantity should change to {string}")
	public void TheCartIconQuantityShouldChangeTo2(String two) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartBtn,two));
		logger.info("cart icone changed to '2' ");
	}
	
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPasswordd(String emailValue, String passwordValue) throws InterruptedException {
		sendText(factory.homePage().emailField,emailValue);
		sendText(factory.homePage().passwordField,passwordValue);
		click(factory.homePage().loginField);
		logger.info("user entered email" + emailValue + "and password" + passwordValue);
		 Thread.sleep(5000);
	   
	}
	@When("User select quantity ‘{string}’")
	public void userSelectQuantityy(String ads) throws InterruptedException {
			sendText(factory.homePage().Quantity,ads);
			logger.info("user selected quantity '2' ");		
			 Thread.sleep(5000);
	   
	}
	@Then("the cart icon quantity should change to ‘{string}’")
	public void theCartIconQuantityShouldChangeTo(String two1) throws InterruptedException {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartBtn,two1));
		logger.info("cart icone changed to '2' ");
		 Thread.sleep(5000);
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() throws InterruptedException {
	    click(factory.homePage().CartButtonOnTop);
	    logger.info("user clicked on Cart option");
	    Thread.sleep(5000);
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() throws InterruptedException {
		click(factory.homePage().proceedToCheckout);
	    logger.info("user clicked on Checkout button");
	    Thread.sleep(5000);
	}  
	    
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() throws InterruptedException {
		click(factory.homePage().addNewAddessButton);
	    logger.info("user clicked Add a new address link for shipping address");
	    Thread.sleep(5000);
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() throws InterruptedException {
		click(factory.homePage().addNewAddessButton);
	    logger.info("user clicked Add a new address link for shipping address");
	    Thread.sleep(5000);
		
	}
	@Then("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) throws InterruptedException {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		logger.info("user filled the new address form with information provided in data table");
		Thread.sleep(5000);
	    
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderButton);
	    logger.info("user clicked on Place Your Order");
	   
	}
	@Then("a message should be displayedd3 {string}")
	public void aMessageShouldBeDisplayedOrderPlacedThanks(String expectedMessage) {
		waitTillPresence(factory.homePage().placedYourOrderSuccessfully);
		Assert.assertEquals(expectedMessage, factory.homePage().placedYourOrderSuccessfully.getText());




}

}


