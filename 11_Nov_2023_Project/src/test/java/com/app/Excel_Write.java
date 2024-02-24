package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	
	public static void excel_write() {
		
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Oct_2023_Project\\src"
					+ "\\test\\resources\\TestData\\Test_One.xlsx");
			FileInputStream fis  = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			// workbook -> sheet create -> row create -> cell data write
			Sheet createSheet = wb.createSheet("Aiite");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue("Selenium");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		excel_write();
	}

}
