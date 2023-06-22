package hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;

public class UploadPage extends BasePage {
    @FindBy(id = "file-upload")
    private WebElement chooseFileButton;
    @FindBy(id = "file-submit")
    private WebElement uploadButton;
    @FindBy(tagName = "h3")
    private static WebElement  checkUpload ;
    public UploadPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public UploadPage uploadFile(){
        File[] file  = new File("target/downloads").listFiles();
        chooseFileButton.sendKeys((CharSequence) file[0].getAbsolutePath());
        uploadButton.click();
        return this;
    }
    public String checkResult(){
        return checkUpload.getText();
    }
}