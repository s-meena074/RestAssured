package week3.day2.Chaining;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import java.io.File;



public class UpdateIncident extends BaseClass {

	@Test(dependsOnMethods = "week3.day2.Chaining.CreateIncident.create") //packageame.className.methodName
	public void update() {


		// Add Request

		File fileName = new File("./src/test/resources/UpdateIncident.json");
		input = RestAssured.given()
				.contentType("application/json").when().body(fileName);
		
				//Send Request

		response = input.put("/"+sys_ID);

		response.prettyPrint();

	}

}
