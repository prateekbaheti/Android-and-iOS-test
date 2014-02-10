

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

import com.thoughtworks.twist.core.BeforeEachStep;

import com.thoughtworks.twist.core.AfterEachStep;

public class ScenarioExecutionHooks {

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	@BeforeEachStep
	public void beforeEachStep() throws Exception {
	
	}

	@AfterEachStep
	public void afterEachStep() throws Exception {
	
	}

}