package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class thirdPage extends BaseClass{
	public thirdPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()=' Login ']")
	private WebElement log;
	public WebElement getlog() {
		return log;
	}
}
