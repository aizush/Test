package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Sovet\\home\\src\\test\\java\\features",
        glue = "steps",
        tags = "@title",
        dryRun = false
)
public class Runner {
}
