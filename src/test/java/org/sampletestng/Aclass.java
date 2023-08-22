package org.sampletestng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Aclass {
	
	
	@Test(groups= "smoke")
	private void tc11() {
		System.out.println("tc11:" +Thread.currentThread().getId());
	}
	
	@Test(groups="sanity")
	private void tc22() {
		System.out.println("tc22:" +Thread.currentThread().getId());
	}
	@Test(groups="regression")
	private void tc33() {
		System.out.println("tc33:" + Thread.currentThread().getId());
	}
}
