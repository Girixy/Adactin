package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PomPage02 {

	public static WebDriver Driver;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement start;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement end;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement submit;

	public PomPage02(WebDriver driver2) {
		this.Driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getStart() {
		return start;
	}

	public void setStart(WebElement start) {
		this.start = start;
	}

	public WebElement getEnd() {
		return end;
	}

	public void setEnd(WebElement end) {
		this.end = end;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getChild() {
		return child;
	}

	public void setChild(WebElement child) {
		this.child = child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	

	

	

	
	
}
