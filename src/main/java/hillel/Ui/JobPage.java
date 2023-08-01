package hillel.Ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class JobPage {
    private SelenideElement commentInput = $x("//textarea[@formcontrolname='message']");
    private SelenideElement leaveCommentButton = $x("//span[text()=' Leave comment ']");
    private SelenideElement closeJobDetailsButton = $x("//span[text()='Close job details']");
    private SelenideElement createdComment = $x("//div[@class='comments']//mat-card-content[@class='mat-card-content']/p");


    public JobPage setCommentInput(String comment) {
        commentInput.shouldBe(Condition.visible).setValue(comment);
        return this;
    }

    public JobPage clickCommentButton() {
        leaveCommentButton.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPage clickCloseJobDetailsButton() {
        closeJobDetailsButton.shouldBe(Condition.visible).click();
        return new MainPage();
    }

    public String getCreatedComment() {
        return createdComment.shouldBe(Condition.visible).text();
    }
}
