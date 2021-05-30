package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void buySelectedProductsTest() {
        loginPage
                .openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Onesie")
                .addProductToCart("Sauce Labs Fleece Jacket")
                .addProductToCart("Sauce Labs Bike Light");
        cartPage
                .openPage();
        checkoutPage
                .clickCheckoutButton()
                .inputCredsToFields(System.getProperty("firstname"), System.getProperty("lastname"), System.getProperty("code"))
                .clickFinishButton()
                .getFinishCheckoutMessageText()
                .clickBackHomeButton();
        Assert.assertTrue(productsPage.isButtonAddToCartOnScreen());
    }
}
//TODO firstname="Yuri", lastname="Protasov", code="password" - оставил для себя :)
// mvn -Dtest=CheckoutTest -Dfirstname=Yuri -Dlastname=Protasov -Dcode=password test
