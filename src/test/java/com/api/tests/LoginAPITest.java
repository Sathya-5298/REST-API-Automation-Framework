package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class LoginAPITest {
	@Test(description = "Verify if Login API is working")
	public void loginTest() {
		
		AuthenticationService authService = new AuthenticationService();
	//	Response response = authService.login("{\"username\": \"uday1234\",\"password\": \"uday12345\"}");
		
	//	System.out.println(response.asPrettyString());

	}
}
