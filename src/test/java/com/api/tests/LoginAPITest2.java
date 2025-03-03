package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class LoginAPITest2 
{
	
	@Test(description = "Verify if Login API is working")
	public void loginTest() 
	{
		LoginRequest loginRequest = new LoginRequest("uday1234", "uday12345");
		
		AuthenticationService authService = new AuthenticationService();
		Response response = authService.login(loginRequest);
		
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getId());
		System.out.println(loginResponse.getEmail());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getId(), 1);
		Assert.assertEquals(loginResponse.getEmail(), "Rajesh12@gmail.com");
		
		
	}
}
