package tests.selenide;
import com.codeborne.selenide.Configuration;
import hillel.listeners.CustomExtentReportListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@Listeners({ CustomExtentReportListener.class})
public class BaseTestSelenide {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/ExtentHtml.html");
    }
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
