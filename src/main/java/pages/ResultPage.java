package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ResultPage {

    public void checkElement(String repository) {
        $(String.format("a[href =\"%s\"]", repository)).shouldBe(Condition.visible);
    }

    public void goToRepository(String repository) {
        $(String.format("a[href =\"%s\"]", repository)).click();
    }
}
