package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currncy;

	public void clickOnCurrency() {
		currncy.click();
	}

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement EuroCurrency;

	public void clickOnEuroCurrency() {
		EuroCurrency.click();
	}

	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencyValueEuro;

	public boolean isCurrencyValueEuroPresent() {
		if (currencyValueEuro.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(id = "cart-total")
	private WebElement shoppingCart;

	public void clickOnShoppingCart() {
		shoppingCart.click();
	}

	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement messageYourShoppingCartIsEmpty;

	public boolean isMessageYourShoppingCartIsEmptyPresent() {
		if (messageYourShoppingCartIsEmpty.isDisplayed())
			return true;
		else
			return false;
	}

}
