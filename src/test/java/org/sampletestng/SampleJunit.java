package org.sampletestng;

import java.io.IOException;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class SampleJunit{

	
	
	@Parameters({"browser"})
	@Test
		public void tc1(String name) throws IOException, InterruptedException {
			
			System.out.println(Thread.currentThread().getId()+":test1" +name);
			

	}
	
	
}
