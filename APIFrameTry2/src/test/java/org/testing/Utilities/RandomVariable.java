package org.testing.Utilities;

import java.util.Random;

public class RandomVariable {
	
	public static String random()
	{
		Random r=new Random();
		Integer i=r.nextInt();
		return i.toString();
	}

}