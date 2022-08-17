package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@first", // feature içinde tag vererek istediğimiz testleri çalıştırabiliriz.
        dryRun = false)  // feature'daki metotları almak için 'true' kullanabiliriz.

public class Runner { }