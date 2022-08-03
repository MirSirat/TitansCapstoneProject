package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;

	public void clickOnDesktopsTubs() {
		desktopsTab.click();
	}

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDestops;

	public void clickOnAllDesktops() {
		showAllDestops.click();
	}

	@FindBy(id = "content")
	private WebElement allItemsArePresent;

	public boolean allItemsArePresentInDesktopsTab() {
		if (allItemsArePresent.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartOption;

	public void ClickOnAddToCartOption() {
		addToCartOption.click();
	}

	@FindBy(id = "input-quantity")
	private WebElement quantity;

	public void selectQuantity(String string) {
		quantity.clear();
		quantity.sendKeys(string);
	}

	@FindBy(id = "button-cart")
	private WebElement addToCartButton;

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartOptions;

	public void clickOnAddToCardOptions() {
		addToCartOptions.click();
	}

	@FindBy(id = "input-option226")
	private WebElement selectColor;

	public void selectColorFromDropDown() {
		Select select = new Select(selectColor);
		select.selectByVisibleText("Red");
	}

	@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
	private WebElement CanonEOS5DItem;

	public void clickOnCanonEOS5DItem() {
		CanonEOS5DItem.click();
	}

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeAReviewLink;

	public void clickOnWriteAReviewLink() {
		writeAReviewLink.click();
	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement yourName;

	public void enterYourName(String string) {
		yourName.sendKeys(string);
	}

	@FindBy(id = "input-review")
	private WebElement yourReview;

	public void enterYourReview(String string) {
		yourReview.sendKeys(string);
	}

	@FindBy(xpath = "(//input[@type='radio'])[5]")
	private WebElement ratingReview;

	public void selectRatingReview() {
		ratingReview.click();
	}

	@FindBy(id = "button-review")
	private WebElement continueButton;

	public void clickOnContinueButton() {
		continueButton.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement thankYOuForYourReview;

	public boolean isMessageThankYouForYourReviewPresent() {
		if (thankYOuForYourReview.isDisplayed())
			return true;
		else
			return false;
	}

}
