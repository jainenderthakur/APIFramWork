package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONFileLoading {
	
	public static String jsonload(String path) throws IOException 

	{ 
		File f=new File(path);
		FileInputStream fs=new FileInputStream(f);
		
		JSONTokener jt = new JSONTokener(fs);
		JSONObject jo = new JSONObject(jt);	

		return jo.toString();
	}

}