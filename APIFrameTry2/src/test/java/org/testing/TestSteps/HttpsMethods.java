package org.testing.TestSteps;

import static io.restassured.RestAssured.given;

import java.util.Properties;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpsMethods {
	
	Properties pr;
 
	public HttpsMethods(Properties p)
	{
		this.pr=p;
	}

		public Response postMethod(String urikey, String bodydata)
	{
		
		Response res=
		given().contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(urikey));
		
		return res;
		
	}
		
		public Response getMethod(String urikey, String id)
	{
			String uri=pr.getProperty(urikey)+"/"+id;
			Response res=
			given().contentType(ContentType.JSON)
			.when()
			.get(uri);
			
			return res;
	}
		
		
		public Response getAllMethod(String urikey)
	{
				String uri=pr.getProperty(urikey);
				Response res=
				given().contentType(ContentType.JSON)
				.when()
				.get(uri);
				
				return res;
	}
		
		
		public Response putMethod(String bodydata, String urikey, String id)
	{
				String uri=pr.getProperty(urikey)+"/"+id;
				Response res=
				given().contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.put(uri);
				
				return res;
	}
		
		public Response deleteMethod (String urikey, String id)
	{
					String uri=pr.getProperty(urikey)+"/"+id;
					Response res=
					given().contentType(ContentType.JSON)
					.when()
					.delete(uri);
					
					return res;
	}
		
}