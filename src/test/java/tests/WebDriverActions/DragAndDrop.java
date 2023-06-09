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

public class DragAndDrop {
    WebDriver driver = new ChromeDriver();

    @BeforeTest

    public void startPage() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
    }

    @Test
    public void dragDropTest() {
        Actions action =  new Actions(driver);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        action.dragAndDrop(drag, drop).perform();
        Assert.assertEquals(driver.findElement(By.cssSelector("#droppable > p")).getText(), "Dropped!");
    }
    @AfterTest(alwaysRun = true)
    public void  closeDriver() {
        driver.quit();
    }
}