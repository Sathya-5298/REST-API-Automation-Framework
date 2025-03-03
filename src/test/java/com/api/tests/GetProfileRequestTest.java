package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest 
{
	@Test(description = "Verify if Get Profile API is working")
	public void getProfileInfoTest() 
	{
		AuthenticationService authenticationService = new AuthenticationService();
		Response response = authenticationService.login(new LoginRequest("Sathya5298", "Sathya5298"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		response.as(UserProfileResponse.class);
		System.out.println(loginResponse.getUsername());
	}

}
