package com.test.StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {

	WebDriver driver;
	
	@Given("Open browser and lunch appliaction")
	public void open_browser_and_lunch_appliaction() {
		System.out.println("Step 1 :Lunch the application");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("Enter username & password")
	public void enter_username_password() {
		System.out.println("Step 2 : USer enter the username & password ");
		
	    driver.findElement(By.id("txtUsername")).sendKeys(" Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Step 3 : User Click on login button");
		
		driver.findElement(By.xpath("//input[@id ='btnLogin']")).click();
	}

	@Then("land on home page")
	public void land_on_home_page() {
	    
		System.out.println("Step 4 : User landed on home page");
		driver.close();
	}

	
	
}
