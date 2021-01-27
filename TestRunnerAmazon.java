package StepDefinitions;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/LoginAmazon.feature", glue = { "StepDefinitions" },
strict = true,
plugin={"pretty","junit:target/JUnitReports/report.xml"}
)

public class TestRunnerAmazon {
	

}
