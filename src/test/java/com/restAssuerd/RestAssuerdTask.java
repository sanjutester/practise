package com.restAssuerd;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestAssuerdTask {
	static RequestSpecification resSpec;
	
	public static void main(String[] args) {
		 
		   resSpec = RestAssured.given();
		   
		   resSpec = resSpec.header("content-type","application/json");
		  
		  
		   Response response = resSpec.get("https://petstore.swagger.io/v2/user/login?username=sundhar&password=sp%40sjbdvh541");
		   
		   int statusCode = response.getStatusCode();System.out.println(statusCode);
		   
		   ResponseBody responsebody = response.getBody();
		   System.out.println(responsebody);
		   
		   String bodyString = responsebody.asString();
		   System.out.println(bodyString);
		   
		   String asPrettyString = responsebody.asPrettyString();
		   System.out.println(asPrettyString);
		   
		   
		
		
		
		
		
		
	}

}
