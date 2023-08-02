package tests.Ui;

import com.codeborne.selenide.Configuration;
import hillel.Ui.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import tests.Ui.listener.CustomExtentReportListener;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

@Listeners(CustomExtentReportListener.class)
public class BaseTest {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out","target/extentReport/ExtentHtml.html");
    }
    static String login = "Nastya";
    static String pass = "T.=;85H.s-b#n5z";

    @BeforeMethod
    void setUp() {
        open("https://freelance.lsrv.in.ua/home");
        Configuration.browser = "chrome";
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = false;
        Configuration.downloadsFolder = "target/download/";
        Configuration.timeout = 40000;
    }

    MainPage login() {
        return new MainPage().goToLoginPage().loginInput(login)
                .passwordInput(pass).clickLoginButton();
    }

    @AfterMethod
    void logout() {
        closeWindow();
    }
}
