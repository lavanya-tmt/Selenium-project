package DataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("F:\\Lavanya\\Selenium Test Data//Excel Test.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");  //providing sheet name
		
//		XSSFSheet sheet=workbook.getSheet(0);  //providing sheet name
		
		int rowcount=sheet.getLastRowNum(); //returns row count
		
		int colcount=sheet.getRow(0).getLastCellNum();  //returns column/cell count
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);   //focuses on current row
			
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();	
				System.out.print(" " + value);
				
			}
			System.out.println();
		}
		
		
		

	}

}
