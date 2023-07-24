package tests.seleniumLocators;

import hillel.listeners.CustomExtentReportListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(CustomExtentReportListener.class)
public class BasisTests {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/ExtentHtml.html");
    }

    WebDriver driver = new ChromeDriver();
    @BeforeTest

    public  void startDriver () {
        WebDriverManager.chromedriver().setup();;
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterTest (alwaysRun = true)
    public void  closeDriver() {
        driver.quit();
    }


}
