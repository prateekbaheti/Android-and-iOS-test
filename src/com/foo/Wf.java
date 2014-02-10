package com.foo;
// JUnit Assert framework can be used for verification

import static junit.framework.Assert.fail;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class Wf {

	@Autowired
	private TwistScenarioDataStore scenarioStore;
	
	@Autowired
	MobileApplication application;
	
	public void loginWithUsernameAndPassword(String username, String password) throws Exception {
		fail();
		application.login(username, password);
	}

}