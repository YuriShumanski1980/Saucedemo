package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginAndPasswordZerro() {
        loginPage.openPage();
        loginPage.login("yuri", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Password is required");
    }

    @Test
    public void checkLoginZerroAndPasswordZerro() {
        loginPage.openPage();
        loginPage.login("", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void checkLoginZerroAndPassword() {
        loginPage.openPage();
        loginPage.login("", "1234567890");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void checkLoginAndPassword() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isButtonAddToCartOnScreen());
    }
}