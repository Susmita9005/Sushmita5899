package readEcxelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// write the data in excel sheet... 
		
		 FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); //provide the path of file
		 Workbook wb = WorkbookFactory.create(fis); // make the file for ready to read
         Sheet sheet = wb.getSheet("IPL");//get into the sheet
         Row row = sheet.createRow(11);
         //write the data into the cell
         Cell cell = row.createCell(0);
         cell.setCellValue("pune");
       
          
          
         FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
         wb.write(fos);
          

	}

}
