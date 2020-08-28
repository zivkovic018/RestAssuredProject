package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {

		try {

			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public Object getCellData(int rowNum, int cellNum) {

		DataFormatter formatter = new DataFormatter();

		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(cellNum)); 
		
		return value;
		
	}

	public int getRowCount() {

		return sheet.getPhysicalNumberOfRows();
		

	}

}
