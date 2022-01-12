package org.testing.Utilities;

import java.util.regex.Pattern;

public class Jsonvariablereplacement {
	public static String jsonvariablereplace(String data, String keyName, String keyValue)
	{		
		data=data.replaceAll(Pattern.quote("{{"+keyName+"}}"), keyValue);
		return data;
	}

}