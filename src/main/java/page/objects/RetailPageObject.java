package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement pageLogo;

	public boolean isTestEnvironmentLogoPresent() {
		if (pageLogo.isDisplayed())
			return true;
		else
			return false;

	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	public void clickOnMyAccount() {
		myAccount.click();
	}

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;

	public void clickOnloginOption() {
		loginOption.click();
	}

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	public void enterUserNameAndPassword(String emailValue, String passwordValue) {
		emailField.sendKeys(emailValue);
		passwordField.sendKeys(passwordValue);
	}

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	public void loginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	public boolean isMyAccountDashboardpresent() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;

	public void registerForAnAffiliateAccount() {
		registerForAnAffiliateAccount.click();
	}

	@FindBy(id = "input-company")
	private WebElement companyField;

	public void enterCompanyName(String companyFieldValue) {
		companyField.sendKeys(companyFieldValue);

	}

	@FindBy(id = "input-website")
	private WebElement webSiteField;

	public void enterWebSiteValue(String webSiteValue) {
		webSiteField.sendKeys(webSiteValue);
	}

	@FindBy(id = "input-tax")
	private WebElement taxIdField;

	public void taxIdField(String taxIdValue) {
		taxIdField.sendKeys(taxIdValue);

	}

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;

	@FindBy(xpath = "//input[@checked='checked']")
	private WebElement paypalButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferButton;

	public void selectPaymentMethod(String paymentType) {
		if (!paymentType.trim().equalsIgnoreCase("cheque")) {
			if (chequeButton.isSelected()) {
				chequeButton.click();
			}
		} else if (paymentType.trim().equalsIgnoreCase("paypal")) {
			paypalButton.click();
		} else
			bankTransferButton.click();
	}

	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameField;

	public void enterChequePayeeName(String chequePayeeNameValue) {
		chequePayeeNameField.sendKeys(chequePayeeNameValue);

	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement aboutUsCheckBox;

	public void clickOnAboutUs() {
		aboutUsCheckBox.click();
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	public void clickOnContinueButton() {
		continueButton.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessfullyMessageOnAffiliatePage;

	public boolean successUpdatedMessage() {
		if (SuccessfullyMessageOnAffiliatePage.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(linkText = "Edit your affiliate information")
	private WebElement editAffiliateInfo;

	public void clickOnEditAffiliateInfo() {
		editAffiliateInfo.click();
	}

	public void clickOnBanktransferButton() {
		bankTransferButton.click();
	}

	@FindBy(id = "input-bank-name")
	private WebElement bankName;

	public void bankNameField(String bankNameValue) {
		bankName.clear();
		bankName.sendKeys(bankNameValue);
	}

	@FindBy(id = "input-bank-branch-number")
	private WebElement branchNumber;

	public void bankBranchNumberField(String bankBranchNumberValue) {
		branchNumber.clear();
		branchNumber.sendKeys(bankBranchNumberValue);
	}

	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCode;

	public void bankSwiftCodeField(String bankSwiftCodeValue) {
		swiftCode.clear();
		swiftCode.sendKeys(bankSwiftCodeValue);
	}

	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;

	public void bankAccountNameField(String bankAccountNameValue) {
		accountName.clear();
		accountName.sendKeys(bankAccountNameValue);
	}

	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;

	public void bankAccountNumberField(String bankAccountNumberValue) {
		accountNumber.clear();
		accountNumber.sendKeys(bankAccountNumberValue);
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInfo;

	public void clickOnEditYourAccountInfo() {
		editYourAccountInfo.click();

	}

	@FindBy(id = "input-firstname")
	private WebElement firstName;

	public void firstNamefield(String firstNameValue) {
		firstName.clear();
		firstName.sendKeys(firstNameValue);
	}

	@FindBy(id = "input-lastname")
	private WebElement lastName;

	public void lastNameField(String lastNameValue) {
		lastName.clear();
		lastName.sendKeys(lastNameValue);
	}

	@FindBy(id = "input-email")
	private WebElement email;

	public void emailField(String emailValue) {
		email.clear();
		email.sendKeys(emailValue);
	}

	@FindBy(id = "input-telephone")
	private WebElement telephoneNumber;

	public void telephoneNumberField(String telephoneNumberValue) {
		telephoneNumber.clear();
		telephoneNumber.sendKeys(telephoneNumberValue);

	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement yourAccountHasBeenSuccessfullyUpdated;

	public boolean isyourAccountHasBeenSuccessfullyUpdated() {
		if (yourAccountHasBeenSuccessfullyUpdated.isDisplayed())
			return true;
		else
			return false;
	}

}
