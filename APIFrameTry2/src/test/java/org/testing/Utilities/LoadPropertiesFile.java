package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile {
	
	public static Properties properties(String path) throws IOException
	{
		File f = new File(path);
		FileInputStream fi=new FileInputStream(f);  
		Properties p=new Properties();
		p.load(fi);
		return p;
	}
}