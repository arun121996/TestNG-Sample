package org.sampletestng;

import org.testng.annotations.Test;

public class Bclass {
	@Test
	private void tc1() {
		System.out.println("tc1:" +Thread.currentThread().getId());
	}
	@Test(groups="smoke")
	private void tc2() {
		System.out.println("tc2:" +Thread.currentThread().getId());
	}
	@Test
	private void tc3() {
		System.out.println("tc3:" + Thread.currentThread().getId());
	}
}
