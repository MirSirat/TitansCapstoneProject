package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsNotebooks;

	public void clickOnLaptopAndNoteBook() {
		LaptopsNotebooks.click();
	}

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebooks;

	public void clickOnShowAllLaptopAndNoteBook() {
		showAllLaptopsNotebooks.click();
	}

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;

	public void clickOnMacBook() {
		macBook.click();
	}

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessageItemAddedToCart;

	public boolean successMessageToYourShoppingCart(String string, String string2) {
		if (SuccessMessageItemAddedToCart.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(id = "cart-total")
	private WebElement cartTotal;

	public boolean cartTotal() {
		if (cartTotal.isDisplayed())
			return true;
		else
			return false;
	}

	public void totalCart() {
		cartTotal.click();
	}

	@FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
	private WebElement RomoveButton;

	public void clickOnRemoveButton() {
		RomoveButton.click();
	}

	@FindBy(id = "cart-total")
	private WebElement shoppingCart0Item;

	public boolean ItemRomoveFromShoppingCart(String string) {
		if (shoppingCart0Item.getText().contains("$0.00"))
			return true;
		else
			return false;

	}

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement macBookComparisonIcon;

	public void clickOnComparisonIconOnMacBook() {
		macBookComparisonIcon.click();
	}

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement macBookAirComparisonIcon;

	public void clickOnComparisonIconOnMacBookAir() {
		macBookAirComparisonIcon.click();
	}

	@FindBy(id = "compare-total")
	private WebElement ProductComparisonlink;

	public void clickOnProductComparisonLink() {
		ProductComparisonlink.click();
	}

	@FindBy(id = "content")
	private WebElement productComparisonChart;

	public boolean ProductComparisonChart() {
		if (productComparisonChart.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "(//button[@type='button'])[23]")
	private WebElement wishList;

	public void clickOnHeartIcon() {
		wishList.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement youMustLoginMessage;

	public boolean mustLoginMessage() {
		if (youMustLoginMessage.isDisplayed())
			return true;
		else
			return false;

	}

	@FindBy(xpath = "(//div[@class='caption'])[4]")
	private WebElement macBookProItem;

	public void clickOnMacBookPro() {
		macBookProItem.click();
	}

	@FindBy(xpath = "(//ul[@class='list-unstyled'])[10]")
	private WebElement priceTag;

	public boolean priceValue() {
		if (priceTag.isDisplayed())
			return true;
		else
			return false;
	}

}
