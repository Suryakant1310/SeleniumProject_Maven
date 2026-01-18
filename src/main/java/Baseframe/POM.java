package Baseframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	//page object model (POM) 
	//it is used to store the Xpath in one class and call it in the other class

	private WebDriver d ;
	
	//Parameterized constructor
	
	POM(WebDriver d)
	{
		this .d= d;
		PageFactory.initElements(d, this);
	
	}
	
	
	//@Findby is the predefine annotation from org. openqa.selenium package
	//it is used to store the xpath in the object  of web element
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	WebElement loginbutton;
	
	@FindBy(xpath = "//span[contains(.,'PIM')]")
	WebElement PIM;
	
	@FindBy(xpath = "//button[contains(.,'Add')]")
	WebElement Add;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	WebElement Save;
	
	//Image upload script
	
	@FindBy(css = "input[type='file']")
	WebElement imageupload;
	
	
	
	
	
		
	
	
}
