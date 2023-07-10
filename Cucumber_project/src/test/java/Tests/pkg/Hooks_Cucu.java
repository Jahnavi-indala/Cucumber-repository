package Tests.pkg;

import Pages.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks_Cucu {


	@Before
	public void beforeScenario() throws Exception
	{

		Driver.driverInstallization();
	}	



	@After
	public void afterScenario()
	{

		Driver.quit();

	}
}
