package step.Definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.WebDriverUtilities;

public class HomePageStepDefinition extends Base {
	HomePageObject homePage = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrency();
		logger.info("User clicked on Currency");

	}

	@And("User Choose Euro from dropdown")
	public void user_choose_euro_from_dropdown() {
		homePage.clickOnEuroCurrency();
		logger.info("User Chose Euro from dropdown");

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homePage.isCurrencyValueEuroPresent());
		logger.info("currency value should be changed to Euro");
		WebDriverUtilities.takeScreenShot();

	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickOnShoppingCart();
		logger.info("User clicked on shopping cart");

	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		Assert.assertTrue(homePage.isMessageYourShoppingCartIsEmptyPresent());
		logger.info("Your shopping cart is empty message should be displayed");
		WebDriverUtilities.takeScreenShot();

	}

}
