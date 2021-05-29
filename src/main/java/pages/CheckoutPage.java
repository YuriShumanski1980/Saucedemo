package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public static final By CHECKOUT_BUTTON = By.xpath("//*[@id='checkout']");
    public static final By INPUT_FIRST_NAME = By.xpath("//*[@id='first-name']");
    public static final By INPUT_LAST_NAME = By.xpath("//*[@id='last-name']");
    public static final By INPUT_CODE = By.xpath("//*[@id='postal-code']");
    public static final By CHECKOUT_CONTINUE_BUTTON = By.xpath("//*[@id='continue']");
    public static final By CHECKOUT_FINISH_BUTTON = By.xpath("//*[@id='finish']");
    public static final By CHECKOUT_FINISH_MESSAGE = By.xpath("//*[contains(text(),'THANK YOU FOR YOUR ORDER')]");
    public static final By CHECKOUT_BACK_HOME_BUTTON = By.xpath("//*[@id='back-to-products']");

    public CheckoutPage clickCheckoutButton() {
        driver.findElement(CHECKOUT_BUTTON).click();
        return this;
    }

    public CheckoutPage inputCredsToFields(String firstname, String lastname, String code) {
        driver.findElement(INPUT_FIRST_NAME).sendKeys(firstname);
        driver.findElement(INPUT_LAST_NAME).sendKeys(lastname);
        driver.findElement(INPUT_CODE).sendKeys(code);
        driver.findElement(CHECKOUT_CONTINUE_BUTTON).click();
        return this;
    }

    public CheckoutPage clickFinishButton() {
        driver.findElement(CHECKOUT_FINISH_BUTTON).click();
        return this;
    }

    public CheckoutPage getFinishCheckoutMessageText() {
        driver.findElement(CHECKOUT_FINISH_MESSAGE).getText();
        return this;
    }

    public CheckoutPage clickBackHomeButton() {
        driver.findElement(CHECKOUT_BACK_HOME_BUTTON).click();
        return this;
    }
}