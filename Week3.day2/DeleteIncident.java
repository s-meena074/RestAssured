package week3.day2;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident

{
	
	@Test
	public void delete()
	{
		RestAssured.baseURI="https://dev143538.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin", "SIhjY-7s!6Ty");

		
		Response response = RestAssured.delete("df6240a897a171107e4af1e3f153afcb");
		
		response.then().assertThat().statusCode(Matchers.equalTo(204));
	}
	
}
