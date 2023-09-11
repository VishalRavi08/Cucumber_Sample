package org.fbpojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPojo extends BaseClass{
	
	public FBPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement creatNew;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstName;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement secondName;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement mobOrEmail;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement password;
	
	public WebElement getCreatNew() {
		return creatNew;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSecondName() {
		return secondName;
	}

	public WebElement getMobOrEmail() {
		return mobOrEmail;
	}

	public WebElement getPassword() {
		return password;
	}

}
