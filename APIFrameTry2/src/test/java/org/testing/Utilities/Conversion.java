package org.testing.Utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion {
	
	public static String xmltoJson(String xmlData)
	{
		JSONObject js=XML.toJSONObject(xmlData);
		return js.toString();
	}
	
	public static String Jsontoxml(String jsonData)
	{
		JSONObject obj=new JSONObject(jsonData);
		return XML.toString(obj);
	}

}
