package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.util.Assert;
import setups.Capabilities;


public class MyStepdefs extends Capabilities {

    @Before({"@CharacterSearch"})
    public void setUp() throws Exception {
        preparation();
    }

    @Given("^the breaking bad app is launched$")
    public void the_breaking_bad_app_is_launched() throws Throwable {
        System.out.println("Preparing to install the app on the phone");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String charactername) throws Throwable {
        androidDriver.findElementByAccessibilityId("Search").click();
        androidDriver.findElementByXPath("//*[@resource-id='com.github.fatihsokmen.breakingbad:id/search_src_text']").sendKeys(charactername);
        androidDriver.findElementByXPath("//*[@resource-id='com.github.fatihsokmen.breakingbad:id/image']").click();
    }

    @Then("^I should see character profile \"([^\"]*)\"$")
    public void i_should_see_character_profile(String status) throws Throwable {
        androidDriver.findElementByXPath("//*[@resource-id='com.github.fatihsokmen.breakingbad:id/status']").isDisplayed();
        Assert.hasText(androidDriver.findElementByXPath("//*[@resource-id='com.github.fatihsokmen.breakingbad:id/status']").getText(), status);
    }

    @After({"@CharacterSearch"})
    public void stop() {
        stopServer();
    }

}
