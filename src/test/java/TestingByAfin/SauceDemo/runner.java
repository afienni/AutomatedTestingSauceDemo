package TestingByAfin.SauceDemo;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features", 
  glue = {"TestingByAfin.stepDev"},
  plugin = {"html:target/reportby.html"}
  )

public class runner {

}
