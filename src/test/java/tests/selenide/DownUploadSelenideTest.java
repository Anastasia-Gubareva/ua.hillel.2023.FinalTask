package tests.selenide;
import com.codeborne.selenide.SelenideElement;
import hillel.pages.Selenide.DynamicallyLoadedPage;
import hillel.pages.Selenide.UploadPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownUploadSelenideTest extends BaseTestSelenide {
    public SelenideElement nameFileElement = $(By.linkText("some-file.txt"));
    public File file;

    @Test(priority = 10)
    public void downLoadTest() throws FileNotFoundException {
        open("/download");
        file = nameFileElement.download();
        //System.out.println(file.getAbsolutePath());
    }

    @Test(priority = 20)
    public void uploadTest() throws IOException {
        open("/upload");
        UploadPage uploadPage = new UploadPage();
        uploadPage.uploadFile(writeToFile(file)).clickUploadButton();
    }

    @Test(priority = 30)
    public void checkDunamicElements1() {
        open("/dynamic_loading");
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        String textCheki1 = dynamicallyLoadedPage.goToExample1().clickButtonStart1().getSign1();
        Assert.assertEquals(textCheki1, "Hello World!");
    }

    @Test(priority = 40)
    public void checkDunamicElements2() {
        open("/dynamic_loading");
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        String textCheki2 = dynamicallyLoadedPage.goToExample2().clickButtonStart2().getSign2();
        Assert.assertEquals(textCheki2, "Hello World!");
    }

    public File writeToFile(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath());
        for (int i = 0; i < 5; i++) {
            lines.add("Слава Україні - Героям Слава! ");
            Files.write(file.toPath(), lines);
        }
        //file.deleteOnExit();
       return file;

    }
}
