package week3.day2.JiraAssignment1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateIncidentinJira extends BaseClass
{

	@Test(dependsOnMethods="week3.day2.JiraAssignment1.CreateIncidentinJIRA.create")
	public void update() {
		
		 input=RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "    \"project\":\r\n"
				+ "                {\r\n"
				+ "                    \"key\": \"RSA\"\r\n"
				+ "                },\r\n"
				+ "    \"summary\": \"updated issue in RSA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "                    \"name\": \"Bug\"\r\n"
				+ "                }\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "");
		 response = input.put("/"+issueId);
		
		
	}
	
}
