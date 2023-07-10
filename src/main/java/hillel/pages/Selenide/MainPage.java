package hillel.pages.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class MainPage {
    private SelenideElement fileDownload = $(By.linkText("File Download"));
    private SelenideElement fileUpload = $(By.linkText("File Upload"));
    private SelenideElement dynamicLoading = $(By.linkText("Dynamic Loading"));
    public DownLoadPage goFileDownload() {
        fileDownload.click();
        return new DownLoadPage();
    }

    public UploadPage goFileUpload() {
        fileUpload.click();
        return new UploadPage();
    }
    public DynamicallyLoadedPage goDynamicallyLoadedPage() {
        dynamicLoading.click();
        return new DynamicallyLoadedPage();
    }
}
