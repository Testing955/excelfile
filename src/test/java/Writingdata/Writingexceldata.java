package Writingdata;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingexceldata {

	public static void main(String[] args) throws IOException 
	{
FileOutputStream writingfile = new FileOutputStream(System.getProperty("user.dir")+"/testdata/writing.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Data");
XSSFRow row1 = sheet.createRow(0);
row1.createCell(0).setCellValue("Java");
row1.createCell(1).setCellValue(14);
row1.createCell(2).setCellValue("Automation");
XSSFRow row2=sheet.createRow(1);
row2.createCell(0).setCellValue("Python");
row2.createCell(1).setCellValue(12);
row2.createCell(2).setCellValue("Automation");
XSSFRow row3=sheet.createRow(2);
row3.createCell(0).setCellValue("c#");
row3.createCell(1).setCellValue(11);
row3.createCell(2).setCellValue("Automation");
workbook.write(writingfile);
workbook.close();
writingfile.close();
System.out.println("File is created....");


	}

}
