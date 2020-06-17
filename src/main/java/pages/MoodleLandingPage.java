package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MoodleLandingPage {
    private SelenideElement getLogo(){
        return $("#yui_3_17_2_1_1592236395432_166");
    }
    private SelenideElement getUsernameField() {
        return $("#login_username");
    }
    private SelenideElement getPasswordField() {
        return $("#login_password");
    }
    private  SelenideElement getSubmitButton() {
        return $("[class='form-group'] [type='submit']");
    }


    public void validateLandingPage(){
        getLogo().exists();
        getUsernameField().exists();
        getPasswordField().exists();
        getSubmitButton().exists();
    }


    public void enterUsername() {
        getUsernameField().setValue("werwerewweer");
    }

    public void enterPassword() {
        getPasswordField().setValue("sadfasfsdafsdaf");
    }

    public void selectSubmitButton() {
        getSubmitButton().click();
    }

}
