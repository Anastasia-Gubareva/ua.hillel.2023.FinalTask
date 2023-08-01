package hillel.Ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private SelenideElement profileLink = $x("//a[text()='Create account']");
    private SelenideElement loginLink = $x("//a[text()='Log in']");
    private SelenideElement iconInput = $x("//mat-icon[@class='mat-icon notranslate mat-accent material-icons']");
    private SelenideElement profileButton = $x("//div/button[1]");
    private SelenideElement viewInfoButton = $x("//mat-icon[@class ='mat-icon notranslate material-icons mat-icon-no-color']");


    public RegisterPage goToRegisterPage() {
        profileLink.shouldBe(visible).click();
        return new RegisterPage();
    }

    public LoginPage goToLoginPage() {
        loginLink.shouldBe(visible, Duration.ofSeconds(6)).click();
        return new LoginPage();
    }
    public MainPage clickIconInput() throws InterruptedException {
        iconInput.shouldBe(Condition.enabled).click();
        return this;
    }

    public ProfilePage clickProfileButton() {
        profileButton.shouldBe(visible).shouldBe(Condition.enabled).click();
        return new ProfilePage();
    }

    public JobPage clickViewInfoButton() {
        viewInfoButton.shouldBe(visible).shouldBe(Condition.enabled).click();
        return new JobPage();
    }
}
