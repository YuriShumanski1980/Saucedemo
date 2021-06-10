package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends HeaderPage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public static final String ADD_TO_CART_OR_REMOVE_BUTTON = "//*[text() = '%s']/ancestor::*[@class = 'inventory_item']//button";
    public static final String BUTTONS_QUANTITY = "//*[@class = 'inventory_item']//button";

    @Step("Add product {productName} to cart")
    public ProductsPage addProductToCart(String productName) {
        driver.findElement(By.xpath(String.format(ADD_TO_CART_OR_REMOVE_BUTTON, productName))).click();
        return this;

    }

    public boolean isButtonAddToCartOnScreen() {
        return driver.findElement(By.xpath(BUTTONS_QUANTITY)).isDisplayed();
    }
}