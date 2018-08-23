package com.accenture.tasks;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
//import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Excel{

	public static String[] leerExcel(String[] args) throws InterruptedException, FileNotFoundException, IOException {
	
    String[] usuarios=new String[5];
	int i = 0;
	
	String nombreArchivo = "correos.xlsx";
	String rutaArchivo = "C:\\Users\\luis.rosero\\Desktop\\" + nombreArchivo;
	
	try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
		// leer archivo excel
		XSSFWorkbook worbook = new XSSFWorkbook(file);
		//obtener la hoja que se va leer
		XSSFSheet sheet = worbook.getSheetAt(0);
		//obtener todas las filas de la hoja excel
		Iterator<Row> rowIterator = sheet.iterator();

		Row row;
		// se recorre cada fila hasta el final
		while (rowIterator.hasNext()) {
			row = rowIterator.next();
			//se obtiene las celdas por fila
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell;
			//se recorre cada celda
			while (cellIterator.hasNext()) {
				// se obtiene la celda en específico y se la imprime
				cell = cellIterator.next();
				System.out.print(cell.getStringCellValue()+" | ");
				usuarios[i] = cell.getStringCellValue();
				i=i+1;
			}
			System.out.println();
		}

	
	
	
	}
	return usuarios;
	}
}