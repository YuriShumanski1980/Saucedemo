package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCart() {
        loginPage
                .openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Onesie");
        cartPage.openPage();
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Onesie"), "$7.99");
    }

    @Test
    public void productQuantityCart() {
        loginPage
                .openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Onesie");
        cartPage.openPage();
        Assert.assertEquals(cartPage.getProductQuantity("1"), "1");
    }
}