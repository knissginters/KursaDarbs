package stepsDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Pages;

public class PrivacyPolicySteps extends Pages {

    @Given("I see the privacy policy banner")
    public void iSeeThePrivacyPolicyBanner() {
        liepUnilandingPage.validatePrivacyBanner();
    }

    @When("I select the privacy policy banner's hyperlink")
    public void iSelectThePrivacyPolicyBannersHyperlink() {
        liepUnilandingPage.selectPrivacyBannerHyperLink();
    }

    @Then("PDF file is opened")
    public void pdfFileIsOpened(){
        pdfPluginPage.validatePdfPlugin();
    }
}

