package com.foo;
import static junit.framework.Assert.fail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import calabash.java.IOSApplication;

@Component
@Profile("ios")
public class MyIOSApplication implements MobileApplication {

	@Autowired
	IOSApplication application;
	
	public void login(String username, String password) throws Exception {
		System.out.println("iosApplication info" + application.getCalabashInfo());
	}

}
