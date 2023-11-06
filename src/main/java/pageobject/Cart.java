package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {

    @FindBy(xpath = "//div[@id='shopping_cart_container']//a[contains(@class, 'shopping_cart_link')]")
    public static WebElement cartButtonWebElement;

    @FindBy(linkText = "CHECKOUT")
    public static WebElement checkOutButtonWebElement;

    @FindBy(xpath = "//input[@id='first-name']")
    public static WebElement firstNameInputWebElement;

    @FindBy(xpath = "//input[@id='last-name']")
    public static WebElement lastNameInputWebElement;

    @FindBy(xpath = "//input[@id='postal-code']")
    public static WebElement zipCodeInputWebElement;

    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement continueButtonWebElement;
}