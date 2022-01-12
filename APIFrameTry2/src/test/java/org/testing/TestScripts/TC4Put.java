package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpsMethods;
import org.testing.Utilities.JSONFileLoading;
import org.testing.Utilities.Jsonvariablereplacement;
import org.testing.Utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4Put {

	//@Test 
	public void testcase4() throws IOException
	{
		Properties pr=LoadPropertiesFile.properties("../APIFrameTry2/src/test/java/URI.properties");
		String bodydata = JSONFileLoading.jsonload("../APIFrameTry2/src/test/java/org/testing/Resources/JSONDataForPut.json");

		bodydata=Jsonvariablereplacement.jsonvariablereplace(bodydata, "id", TC1Post.responseIdValue);
		HttpsMethods http = new HttpsMethods(pr);
		Response res=http.putMethod(bodydata, "QA_URI", TC1Post.responseIdValue);
		System.out.println("Status code is:" +res.statusCode());
		System.out.println("Data after updation:");
		System.out.println(res.asString());	
	}
}
