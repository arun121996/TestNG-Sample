package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class FaceBookPojo extends BaseClass {
	public FaceBookPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtuser;
	
	
	@FindBy(name="pass")
	private WebElement txtpass;
	
	
	@FindBy(name="login")
	private WebElement txtlogin;


	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}


	public WebElement getTxtlogin() {
		return txtlogin;
	}
	
	
	
}
