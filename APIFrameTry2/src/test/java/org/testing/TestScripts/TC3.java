package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3 {
	
	//@Test 
	public void testcase3() throws IOException
	{
		Properties pr=LoadPropertiesFile.properties("../APIFrameTry2/src/test/java/URI.properties");
		
		HttpsMethods http = new HttpsMethods(pr);
		Response res=http.getAllMethod("QA_URI");
		System.out.println("Status code is:" +res.statusCode());
		System.out.println("Response is:");
		System.out.println(res.asString());
	}

}
