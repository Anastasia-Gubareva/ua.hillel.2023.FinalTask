package tests.seleniumLocators;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BasisTests {


    @Test

    public void validLogin () {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".success")).getText().contains("You logged into a secure area!"));
    }

    @Test
    public  void invalidLogin () {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("input#username")).sendKeys("fall");
        driver.findElement(By.cssSelector("input#password")).sendKeys("123456!");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".error")).getText().contains("Your username is invalid!"));
    }


}
