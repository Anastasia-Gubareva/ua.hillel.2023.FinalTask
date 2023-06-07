package tests.seleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasisTests {

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
