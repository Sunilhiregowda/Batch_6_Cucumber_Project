package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Features" },

		glue = { "StepDefinations" }
//		tags = "@Facebook"

)

public class CucumberRunner {

}
