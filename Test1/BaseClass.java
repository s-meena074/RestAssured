package week3.day2.Chaining;


import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	public static String sys_ID;
	public RequestSpecification input;
	public static Response response;
	public static String incNum;
	
	@BeforeMethod
	public void setUp() {
		
		// End point
		RestAssured.baseURI="https://dev143538.service-now.com/api/now/table/incident";
		
		//Authentication
		
		RestAssured.authentication=RestAssured.basic("admin", "SIhjY-7s!6Ty");
		
		//RestAssured.authentication=RestAssured.preemptive().basic("jirausername", "jirakey");
		
		
		
	}

}
