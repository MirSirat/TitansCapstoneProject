package step.Definition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtilities;

public class RetailStepDefinition extends Base {

	RetailPageObject retail = new RetailPageObject();

	public RetailStepDefinition() throws IOException {

	}

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(retail.isTestEnvironmentLogoPresent());
		logger.info("user is on retail website");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click  on MyAccount")
	public void user_click_on_my_account() {
		retail.clickOnMyAccount();
		logger.info("user clicked on myAccount");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnloginOption();
		logger.info("user clicked on login option");

	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		retail.enterUserNameAndPassword(string, string2);
		logger.info("user entered user name and password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retail.loginButton();
		logger.info("user clicked on login button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(retail.isMyAccountDashboardpresent());
		logger.info("user logged in to my account dashboard");
		WebDriverUtilities.takeScreenShot();
	}

	@When("User click on register {string} link")
	public void user_click_on_register_link(String string) {
		retail.registerForAnAffiliateAccount();
		logger.info("user clicked on register for affiliate accountlink");

	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> affiliateInfo = dataTable.asMaps(String.class, String.class);
		retail.enterCompanyName(affiliateInfo.get(0).get("company"));
		retail.enterWebSiteValue(affiliateInfo.get(0).get("website"));
		retail.taxIdField(affiliateInfo.get(0).get("taxID"));
		retail.selectPaymentMethod(affiliateInfo.get(0).get("paymentMethod"));
		retail.enterChequePayeeName(affiliateInfo.get(0).get("payeeName"));
		logger.info("User filled affiliate form");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickOnAboutUs();
		logger.info("User checked on About us check box");

	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.clickOnContinueButton();
		logger.info("User clicked on Continue button");

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retail.successUpdatedMessage());
		logger.info("User should see a success message");
		WebDriverUtilities.takeScreenShot();
	}

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retail.clickOnEditAffiliateInfo();
		logger.info("User clicked on Edit your affiliate informationlink");

	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.clickOnBanktransferButton();
		logger.info("user clicked on Bank Transfer radio button");
	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> EditAffiliateInfo = dataTable.asMaps(String.class, String.class);
		retail.bankNameField(EditAffiliateInfo.get(0).get("bankName"));
		retail.bankBranchNumberField(EditAffiliateInfo.get(0).get("abaNumber"));
		retail.bankSwiftCodeField(EditAffiliateInfo.get(0).get("swiftCode"));
		retail.bankAccountNameField(EditAffiliateInfo.get(0).get("accountName"));
		retail.bankAccountNumberField(EditAffiliateInfo.get(0).get("accountNumber"));
		logger.info("User filled Bank information");
		WebDriverUtilities.takeScreenShot();

	}

	@And("User click on {string} link")
	public void user_click_on_link(String string) {
		retail.clickOnEditYourAccountInfo();
		logger.info("User clicked on edit your account link");
	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> EditYourAccountInfo = dataTable.asMaps(String.class, String.class);
		retail.firstNamefield(EditYourAccountInfo.get(0).get("firstName"));
		retail.lastNameField(EditYourAccountInfo.get(0).get("lastName"));
		retail.emailField(EditYourAccountInfo.get(0).get("email"));
		retail.telephoneNumberField(EditYourAccountInfo.get(0).get("telephone"));
		logger.info("User modified information");
		WebDriverUtilities.takeScreenShot();

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(retail.isyourAccountHasBeenSuccessfullyUpdated());
		logger.info("User should see a message");
		WebDriverUtilities.takeScreenShot();

	}

}
