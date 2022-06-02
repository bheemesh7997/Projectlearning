package selenium.learning;

import java.io.FileInputStream;
import java.io.IOException;

import javax.naming.Name;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Tc001 {
	
	@DataProvider(name = "fetchdata")
	public static String [][] mydata() throws IOException {
		
		FileInputStream fis = new FileInputStream("./Data/Tc001.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		int columncount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowcount);
		
		System.out.println(columncount);
		
		String [] [] testdata = new String [rowcount] [columncount];
		
		for (int i = 1 ; i<=rowcount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0 ; j<columncount;j++) {
				
				String text = row.getCell(j).getStringCellValue();
				
				testdata [i-1] [j] = text;
				
				System.out.println("Row ["+(i-1)+"] " + "Col ["+ j +"] " +" = "+text);
			}
			
			
		}
		
		return testdata;
		
		
		
		
		
		

	}

}
