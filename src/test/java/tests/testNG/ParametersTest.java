package tests.testNG;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
    @Test (groups = "login")
    @Parameters({"url", "browser"})
    public void parametersTest (@Optional("Url Google.com") String url, @Optional("Browser Chrome") String browser)  {
        System.out.println("Test started : " + url + " " + " " + browser);
    }
}