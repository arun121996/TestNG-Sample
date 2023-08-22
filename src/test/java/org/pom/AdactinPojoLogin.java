package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class AdactinPojoLogin extends BaseClass{
	public AdactinPojoLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement txtuser;
	
	@FindBy(name="password")
	private WebElement txtpass;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement txtlogin;

	@FindBy(xpath="//select[@id='location']")
	private WebElement txtloction;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement txthotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement txtroomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement txtnoofroom;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement txtadults;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement txtchild;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement txtenter;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radiobtn;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fullname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccno;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ccmonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ccyear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getTxtlogin() {
		return txtlogin;
	}

	public WebElement getTxtloction() {
		return txtloction;
	}

	public WebElement getTxthotel() {
		return txthotel;
	}

	public WebElement getTxtroomtype() {
		return txtroomtype;
	}

	public WebElement getTxtnoofroom() {
		return txtnoofroom;
	}

	public WebElement getTxtadults() {
		return txtadults;
	}

	public WebElement getTxtchild() {
		return txtchild;
	}

	public WebElement getTxtenter() {
		return txtenter;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
	
	
		
}
