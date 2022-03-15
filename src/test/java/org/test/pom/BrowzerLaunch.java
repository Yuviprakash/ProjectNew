package org.test.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class BrowzerLaunch extends BaseClass {

	public static void main(String[] args) {
		
		chromeLaunch();
		urlLaunch("https://www.facebook.com/");
		maxi();
		impWait(5);
		
		Loginpage l=new Loginpage();
		l.start();
		
		sendKeys(l.getTxtusername(),"Prakash");
		sendKeys(l.getTxtpassword(),"9486339158");
		click(l.getBtnlogin());
		
		

	}

	


}
