package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

		FileInputStream f =new FileInputStream(new File("C:\\Users\\sidde\\Desktop\\AutomationExcel.xlsx"));
		//FileInputStream is predefined class from java.io package
		//it is used to read data from the excel file
		//add the file location from properties +\\+ add filename.xlsx
		
		XSSFWorkbook w = new XSSFWorkbook(f);
		//XSSFWorkbook is predefined class from org.apache.poi
		
		XSSFSheet sh = w.getSheetAt(0);  // sheet indexing is zero
		
		Cell c;  //Writ karne tha islye xss ko hata diya
		
		for (int i =1; i<=sh.getLastRowNum();i++)  //in excel 1 row se exectuion start hoga..
		{
			Row  r =  sh.getRow(0);
			
			if (r==null)
			{
				r= sh.createRow(0);  //indexing 0 se hoga excel mai blank row par "status" print hoga..
				//row 1
			}
			
			c= r.createCell(2); //col 2  indexing 2 par column mai "Status" hoga
			c.setCellValue("Status");
			
			
			FileOutputStream fo = new FileOutputStream("C:\\Users\\sidde\\Desktop\\AutomationExcel.xlsx");
			w.write(fo);
			
		}
		

	}

}
