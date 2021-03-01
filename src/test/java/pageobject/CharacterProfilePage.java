package pageobject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.springframework.util.Assert;

public class CharacterProfilePage {
    private AndroidDriver<AndroidElement> driver;

    public CharacterProfilePage() {
    }

    public CharacterProfilePage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='com.github.fatihsokmen.breakingbad:id/status']")
    private AndroidElement characterProfileStatus;

    public void checkCharacterProfileStatusisDisplayed(){
        characterProfileStatus.isDisplayed();
    }
    public void assertCharacterProfileStatus(String status) {
        Assert.hasText(characterProfileStatus.getText(), status);
    }
}
