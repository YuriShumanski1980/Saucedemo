package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final By USERNAME_INPUT = By.xpath("//*[@data-test='username']");
    public static final By PASSWORD_INPUT = By.xpath("//*[@data-test='password']");
    public static final By LOGIN_BUTTON = By.xpath("//*[@id='login-button']");
    public static final By ERROR_BUTTON_TEXT = By.xpath("//*[@class='error-message-container error']");
    public static final By BOT_LOGO = By.xpath("//*[@id='bot_column-button']");
    public static final String URL = "https://www.saucedemo.com/";


    @Step("Fill in {username} & {password} in Login field")
    public ProductsPage login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new ProductsPage(driver);
    }

    public String getErrorText() {
        return driver.findElement(ERROR_BUTTON_TEXT).getText();
    }

    @Step("Opening Login Page")
    public LoginPage openPage() {
        driver.get(URL);
        return this;
    }
}