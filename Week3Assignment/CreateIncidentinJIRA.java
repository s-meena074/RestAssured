package week3.day2.JiraAssignment1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class CreateIncidentinJIRA extends BaseClass 

{

	@Test
	public void create() {
		
		input=RestAssured.given().contentType("application/json").accept("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "    \"project\":\r\n"
				+ "                {\r\n"
				+ "                    \"key\": \"RSA\"\r\n"
				+ "                },\r\n"
				+ "    \"summary\": \"create issue in RA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "                    \"name\": \"Bug\"\r\n"
				+ "                }\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "");
		
		response = input.post();
int statusCode = response.getStatusCode();
		
		issueId = response.jsonPath().get("id");
		//response.then().assertThat().statusCode(Matchers.equalTo(201));
		//incnum=response.jsonPath().get("result.number");
	//	System.out.println("Jira Issue ID: " + issueId);
		//System.out.println("Status Code: " + statusCode);
		
	}

	
}
