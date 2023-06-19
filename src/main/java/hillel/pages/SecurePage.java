package hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SecurePage extends BasePage {
    @FindBy(css = "a.radius")
    private WebElement LogoutButton;
    @FindBy(css = ".success")
    private WebElement SuccessToast;
    public SecurePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage logoutButton(){
        LogoutButton.click();
        return new LoginPage(driver);
    }

    public String getSuccessToast(){
        return SuccessToast.getText();
    }
}