import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty"}, features = {
        "src/main/resources/features/" }, glue = "stepDefinitions", tags = { "@CharacterSearch" })

public class Runner {

}