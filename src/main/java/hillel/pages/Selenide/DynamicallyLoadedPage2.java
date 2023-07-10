package hillel.pages.Selenide;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicallyLoadedPage2 {
    private SelenideElement buttonStart = $x("//button[contains(text(),'Start')]");
    private SelenideElement HelloWorld = $x("//h4[contains(text(),'Hello World!')]");

    public DynamicallyLoadedPage2 clickButtonStart2() {
        buttonStart.shouldBe(Condition.visible).click();
        return new DynamicallyLoadedPage2();
    }

    public String getSign2() {
        return HelloWorld.shouldBe(Condition.visible).getText();
    }
}
