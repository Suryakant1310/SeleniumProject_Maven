package Baseframe;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		POM p = new POM(d);
		p.username.sendKeys("Admin");
		Thread.sleep(2000);
		
		p.password.sendKeys("admin123");
		Thread.sleep(2000);
		
		p.loginbutton.click();
		Thread.sleep(2000);
		
		p.PIM.click();
		Thread.sleep(2000);
		
		p.Add.click();
		Thread.sleep(2000);
		
		//Imageupload script
		
		File f = new File("C:\\Users\\sidde\\Downloads\\testimageuplaodsel.png");
		//file is the prefdefine class from java
		p.imageupload.sendKeys(f.getAbsolutePath());
		Thread.sleep(2000);
		
		p.FirstName.sendKeys("Siddesh");
		Thread.sleep(2000);
	
		p.LastName.sendKeys("Naikare");
		Thread.sleep(2000);
		
		p.Save.click();
		Thread.sleep(2000);
		
		

	}

}
