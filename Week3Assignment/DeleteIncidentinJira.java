package week3.day2.JiraAssignment1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncidentinJira	extends BaseClass
{
		@Test(dependsOnMethods="week3.day2.JiraAssignment1.UpdateIncidentinJira.update")
		public void delete() {
			
			Response response = RestAssured.delete("/"+issueId);
			System.out.println(response.getStatusCode());
			
		}
	
}
