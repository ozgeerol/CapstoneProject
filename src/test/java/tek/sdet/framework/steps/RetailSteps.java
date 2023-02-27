package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();


	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}


	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar,productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product" + productValue);
	WebElement s = getDriver().findElement(By.xpath("//select[@name='state']"));
	}

	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
        logger.info("the Product is displayed on home page");
	}
	
	@When("User click on All section and User on Electronics")
	public void userClickOnAllSectionAndUserOnElectronics() {
	  click(factory.homePage().allIcon);
	  click(factory.homePage().electronicsSideBar);
	  logger.info("user clicked on All section");
		
		
	}
	@When("User click on All section and User on Computers")
	public void userClickOnAllSectionAndUserOnComputers() {
		click(factory.homePage().allIcon);
		  click(factory.homePage().computersSideBar);
	
	}
	@When("User click on All section and User on Smart Home")
	public void userClickOnAllSectionAndUserOnSmartHome() {
		 click(factory.homePage().allIcon);
		  click(factory.homePage().smartHomeSideBar);	}

	

@When("User click on All section and User on Sports")
public void userClickOnAllSectionAndUserOnSports() {
	click(factory.homePage().allIcon);
	  click(factory.homePage().sportsSideBar);	}


	
	@When("User click on All section and User on Automotive")
	public void userClickOnAllSectionAndUserOnAutomotive() {
		 click(factory.homePage().allIcon);
		  click(factory.homePage().automativeSideBar);
	}


	
	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);

		List<WebElement> actualSideBar = factory.homePage().sideBarElements;

		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
		}
		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
		logger.info("actual is equal to expected");

	}

	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}

		}

	}

}











