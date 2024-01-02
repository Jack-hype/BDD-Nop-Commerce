package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\Feature\\Login.feature"},
		glue= {"Steps"},
		//tags="@smoke and @sanity",
		dryRun=true,
		publish=true,
		plugin= {"pretty","html:target\\htmlreports"}
				
		)

public class LoginRunner extends AbstractTestNGCucumberTests {
	

}
