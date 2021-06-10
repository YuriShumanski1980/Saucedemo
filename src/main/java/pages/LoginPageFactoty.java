package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactoty extends BasePage {
    public LoginPageFactoty(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@data-test='username']")
    WebElement usernameInput;

    @FindBy(xpath = "//*[@data-test='password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(id = "error-message-container error")
    WebElement errorButtonTest;

    @FindBy(id = "bot_column-button")
    WebElement botLogo;


}
