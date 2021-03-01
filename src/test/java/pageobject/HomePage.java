package pageobject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private AndroidDriver<AndroidElement> driver;

    public HomePage() {
    }

    public HomePage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Search")
    private AndroidElement searchButton;
    @AndroidFindBy(xpath = "//*[@resource-id='com.github.fatihsokmen.breakingbad:id/search_src_text']")
    private AndroidElement searchFieldTextArea;

    public void clickSearch() {
        searchButton.click();
    }

    public void enterCharacterToSearch(String characterName) {
        searchFieldTextArea.sendKeys(characterName);
    }
}
