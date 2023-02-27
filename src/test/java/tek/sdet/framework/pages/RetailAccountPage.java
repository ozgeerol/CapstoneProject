package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;

	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement profileUpdateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;

	@FindBy(xpath = "//input[@id='previousPasswordInput']")
	public WebElement previousPasswordButton;

	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordButton;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassordButton;

	@FindBy(xpath = "//button[text() = 'Change Password']")
	public WebElement changePasswordButton;

	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordInfoUpdateSuccessMessage;

//	@FindBy(xpath = "//h1[text()='Add']")
	// public WebElement addCreditOrDebitCart;

	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement CardNumberInfo;

	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnCardInfo;

	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement expirationMonthButton;

	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationYearButton;

	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement securityCodeButton;

	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addYourCartButton;

	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentMethodAddedInfo;

	public void paymentMethodAddedInfo() {
		paymentMethodAddedInfo.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='account__payment-detail']")
	public WebElement paymentMethodUpdate;

	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement clickOnCard;

	@FindBy(xpath = "//button[normalize-space()='Edit']")
	public WebElement editButton;

	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentSuccessAdded;

	@FindBy(xpath = "//button[normalize-space()='remove']")
	public WebElement removeButton;

	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;

	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberField;
	
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement streetAddressField;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;
	
	@FindBy(id = "cityInput")
	public WebElement cityField;

	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;
	
	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	@FindBy(xpath = "//button[normalize-space()='Edit']")
	public WebElement editAddressButton;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateAddressButton;
	
	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpdatedSuccessfully;
	
    @FindBy(xpath = "//button[normalize-space()='Remove']")
    public WebElement removeAddressButton;
    
    
    

    
    
    
}
