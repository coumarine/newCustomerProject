import io.cucumber.java.en.Given;

public class Stepdefs {
    openPage OpenPage;

    @Given("open url using {string}")
    public void openUrlUsingBrowser(String browserType) {
        OpenPage.openBrowser(browserType);
    }
}
