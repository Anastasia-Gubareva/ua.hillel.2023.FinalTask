package tests.seleniumLocators;

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

        List<String>  tableValues = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            tableValues.add(driver.findElement(By.xpath("//tr/td[4]")).getText());
        }
        System.out.println(tableValues);

    }

}