package org.hhp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}
	
	
	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
	}
	@DataProvider(name="Login")
	public static Object[][] getTableArray() throws Exception {

		   String[][] tabArray = null;
		   String xlfile = System.getProperty("user.dir")+"/src/test/java/org/hhp/testData/HHP_TestData.xlsx";
		   String xlsheet = "Login";
		   
		   try {

			   FileInputStream ExcelFile = new FileInputStream(xlfile);

			   // Access the required test data sheet

			   wb = new XSSFWorkbook(ExcelFile);
			   ws = wb.getSheet(xlsheet);
			   int startRow = 1;
			   int startCol = 0;
			   int ci,cj;
			   int totalRows = ws.getLastRowNum()+1;
			   int totalCols = ws.getRow(ws.getFirstRowNum()).getLastCellNum();
		   
			   tabArray=new String[totalRows-1][totalCols];

			   ci=0;

			   for (int i=startRow;i<=totalRows-1;i++, ci++) {           	   

				  cj=0;

				   for (int j=startCol;j<=totalCols-1;j++, cj++){

					   tabArray[ci][cj]=getCellData(xlfile, xlsheet, i, j);

						}

					}

				}
		   catch (FileNotFoundException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}

			catch (IOException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}
		   return(tabArray);

	}
	
	@DataProvider(name="SignUp")
	public static Object[][] getTableArray1() throws Exception {

		   String[][] tabArray = null;
		   String xlfile = System.getProperty("user.dir")+"/src/test/java/org/hhp/testData/HHP_TestData.xlsx";
		   String xlsheet = "SignUp";
		   
		   try {

			   FileInputStream ExcelFile = new FileInputStream(xlfile);

			   // Access the required test data sheet

			   wb = new XSSFWorkbook(ExcelFile);
			   ws = wb.getSheet(xlsheet);
			   int startRow = 1;
			   int startCol = 0;
			   int ci,cj;
			   int totalRows = ws.getLastRowNum()+1;
			   int totalCols = ws.getRow(ws.getFirstRowNum()).getLastCellNum();
		   
			   tabArray=new String[totalRows-1][totalCols];

			   ci=0;

			   for (int i=startRow;i<=totalRows-1;i++, ci++) {           	   

				  cj=0;

				   for (int j=startCol;j<=totalCols-1;j++, cj++){

					   tabArray[ci][cj]=getCellData(xlfile, xlsheet, i, j);

						}

					}

				}
		   catch (FileNotFoundException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}

			catch (IOException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}
		   return(tabArray);

	}
}
