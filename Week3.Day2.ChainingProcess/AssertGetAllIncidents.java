package week3.day2.Chaining;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssertGetAllIncidents extends BaseClass {
	
	@Test(dependsOnMethods = "week3.day2.Chaining.CreateIncident.create")
	public void getIncidents() {
		
		
		
		//Add a Single Query Parameter
		RequestSpecification input = RestAssured.given();
		
		//Send Request
		Response response = input.get();
		List<Object> sysidList= response.jsonPath().getList("result.sys_id");
		System.out.println("Total number of incidents"+sysidList.size());
		
		//out of 2163 incidents validate in the response whether INC0012580 is present
		
		//response.then().assertThat().body("result.number", Matchers.hasItem("INC0012580"));
		response.then().assertThat().body("result.number", Matchers.hasItem(incNum));
	    System.out.println("The Incident Number is ----"+incNum);
	
	}

}