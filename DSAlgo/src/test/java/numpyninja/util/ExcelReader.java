package numpyninja.util;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
		 public static String getCellValue(String xl, String Sheet, int r, int c)
			      {
			          try {
                             FileInputStream fis = new FileInputStream(xl);
                             Workbook wb = WorkbookFactory.create(fis);
                             Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);
                             DataFormatter formatter = new DataFormatter();
							String value = formatter.formatCellValue(cell);
							return value;
                               }
                                catch (Exception e){ return ""; }

			                }
				 public static int getRowCount (String xl, String Sheet1)
	                {
	                    try
	                         {
	                             FileInputStream fis = new FileInputStream(xl);
	                             Workbook wb = WorkbookFactory.create(fis);
	                             return wb.getSheet(Sheet1).getLastRowNum();
	                                }
	                                catch (Exception e)
	                                {
	                                  return 0;
	                                }
			}
		}