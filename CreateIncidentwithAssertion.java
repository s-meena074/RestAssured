package week3.day2;

import io.restassured.RestAssured;

import java.io.File;
import org.hamcrest.*;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentwithAssertion
{


@Test
public  void create()
{
	RestAssured.baseURI="https://dev143538.service-now.com/api/now/table/incident";
	RestAssured.authentication=RestAssured.basic("admin", "SIhjY-7s!6Ty");
	
	
	File fileName = new File("./src/test/resources/CreateIncident.json");
	
	RequestSpecification input = RestAssured.given()
			.contentType("application/json").when().body(fileName);
	
	
	Response response =input.post();
	
	//int statusCode = response.getStatusCode();
	
	//response.then().assertThat().body("result.number", Matchers.containsString("XYZ")); 
	response.then().assertThat().body("result.number", Matchers.containsString("INC"));	
	response.prettyPrint();
}
}

