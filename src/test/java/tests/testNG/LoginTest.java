package tests.testNG;

import org.testng.annotations.*;

public class LoginTest {

    @BeforeMethod(groups = "login")
    public void openBrowser () {
            System.out.println("Open browser, open login form");
            }
    @Test(dataProvider = "userProvider", groups = "login")
    public void loginTest(String username, String password, String role) {
        System.out.println("Test for user  " + username + " with password  " + password + "  role  " + role );
    }

    @DataProvider(name = "userProvider")
    public Object[][] getDataFromDataProvider() {
        Object[][] user = {
                { "adminName", "11111d", "admin" },
                { "userName1", "22222", "user" },
                { "guestName", "guest", "guest" },
                { "userName2", "", "user"}
        };
        return user;
    }
    @AfterMethod(groups = "login")

    public void cleanAll () {
        System.out.println("Clean all and close browser");
    }

}
