package Task4;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Task4/resources/"}, glue = {"steps"}, plugin = {"Task4.util.AllureReporter",})
public class CucumberRunner {

}
