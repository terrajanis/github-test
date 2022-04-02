import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ResultPage;
public class SearchTest extends BaseTest {

    private String repository = "/terrajanis/ts-ui-test-with-api";

    @Description("Search a repository and check")
    @Test
    public void searchRepository() {
        openMainPage(BASE_URL);
        new MainPage().search(repository);
        ResultPage resultPage =  new ResultPage();
        resultPage.checkElement(repository);
        resultPage.goToRepository(repository);
        String url = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertTrue(url.contains(repository), "Repository doesn't open");
    }
}
