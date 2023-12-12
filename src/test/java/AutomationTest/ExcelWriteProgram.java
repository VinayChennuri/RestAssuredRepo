package AutomationTest;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteProgram {
	
	@Test
	public void excelWrite() throws Exception
	{
		File f = new File("C:\\Users\\vc21352\\Desktop\\Credentials.xlsx");
		FileInputStream fs = new FileInputStream(f);
		//@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		Row r = sh.createRow(1);
		Cell c = r.createCell(1);
		c.setCellValue("Vinaychennuri1");
		FileOutputStream fo = new FileOutputStream("C:\\Users\\vc21352\\Desktop\\Book1.xlsx");
		wb.write(fo);
		fo.close();
		System.out.println("Written Successfully");
		
		
		
	}

}
