package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void buySelectedProducts() {
        loginPage
                .openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Onesie")
                .addProductToCart("Sauce Labs Fleece Jacket")
                .addProductToCart("Sauce Labs Bike Light");
        cartPage
                .openPage();
        checkoutPage
                .clickCheckoutButtonPage()
                .inputCredsToFields("Yuri", "Protasov", "password")
                .clickFinishButtonPage()
                .checkFinishInscriptionPage()
                .clickBackHomeButton();
        Assert.assertTrue(productsPage.isButtonAddToCartOnScreen());
    }
}