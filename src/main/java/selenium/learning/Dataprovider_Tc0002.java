package selenium.learning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider_Tc0002 {

	@DataProvider(name = "fetchdata2")
	public static String [] [] mydata2() throws IOException {
		
		FileInputStream fdata = new FileInputStream("./Data/Tc0002.xlsx");
		
		XSSFWorkbook Wb = new XSSFWorkbook(fdata);
		
		XSSFSheet sheets = Wb.getSheet("Sheet1");
		
		int rowcount = sheets.getLastRowNum();
		
		int colcount = sheets.getRow(rowcount).getLastCellNum();
		
		System.out.println(rowcount);
		
		System.out.println(colcount);
		
		String [][] testdata = new String [rowcount] [colcount];
		
		for (int i=1 ; i<=rowcount ; i++) {
			
			XSSFRow row = sheets.getRow(i);
			
			for (int j=0 ; j<colcount ; j++) {
				
				String text = row.getCell(j).getStringCellValue();
				
				testdata [i-1] [j] = text;
				
				System.out.println("Row ["+ (i-1) +"]" + "Column [" + j +"]" + " = "+ text);
			}
			
		}
		
		return testdata;
		
	} 
	
	
}
