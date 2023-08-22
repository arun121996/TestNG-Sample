package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class CrazySalesPojo extends BaseClass {
	public CrazySalesPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[text()='Sign In'])[1]")
	private WebElement loginlogoclk;
	
	@FindBy(id="email")
	private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login-button")
	private WebElement txtlogin;
	
	@FindBy(xpath="(//input[@class='input151'])[1]")
	private WebElement txtfullname;
	
	@FindBy(xpath="(//input[@class='input151'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@class='input151'])[3]")
	private WebElement postalcode;
	
	@FindBy(xpath="(//input[@class='input291'])[1]")
	private WebElement phno;	
	
	@FindBy(xpath="(//input[@class='input291'])[2]")
	private WebElement address;
	
	@FindBy(xpath="//input[@class='buttonred176']")
	private WebElement addressbookclk;

	public WebElement getLoginlogoclk() {
		return loginlogoclk;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getTxtlogin() {
		return txtlogin;
	}

	public WebElement getTxtfullname() {
		return txtfullname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAddressbookclk() {
		return addressbookclk;
	}
	
}
