package Keyword_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream f = new FileInputStream(new File("C:\\Users\\sidde\\Desktop.xlsx"));
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet sh = w.getSheet("Sheet1");
		XSSFCell c;
		
		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			
			String keyword = sh.getRow(i).getCell(1).getStringCellValue();
			
			
			String locatortype
			
			
			
		}

	}

}
