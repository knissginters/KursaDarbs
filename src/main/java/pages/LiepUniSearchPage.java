package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LiepUniSearchPage {

    private SelenideElement getTitle() {
        return $("[class='title']");
    }

    private SelenideElement getSearchField() {
        return $("#searchField [class='form-control']");
    }

    private SelenideElement getFilterTickBoxes(String checkType) {
        return $("span.custom-control-label");
    }

    private SelenideElement getAlertMessage() {
        return $("[class='alert alert-danger']");
    }
    private SelenideElement getSearchReults() {
        return $("[class='my-2 w-100']");
    }

    private SelenideElement getSearchButton() {
        return $("[class='input-group-append']");
    }
    public void validateSearchPage() {
        getSearchField().exists();
        getTitle().exists();
    }
    public void selectFilterTickBoxes(String checkType) {
        getFilterTickBoxes(checkType).click();
    }

    public void validateAlert() {
        getAlertMessage().exists();
    }

    public void makeSearch(String searchParameter) {
        getSearchField().click();
        getSearchField().setValue(searchParameter);
        getSearchButton().click();
    }

    public void validateSearchResults() {
        String txt = getSearchReults().getText();
        System.out.printf(txt);
    }
}
