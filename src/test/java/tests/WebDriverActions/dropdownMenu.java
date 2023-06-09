package tests.WebDriverActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdownMenu {

    WebDriver driver = new ChromeDriver();

    @BeforeTest

    public void startPage() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

    }
    @Test
    public  void dropdownMenu () {
        Actions actions = new Actions(driver);

            WebElement dropdownMenu = driver.findElement(By
                    .xpath("//a[@class='dropdown-toggle' and contains(text(), 'Dropdown ')]"));
            WebElement secondaryMenu = driver.findElement(By
                    .xpath("//a[@class='dropdown-toggle' and contains(text(), 'Secondary Menu ')]"));
            WebElement secondaryAction = driver.findElement(By
                    .xpath("//a[@onclick='handleSecondaryAction()']"));

        actions.moveToElement(dropdownMenu)
                .moveToElement(secondaryMenu)
                .moveToElement(secondaryAction)
                .click().perform();;

        Assert.assertEquals(driver.findElement(By.xpath(".//*[text()='Secondary Page']"))
                .getText(), "Secondary Page");
    }
    @AfterTest(alwaysRun = true)
    public void  closeDriver() {
        driver.quit();
    }
}



