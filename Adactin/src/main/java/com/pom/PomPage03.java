package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement agree;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement next;

	public PomPage03(WebDriver driver2) {
	      this.driver=driver2;
	      PageFactory.initElements(driver2, this);
	}

	public WebElement getAgree() {
		return agree;
	}

	public void setAgree(WebElement agree) {
		this.agree = agree;
	}

	public WebElement getNext() {
		return next;
	}

	public void setNext(WebElement next) {
		this.next = next;
	}
	


	
	
}
