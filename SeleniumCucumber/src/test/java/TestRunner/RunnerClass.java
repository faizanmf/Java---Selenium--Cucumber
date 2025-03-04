package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/Features",
    glue = {"StepDefinition"},
    monochrome = true,
    plugin = {"json:target/cucumber.json"},
    tags="@smoke"
)
public class RunnerClass {
}
