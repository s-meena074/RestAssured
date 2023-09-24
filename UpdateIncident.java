package week3.day2;

import java.io.File;

import io.restassured.RestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident //classroom excercise
{
	@Test
	public  void update()
	{
	RestAssured.baseURI="https://dev143538.service-now.com/api/now/table/incident";
	RestAssured.authentication=RestAssured.basic("admin", "SIhjY-7s!6Ty");

	
File fileName = new File("./src/test/resources/UpdateIncident.json");
	
	RequestSpecification input = RestAssured.given()
			.contentType("application/json").when().body(fileName);
	
	Response response = input.put("7100002897a171107e4af1e3f153af75");
	System.out.println(response.getStatusCode());
	
	response.then().assertThat().statusCode(Matchers.equalTo(200));
	}
}
