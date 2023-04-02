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
	public WebElement getElement() {
		return Element;
	}
	
	@FindBy(xpath="//span[normalize-space()='Text Box']")
	private WebElement textBox;
	public WebElement gettextBox() {
		return textBox;
	}
	@FindBy(xpath="//input[@id='userName']")
	private WebElement userName;
	public WebElement getuserName() {
		return userName;
	}
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement userEmail;
	public WebElement getuserEmail() {
		return userEmail;
	}
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement currentAddress;
	public WebElement getusercurrentAddress() {
		return userEmail;
	}
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	private WebElement permanentAddress;
	public WebElement getpermanentAddress() {
		return permanentAddress;
	}
	
	@FindBy(xpath="//button [@Id='submit']")
	private WebElement subMit;
	public WebElement getSubMit() {
		return subMit;
	}

	@FindBy(xpath="//span[normalize-space()='Check Box']")
	private WebElement checkBox;
	public WebElement getcheckBox() {
		return checkBox;
	}
	
	@FindBy(xpath="//button[@class='rct-option rct-option-expand-all']")
	private WebElement expandAll;
	public WebElement getexpandAll() {
		return expandAll;
	}
	
	@FindBy(xpath="//span[contains(text(),'Word File.doc')]")
	private WebElement workFile;
	public WebElement getworkFile() {
		return workFile;
	}
	@FindBy(xpath="//span[normalize-space()='Radio Button']")
	private WebElement radioButton;
	public WebElement getradioButton() {
		return radioButton;
	}
	@FindBy(xpath="//label[normalize-space()='Yes']")
	private WebElement yesButton;
	public WebElement getyesButton() {
		return yesButton;
	}
	@FindBy(xpath="//span[normalize-space()='Buttons']")
	private WebElement Buttons;
	public WebElement getButtons() {
		return Buttons;
	}
	@FindBy(xpath="//span[normalize-space()='Web Tables']")
	private WebElement webTables;
	public WebElement getwebTables() {
		return webTables;
	}
	@FindBy(xpath="//span[@id='edit-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
	private WebElement editRecord;
	public WebElement geteditRecord() {
		return editRecord;
	}
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstNa;
	public WebElement getfirstNa() {
		return firstNa;
	}
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastNa;
	public WebElement getlastNa() {
		return lastNa;
	}
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitClick;
	public WebElement getsubmitClick() {
		return submitClick;
	}
	@FindBy(xpath="//span[normalize-space()='Radio Button']")
	private WebElement radioButton1;
	public WebElement getradioButton1() {
		return radioButton1;
	}
	
	
	
	@FindBy(xpath="//label[normalize-space()='Impressive']")
	private WebElement impressive;
	public WebElement getimpressive() {
		return impressive;
	}
	@FindBy(xpath="//span[@id='delete-record-3']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")
	private WebElement deleteRecord;
	public WebElement getdeleteRecord() {
		return deleteRecord;
	}
	
	@FindBy(xpath="//span[normalize-space()='Links']")
	private WebElement links;
	public WebElement getlinks() {
		return links;
	}
	@FindBy(xpath="//a[@id='invalid-url']")
	private WebElement invalidUrl;
	public WebElement getinvalidUrl() {
		return invalidUrl;
	}
	
	@FindBy(xpath="//span[normalize-space()='Broken Links - Images']")
	private WebElement brokenUrl;
	public WebElement getbrokenUrl() {
		return brokenUrl;
	}
	@FindBy(xpath="//a[translate(normalize-space(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='click here for broken link']")
	private WebElement brokenUrl2;
	public WebElement getbrokenUrl2() {
		return brokenUrl2;
	}
	
}
