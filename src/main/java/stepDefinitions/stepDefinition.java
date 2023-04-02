package stepDefinitions;
import java.awt.AWTException;




import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.objectRepository.DemoQa;
import com.objectRepository.SecondPage;
import com.objectRepository.thirdPage;
import com.resources.BaseClass;


public class stepDefinition extends BaseClass {
DemoQa d;
SecondPage s;
thirdPage t;
@Before
public void initilization() {
	 LaunchBrowser();
	 LaunchURL("https://demoqa.com/");
    driver.manage().window().maximize();
}
@After
public void end() {
	driver.close();
	
	
}

	@Given("User should open the url")
	public void user_should_open_the_url() {
	   
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





}
