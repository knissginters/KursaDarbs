package stepsDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Pages;

public class SearchSteps extends Pages {
    @When("I select Search Icon")
    public void iSelectSearchIcon() {
        liepUnilandingPage.selectSearchIcon();
    }

    @Then("I am navigated to Search page")
    public void iAmNavigatedToSearchPage() {
        liepUniSearchPage.validateSearchPage();
    }

    @When("I uncheck the filters")
    public void iUncheckTheFilters() {
        liepUniSearchPage.selectFilterTickBoxes("news");
    }

    @And("make a search")
    public void makeASearch() {
        liepUniSearchPage.makeSearch("Ginters");
    }
    @Then("I get a warning message")
    public void iGetAWarningMessage() {
        liepUniSearchPage.validateAlert();
    }

    @When("I do search by {string}")
    public void iDoSearchBy(String string) {
            liepUniSearchPage.makeSearch(string);
    }

    @Then("Search results contain search parameter")
    public void searchResultsContainSearchParameter() {
        liepUniSearchPage.validateSearchResults();
    }


}
