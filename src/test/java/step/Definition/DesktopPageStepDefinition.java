package step.Definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.WebDriverUtilities;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktop = new DesktopPageObject();

	public DesktopPageStepDefinition() {

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickOnDesktopsTubs();
		logger.info("User clicked on Destops tab");

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.clickOnAllDesktops();
		logger.info("Ueer clicked on show all desktops");

	}

	@Then("User should see all items are present in Desktop page")
	public void User_should_see_all_items_are_present_in_Desktop_page() {
		Assert.assertTrue(desktop.allItemsArePresentInDesktopsTab());
		logger.info("User should see all items are present in Desktop page");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktop.ClickOnAddToCartOption();
		logger.info("User click on add to cart option on HP LP3065item");

	}

	@And("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktop.selectQuantity(string);
		logger.info("User select quantity");

	}

	@And("User click  ADD TO CART option on Canon EOS {string}")
	public void user_click_add_to_cart_option_on_canon_eos(String string) {
		desktop.clickOnAddToCardOptions();
		logger.info("User clicked add to cart option on Canon EOS");

	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktop.selectColorFromDropDown();
		logger.info("User select color from dropdown");
		WebDriverUtilities.takeScreenShot();
	}

	@And("User click on Canon EOS5D item")
	public void user_click_on_canon_eos5d_item() {
		desktop.clickOnCanonEOS5DItem();
		logger.info("User clicked on Canon EOS5D");

	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.clickOnWriteAReviewLink();
		logger.info("User clicked on write a review");

	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewerInfo = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(reviewerInfo.get(0).get("yourname"));
		desktop.enterYourReview(reviewerInfo.get(0).get("yourReview"));
		desktop.selectRatingReview();
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click on ContinueButton")
	public void user_click_on_continue_button() {
		desktop.clickOnContinueButton();
		logger.info("User clicked on continue button");

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		Assert.assertTrue(desktop.isMessageThankYouForYourReviewPresent());
		logger.info("User should see a message");
	}

}
