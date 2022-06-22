package Com.Crm.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Rakesh
 *
 */



public class ExcelUtility {

	public FileInputStream fxl;

	public String getFromExcel(String sheet, int rowNum, int cellNum) throws Throwable {
		fxl = new FileInputStream("./src/test/resources/vtigertestcases.xlsx");
		Workbook workbook = WorkbookFactory.create(fxl);
		
		return workbook.getSheet(sheet).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	public void writeToExcel(String sheet, int rowNum, int cellNum, String value) throws Throwable, Throwable {
		fxl = new FileInputStream("./src/test/resources/vtigertestcases.xlsx");
		Workbook workbook = WorkbookFactory.create(fxl);
		
		workbook.getSheet(sheet).getRow(rowNum).createCell(cellNum).setCellValue(value);
		
		FileOutputStream fout = new FileOutputStream("./src/test/resources/vtigertestcases.xlsx");
		workbook.write(fout);
		fout.close();
	}
	
	public void closeFile() throws Throwable {
		fxl.close();
	}
}