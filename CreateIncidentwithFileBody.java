package week3.day2;

import io.restassured.RestAssured;

import org.jsoup.select.Evaluator.Matches;
import org.hamcrest.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentwithFileBody
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
	
	int statusCode = response.getStatusCode();
	//Assert.assertEquals(statusCode, 200);
	
	response.then().assertThat().statusCode(Matchers.equalTo(201));
	
	response.prettyPrint();
	
}
}

