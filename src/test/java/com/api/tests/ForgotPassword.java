package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthenticationService;

import io.restassured.response.Response;

public class ForgotPassword 
{
	
	@Test(description = "Verify if Forgot Password API is working")
	public void forgotPasswordTest() 
	{
		AuthenticationService authenticationService = new AuthenticationService();
		
		Response response = authenticationService.forgotPassword("smurthy829@gmail.com");
		
		System.out.println(response.asPrettyString());
	}

}
