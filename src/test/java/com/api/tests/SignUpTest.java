package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class SignUpTest 
{
	
	@Test(description = "Verify if SignUp API is working")
	public void createAccountTest() 
	{
		
		SignUpRequest signUpRequest = new SignUpRequest.Builder().UserName("Adam19")
		.email("adam19@gmail.com").firstName("adam").password("adam19").lastName("AD").mobileNumber("9898032100").build();
		
		AuthenticationService authenticationService = new AuthenticationService();
		Response response = authenticationService.signUp(signUpRequest);
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}

}
