package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "", 
features = "scr/test/features/Sprint1/Authentification.feature", 
glue = "src/test/java/Sprint", 
publish = true, 
plugin = {
		"pretty", "html:target/CucumberReport2.html", "json:target/CucumberReport2" })

public class Runner {

}
