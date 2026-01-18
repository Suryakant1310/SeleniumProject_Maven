package BDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Snapsignupformclass {
	
	WebDriver d;
	String url ="https://accounts.snapchat.com/v2/signup";
	
	
	@Given("user will click on Sign Up")
	public void user_will_click_on_sign_up() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		d= new ChromeDriver();
		d.get(url);
		Thread.sleep(2000);
		
	
	   
	}

	
	@When("user will enter the first name in the first name field")
	public void user_will_enter_the_first_name_in_the_first_name_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		d.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Siddesh");
		Thread.sleep(2000);
	    
	}

	@And("user will enter the last name in the last name field")
	public void user_will_enter_the_last_name_in_the_last_name_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Naik");
		Thread.sleep(2000);
		
	    
	}

	@When("user enter the Birthday in the Birthday field")
	public void user_enter_the_birthday_in_the_birthday_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		new Select(d.findElement(By.xpath("//select[@name='month']"))).selectByVisibleText("July");
		Thread.sleep(2000);
		 d.findElement(By.xpath("//input[@placeholder='Day']")).sendKeys("17");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='year']")).sendKeys("1998");
		Thread.sleep(2000);
	    
	}

	@And("user will enter the username in the username field")
	public void user_will_enter_the_username_in_the_username_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@name='username']")).sendKeys("Sid17");
	    Thread.sleep(2000);
	}

	@When("user will enter a secure password in the password field")
	public void user_will_enter_a_secure_password_in_the_password_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@type='password']")).sendKeys("Sid@t@ran123");
	    Thread.sleep(2000);
	}

	@Then("user will click on the Agree and Continue button")
	public void user_will_click_on_the_agree_and_continue_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//button[contains(.,'Agree and Continue')]")).click();
		Thread.sleep(2000);
	    
	}


	
	

}
