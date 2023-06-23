package hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDOM;
    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthentication;
    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxes;
    @FindBy(linkText = "Hovers")
    private WebElement hovers;
    @FindBy(linkText = "File Download")
    private WebElement DownloadFile;
    @FindBy(linkText = "File Upload")
    private WebElement UploadFile;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ButtonClickChallenging goChallengingDOM() {
        clickButton(challengingDOM);
        return new ButtonClickChallenging(driver);
    }

    public LoginPage goToLogInPage() {
        clickButton(formAuthentication);
        return new LoginPage(driver);
    }

    public CheckBoxesPage goToCheckBoxPage() {
        clickButton(checkboxes);
        return new CheckBoxesPage(driver);
    }

    public UserTestHovers goToHowers() {
        clickButton(hovers);
        return new UserTestHovers(driver);
    }
    public DownloadPage goToDownloadPage(){
        DownloadFile.click();
        return  new DownloadPage(driver);
    }
    public UploadPage goToUploadPage(){
        UploadFile.click();
        return new UploadPage(driver);
    }
}
