package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class DemoQa extends BaseClass {
	public DemoQa() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]/div[1]")
	private WebElement Element;
	
	
	@FindBy(xpath="//span[normalize-spa"+ ""+ "ce()='Text Box']")
	private WebElement textBox;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement userEmail;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement currentAddress;
	
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	private WebElement permanentAddress;
	
	
	@FindBy(xpath="//button [@Id='submit']")
	private WebElement subMit;
	

	@FindBy(xpath="//span[normalize-space()='Check Box']")
	private WebElement checkBox;
	
	
	@FindBy(xpath="//button[@class='rct-option rct-option-expand-all']")
	private WebElement expandAll;
	
	
	@FindBy(xpath="//span[contains(text(),'Word File.doc')]")
	private WebElement workFile;
	
	@FindBy(xpath="//span[normalize-space()='Radio Button']")
	private WebElement radioButton;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	private WebElement yesButton;
	
	@FindBy(xpath="//span[normalize-space()='Buttons']")
	private WebElement Buttons;
	
	@FindBy(xpath="//span[normalize-space()='Web Tables']")
	private WebElement webTables;
	
	@FindBy(xpath="//span[@id='edit-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
	private WebElement editRecord;
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstNa;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastNa;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitClick;
	
	@FindBy(xpath="//span[normalize-space()='Radio Button']")
	private WebElement radioButton1;
	
	
	
	
	@FindBy(xpath="//label[normalize-space()='Impressive']")
	private WebElement impressive;
	
	@FindBy(xpath="//span[@id='delete-record-3']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")
	private WebElement deleteRecord;
	
	
	@FindBy(xpath="//span[normalize-space()='Links']")
	private WebElement links;
	
	@FindBy(xpath="//a[@id='invalid-url']")
	private WebElement invalidUrl;
	
	@FindBy(xpath="//span[normalize-space()='Broken Links - Images']")
	private WebElement brokenUrl;
	
	@FindBy(xpath="//a[translate(normalize-space(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='click here for broken link']")
	private WebElement brokenUrl2;
	
	public WebElement getElement() {
		return Element;
	}
	public WebElement getworkFile() {
		return workFile;
	}
	
	public WebElement gettextBox() {
		return textBox;
	}
	public WebElement getuserName() {
		return userName;
	}
	public WebElement getuserEmail() {
		return userEmail;
	}
	public WebElement getusercurrentAddress() {
		return currentAddress;
	}
	public WebElement getpermanentAddress() {
		return permanentAddress;
	}
	public WebElement getSubMit() {
		return subMit;
	}
	
	public WebElement getcheckBox() {
		return checkBox;
	}
	public WebElement getlastNa() {
		return lastNa;
	}
	
	public WebElement getexpandAll() {
		return expandAll;
	}
	public WebElement getradioButton() {
		return radioButton;
	}
	public WebElement getyesButton() {
		return yesButton;
	}
	public WebElement getButtons() {
		return Buttons;
	}
	public WebElement getwebTables() {
		return webTables;
	}
	public WebElement geteditRecord() {
		return editRecord;
	}
	public WebElement getfirstNa() {
		return firstNa;
	}
	public WebElement getsubmitClick() {
		return submitClick;
	}
	public WebElement getradioButton1() {
		return radioButton1;
	}
	public WebElement getimpressive() {
		return impressive;
	}
	public WebElement getdeleteRecord() {
		return deleteRecord;
	}
	public WebElement getlinks() {
		return links;
	}
	public WebElement getinvalidUrl() {
		return invalidUrl;
	}
	public WebElement getbrokenUrl() {
		return brokenUrl;
	}
	public WebElement getbrokenUrl2() {
		return brokenUrl2;
	}
	
}

