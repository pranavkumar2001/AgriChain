package org.argichain.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/org/agrichain/featureFiles",
        monochrome= true,
        glue= { "org/agrichain/stepDefinition","org/agrichain/Hooks"},
		stepNotifications = true,
        tags= "@regression",
        plugin = {"pretty",
        }
)

public class
TestRunner {

}
