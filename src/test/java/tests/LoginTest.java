package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginAndPasswordZerroTest() {
        loginPage
                .openPage();
//                .login("yuri", "");
//        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Password is required");
    }

    @Test
    public void checkLoginZerroAndPasswordZerroTest() {
        loginPage
                .openPage()
                .login("", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void checkLoginZerroAndPasswordTest() {
        loginPage
                .openPage()
                .login("", "1234567890");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void checkLoginAndPasswordTest() {
        loginPage
                .openPage()
                .login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isButtonAddToCartOnScreen());
    }
}