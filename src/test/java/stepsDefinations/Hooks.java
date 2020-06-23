package stepsDefinations;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.junit.After;
import org.junit.Assume;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.BrowserType.CHROME;

public class Hooks {
    @BeforeEach
    public void launchBrowser() {
        System.setProperty("selenide.browser", CHROME);
    }

    @Before
    public void openBackOffice() {
        open("https://www.liepu.lv");
    }

    @Before("@skip_scenario")
    public void skip_scenario(Scenario scenario) {
        System.out.println("SKIP SCENARIO: " + scenario.getName());
        Assume.assumeTrue(false);
    }
    @After
    public void closeBrowser() {
        close();
        System.out.println("CLOSE BROWSER");

    }

}