package tests.WebDriverActions;
import hillel.listeners.CustomExtentReportListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.List;

@Listeners(CustomExtentReportListener.class)
public class UserNameTest {

    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/ExtentHtml.html");
    }
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void startPage() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");
    }
    @Test
    public void displayUsernames() {

       Actions actions = new Actions(driver);

        List<WebElement> userProfiles = driver.findElements(By.cssSelector(".figure"));

        for (WebElement userProfile : userProfiles) {
            actions.moveToElement(userProfile).pause(100).perform();

            String userName = userProfile.findElement(By.tagName("h5")).getText();
            System.out.println(userName.replace("name: ", ""));
        }
    }
    @AfterTest(alwaysRun = true)
    public void  closeDriver() {
        driver.quit();
    }
}