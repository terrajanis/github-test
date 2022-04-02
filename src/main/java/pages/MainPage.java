package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement searchInput = $("input[data-test-selector=\"nav-search-input\"]");

    public void search(String text) {
        searchInput.click();
        searchInput.setValue(text);
        searchInput.pressEnter();
    }
}
