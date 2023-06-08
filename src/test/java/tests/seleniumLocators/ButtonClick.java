package tests.seleniumLocators;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;


public class ButtonClick  extends BasisTests{

    @Test
    public void clickAndFindText() {

        driver.findElement(By.linkText("Challenging DOM")).click();
        driver.findElement(By.cssSelector("div a:nth-of-type(1).button")).click();
        driver.findElement(By.cssSelector(".button.alert")).click();
        driver.findElement(By.cssSelector(".button.success")).click();

        List<WebElement> tableValues = driver.findElements(By.cssSelector("table tr td:nth-child(4)"));

        for(WebElement tableElement : tableValues) {
            System.out.println(tableElement.getText());
        }

    }

}