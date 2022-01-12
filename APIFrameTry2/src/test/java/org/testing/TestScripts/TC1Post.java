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

public class TC1Post {
	static String responseIdValue;
	
	//@Test 
	public void testcase1() throws IOException	
	{
		String bodydata = JSONFileLoading.jsonload("../APIFrameTry2/src/test/java/org/testing/Resources/JSONDataForPost.json");
//		System.out.println("Before Replacement :: "+ bodydata);
		
		String randomID=RandomVariable.random();
		System.out.println(randomID);
		
		bodydata=Jsonvariablereplacement.jsonvariablereplace(bodydata, "id", randomID);
//		System.out.println("After Replacement :: "+ bodydata);
		
		Properties pr=LoadPropertiesFile.properties("../APIFrameTry2/src/test/java/URI.properties");
		
		HttpsMethods http=new HttpsMethods(pr);
		Response r=http.postMethod("QA_URI", bodydata);
		
		responseIdValue=JsonParsing.jsonparse(r.asString(), "id");
		System.out.println(responseIdValue);
	}

}