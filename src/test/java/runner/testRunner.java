package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@EmptyUsername",
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "utils"},
        plugin = {
                "pretty",
                "summary",
                "html:target/cucumber-report.html"
        }
)
public class testRunner extends AbstractTestNGCucumberTests {
}
