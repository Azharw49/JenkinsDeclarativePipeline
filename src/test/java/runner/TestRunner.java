package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features="src/test/java/feature",
                glue={"stepDefinition"},
                dryRun = false,
                monochrome = true,
                plugin = { "pretty", "json:target/cucumber.json"}
                //,tags = "@citrix"
        )

public class TestRunner {









}
