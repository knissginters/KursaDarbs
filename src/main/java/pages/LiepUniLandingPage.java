package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LiepUniLandingPage {
    private SelenideElement getLandinglogo(){
        return $("[class='container header'] [class= 'logo']");
    }

    private SelenideElement getMoodleIcon() {
        return $("[class='container header'] [class ='header-icon header-moodle']");
    }

    private SelenideElement getPrivacyBanner() {
        return $("[class='js-cookie-consent cookie-consent cookiealert show'] .cookie-consent__message");
    }

    private SelenideElement getPrivacyBannerHyperLink(){
        return $("[hreflang='lv']");
    }


    private SelenideElement getSearchIcon() {
        return $("[class='header-icon header-search']");
    }

    public void validateLandingPage() {
        getLandinglogo().exists();
        getMoodleIcon().exists();
        getSearchIcon().exists();
    }
    public void clickMoodleIcon(){
        getMoodleIcon().click();
    }
    public void validatePrivacyBanner() {
        getPrivacyBanner().exists();
        getPrivacyBannerHyperLink().exists();
    }

    public void selectPrivacyBannerHyperLink() {
        getPrivacyBannerHyperLink().click();
    }

    public void selectSearchIcon() {
        getSearchIcon().click();
    }
}
