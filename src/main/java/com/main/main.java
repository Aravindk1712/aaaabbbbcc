package com.main;

import io.cucumber.core.cli.Main;

public class main {
	public static void main(String[] args) {
	try {
		Main.main(new String[]{"-g","stepDefinitions","-g","com.main","-g","com.resources","-g","com.objectRepository","-g","runners","classpath:functionalTests","-p","json:target/cucumber-reports/cucumber.json","-m"});
	}
    catch(Exception e)
	{
     System.out.println("Main method exception : "+e);
	}
}

}
