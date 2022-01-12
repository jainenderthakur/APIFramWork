package org.testing.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoadXMLData {
	public static String readXml(String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader b =new BufferedReader(fr);
		String s="";
		String data="";
		while((s=b.readLine())!=null)
		{
			data=data+s;
		}
		
		return data;
		
	}
}