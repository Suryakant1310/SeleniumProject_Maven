package BDD;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.performance.Performance;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multiplescen {

	WebDriver d;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	
	@Given("when we are on the login page")
	public void when_we_are_on_the_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		d = new ChromeDriver();
		d.get(url);
		Thread.sleep(8000);
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2)); // to open the website as early as possible
		
		
	}

	@When("we will enter the valid username in username field")
	public void we_will_enter_the_valid_username_in_username_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(5000);
	}

	@And("when will  enter the password in password field")
	public void when_will_enter_the_password_in_password_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    Thread.sleep(5000);
	}

	@Then("will click on the login button")
	public void will_click_on_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		Thread.sleep(5000);
	   
	}

	@When("we will mouse hover Admin option")
	public void we_will_mouse_hover_admin_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Admin')] "))).perform();
	    Thread.sleep(5000);
	}

	@And("we will mouse hover PIM option")
	public void we_will_mouse_hover_pim_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'PIM')]"))).perform();
	   Thread.sleep(5000);
		
	}

	@When("we will mouse hover Leave option")
	public void we_will_mouse_hover_leave_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Leave')]"))).perform();
		Thread.sleep(5000);
	    
	}

	@And("we will mouse hover Time option")
	public void we_will_mouse_hover_time_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//span[contains(.,'Time')]"))).perform();
		Thread.sleep(5000);
	   
	}

	@Then("we will mouse hover Recruitment option")
	public void we_will_mouse_hover_recruitment_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//span[contains(.,'Recruitment')]"))).perform();
		Thread.sleep(5000);
	    
	}

	@When("we will navigate to PIM option and click on the add button")
	public void we_will_navigate_to_pim_option_and_click_on_the_add_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		d.findElement(By.xpath("//span[contains(.,'PIM')]")).click();  //PIM option
		Thread.sleep(5000);
		d.findElement(By.xpath("//button[contains(.,'Add')]")).click();  //Add option
		Thread.sleep(5000);
	}

	@And("^we will enter the (.*) in the firstname field$")
	public void we_will_enter_the_rizwan_in_the_firstname_field(String fname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		Thread.sleep(5000);
	   
	}

	@When("^we will enter the (.*) in the middlename field$")
	public void we_will_enter_the_abcd_in_the_middlename_field(String mname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@name='middleName']")).sendKeys(mname);
		Thread.sleep(5000);
	    
	}

	@And("^we will enter the (.*) in the lastname field$")
	public void we_will_enter_the_test1_in_the_lastname_field(String lname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		Thread.sleep(5000);
	    
	}

	@Then("we will click on the save button")
	public void we_will_click_on_the_save_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(5000);
		
		
		d.findElement(By.xpath("//span[contains(.,'PIM')]")).click();  //PIM option
		Thread.sleep(5000);
		d.findElement(By.xpath("//button[contains(.,'Add')]")).click();  //Add option
		Thread.sleep(5000);
	    
	}

	

	
}
