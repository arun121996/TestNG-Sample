package org.pom;

import java.io.IOException;

import org.utilities.BaseClass;

public class FbLogIn extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchchrome();
		loadurl("https://www.facebook.com/");
		winmax();
		printcurrenturl();
		printtitle();
		
		FaceBookPojo f = new FaceBookPojo();
	    fill(f.getTxtuser(), getdata(0, 0));
	    fill(f.getTxtpass(), getdata(0, 2));
	    btnclick(f.getTxtlogin());
		
	}
}
