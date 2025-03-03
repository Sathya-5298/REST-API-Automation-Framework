package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class ProfileUpdateTest {

	@Test(description = "Verify if Profile Update API is working")
	public void getProfileInfoTest()
	{
		AuthenticationService authenticationService = new AuthenticationService();
		Response response = authenticationService.login(new LoginRequest("uday1234", "uday12345"));
		LoginResponse loginResponse  = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("=======================================");
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "uday1234");
		
		System.out.println("=======================================");
		ProfileRequest profileRequest = new ProfileRequest.Builder().firstName("Rajesh").lastName("Bhat")
				.email("Rajesh12@gmail.com").mobileNumber("9878998789").build();
		
		response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
	}
}
