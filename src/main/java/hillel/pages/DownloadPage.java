package hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;



public class DownloadPage extends BasePage {


        @FindBy(linkText = "some-file.txt")
        private List<WebElement> downloadFileTxt;
        public DownloadPage(WebDriver driver){
            super(driver);
            PageFactory.initElements(driver, this);
        }
        public DownloadPage downloadFile(){
            downloadFileTxt.get(0).click();
            return this;
        }

}
