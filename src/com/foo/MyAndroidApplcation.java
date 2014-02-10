package com.foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.thoughtworks.calabash.android.AndroidApplication;
import com.thoughtworks.calabash.android.CalabashException;

@Component
@Profile("android")
public class MyAndroidApplcation implements MobileApplication {
	
	@Autowired
	AndroidApplication application;
	
	public void login(String username, String password) throws CalabashException {
		System.out.println("In android activity" + application.getCurrentActivity());
	}

}
