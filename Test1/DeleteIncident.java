package week3.day2.Chaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass {

	@Test(dependsOnMethods = "week3.day2.Chaining.UpdateIncident.update")
	public void delete() {
		
		
		//Send Request
		
		Response response = RestAssured.delete("/"+sys_ID);
		response.then().assertThat().statusCode(Matchers.equalTo(204));
		System.out.println(response.getStatusCode());
	}


}
