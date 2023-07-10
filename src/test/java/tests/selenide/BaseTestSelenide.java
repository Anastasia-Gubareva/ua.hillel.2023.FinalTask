package tests.selenide;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTestSelenide {
    @BeforeClass
    public void SetUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.browser = "chrome";
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = false;
        Configuration.downloadsFolder = "target/download/";
        Configuration.timeout = 40000;
        Configuration.browserSize = "maximize";

    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}
