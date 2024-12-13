package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/BackgroundDemo/BackgroundDemo.feature",
    glue = {"StepsForBackground"},
    monochrome = true,
    plugin= {"pretty", "html:target/HTMLReports",
    		"pretty", "json:target/JSONReports",
    		"pretty", "junit:target/JUnitReports/LoginReport.xml"}
    //tags="@smoke"
)
public class TestRunnerForBackground {
}
