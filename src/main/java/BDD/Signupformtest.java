package BDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class Signupformtest {

	
	WebDriver d;
	String url ="https://www.facebook.com/r.php?entry_point=login";
	
	@Given("User will click on the creat account button")
	public void user_will_click_on_the_creat_account_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d = new ChromeDriver();
		 d.get(url);
		 Thread.sleep(2000);
		
	}

	@When("user will enter the firstname in firstname field")
	public void user_will_enter_the_firstname_in_firstname_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		d.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Siddesh");
		Thread.sleep(2000);
		
	}
	
	@And("user will enter the Surname in Surname field")
	public void user_will_enter_the_surname_in_surname_field() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Naik");
	    
	}

	@When("user will enter the Date of Birth in the Date of birth field")
	public void user_will_enter_the_date_of_birth_in_the_date_of_birth_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    new Select(d.findElement(By.xpath("//select[@title='Day']"))).selectByVisibleText("17");
	    Thread.sleep(2000);
	    new Select(d.findElement(By.xpath("//select[@title='Month']"))).selectByVisibleText("Jul");
	    Thread.sleep(2000);
	    new Select(d.findElement(By.xpath("//select[@title='Year']"))).selectByVisibleText("1998");
	    Thread.sleep(2000);
	}
	
	

	@And("user will select the Gender option as Male, Female, custom")
	public void user_will_select_the_gender_option_as_male_female_custom() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@value='2']")).click();
		
	   
	}

	@When("usre will enter the mobile number in mobile number field")
	public void usre_will_enter_the_mobile_number_in_mobile_number_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9967402823");
	 Thread.sleep(2000);  
	}
	   
	    
	 @And("user will enter the New passoword in New password field")
	 public void user_will_enter_the_new_passoword_in_new_password_field() throws InterruptedException {
	 // Write code here that turns the phrase above into concrete actions
		 d.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("123456@123S");
		 Thread.sleep(2000);
	 }
		
	        
	        @Then("user will click on Sign Up button")
	        public void user_will_click_on_sign_up_button() throws InterruptedException {
	            // Write code here that turns the phrase above into concrete actions
	        	d.findElement(By.xpath("(//button[contains(.,'Sign Up')])[1]")).click();
	        	Thread.sleep(2000); 


	    
	}
	        


	
	
}
