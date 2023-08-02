package tests.Api;

import hillel.Api.AuthController;
import hillel.entities.Auth;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

public class BaseTestApi {
    private static String login = "Nastya";
    private static String pass = "T.=;85H.s-b#n5z";
    Auth auth;

    @BeforeMethod
    void setup() throws IOException {
        Auth auth = new Auth(login, pass);
        AuthController authController = new AuthController();
        this.auth = authController.signIn(auth);
    }
}
