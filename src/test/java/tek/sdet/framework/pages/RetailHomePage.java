package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
		@FindBy(xpath = "//a[text()='TEKSCHOOL']")
		public WebElement tekSchoolLogo;
		
	    @FindBy(id = "signinLink")
	    public  WebElement signin ;

		@FindBy(id = "search")
		public WebElement allDepartmentDropDown;

		@FindBy(css = "#searchInput")
		public WebElement searchBar;

//		@FindBy(xpath = "//button[@id='searchBtn']")
//		public WebElement searchButton;

		@FindBy(linkText = "Sign in")
		public WebElement signInButton;

		@FindBy(id = "cartBtn")
		public WebElement cartButton;

		@FindBy(xpath = "//img[contains(@alt, 'Pokemon')]")
		public WebElement pokemanProductImage;

		@FindBy(xpath = "//a[text()='Account']")
		public WebElement accountOption;

		@FindBy(xpath = "//button[@id='hamburgerBtn']//*[name()='svg']")
		public WebElement allIcon;

		@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
		public List<WebElement> sideBarElements;

		@FindBy(xpath = "//span[text()='Electronics']")
		public WebElement electronicsSideBar;

		@FindBy(xpath = "//span[normalize-space()='Electronics']")
		public WebElement computersSideBar;

		@FindBy(xpath = "//span[text()='Smart Home']")
		public WebElement smartHomeSideBar;

		@FindBy(xpath = "//span[text()='Sports']")
		public WebElement sportsSideBar;

		@FindBy(xpath = "//span[text()='Automative']")
		public WebElement automativeSideBar;

		@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
		public List<WebElement> sideBarOptionElements;
		
	    @FindBy(id = "search")
	    public WebElement allDepartments;
	    
	    @FindBy(xpath="//span[text()='Smart Home']")
	    public WebElement Smarthome;
	    
	    
	    @FindBy(id = "searchInput")
	    public WebElement searchInputField;
	    
	    @FindBy(id = "searchBtn")
	    public WebElement searchButton;
	    
	    @FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
	    public WebElement Kasa;
	    
	    
	    @FindBy(css="select.product__select")
	    public WebElement Quantity;
	    
	    
	    @FindBy(xpath="//option[text()='2']")
	    public WebElement quantity2;
	   
	    
	    @FindBy(id="addToCartBtn")
	    public WebElement AddToCart;
	    
	    @FindBy(id="cartBtn")
	    public WebElement cartBtn;
	    
	    @FindBy(xpath="//input[@id='email']")
	    public WebElement emailField;
	    
	    @FindBy(xpath="//input[@id='password']")
	    public WebElement passwordField;
	    
	    @FindBy(xpath="//button[@id='loginBtn']")
	    public WebElement loginField;
	    
	    @FindBy(xpath="//option[text()='2']")
	    public WebElement quantityy;
	    
	    @FindBy(xpath="//p[normalize-space()='Cart']")
	    public WebElement CartButtonOnTop;
	    
	    @FindBy(xpath="//button[@id='proceedBtn']")
	    public WebElement proceedToCheckout;
	    
	    @FindBy(xpath = "//button[@id='addAddressBtn']")
	    public WebElement addNewAddessButton;
	    
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
	    
		@FindBy(id = "//button[@id='placeOrderBtn']")
		public WebElement placeOrderButton;
		
		@FindBy(id = "//div[contains(text(),'Order Placed Successfully']")
		public WebElement placedYourOrderSuccessfully;
		
		
	}


