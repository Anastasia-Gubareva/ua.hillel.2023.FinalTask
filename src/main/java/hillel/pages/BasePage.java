package hillel.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    public JavascriptExecutor javascriptExecutor;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        javascriptExecutor = (JavascriptExecutor) driver;
    }
    public void clickButton(WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }

    public void setText(WebElement input, String text){
        input.clear();
        input.sendKeys(text);
    }
}