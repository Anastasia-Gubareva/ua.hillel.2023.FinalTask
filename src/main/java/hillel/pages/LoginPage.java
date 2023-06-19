package hillel.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {
    @FindBy(css = "input#username")
    private WebElement UsernameInput;
    @FindBy(css = "input#password")
    private WebElement PasswordInput;
    @FindBy(css = ".radius")
    private WebElement LoginButton;
    @FindBy(css = ".error")
    private WebElement ErrorToast;

    public  LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername (String username){
        setText(UsernameInput, username);
        return this;
    }

    public LoginPage setPassword(String password){
        setText(PasswordInput, password);
        return this;
    }

    public SecurePage clickLoginButton(){
        clickButton(LoginButton);
        return new SecurePage(driver);
    }

    public SecurePage validLogin(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        return new SecurePage(driver);
    }

    public LoginPage invalidLogin(String username, String password){
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        return new LoginPage(driver);

    }
    public String getErrorToast(){
        return ErrorToast.getText();
    }
}