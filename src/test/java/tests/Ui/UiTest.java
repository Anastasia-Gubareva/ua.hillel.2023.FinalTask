package tests.Ui;

import com.codeborne.selenide.WebDriverRunner;
import hillel.Ui.MainPage;
import hillel.Ui.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;

public class UiTest extends BaseTest {
    static String title = "My new jod QA";
    static String description = "manual testing, automation ui and app";
    static String price = "55555";
    static String comment = "This is a good job";


    @Test(priority =  10, description = "рестрация користувачв")
    public void registerProfile() {
        new MainPage().goToRegisterPage()
                .setUsername(login).setName("Cool").setLastName("Super")
                .setPassword(pass).setConfirmPassword(pass)
                .clickRegisterButton();
    }

    @Test(priority = 20, description = "логиінимся та зберегаєм зміни в профілі")
    public void loginAndChangeProfile() throws InterruptedException {
        login().clickIconInput().clickProfileButton();
        setAndCheck(new ProfilePage(), "Nastya1", "Nastya111");
        setAndCheck(new ProfilePage(), "Nastya2", "Natya222");
    }
    void setAndCheck(ProfilePage page, String first, String last) {
        String pageText = page.clickButtonEditInfo().inputName(first)
                .inputLastName(last).clickUpdateButton().getPageName();
        Assert.assertTrue(pageText.contains(first + " " + last));
    }


    @Test(priority = 30, description = "додаємо оголошення про роботу")
    public void addJob() throws InterruptedException {
        title += new Random().nextInt();
        login().clickIconInput().clickProfileButton()
                .clickAddJobButton()
                .setTitle(title).setDescription(description).setPrise(price).clickLCreateJobButton();

        Assert.assertEquals(new ProfilePage().getCreatedTitle(),title);
        Assert.assertEquals(new ProfilePage().getCreatedDescription(), description);
        Assert.assertEquals(new ProfilePage().getCreatedPrice(), "Price " + price);
    }

    @Test(priority = 40, description = "додаємо коментар")
    public void addComment() {
        login().clickViewInfoButton().setCommentInput(comment).clickCommentButton()
                .clickCloseJobDetailsButton();
        Assert.assertEquals(new MainPage().clickViewInfoButton().getCreatedComment(), comment);
    }
    @Test(priority = 50, description = "видаляємо оголошення про роботу" )
    public void deleteJob() throws InterruptedException {
        login().clickIconInput().clickProfileButton();
        String numberJob = new ProfilePage().getCreatedJobs();
        String numberComments = new ProfilePage().getCreatedComment();
        System.out.println(numberJob + "  and  " + numberComments);
        new ProfilePage().deleteJob();
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.switchTo().alert().accept();
        new ProfilePage().makeScrollJobs();
    }
}
