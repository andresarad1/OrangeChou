package co.com.orange.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_user.feature",
        glue ="co.com.orange.stepdefinitions",
        tags = "@createCandidate and  @addCandidates"
)
public class Runners {
}
