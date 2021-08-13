package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target\\default-cucumber-reports9.html",
                "json:target\\json-reports/cucumber9.json",
                "junit:target\\xml-report/cucumber9.xml"},
        features = "src/test/resources",
        glue = "Hsaruhan01/src/test/java/stepdefinitions/LoginStepDefinitions",

        tags = "@LoginTest",
        dryRun = false
)

public class Runners {
}
