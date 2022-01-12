package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.JSONFileLoading;
import org.testing.Utilities.JsonParsing;
import org.testing.Utilities.Jsonvariablereplacement;
import org.testing.Utilities.LoadPropertiesFile;
import org.testing.Utilities.RandomVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8Post2 {
	
	static String responseidvalue;
	
	@Test
	public void testcase8() throws IOException
	{
		Properties pr = LoadPropertiesFile.properties("../APIFrameTry2/src/test/java/URI.properties");
		String bodydata=JSONFileLoading.jsonload("../APIFrameTry2/src/test/java/org/testing/Resources/Bodydataforpost2.json");
		
		bodydata=Jsonvariablereplacement.jsonvariablereplace(bodydata, "id", RandomVariable.random()); 
				
		HttpsMethods http= new HttpsMethods(pr); 
		Response res=http.postMethod("QA_URI", bodydata);		
		
		System.out.println("Status Code is:" +res.statusCode());
		System.out.println("Response is:");
		System.out.println(res.asString());
		
		responseidvalue=JsonParsing.jsonparse(res.asString(), "id");		
	}

}
