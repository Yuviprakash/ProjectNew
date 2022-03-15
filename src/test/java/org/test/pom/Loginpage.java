package org.test.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	
	public void start() 
	{
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnlogin;
	
	///....GETTER........///
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
		
}
