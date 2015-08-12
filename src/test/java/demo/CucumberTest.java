package demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: jacobs
 * Date: 6/11/15
 * Time: 11:09 AM
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        plugin = {"json:build/cucumber/json/cucumber.json"},
        glue = {"demo.steps"})
public class CucumberTest{
}
