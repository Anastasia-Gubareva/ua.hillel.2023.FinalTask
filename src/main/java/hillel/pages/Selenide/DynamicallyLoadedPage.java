package hillel.pages.Selenide;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class DynamicallyLoadedPage {
    private SelenideElement Example1 = $(By.linkText("Example 1: Element on page that is hidden"));
    private SelenideElement Example2 = $(By.linkText("Example 2: Element rendered after the fact"));

    public DynamicallyLoadedPage1 goToExample1 (){
        Example1.shouldBe(Condition.visible).click();
        return new DynamicallyLoadedPage1();
    }
    public DynamicallyLoadedPage2 goToExample2 (){
        Example2.shouldBe(Condition.visible).click();
        return new DynamicallyLoadedPage2();
    }
}
