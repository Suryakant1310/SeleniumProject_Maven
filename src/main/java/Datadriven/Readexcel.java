package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readexcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		FileInputStream f =new FileInputStream(new File("C:\\Users\\sidde\\Desktop\\AutomationExcel.xlsx"));
		//FileInputStream is predefined class from java.io package
		//it is used to read data from the excel file
		//add the file location from properties +\\+ add filename.xlsx
		
		XSSFWorkbook w = new XSSFWorkbook(f);
		//XSSFWorkbook is predefined class from org.apache.poi
		
		XSSFSheet sh = w.getSheetAt(0);  // sheet indexing is zero
		
		XSSFCell c;
		
		WebDriver d= new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		for (int i=1; i<=sh.getLastRowNum(); i++)
		{
		    c= sh.getRow(i).getCell(0);
		  //Row 1, Column 0
		    
		    c.setCellType(CellType.STRING);
		    // isko datatype kya hai string toh islye woh line likha hai
		    
		    d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(c.getStringCellValue());
		    Thread.sleep(2000);
		    
		    System.out.println(c.getStringCellValue());
		    //Ye username column ke liye hai 
		    
		    
		    
		    
		    c=sh	.getRow(i).getCell(1);
		  //Row 1, Column 0
		    
		    c.setCellType(CellType.STRING);
		    
		    d.findElement(By.xpath("//input[@name='password']")).sendKeys(c.getStringCellValue());
		    Thread.sleep(2000);
		    
		    d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
			Thread.sleep(2000);
		    
		    System.out.println(c.getStringCellValue());
		    //Ye password column ke liye code 
		}
		
		
	}

}
