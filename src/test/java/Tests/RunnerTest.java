package Tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/factorial.feature",
        glue={"CucumberStepDefinition"},
        plugin={"pretty", "html:target/cucumber-html-report.html"},
        monochrome = true
)
class RunnerTest {
}
