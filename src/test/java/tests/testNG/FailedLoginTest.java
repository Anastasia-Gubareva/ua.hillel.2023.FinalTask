package tests.testNG;

import org.testng.annotations.Test;

public class FailedLoginTest extends LoginTest{
    @Test(dataProvider = "userProvider", dependsOnGroups = "login")
    public void failedTest(String user, String pass, String role) {
        if (pass.equals("")) {
            throw new RuntimeException("Test failed! this user " + user + " hasn't password! ");
        }
    }
}

