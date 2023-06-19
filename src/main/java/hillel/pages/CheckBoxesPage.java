package hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class CheckBoxesPage extends BasePage {

    @FindBy(xpath = "//input[1]")
    private WebElement box1;

    @FindBy(xpath = "//input[2]")
    private WebElement box2;

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckBoxesPage checkBoxTest() {
        if (box1.isSelected()) {
            System.out.println( "CheckBox1 обрано");
        } else {
            System.out.println( "CheckBox1 не обрано");
            box1.click();
        }
        if (box2.isSelected()) {
            System.out.println( "CheckBox2 обрано");
        } else {
            System.out.println("CheckBox2 не обрано");
            box2.click();
        } return this;

    }
}

