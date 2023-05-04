package DataDrivenTests;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
  
	public static void main(String[] args) throws IOException {
		
		//Giving filename
		FileOutputStream file=new FileOutputStream("F://Lavanya//Selenium Test Data/Writing Data.xlsx");  
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Dataset1");
		
		for(int i=0;i<=5;i++) {
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<3;j++) 
			{
				row.createCell(j).setCellValue("abc");
			}
		}
		
		workbook.write(file);
		file.close();
		
		System.out.println("Written data into excel is completed");
		
	}

}
