package hillel.Ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement loginField = $x("//input[@id='mat-input-0']");
    private final SelenideElement passwordField = $x("//input[@id='mat-input-1']");
    private final SelenideElement loginButton = $x("//span[@class='mat-button-wrapper']");

    public LoginPage loginInput(String login) {
        loginField.shouldBe(Condition.visible).sendKeys(login);
        return this;
    }

    public LoginPage passwordInput(String password) {
        passwordField.shouldBe(Condition.visible).sendKeys(password);
        return this;
    }

    public MainPage clickLoginButton() {
        loginButton.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
