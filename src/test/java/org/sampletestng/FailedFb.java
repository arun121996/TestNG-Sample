package org.sampletestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedFb implements IRetryAnalyzer {
     
	int min =0;  int max =3;
	
	
	public boolean retry(ITestResult result ) {
		if (min<max) {
			return true;
		}
		
		
		return false;
	}
	
	
	

}
