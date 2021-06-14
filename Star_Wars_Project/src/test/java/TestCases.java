

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class TestCases {
		
		@Test(priority=1)
		void all_Character_Valid_Test() {
			
			// Specify Base URL
			RestAssured.baseURI = "https://swapi.dev/api/";
			
			//Creating request object
			RequestSpecification allcharvalidrequest  = RestAssured.given();
			
			// Creating response object
			Response allcharvalidresponse = allcharvalidrequest.request(Method.GET, "people/");
		
			// response string
			String response1 = allcharvalidresponse.getBody().asString();
			System.out.println(response1);
			
			// Obtained and verified status code
			int code1 = allcharvalidresponse.getStatusCode();
			System.out.println(code1);
			Assert.assertEquals(code1, 200);
			
			// Obtained and verified status line
			String statusline1 = allcharvalidresponse.getStatusLine();
			System.out.println(statusline1);
			Assert.assertEquals(statusline1, "HTTP/1.1 200 OK");	
			
		}
		
		@Test(priority=2)
		void all_Character_Invalid_Test() {
			
			RestAssured.baseURI = "https://swapi.dev/api/";
			RequestSpecification allCharInvalidTest  = RestAssured.given();
			
			Response allcharinvalidresponse = allCharInvalidTest.request(Method.GET, "people190/");
			
			String response2 = allcharinvalidresponse.getBody().asString();
			System.out.println(response2);
			
			int code2 = allcharinvalidresponse.getStatusCode();
			System.out.println(code2);
			
			Assert.assertEquals(code2, 404);
			
			String statusline2 = allcharinvalidresponse.getStatusLine();
			System.out.println(statusline2);
			
			Assert.assertEquals(statusline2, "HTTP/1.1 404 NOT FOUND");	
			
		}
		
		@Test(priority=3)
		void Blank_Search() {
			
			RestAssured.baseURI = "https://swapi.dev/api";
			RequestSpecification blanksearchrequest  = RestAssured.given();
			
			Response blanksearchresponse = blanksearchrequest.request(Method.GET, " ");
			
			String response3 = blanksearchresponse.getBody().asString();
			System.out.println(response3);
			
			int code3 = blanksearchresponse.getStatusCode();
			System.out.println(code3);
			
			Assert.assertEquals(code3, 200);
			
			String statusline3 = blanksearchresponse.getStatusLine();
			System.out.println(statusline3);
			
			Assert.assertEquals(statusline3, "HTTP/1.1 200 OK");	
			
		}
		
		
		@Test(priority=4)
		void specific_Character_Valid_Test() {
			
			RestAssured.baseURI = "https://swapi.dev/api/";
			RequestSpecification specificCharValidTest  = RestAssured.given();
			
			Response specificcharvalidresponse = specificCharValidTest.request(Method.GET, "people/3/");
			
			String response4 = specificcharvalidresponse.getBody().asString();
			System.out.println(response4);
			
			int code4 = specificcharvalidresponse.getStatusCode();
			System.out.println(code4);
			
			Assert.assertEquals(code4, 200);
			
			String statusline4 = specificcharvalidresponse.getStatusLine();
			System.out.println(statusline4);
			
			Assert.assertEquals(statusline4, "HTTP/1.1 200 OK");	
			
		}
		
		@Test(priority=5)
		void specific_Character_Invalid_Test() {
			
			RestAssured.baseURI = "https://swapi.dev/api";
			RequestSpecification specificCharInvalidTest  = RestAssured.given();
			
			Response specificcharinvalidresponse = specificCharInvalidTest.request(Method.GET, "people/204/");
			
			String response5 = specificcharinvalidresponse.getBody().asString();
			System.out.println(response5);
			
			int code5 = specificcharinvalidresponse.getStatusCode();
			System.out.println(code5);
			
			Assert.assertEquals(code5, 404);
			
			String statusline5 = specificcharinvalidresponse.getStatusLine();
			System.out.println(statusline5);
			
			Assert.assertEquals(statusline5, "HTTP/1.1 404 NOT FOUND");	
			
		}
		
		@Test(priority=6)
		void search_Planets_Valid_Test() {
			
			RestAssured.baseURI = "https://swapi.dev/api/";
			RequestSpecification searchPlanetsValidrequest  = RestAssured.given();
			
			Response searchPlanetsValidresponse = searchPlanetsValidrequest.request(Method.GET, "planets/4/");
			
			String response6 = searchPlanetsValidresponse.getBody().asString();
			System.out.println(response6);
			
			int code6 = searchPlanetsValidresponse.getStatusCode();
			System.out.println(code6);
			
			Assert.assertEquals(code6, 200);
			
			String statusline6 = searchPlanetsValidresponse.getStatusLine();
			System.out.println(statusline6);
			
			Assert.assertEquals(statusline6, "HTTP/1.1 200 OK");	
		}
		
		@Test(priority=7)
		void search_Planets_Invalid_Test() {
			
			RestAssured.baseURI = "https://swapi.dev/api/";
			RequestSpecification searchPlanetsInvalidrequest  = RestAssured.given();
			
			Response searchPlanetsInvalidresponse = searchPlanetsInvalidrequest.request(Method.GET, "planets/202/");
			
			String response7 = searchPlanetsInvalidresponse.getBody().asString();
			System.out.println(response7);
			
			int code7 = searchPlanetsInvalidresponse.getStatusCode();
			System.out.println(code7);
			
			Assert.assertEquals(code7, 404);
			
			String statusline7 = searchPlanetsInvalidresponse.getStatusLine();
			System.out.println(statusline7);
			
			Assert.assertEquals(statusline7, "HTTP/1.1 404 NOT FOUND");	
		}

}
