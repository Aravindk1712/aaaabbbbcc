package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class stepDefinit {
	
	


		RequestSpecification reqspec;
		Response response;
		
		
		@Given("visiting the API")
		public void visiting_the_api() {
			RestAssured.baseURI = "https://ergast.com/api/f1/2017/circuits.json";
			reqspec = RestAssured.given();
			
			
		}

		@When("get response from API")
		public void get_response_from_api() {
			response = reqspec.get();
		}

		@Then("validate the response code")
		public void validate_the_response_code() {
			Assert.assertEquals(200 , response.statusCode());
		}

		@Then("verify series")
		public void verify_series() {
			String  a =response.then().extract().path("path" ,"MRData.series");
			String b ="f1";
			if (b==a)
			{System.out.println("matched");	}}
		

	@Then("verify circuitID")
	public void verify_circuit_id() {
		String  circuitId =response.then().extract().path("path" ,"MRData.CircuitTable.Circuits[0].circuitId");
		String ExcircuitId = "albert_park";
		if(circuitId==ExcircuitId)
		{System.out.println("verified");}
	}

	@Then("verify the circuitName")
	public void verify_the_circuit_name() {
		String  circuitName =response.then().extract().path("path" ,"MRData.CircuitTable.Circuits[0].circuitName");
		String ExcircuitName = "Albert Park Grand Prix Circuit";
		if(circuitName==ExcircuitName)
		{System.out.println("verified");}
	}

		
			
	

	@Then("verify the locality")
	public void verify_the_locality() {
		String  locality =response.then().extract().path("path" ,"MRData.CircuitTable.Circuits[0].Location.locality");
		String Exlocality = "Albert Park Grand Prix Circuit";
		if(locality==Exlocality)
		{System.out.println("verified");}
	    
	}

@Then("verify the country")
public void verify_the_country() {
    // Write code here that turns the phrase above into concrete actions
   
    String  total  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[0].Location.country");
	String CountryName = "Australia";
	if(total==CountryName)
	{System.out.println("verified");}
}
@Then("verify the circuiName")
public void verify_the_circuiName() {
    // Write code here that turns the phrase above into concrete actions
   
    String  Nam  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[11].circuitName");
	String CircuiName = "Autódromo Hermanos Rodríguez";
	if(Nam==CircuiName)
	{System.out.println("verified");}
}
@Then("validate the url")
public void validate_the_url() {
	String  url  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[11].url");
	String link = "http:\\/\\/en.wikipedia.org\\/wiki\\/Aut%C3%B3dromo_Hermanos_Rodr%C3%ADguez";
	if(url==link)
	{System.out.println("verified");}
}

@Then("validate the name")
public void validate_the_name() {
	String  na  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[12].circuitId");
	String name = "sepang";
	if(na==name)
	{System.out.println("verified");}
}
	
 @Then("validate the name2")
	public void validate_the_name2() {
	 String  nam  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[13].circuitId");
		String name2 = "shanghai";
		if(nam==name2)
		{System.out.println("verified");}
	    
	}
 @Then("validate the url2")
 public void validate_the_url2() {
	 String  url2  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[14].url");
		String linke = "http:\\/\\/en.wikipedia.org\\/wiki\\/Silverstone_Circuit";
		if(url2==linke)
		{System.out.println("verified");}
     
 }
 
 @Then("validate the name3")
 public void validate_the_name3() {
	 String  namee  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[9].circuitId");
		String nam3= "monza";
		if(namee==nam3)
		{System.out.println("verified");}
 }

 @Then("validate the name4")
 public void validate_the_name4() {
	 String  namey  = response.then().extract().path("path" ,"x.MRData.CircuitTable.Circuits[7].circuitId");
		String name4 = "marina_bay";
		if(namey==name4)
		{System.out.println("verified");}
 }




    




}

	

	

	




	


