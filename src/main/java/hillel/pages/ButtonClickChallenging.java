package hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class ButtonClickChallenging extends BasePage  {

        @FindBy(css = "div a:nth-of-type(1).button")
        private WebElement button1;
        @FindBy(css = ".button.alert")
        private WebElement button2;
        @FindBy(css = ".button.success")
        private WebElement button3;
        @FindBy(css = "table tr td:nth-child(4)")
        private List<WebElement> tableValues;


    public ButtonClickChallenging(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ButtonClickChallenging clickButtons() {
        button1.click();
        button2.click();
        button3.click();
     return this;
    }
        public void showValuesColum(){
            for (WebElement tableElement : tableValues) {
                System.out.println(tableElement.getText());
            }
        }


}
