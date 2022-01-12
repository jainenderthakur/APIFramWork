package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;


public class JsonParsing {
	
	public static String jsonparse(String response, String keyName)
	{
		JSONObject ob=new JSONObject(response);
		return ob.getString(keyName);
		
//		if(response.startsWith("{"))
//		{
//			JSONObject js=new JSONObject(response);
//			return js.getString(keyName);
//		}
//		return keyName;
	}
	
	public static void jsonParseAllkeys(String response, String keyName)
	{
		JSONArray js=new JSONArray(response);
		int l=js.length();
		for(int i=0; i<l; i++)
		{
			JSONObject on=new JSONObject(i);
			System.out.println(keyName);
		}
	}
	
	public static String jsonParseUsingjsonPath(Response res, String jsonPath)
	{
		return res.jsonPath().getString(jsonPath);
	}
}