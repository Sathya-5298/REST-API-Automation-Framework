package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService 
{
	//Responsible for Handling BaseURI, Creating the Request, Handling the Response (Wrapper for REST Assured)
	
	private static final String BASE_URL = "http://64.227.160.186:8080";
	
	private RequestSpecification requestSpecification;

	public BaseService() 
	{
		requestSpecification = RestAssured.given().baseUri(BASE_URL);
	}
	
	protected void setAuthToken(String token)
	{
		requestSpecification.header("Authorization", "Bearer " + token);
	}
	
	protected Response postRequest(Object payLoad, String endPoint)
	{
		 return requestSpecification.contentType(ContentType.JSON).body(payLoad).post(endPoint);
	}
	
	protected Response postRequest(String baseUrl,Object payLoad, String endPoint)
	{
		 return requestSpecification.baseUri(baseUrl).contentType(ContentType.JSON).body(payLoad).post(endPoint);
	}
	
	protected Response getRequest(String endPoint)
	{
		 return requestSpecification.get(endPoint);
	}
	
	protected Response putRequest(Object payLoad, String endPoint)
	{
		 return requestSpecification.contentType(ContentType.JSON).body(payLoad).put(endPoint);
	}
}
