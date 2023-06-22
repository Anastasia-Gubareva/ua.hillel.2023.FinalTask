package tests.pageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public final class WorkFileTest extends BaseTest{

    @Test
    public void downloadAndChangeFile() throws  IOException, InterruptedException {
        openMainPage().goToDownloadPage()
                .downloadFile();
        waitForPreparation();

        File filesInFolder = new File("target/downloads");
        File[] files = filesInFolder.listFiles();
        for (File file : files) {

            List<String> lines = Files.readAllLines(file.toPath());
            lines.add("Слава Україні!");
            lines.add("Героям Слава!");

            Files.write(file.toPath(), lines);
        }
    }

    @Test
    public void uploadFile() throws InterruptedException {
        waitForPreparation();
        Assert.assertTrue(openMainPage().goToUploadPage()
                .uploadFile().checkResult().contains("File Uploaded!"));
    }
}