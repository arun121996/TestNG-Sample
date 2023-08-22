package org.sampletestng;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pom.CrazySalesPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrazyLogin extends BaseClass{
	
	@BeforeClass
	private void openbrowser() {
//	launchchrome();
		System.out.println("start scenario");
	
	}
	
	@BeforeMethod
	private void starttime() {
		System.out.println(new Date());
	}
	@AfterMethod
	private void endtime() {
		System.out.println(new Date());
	}
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc1(String name) throws InterruptedException, IOException {
		if (name.equals("chrome")) {
			launchchrome();
			}
		else if (name.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		CrazySalesPojo c = new CrazySalesPojo();
		loadurl("https://www.crazysales.com.au/");
		printcurrenturl();
		printtitle();
		winmax();
		mousemove(c.getLoginlogoclk());
		Thread.sleep(2000);
		fill(c.getTxtuser(), getdata(6, 2));
		fill(c.getTxtpass(), getdata(6, 3));
		btnclick(c.getTxtlogin());
		System.out.println("Thread.currentThread().getId();");
	}
	
	@AfterClass
	private void browserclose() {
//		closebrowser();
		System.out.println("ends scenario");
	}
	

}
