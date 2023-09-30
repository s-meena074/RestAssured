package week3.day2.JiraAssignment1;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass 
{

	public static String issueId;
	public static RequestSpecification input;
	public static Response response;
	
@BeforeMethod
	public void setUp() {
		RestAssured.baseURI="https://mukeshtest1.atlassian.net/rest/api/2/issue/";
		RestAssured.authentication=RestAssured.preemptive().basic("mukesh.arvind92@gmail.com", "ATATT3xFfGF0KdfbnLbrR44MIPsqFWHhRKUCA3c8Emxl3LmixlgxWM_ouNwh0MU-FRVZnlkyxbIiMGyP_t2HmadnM8GLBc0m2-ZOzHiGezL211bDZtegdBBi9t7aC3FMAypAtuQsp76cb_eaCXQ7Hb4r8h5L5ixKM4kSeeivnanI65J8IveMFjA=3838A0A3");
	}
	
}
