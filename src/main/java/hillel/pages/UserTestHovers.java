package hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
public class UserTestHovers extends BasePage {

    @FindBy(css = ".figure")
    private List<WebElement> profiles;
    @FindBy(tagName = "h5")
    private List<WebElement> userNames;

    public UserTestHovers(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public UserTestHovers displayUser() {
        for (WebElement profile : profiles) {
            actions.moveToElement(profile).perform();
            for (WebElement userName : userNames) {
                System.out.println(userName.getText().replaceAll("name:", ""));
            }
        }
        return this;
    }
}