package tests.seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends BasisTests {

    @Test
    public void CheckBoxTest() {

        driver.findElement(By.linkText("Checkboxes")).click();
        WebElement box1 = driver.findElement(By.xpath("//input[1]"));
        WebElement box2 = driver.findElement(By.xpath("//input[2]"));

        if (box1.isSelected()) {
            System.out.println( "CheckBox1 обрано");
        } else {
            System.out.println( "CheckBox1 не обрано");
            box1.click();
        }
        if (box2.isSelected()) {
            System.out.println( "CheckBox2 обрано");
        } else {
            System.out.println("CheckBox2 не обрано");
           box2.click();
        }
    }
}

