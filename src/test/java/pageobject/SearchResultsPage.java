package pageobject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private AndroidDriver<AndroidElement> driver;

    public SearchResultsPage() {
    }

    public SearchResultsPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='com.github.fatihsokmen.breakingbad:id/image']")
    private AndroidElement searchResultImage;

    public void clickSearchResult(String characterName) {
        searchResultImage.click();
    }
}
