package step.Definition;

import java.io.IOException;
import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtilities;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject();

	public LaptopNoteBooksStepDefinition() throws IOException {

	}

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptop.clickOnLaptopAndNoteBook();
		logger.info("user clicked on Laptop and NoteBook");

	}

	@And("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptop.clickOnShowAllLaptopAndNoteBook();
		logger.info("user clicked on show all Laptop and NoteBook");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptop.clickOnMacBook();
		logger.info("user clicked on MacBook item");

	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		laptop.clickOnAddToCartButton();
		logger.info("user clicked on add to Cart button");

	}

	@Then("User should see {string} item\\(s) {string} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(String string, String string2) {
		Assert.assertTrue(laptop.successMessageToYourShoppingCart(string, string2));
		logger.info("User should see 1 item added to the cart");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptop.totalCart();
		logger.info("User clicked on cart option");

	}

	@And("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptop.clickOnRemoveButton();
		logger.info("User clicked on red X button");

	}

	@Then("item should be removed and cart should show {string} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(String string) {
		logger.info("Item should be removed and cart should show 0 item");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptop.clickOnComparisonIconOnMacBook();
		logger.info("User clicked on product comparison icon on MacBook");

	}

	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptop.clickOnComparisonIconOnMacBookAir();
		logger.info("User clicked on product comparison icon on MacBook Air");

	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptop.clickOnProductComparisonLink();
		logger.info("User clicked on Product comparison link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(laptop.ProductComparisonChart());
		logger.info("User should see product Comprison chart");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptop.clickOnHeartIcon();
		logger.info("user clicked on heart icon");

	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		Assert.assertTrue(laptop.mustLoginMessage());
		logger.info("User should get a message");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		laptop.clickOnMacBookPro();
		logger.info("User should see the price tag");

	}

	@Then("User should see  {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		Assert.assertTrue(laptop.priceValue());
		logger.info("User should see price tag");

	}
}
