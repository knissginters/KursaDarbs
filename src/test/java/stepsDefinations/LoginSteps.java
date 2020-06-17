package stepsDefinations;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Pages;

public class LoginSteps extends Pages {

    @Given("I am in Landing page")
    public void iAmInLandingPage() {
        liepUnilandingPage.validateLandingPage();
    }

    @When("I select Mail icon")
    public void iSelectMailIcon() {
        liepUnilandingPage.clickMoodleIcon();
    }

    @And("I enter invalid username")
    public void iEnterInvalidUsername() {
        moodleLandingPage.enterUsername();
    }

    @And("I enter invalid password")
    public void iEnterInvalidPassword() {
        moodleLandingPage.enterPassword();
    }

    @And("I select submit button")
    public void iSelectSubmitButton() {
        moodleLandingPage.selectSubmitButton();
    }

    @Then("I am navigated to Moodle")
    public void iAmNavigatedToMoodle() {
        moodeleLoginPage.validateMoodleLoginPage();
    }

    @And("I enter valid username")
    public void iEnterValidUsername() {
        moodeleLoginPage.enterUsername();

    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        moodeleLoginPage.enterPassword();
    }

    @Then("I see warning about invalid login")
    public void iSeeWarningAboutInvalidLogin() {
        moodeleLoginPage.validateMoodleLoginPage();
    }
}
