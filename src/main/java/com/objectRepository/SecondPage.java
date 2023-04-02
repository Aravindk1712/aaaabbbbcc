package com.objectRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	import com.resources.BaseClass;

	public class SecondPage extends BaseClass {
		public SecondPage() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[normalize-space()='Click Here for Valid Link']")
		private WebElement validLinkCheck;
		public WebElement getvalidLinkCheck() {
			return validLinkCheck;
		}
		@FindBy(xpath="//a[@id='forbidden']")
		private WebElement forBidden;
		public WebElement getforBidden() {
			return forBidden;
		}
		
		@FindBy(xpath="//a[@id='unauthorized']")
		private WebElement unauthorized;
		public WebElement getunauthorized() {
			return unauthorized;
		}
		
		@FindBy(xpath="//a[@id='created']")
		private WebElement created;
		public WebElement getcreated() {
			return created;
		}
		
		@FindBy(xpath="//a[@id='no-content']")
		private WebElement noContent;
		public WebElement getnoContent() {
			return noContent;
		}
		@FindBy(xpath="//a[@id='moved']")
		private WebElement moved;
		public WebElement getmoved() {
			return moved;
		}
		
		@FindBy(xpath="//a[@id='bad-request']")
		private WebElement badRequest;
		public WebElement getbadRequest() {
			return badRequest;
		}
		
		@FindBy(xpath="//a[@id='simpleLink']")
		private WebElement simepleLink;
		public WebElement getsimpleLink() {
			return simepleLink;
		}
		
		@FindBy(xpath="//a[@id='dynamicLink']")
		private WebElement dynamicLink;
		public WebElement getdynamicLink() {
			return dynamicLink;
		}
		@FindBy(xpath="//span[@id='edit-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
		private WebElement editRecord2;
		public WebElement geteditRecord2() {
			return editRecord2;
		}
		@FindBy(xpath="//input[@id='salary']")
		private WebElement salary;
		public WebElement getsalary() {
			return salary;
		}
		@FindBy(xpath="//button[@id='submit']")
		private WebElement submit3;
		public WebElement getsubmit3() {
			return submit3;
		}
		
		@FindBy(xpath="//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
		private WebElement editrec;
		public WebElement geteditrec() {
			return editrec;
		}
		
		@FindBy(xpath="//input[@id='age']")
		private WebElement age;
		public WebElement getage() {
			return age;
		}
		
		@FindBy(xpath="//button[@id='submit']")
		private WebElement submit31;
		public WebElement getsubmit31() {
			return submit31;
		}

		
		
		@FindBy(xpath="//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
		private WebElement editrec55;
		public WebElement geteditrec55() {
			return editrec55;
		}
		
		@FindBy(xpath="//input[@id='userEmail']")
		private WebElement emailChange;
		public WebElement getemailChnage() {
			return emailChange;
		}
		
		@FindBy(xpath="//button[@id='submit']")
		private WebElement submit81;
		public WebElement getsubmit81() {
			return submit81;
		}

}
