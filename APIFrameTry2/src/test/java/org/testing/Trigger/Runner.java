package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1Post;
import org.testing.TestScripts.TC2Get;

public class Runner {

	public static void main(String[] args) throws IOException {
		TC1Post t1=new TC1Post();
		t1.testcase1();
		
		TC2Get t2=new TC2Get();
		t2.testcase2();		
	}
}