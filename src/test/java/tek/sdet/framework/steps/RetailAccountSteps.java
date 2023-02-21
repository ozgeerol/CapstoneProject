package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.pages.RetailAccountPage;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
		
	}   
	@When("User update Name {string} and {string}")
	public void userUpdateNameAnd(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField,nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField,phoneValue);
		logger.info("user updated Name and Phone values");
	   
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}   
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
	 Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage)); 
	 logger.info("user profile information updated");

	}
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String,String>>updatePasswordInfo = dataTable.asMaps(String.class,String.class);
		sendText(factory.accountPage().previousPasswordButton,updatePasswordInfo.get(0).get("previous password"));
		sendText(factory.accountPage().newPasswordButton,updatePasswordInfo.get(0).get("new password"));
		sendText(factory.accountPage().confirmPassordButton,updatePasswordInfo.get(0).get("confirm password"));
	    logger.info("user changed the password");
	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("user clicked on ChangePassword button");
	    
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) throws InterruptedException {
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordInfoUpdateSuccessMessage));
	   logger.info("a message is displayed on acccount page");
	   Thread.sleep(4000);
	}

//	@When("User click on Add a payment method link")
//	public void userClickOnAddAPaymentMethodLink() throws InterruptedException {
//	   click(factory.accountPage().addCreditOrDebitCart);
//	   logger.info("user clicked on Add a payment method link");
//	   Thread.sleep(4000);
//	}
	@When("User fill Debit or credit card informetion")
	public void userFillDebitOrCreditCardInformetion(DataTable dataTable) throws InterruptedException {
	   List<Map<String,String>>addCreditCartInfo = dataTable.asMaps(String.class,String.class);
	  // sendText(factory.accountPage().addCreditOrDebitCart,addCreditCartInfo.get(0).get("credit cart"));
	   sendText(factory.accountPage().CardNumberInfo,addCreditCartInfo.get(0).get("cardNumber"));
	   sendText(factory.accountPage().nameOnCardInfo,addCreditCartInfo.get(0).get("nameOnCard"));
	   sendText(factory.accountPage().expirationMonthButton,addCreditCartInfo.get(0).get("expirationMonth"));
	   sendText(factory.accountPage().expirationYearButton,addCreditCartInfo.get(0).get("expirationYear"));
	   sendText(factory.accountPage().securityCodeButton,addCreditCartInfo.get(0).get("securityCode"));
	   logger.info("user filled debir ot credit cart information");
	   Thread.sleep(4000);
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	 click(factory.accountPage().addYourCartButton) ;
	 logger.info("user clicked on add your cart button");
	}
	@Then("a message should be displayedd {string}")
	public void aMessageShouldBeDisplayedd(String string) throws InterruptedException {
		factory.accountPage().paymentMethodAddedInfo();
	   logger.info("a message is displayed on acccount page");
	   Thread.sleep(4000);
	}
	@When("User click on Card option")
	public void userClickOnCardOption() throws InterruptedException {
		click(factory.accountPage().clickOnCard);
		logger.info("user closed on card option");
		Thread.sleep(4000);
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() throws InterruptedException {
	   click(factory.accountPage().editButton);
	   logger.info("user clicked on Edit option of card section");
	   Thread.sleep(4000);
	 
	}
	@When("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) throws InterruptedException {
	List<Map<String,String>>editInformation = dataTable.asMaps(String.class,String.class );
	clearTextUsingSendKeys(factory.accountPage().CardNumberInfo);	
	sendText(factory.accountPage().CardNumberInfo,editInformation.get(0).get("cardNumber"));
	clearTextUsingSendKeys(factory.accountPage().nameOnCardInfo);
	sendText(factory.accountPage().nameOnCardInfo,editInformation.get(0).get("nameOnCard"));
	sendText(factory.accountPage().expirationMonthButton,editInformation.get(0).get("expirationMonth"));
	sendText(factory.accountPage().expirationYearButton,editInformation.get(0).get("expirationYear"));
	clearTextUsingSendKeys(factory.accountPage().securityCodeButton);	
	sendText(factory.accountPage().securityCodeButton,editInformation.get(0).get("SecurityCode"));
    logger.info("user edited credit cart information ");

    Thread.sleep(4000);
    
	
	
	}
	@When("User click on Update your card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.accountPage().addYourCartButton);
	    logger.info("user clicked on update card");
	}
	@Then("a message should be displayedd1 {string}")
	public void aMessageShouldBeDisplayedd1(String string) throws InterruptedException {
		waitTillPresence(factory.accountPage().paymentSuccessAdded);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentSuccessAdded));
		logger.info("a message is displayed on acccount page");
	   Thread.sleep(4000);
	   
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() throws InterruptedException {
		click(factory.accountPage().removeButton);
	   logger.info("user clicked on remove option of card section");
	   Thread.sleep(4000);
	}



	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}


    


