package step.Definition;

import java.io.IOException;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	public Initializer() throws IOException {
	}

	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario" + scenario.getName() + "started");
		selectBrowser();
		openBrowser();

	}

	@After
	public void AfterHooks(Scenario scenario) {
		driver.quit();
		logger.info("Scenario" + scenario.getName() + scenario.getStatus());

	}

}
