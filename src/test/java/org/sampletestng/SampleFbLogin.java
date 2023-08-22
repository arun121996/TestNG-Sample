package org.sampletestng;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.pom.FaceBookPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFbLogin extends BaseClass {

	@BeforeClass
	public void startscenario() {
		System.out.println("start scenario");
	}

	@AfterClass
	public void endscenario() {
		System.out.println("end scenario");
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
	@Test(retryAnalyzer=FailedFb.class)
	public void tc11() throws IOException, InterruptedException {
		launchchrome();
		winmax();
		driver.get("https://www.facebook.com/");
		driver.getCurrentUrl();
		FaceBookPojo f = new FaceBookPojo();

		fill(f.getTxtuser(), getdata(4, 2));
		fill(f.getTxtpass(), getdata(4, 4));
		btnclick(f.getTxtlogin());
		assertTrue(false, "verify the assert");
		System.out.println("tc11:" +Thread.currentThread().getId());
		Thread.sleep(2000);
		closebrowser();
	}
    
	@Test
	public void tc22() throws IOException, InterruptedException {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new InternetExplorerDriver();
		launchchrome();
		winmax();
		driver.get("https://www.facebook.com/");
		driver.getCurrentUrl();
		FaceBookPojo f = new FaceBookPojo();

		fill(f.getTxtuser(), getdata(4, 2));
		fill(f.getTxtpass(), getdata(4, 4));
		btnclick(f.getTxtlogin());
		System.out.println("tc22:" +Thread.currentThread().getId());
		Thread.sleep(2000);
		closebrowser();
	}
	

	@Test
	public void tc33() throws IOException, InterruptedException {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		launchchrome();
		winmax();
		driver.get("https://www.facebook.com");
		driver.getCurrentUrl();
		FaceBookPojo f = new FaceBookPojo();

		fill(f.getTxtuser(), getdata(4, 2));
		fill(f.getTxtpass(), getdata(4, 4));
		btnclick(f.getTxtlogin());
		System.out.println("tc33:" + Thread.currentThread().getId());
		Thread.sleep(2000);
		closebrowser();
		
		
		
		
	}
}
