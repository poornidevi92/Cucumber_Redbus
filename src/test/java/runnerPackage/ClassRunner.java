package runnerPackage;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (features = "C:/Users/poornima/IdeaProjects/Selenium/Cucumber_RedBus/src/main/resources/Features", glue = {"stepdefs"},tags = "@Homepage", monochrome = true,plugin = { "pretty",  "html:Reports/cucumber-pretty" })
public class ClassRunner {

}
