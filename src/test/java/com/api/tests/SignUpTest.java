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
		
		SignUpRequest signUpRequest = new SignUpRequest.Builder().UserName("Adam12")
		.email("adam90@gmail.com").firstName("adam").password("adam123").lastName("Negi").mobileNumber("9898012322").build();
		
		AuthenticationService authenticationService = new AuthenticationService();
		Response response = authenticationService.signUp(signUpRequest);
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}

}
