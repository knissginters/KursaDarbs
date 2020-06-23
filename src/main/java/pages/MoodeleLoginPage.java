package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MoodeleLoginPage {
    private SelenideElement getWelcomeMessage(){
        return $("#yui_3_17_2_1_1592237363868_41");
    }
    private SelenideElement getUsernameField(){
        return $("#username");
    }

    private SelenideElement getPasswordField(){
        return $("#password");
    }

    private SelenideElement getSubmitButton(){
        return $("#loginbtn");
    }

    private SelenideElement getWarningIcon() {
        return $("[class='icon icon icon-pre']");
    }

    public void validateMoodleLoginPage() {
        getWelcomeMessage().exists();
        getPasswordField().exists();
        getUsernameField().exists();
        getSubmitButton().exists();
        String text = getWarningIcon().getText();
        if(text=="Neuuurrruruur!"){
        }

    }

    public void enterUsername() {
        getUsernameField().setValue("weewerweew");
    }

    public void enterPassword() {
        getPasswordField().setValue("sdfsdfsdf");
    }

    public void selectSubbmitButton(){
        getSubmitButton().click();
    }



}
