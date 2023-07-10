package hillel.pages.Selenide;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;


public class UploadPage {
    private SelenideElement browseButton = $(By.id("file-upload"));
    private SelenideElement uploadButton = $(By.id("file-submit"));

    public UploadPage uploadFile(File file) {
        browseButton.uploadFile(file);
        return new UploadPage();
    }

    public void clickUploadButton() {
        uploadButton.shouldBe(Condition.visible).click();
    }
}
