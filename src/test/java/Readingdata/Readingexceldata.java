package Readingdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//file --->workbook ---> sheets ---> rows ---> cells --->
public class Readingexceldata 
{
public static void main(String args[]) throws IOException
{
FileInputStream readingfile = new FileInputStream(System.getProperty("user.dir")+"/testdata/Portfolio_AiMl.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(readingfile);
XSSFSheet sheet = workbook.getSheet("Portfoliolink");   //workbook.getSheetAt(0);
int totalrows=sheet.getLastRowNum();
int totalcells=sheet.getRow(1).getLastCellNum();
System.out.println("Number of rows: " + totalrows);  //7
System.out.println("Number of cells: " + totalcells);  //2
for(int r=0;r<=totalrows;r++)
{
XSSFRow currentRow=sheet.getRow(r);
for(int c =0;c<totalcells;c++)
{
//XSSFCell cell = currentRow.getCell(c);
//String value = (cell.toString()+"\t");
String value = currentRow.getCell(c).toString();
System.out.print(value + "   ");
}
System.out.println();
}
workbook.close();
readingfile.close();
}
}

