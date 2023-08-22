package org.sampletestng;

import java.io.IOException;
import java.util.Date;

import org.pom.AdactinPojoLogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class SampleAdactinLogin extends BaseClass {
	@BeforeClass(alwaysRun=true)
	private void startscenario() {
		
	}
	@AfterClass(alwaysRun=true)
	private void endscenario() {
       
	}
	@BeforeMethod
	private void startswith() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endswith() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	private void tc1() throws IOException, InterruptedException {
		launchchrome();
		winmax();
		AdactinPojoLogin a = new AdactinPojoLogin();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.getCurrentUrl();
		fill(a.getTxtuser(),getdata(0, 2));
		fill(a.getTxtpass(), getdata(0, 4));
		btnclick(a.getTxtlogin());
		System.out.println("tc1: " + Thread.currentThread().getId());
		Thread.sleep(2000);
		 closebrowser();
	}
	@Parameters({"email","pass"})
	@Test
	private void tc2(String s1 ,String s2) throws IOException, InterruptedException {
		launchchrome();
		winmax();
		AdactinPojoLogin a = new AdactinPojoLogin();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.getCurrentUrl();
		fill(a.getTxtuser(),s1);
		fill(a.getTxtpass(), s2);
		btnclick(a.getTxtlogin());
		System.out.println("tc2: " +Thread.currentThread().getId());
		Thread.sleep(2000);
		 closebrowser();
	
	}
	
	
	@Test(dataProvider="login")
	private void tc3(String s1,String s2) throws IOException, InterruptedException {
		launchchrome();
		winmax();
		AdactinPojoLogin a = new AdactinPojoLogin();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.getCurrentUrl();
		fill(a.getTxtuser(),s1);
		fill(a.getTxtpass(), s2);
		btnclick(a.getTxtlogin());
		System.out.println("tc3: " +Thread.currentThread().getId());
		Thread.sleep(2000);
		 closebrowser();
		
	}
	@DataProvider(name="login")
	
	private String[][] data() {
		

		
		return new String[][] {
			{"java","java@123"},
			{"sql","sql@123"},	
			{"python","python@123"},
			{"oracle","oracle@123"},		
			{"selenium","selenium@123"}
			
		};
	
	
	}	
	
	
}
	
	
	
//	@DataProvider(name="login")
//	public Object[][] data() {
//		
//		return new Object[][] {
//			{"java","java@123"},
//			{"sql","sql@123"},
//			{"python","python@123"},
//			{"oracle","oracle@123"},
//			{"selenium","selenium@123"}
//		};
//
//	}
	

