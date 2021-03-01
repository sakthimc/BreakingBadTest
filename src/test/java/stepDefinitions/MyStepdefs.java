package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.util.Assert;
import pageobject.CharacterProfilePage;
import pageobject.HomePage;
import pageobject.SearchResultsPage;
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
        HomePage homePage = new HomePage(androidDriver);
        homePage.clickSearch();
        homePage.enterCharacterToSearch(charactername);
        SearchResultsPage searchResultsPage = new SearchResultsPage(androidDriver);
        searchResultsPage.clickSearchResult(charactername);
    }

    @Then("^I should see character profile \"([^\"]*)\"$")
    public void i_should_see_character_profile(String status) throws Throwable {
        CharacterProfilePage characterProfilePage = new CharacterProfilePage(androidDriver);
        characterProfilePage.checkCharacterProfileStatusisDisplayed();
        characterProfilePage.assertCharacterProfileStatus(status);
    }

    @After({"@CharacterSearch"})
    public void stop() {
        stopServer();
    }

}
