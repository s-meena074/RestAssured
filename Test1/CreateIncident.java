package week3.day2.Chaining;



import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class CreateIncident extends BaseClass

{

	@Test
	public void create() {
		
		
				
		//Add Request
		File fileName = new File("./src/test/resources/CreateIncident.json");
		
		 input = RestAssured.given()
				.contentType("application/json").when().body(fileName);
	
		
		 response = input.post();
		//	response.then().assertThat().statusCode(Matchers.equalTo(200));
		 sys_ID = response.jsonPath().get("result.sys_id");
		 
		  incNum = response.jsonPath().get("result.number");
		System.out.println("The Extracted Sysid is -------:"+sys_ID);
	
		
		
		
		
		
		
		
	}

	
}
