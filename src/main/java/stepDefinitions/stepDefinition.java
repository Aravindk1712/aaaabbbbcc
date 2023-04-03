package stepDefinitions;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.objectRepository.AddToCart;
import com.objectRepository.DemoQa;
import com.objectRepository.FrontPage;
import com.objectRepository.LoginPage;
import com.objectRepository.ProductPage;
import com.objectRepository.SecondPage;
import com.objectRepository.thirdPage;
import com.resources.BaseClass;


public class stepDefinition extends BaseClass {
DemoQa d;
SecondPage s;
thirdPage t;

LoginPage l;
FrontPage f;
ProductPage p;
AddToCart a;

@Before
public void initilization() {
	 LaunchBrowser();
	 
}
@After
public void end() {
	driver.close();
	
	
}

	@Given("User should open the url")
	public void user_should_open_the_url() {
		LaunchURL("https://demoqa.com/");
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //driver.findElement(By.xpath("//div[text()=' Login ']")).click();
		LaunchJavascript();
	  
	}

	
	
	@When("User should click the element button")
	public void User_should_click_the_element_button()  {
	    d=new DemoQa();
		d.getElement().click();
	    
	}

	@When("User should click the text box and enter all the details")
	public void User_should_click_the_text_box_and_enter_all_the_details() throws InterruptedException {
		 d=new DemoQa();
		d.gettextBox().click();
		
		d.getuserName().sendKeys("Arav");
		d.getuserEmail().sendKeys("Aravind@demoqa.com");
		d.getusercurrentAddress().sendKeys("No 21 , neela nagar, 2nd street , Chennai-100");
		
		d.getpermanentAddress().sendKeys("No 21 , neela nagar, 2nd street , Chennai-100");
		
	}
	@When("User should click the submit button")
	public void User_should_click_the_submit_button() throws AWTException, InterruptedException {
		d=new DemoQa();
		
		LaunchJavascript();
		d.getSubMit().click();
		
		
		   
		
	}
	
	@When("User should click the check box")
	public void User_should_click_the_check_box() throws InterruptedException {
		d=new DemoQa();
		d.getcheckBox().click();
		
		d.getexpandAll().click();
		//label[text()='Permanent Address']//following::div//button
		//driver.findElement(By.xpath("//label[text()='Permanent Address']//following::div//button")).click();
		LaunchJavascript();
		 
		
	}
	@When("User should click the home  button and click workfile.doc")
	public void user_should_click_the_home_button_and_click_workfile_doc() throws InterruptedException {
		d= new DemoQa();
		
		d.getworkFile().click();
		
		
		
		 
		
	}
	
	@When("User should click the radiobutton option")
	public void user_should_click_the_radiobutton_option() {
		
		d=new DemoQa();
		d.getradioButton().click();
		
	    
	}
	@When("User should click the yes for the answer")
	public void user_should_click_the_yes_for_the_answer() {
		d=new DemoQa();
		
		d.getyesButton().click();
		
	    
	}
	@When("User should click the button option")
	public void user_should_click_the_button_option() throws InterruptedException {
		d=new DemoQa();
		
		d.getButtons().click();
		
	   
	}
	@When("User should click the double click")
	
	
	public void user_should_click_the_double_click() throws InterruptedException {
		d=new DemoQa();
		
LaunchJavascript();
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]")); 
		act.doubleClick(ele).perform();
		
		
	}

@When("User should click the webtable option")
public void user_should_click_the_webtable_option() {
	d=new DemoQa();
	
	d.getwebTables().click();
}
@When("User should click the edit option and submit")
public void user_should_click_the_edit_option_and_submit() throws InterruptedException {
	d=new DemoQa();
	
LaunchJavascript();
	d.geteditRecord().click();
	d.getfirstNa().sendKeys("Arav");
	d.getlastNa().sendKeys("kum");
	d.getsubmitClick().click();
	
	

	
}
@When("User should click the radio_button option")
public void user_should_click_the_radio_button_option() {
	d=new DemoQa();
	d.getradioButton1().click();
	
    
    
}
@When("User should click the Impressive")
public void user_should_click_the_Impressive() throws InterruptedException {
	
	d=new DemoQa();
	d.getimpressive().click();
	
	
	
	
	
    
   
}
@When("User should click the delete button")
public void user_should_click_the_delete_button() throws InterruptedException {
	d=new DemoQa();
	
	d.getdeleteRecord().click();
	
	
	
	
	
    
   
}
@When("User should click the Rightclick option")
public void user_should_click_the_Rightclick_option() throws InterruptedException {
	
	d=new DemoQa();
LaunchJavascript();
	
	Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//button[@id='rightClickBtn']")); 
	act.contextClick(ele).perform();
	
	
}

@When("User should click the link option")
public void user_should_click_the_link_option() throws InterruptedException {
	
	d=new DemoQa();
	d.getlinks().click();
	
	
	
	
   
   
}
@When("User should click the notfound option")
public void user_should_click_the_notfound_option() throws InterruptedException {
	
	d=new DemoQa();
LaunchJavascript();
	
	d.getinvalidUrl().click(); 
	
	
	
}
@When("User should click the brokenlink option")
public void user_should_click_the_brokenlink_option() throws InterruptedException {
	d=new DemoQa();
	d.getbrokenUrl().click();
	
	
	
	
   
   
}
@When("User should click the brokenlink")
public void user_should_click_the_brokenlink() throws InterruptedException {
	d=new DemoQa();
	
	d.getbrokenUrl2().click(); 
	
	}
@When("User should click the validlink")
public void user_should_click_the_validlink() throws InterruptedException {
	
	

	s=new SecondPage();
	
	s.getvalidLinkCheck().click(); 
	
	
	
}
@When("User should click the forbidden option")
public void user_should_click_the_forbidden_option() throws InterruptedException {
	
	s=new SecondPage();
LaunchJavascript();
	s.getforBidden().click(); 
	
	
}

@When("User should click the unauthorized option")
public void user_should_click_the_unauthorized_option() throws InterruptedException {
	
	s=new SecondPage();

	LaunchJavascript();
	
	s.getunauthorized().click(); 
	
	
	
}

@When("User should click the created option")
public void user_should_click_the_created_option() throws InterruptedException {
	
	s=new SecondPage();
LaunchJavascript();
	
	s.getcreated().click(); 
	
	
	
}
@When("User should click the nocontent option")
public void user_should_click_the_nocontent_option() throws InterruptedException {
	
	s=new SecondPage();
LaunchJavascript();
	s.getnoContent().click(); 
	
	
	
}

@When("User should click the moved option")
public void user_should_click_the_moved_option() throws InterruptedException {
	
	s=new SecondPage();

	LaunchJavascript();
	
	s.getmoved().click(); 
	
	
	
}


@When("User should click the badrequest option")
public void user_should_click_the_badrequest_option() throws InterruptedException {
	
	s=new SecondPage();
LaunchJavascript();
	s.getbadRequest().click(); 
	
	
	
}
@When("User should click the home option")
public void user_should_click_the_home_option() throws InterruptedException {
	
	
	s=new SecondPage();
	LaunchJavascript();
	
	s.getsimpleLink().click(); 
	
	
	
}
@When("User should click the homevPSkr option")
public void user_should_click_the_homevPSkr_option() throws InterruptedException {
	
	s=new SecondPage();
LaunchJavascript();
	
	s.getdynamicLink().click(); 


	
	
}
@When("User should click the edit option and edit salary")
public void user_should_click_the_edit_option_and_edit_salary() throws InterruptedException {
	
	s=new SecondPage();

	LaunchJavascript();
	s.geteditRecord2().click();
	s.getsalary().sendKeys("200");
    s.getsubmit3().click();
	
	

	
}

@When("User should click the edit option and edit age")
public void user_should_click_the_edit_option_and_edit_age() throws InterruptedException {
	
	s=new SecondPage();
LaunchJavascript();
	s.geteditrec().click();
	
	s.getage().sendKeys("19");
    s.getsubmit31().click();
	
	

	
}
@When("User should click the edit option and edit email")
public void user_should_click_the_edit_option_and_edit_email() throws InterruptedException {
	s=new SecondPage();
	

	LaunchJavascript();
	s.geteditrec55().click();
	s.getemailChnage().sendKeys("aravindk1994@gmail.com");
  s.getsubmit81().click();
	
	

	
}
@When("User should click the edit option and change department")
public void user_should_click_the_edit_option_and_change_department() throws InterruptedException {
	
	
	s=new SecondPage();
LaunchJavascript();
	driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	Actions act = new Actions(driver);
	WebElement elem =driver.findElement(By.xpath("//input[@id='department']")); 
	elem.click();
	act.doubleClick(elem).perform();
	elem.sendKeys("legal");
	
     driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}@When("User should click the edit option and change lastname")
public void user_should_click_the_edit_option_and_change_lastname() throws InterruptedException {
	
	s=new SecondPage();

	LaunchJavascript();
	driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")).click();
	Actions act = new Actions(driver);
	WebElement eleme =driver.findElement(By.xpath("//input[@id='lastName']")); 
	eleme.click();
	act.doubleClick(eleme).perform();
	eleme.sendKeys("abcd");

     driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	

	
}

@Given("User launch open the url")
public void user_launch_open_the_url() {
     
    driver.get("https://demo.cyclos.org/ui/home");
    driver.manage().window().maximize();
    
    
    driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
}

@When("User should enter the {string} and {string}")
public void user_should_enter_the_and(String User, String pass) {
	driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys(User);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	driver.findElement(By.xpath("//span[text()='Submit']")).click();
}
@When("User should click the edit profile   button")
public void user_should_click_the_edit_profile_button() throws InterruptedException {
	driver.findElement(By.xpath("//a[@href='/users/self/profile/edit']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
	   
    driver.findElement(By.xpath("//input[@id='landLinePhoneNumber']")).sendKeys("044-22771317");
    driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
   
}
@When("User should change the name and add mobile number and click save button")
public void user_should_change_the_name_and_add_mobile_number_and_click_save_button() {
	
}

@When("User should click the switch theme button new  button")
public void user_should_click_the_switch_theme_button_new_button() throws InterruptedException {
    
	driver.findElement(By.xpath("//a[@href='/personal/settings']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
	
	
}

@When("User should click the payment button")
public void user_should_click_the_payment_button() throws AWTException, InterruptedException {
    
    driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
     driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys(" Car");
     driver.findElement(By.xpath("//a[text()=' Car repair ']")).click();
     driver.findElement(By.xpath(" //input[@id='id_4']")).sendKeys("100");
    
     driver.findElement(By.xpath("//div[@class='w-100 mw-100 text-truncate pr-3']"));
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     
     driver.findElement(By.xpath("//span[text()='Confirm']")).click();
     
    /*WebElement drop = driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']"));
    drop.click();
    driver.findElement(By.xpath("//a[text()=' Car repair ']")).click();
    driver.findElement(By.xpath("//input[contains(@id,'id')]")).sendKeys("200");
    driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
    driver.findElement(By.xpath("//textarea[contains(@id,'id')]")).sendKeys("Payment done");
    driver.findElement(By.xpath("//span[text()='Next']")).click();*/
    
}
@When("User should enter the value and click confirm button")
public void user_should_enter_the_value_and_click_confirm_button() {
    
	//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	
}

@When("User should click the directory button")
public void User_should_click_the_directory_button() throws AWTException, InterruptedException {
    

	driver.findElement(By.xpath("//a[@href='/users/search']")).click();
	driver.findElement(By.xpath("//div[normalize-space()='My vouchers']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Buy vouchers')]")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Cinema voucher']")).click();
	//driver.findElement(By.xpath("//input[contains(@class,'form-control text-right ng-untouched ng-pristine ng-valid')]")).sendKeys("100");
	driver.findElement(By.xpath("//span[text()='Amount']//following::div//input[@class='form-control text-right ng-untouched ng-pristine ng-valid']")).sendKeys("100");
	
	driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).click();
	
	////span[text()='Amount']//following::div//input[@class='form-control text-right ng-valid ng-dirty ng-touched']
	//driver.findElement(By.xpath("//a[@href='/users/messages/search']//div[@class='quick-access-icon']")).click();
   
   // driver.findElement(By.xpath("//div[contains(text(),'New message')]")).click();
    //driver.findElement(By.xpath("//button[@id='id_11']")).click();
   //Select select = new Select( driver.findElement(By.xpath("//button[@id='id_2']")));
   //select.selectByVisibleText("User");
   
    
    //driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']//icon//*[name()='svg']")).click();
    //driver.findElement(By.xpath("//a[normalize-space()='Alfred Akuffo Addo']")).click();
    //driver.findElement(By.xpath("//div[@id='id_212_editor']")).sendKeys("Hi, This is test 1 2 3 4");
    //driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
    
    
    
    
}

@When("User should click My vouchers and click Buy vouchers and send button")
public void User_should_click_My_vouchers_and_click_Buy_vouchers_and_send_button() {
    
	//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	
}


@When("User should click scheduled payment")
public void user_should_click_scheduled_payment() {
	driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
	driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
	//driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::td//a[text()=' 08/05/2023 ']")).click();
	//driver.findElement(By.xpath("//div[text()='Cancel this scheduled payment']")).click();
	//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	
	
}

@When("User should click the member account button")
public void user_should_click_the_member_account_button() {
    driver.findElement(By.xpath("//a[@href='/banking/self/payment-requests']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
    driver.findElement(By.xpath("//div[normalize-space()='Member account']")).click();

}
@When("User should click car repair details and validate that")
public void user_should_click_car_repair_details_and_validate_that() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



/*@When("User should click the add newest  button")
public void user_should_click_the_add_newest_button() throws AWTException, InterruptedException {
    
    driver.findElement(By.xpath("//a[@href='/users/contacts']")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Add new')]")).click();
    driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("ar");
    driver.findElement(By.xpath("//a[normalize-space()='Ariadne']")).click();
    driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
    
    
    
}

@When("User should enter the value and click the submit button")
public void user_should_enter_the_value_and_click_the_submit_button() {
    
	//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	
}*/@Given("User get the title")
public void user_get_the_title() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();

}

@When("User should enter the username")
public void user_should_enter_the_username() {
	l = new LoginPage();
	l.getSignIn().click();
	l.getUsername().sendKeys("Aravindk1712");
}

@When("User should enter the password")
public void user_should_enter_the_password() {
	l.getPassword().clear();
	l.getPassword().sendKeys("Aravindk1712");
}

@Then("User should login the application")
public void user_should_login_the_application() {
	l.getLogin().click();
	
}

//Choose the fish
@Given("User launch the url")
public void user_launch_the_url() {

	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
}

@When("User choose the fish")
public void user_choose_the_fish() {
	FrontPage f = new FrontPage();
	f.getFish().click();

}

@Then("User should choose the product")
public void user_should_choose_the_product() {
	ProductPage p = new ProductPage();
	p.getAngleFish().click();
	

}

//Choose the Dog
@Given("User get the current url")
public void user_get_the_current_url() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
}

@When("User choose the Dos")
public void user_choose_the_dos() {
	FrontPage f = new FrontPage();
	f.getDogs().click();

}

@Then("User should choose the Dog")
public void user_should_choose_the_dog() {
	ProductPage p = new ProductPage();
	p.getBulldog().click();
	
}

//Choose the Cats
@Given("User Get the url")
public void user_get_the_url() {

	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
	GetCurrentURL();
}

@When("User choose the Cats")
public void user_choose_the_cats() {
	FrontPage f = new FrontPage();
	f.getCats().click();
}

@Then("User should choose the Cat")
public void user_should_choose_the_cat() {
	ProductPage p= new ProductPage();
	p.getManxCat().click();
	
}

//Choose the Reptiles
@Given("User Get the title and url")
public void user_get_the_title_and_url() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
	GetCurrentURL();
}

@When("User choose the Reptiles")
public void user_choose_the_reptiles() {
	FrontPage f = new FrontPage();
	f.getReptiles().click();
}

@Then("User should choose the Reptiles")
public void user_should_choose_the_reptiles() {
	ProductPage p = new ProductPage();
	p.getRattlesnakeReptiles().click();
	
}

//Choose the Birds
@Given("User should get the title")
public void user_should_get_the_title() {

	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
	GetCurrentURL();
}

@When("User choose the Birds")
public void user_choose_the_birds() {
	FrontPage f = new FrontPage();
	f.getBirds().click();
}

@Then("User should choose the Birds")
public void user_should_choose_the_birds() {
	ProductPage p = new ProductPage();
	p.getFinchBird().click();
	
}

//Add the fish to cart
@Given("User get the title for the application")
public void user_get_the_title_for_the_application() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
	GetCurrentURL();
}

@When("User choose the fish in the front page")
public void user_choose_the_fish_in_the_front_page() {
	FrontPage f = new FrontPage();
	f.getFish().click();
}

@Then("User should choose add the fish to cart")
public void user_should_choose_add_the_fish_to_cart() {
	ProductPage p = new ProductPage();
	p.getAngleFish().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
	

}

//Add the Dog to cart
@Given("User launch the application")
public void user_launch_the_application() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
	GetCurrentURL();
}

@When("User choose the Dog in the front page")
public void user_choose_the_dog_in_the_front_page() {
	FrontPage f = new FrontPage();
	f.getDogs().click();
}

@Then("User should choose add the Dog to cart")
public void user_should_choose_add_the_dog_to_cart() {
	ProductPage p = new ProductPage();
	p.getBulldog().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
	

}

//Add the Cats to cart
@Given("User launching the url")
public void user_launching_the_url() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
	GetCurrentURL();
}

@When("User choose the Cats in the front page")
public void user_choose_the_cats_in_the_front_page() {
	FrontPage f = new FrontPage();
	f.getCats().click();
}

@Then("User should add the cat to cart")
public void user_should_add_the_cat_to_cart() {
	ProductPage p = new ProductPage();
	p.getPersianCat().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
	
}

//Add the Reptiles to cart
@Given("User launch the url app")
public void user_launch_the_url_app() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	GetTitle();
	GetCurrentURL();
}

@When("User choose the Reptiles in the front page")
public void user_choose_the_reptiles_in_the_front_page() {
	FrontPage f = new FrontPage();
	f.getReptiles().click();
}

@Then("User should add the Reptiles to cart")
public void user_should_add_the_reptiles_to_cart() {
	ProductPage p = new ProductPage();
	p.getIguanaReptiles().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
	
}

//Add the Birds to cart
@Given("User launching the application url")
public void user_launching_the_application_url() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("User choose the Birds in the front page")
public void user_choose_the_birds_in_the_front_page() {
	FrontPage f = new FrontPage();
	f.getBirds().click();

}

@Then("User should add the Birds to cart")
public void user_should_add_the_birds_to_cart() {
	ProductPage p = new ProductPage();
	p.getFinchBird().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
	
}

//Remove the fish to cart
@Given("Choose the fish to cart")
public void choose_the_fish_to_cart() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("User Add the fish to cart")
public void user_add_the_fish_to_cart() {
	FrontPage f = new FrontPage();
	f.getFish().click();
	ProductPage p = new ProductPage();
	p.getAngleFish().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
}

@Then("User Remvoe the fish to cart")
public void user_remvoe_the_fish_to_cart() {
	
	AddToCart a= new AddToCart();
	a.getRemoveCart().click();
	
}

//Remove dog to cart
@Given("Choose the Dog to cart")
public void choose_the_dog_to_cart() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("User Add the Dog to cart")
public void user_add_the_dog_to_cart() {
	FrontPage f = new FrontPage();
	f.getDogs().click();
	ProductPage p = new ProductPage();
	p.getBulldog().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();

}

@Then("User Remvoe the Dog to cart")
public void user_remvoe_the_dog_to_cart() {
	AddToCart a = new AddToCart();
	a.getRemoveCart().click();
	
}

//Remove cat in cart
@Given("Choose the Cat to cart")
public void choose_the_cat_to_cart() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("User Add the Cat to cart")
public void user_add_the_cat_to_cart() {
	FrontPage f = new FrontPage();
	f.getCats().click();
	ProductPage p = new ProductPage();
	p.getManxCat().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
}

@Then("User Remvoe the Cat to cart")
public void user_remvoe_the_cat_to_cart() {
	AddToCart a = new AddToCart();
	a.getRemoveCart().click();
	
}

//Remove Reptiles in cart
@Given("Choose the Reptiles to cart")
public void choose_the_reptiles_to_cart() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("User Add the Reptiles to cart")
public void user_add_the_reptiles_to_cart() {
	FrontPage f = new FrontPage();
	f.getReptiles().click();
	ProductPage p = new ProductPage();
	p.getIguanaReptiles().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();
}

@Then("User Remvoe the Reptiles to cart")
public void user_remvoe_the_reptiles_to_cart() {
	AddToCart a = new AddToCart();
	a.getRemoveCart().click();
	
}

//Remove birds in cart
@Given("Choose the Birds to cart")
public void choose_the_birds_to_cart() {

	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	FrontPage f = new FrontPage();
	f.getBirds().click();
}

@When("User Add the Birds to cart")
public void user_add_the_birds_to_cart() {
	ProductPage p = new ProductPage();
	p.getFinchBird().click();
	AddToCart a = new AddToCart();
	a.getAddtocart1().click();

}

@Then("User Remvoe the Birds to cart")
public void user_remvoe_the_birds_to_cart() {
	AddToCart a = new AddToCart();
	a.getRemoveCart().click();
	
}

//search the fish
@Given("Launch the app")
public void launch_the_app() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");

}

@When("Enter the fish name")
public void enter_the_fish_name() {
	AddToCart a = new AddToCart();
	a.getSearchKeyword().click();
	a.getSearchKeyword().sendKeys("Angelfish");
}

@Then("click the search button")
public void click_the_search_button() {
	AddToCart a = new AddToCart();
	a.getSubmit().click();
	
}

//Search the Dog
@Given("Launch the jpet app")
public void launch_the_jpet_app() {

	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("Enter the Dog name")
public void enter_the_dog_name() {
	AddToCart a = new AddToCart();
	a.getSearchKeyword().sendKeys("Bulldog");
}

@Then("click the search")
public void click_the_search() {
	AddToCart a = new AddToCart();
	a.getSubmit().click();
	
}

//Search the Cat
@Given("Launch the pet app")
public void launch_the_pet_app() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("Enter the Cat name")
public void enter_the_cat_name() {
	AddToCart a = new AddToCart();
	a.getSearchKeyword().sendKeys("Manx");
}

@Then("click the search the")
public void click_the_search_the() {
	AddToCart a = new AddToCart();
	a.getSubmit().click();
	
}

//search the Reptiles
@Given("Launch the pet application")
public void launch_the_pet_application() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");

}

@When("Enter the Reptiles name")
public void enter_the_reptiles_name() {
	AddToCart a = new AddToCart();
	a.getSearchKeyword().sendKeys("Rattlesnake");
}

@Then("click search button")
public void click_search_button() {
	AddToCart a = new AddToCart();
	a.getSubmit().click();
	
}

//search the Birds
@Given("Launch the Jpet application")
public void launch_the_jpet_application() {
	
	LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
}

@When("Enter the Birds name")
public void enter_the_Birds_name() {
	AddToCart a = new AddToCart();
	a.getSearchKeyword().sendKeys("Amazon Parrot");
}

@Then("click search btn")
public void click_search_btn() {
	AddToCart a = new AddToCart();
	a.getSubmit().click();
	
}




	





}
