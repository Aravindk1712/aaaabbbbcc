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
		
		@FindBy(xpath="//a[@id='forbidden']")
		private WebElement forBidden;
		
		
		@FindBy(xpath="//a[@id='unauthorized']")
		private WebElement unauthorized;
		
		
		@FindBy(xpath="//a[@id='created']")
		private WebElement created;
		
		
		@FindBy(xpath="//a[@id='no-content']")
		private WebElement noContent;
		
		@FindBy(xpath="//a[@id='moved']")
		private WebElement moved;
		
		
		@FindBy(xpath="//a[@id='bad-request']")
		private WebElement badRequest;
		
		
		@FindBy(xpath="//a[@id='simpleLink']")
		private WebElement simepleLink;
		
		
		@FindBy(xpath="//a[@id='dynamicLink']")
		private WebElement dynamicLink;
		
		@FindBy(xpath="//span[@id='edit-record-2']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
		private WebElement editRecord2;
		
		@FindBy(xpath="//input[@id='salary']")
		private WebElement salary;
		
		@FindBy(xpath="//button[@id='submit']")
		private WebElement submit3;
		
		
		@FindBy(xpath="//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
		private WebElement editrec;
	
		
		@FindBy(xpath="//input[@id='age']")
		private WebElement age;
		
		
		@FindBy(xpath="//button[@id='submit']")
		private WebElement submit31;
	
		
		
		@FindBy(xpath="//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
		private WebElement editrec55;
		
		
		@FindBy(xpath="//input[@id='userEmail']")
		private WebElement emailChange;
		
		
		@FindBy(xpath="//button[@id='submit']")
		private WebElement submit81;
		
		public WebElement getvalidLinkCheck() {
			return validLinkCheck;
		}
		public WebElement getforBidden() {
			return forBidden;
		}
		public WebElement getunauthorized() {
			return unauthorized;
		}
		public WebElement getcreated() {
			return created;
		}
		public WebElement getnoContent() {
			return noContent;
		}
		public WebElement getmoved() {
			return moved;
		}
		public WebElement getbadRequest() {
			return badRequest;
		}
		public WebElement getsimpleLink() {
			return simepleLink;
		}
		public WebElement getdynamicLink() {
			return dynamicLink;
		}
		public WebElement geteditRecord2() {
			return editRecord2;
		}
		public WebElement getsalary() {
			return salary;
		}
		public WebElement getsubmit3() {
			return submit3;
		}
		public WebElement geteditrec() {
			return editrec;
		}
		public WebElement getage() {
			return age;
		}
		public WebElement getsubmit31() {
			return submit31;
		}
		public WebElement geteditrec55() {
			return editrec55;
		}
		public WebElement getemailChnage() {
			return emailChange;
		}
		public WebElement getsubmit81() {
			return submit81;
		}
		@FindBy(xpath="//input[@id='user-name']")
		private WebElement username;
		public WebElement getusername() {
			return username;
				
			}
		@FindBy(xpath="//input[@id='password']")
		private WebElement passWord;
		public WebElement getpassWord() {
			return passWord;
			

		}
		@FindBy(xpath="//input[@id='login-button']")

		private WebElement submit;
		public WebElement getsubmit() {
			return submit ;
			

		}

		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")

		private WebElement addtoCart;
		public WebElement getaddtoCart() {
			return addtoCart ;
			

		}
		@FindBy(xpath="//a[@class='shopping_cart_link']")

		private WebElement shoppingCart;
		public WebElement getshoppingCart() {
			return shoppingCart ;
			

		}

		@FindBy(xpath="//button[@id='checkout']")

		private WebElement mediumCheckout;
		public WebElement getmediumCheckout() {
			return mediumCheckout ;
			

		}
		@FindBy(xpath="//input[@id='first-name']")

		private WebElement firstName;
		public WebElement getfirstName() {
			return firstName ;
			

		}
		@FindBy(xpath="//input[@id='last-name']")

		private WebElement lastName;
		public WebElement getlastName() {
			return lastName ;
			

		}
		@FindBy(xpath="//input[@id='postal-code']")

		private WebElement zipCode;
		public WebElement getzipCode() {
			return zipCode ;
			

		}
		@FindBy(xpath="//input[@id='continue']")

		private WebElement continue2;
		public WebElement getcontinue2() {
			return continue2 ;
			

		}
		@FindBy(xpath="//div[text()='SauceCard #31337']")

		private WebElement print;
		public WebElement getprint() {
			return print ;
			

		}
}
