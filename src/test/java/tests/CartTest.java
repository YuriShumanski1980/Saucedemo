package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {
        loginPage
                .openPage()
                .login(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                        System.getenv().getOrDefault("password", PropertyReader.getProperty("password")))
                .addProductToCart("Sauce Labs Onesie");
        cartPage.openPage();
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Onesie"), "$7.99");
    }

    @Test
    public void productQuantityCartTest() {
        loginPage
                .openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Onesie");
        cartPage.openPage();
        Assert.assertEquals(cartPage.getProductQuantity("1"), "1");
    }
}
//"standard_user", "secret_sauce"
//username="standard_user"
//password="secret_sauce"