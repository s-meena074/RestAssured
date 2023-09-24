package week3.day2;

import io.restassured.RestAssured;
import java.io.File;
import java.util.List;

import org.hamcrest.*;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssertGetAllIncidents 
{
@Test
	public void getAllIncidents()
	{
		
	
	RestAssured.baseURI="https://dev143538.service-now.com/api/now/table/incident";
	RestAssured.authentication=RestAssured.basic("admin", "SIhjY-7s!6Ty");
	
	RequestSpecification input = RestAssured.given()
			.contentType("application/json");
/*	
File fileName = new File("./src/test/resources/CreateIncident.json");
	
	RequestSpecification input = RestAssured.given()
			.contentType("application/json").when().body(fileName);
	
	*/
	Response response =input.get();
	List<Object> sysidList = response.jsonPath().getList("result.number");
	System.out.println("Total Number of Incidents:" +sysidList.size());
	//System.out.println("List all Incidents:" +result.number);
	response.then().assertThat().body("result.number", Matchers.hasItem("INC0010043"));
	
}

}