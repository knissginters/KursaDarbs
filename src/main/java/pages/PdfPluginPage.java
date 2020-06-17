package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PdfPluginPage {

    private SelenideElement getPluginID() {
        return $("#plugin");
    }

    public void validatePdfPlugin() {
        getPluginID().exists();
    }
}