package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2Get {
	
	//@Test 
	public void testcase2() throws IOException	
	{
		Properties pr=LoadPropertiesFile.properties("../APIFrameTry2/src/test/java/URI.properties");
				
		HttpsMethods http=new HttpsMethods(pr);
		Response r=http.getMethod("QA_URI", TC1Post.responseIdValue);
		
		System.out.println("Status code is:" +r.statusCode());
		System.out.println("Response is:");
		System.out.println(r.asString());
	}

}