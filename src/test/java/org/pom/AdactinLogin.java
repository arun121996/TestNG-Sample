package org.pom;

import java.io.IOException;

import org.utilities.BaseClass;

public class AdactinLogin extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		launchchrome();
		loadurl("http://www.adactin.com/HotelApp/");
		winmax();
		printcurrenturl();
		printtitle();
		Thread.sleep(2000);
		AdactinPojoLogin a = new AdactinPojoLogin();
		
		fill(a.getTxtuser(), getdata(0, 2));
		
		fill(a.getTxtpass(), getdata(0, 4));
		btnclick(a.getTxtlogin());
		
		
		mousemove(a.getTxtloction());
		dropdown(a.getTxtloction(), getdata(1, 2));
		
		
		mousemove(a.getTxthotel());
		dropdown(a.getTxthotel(), getdata(1, 4));
		
		
		mousemove(a.getTxtroomtype());
		dropdown(a.getTxtroomtype(), getdata(1, 6));
		
		mousemove(a.getTxtnoofroom());
		dropdownid(a.getTxtnoofroom(), 2);
		
		mousemove(a.getTxtadults());
		dropdownid(a.getTxtadults(), 3);
		
		mousemove(a.getTxtchild());
		dropdownid(a.getTxtchild(), 1);
		
		mousemove(a.getTxtenter());
		
		btnclick(a.getRadiobtn());
		
		btnclick(a.getCont());
		
		fill(a.getFullname(), getdata(2, 2));
		
		fill(a.getLastname(), getdata(2, 4));
		
		fill(a.getAddress(), getdata(2, 6));
		
		fill(a.getCcno(), getdata(2, 8));
		
		mousemove(a.getCctype());
		dropdown(a.getCctype(), getdata(2, 11));
		
		mousemove(a.getCcmonth());
		dropdownid(a.getCcmonth(), 11);
		
		mousemove(a.getCcyear());
		dropdownid(a.getCcyear(), 12);
		
		fill(a.getCvv(), getdata(2, 16));
		
		btnclick(a.getBook());
		
		
		
	}
}
