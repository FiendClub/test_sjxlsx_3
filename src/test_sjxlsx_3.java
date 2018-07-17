/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gormlm1
 */

import java.io.File;



import com.incesoft.tools.excel.xlsx.Cell;
import com.incesoft.tools.excel.xlsx.Sheet;
import com.incesoft.tools.excel.xlsx.Sheet.SheetRowReader;
import com.incesoft.tools.excel.xlsx.SimpleXLSXWorkbook;



public class test_sjxlsx_3 {

    public test_sjxlsx_3() {
        
        SimpleXLSXWorkbook workbook ;        
        Cell[] row;
        Sheet sheetToRead ;
        SheetRowReader reader ;
                
        long ll_start = System.currentTimeMillis();

        workbook = new SimpleXLSXWorkbook(new File( "test.xlsx"));        

        sheetToRead = workbook.getSheet(0, false);
        reader      = sheetToRead.newReader();

        row = reader.readRow();
        System.out.println(row[0]);
        workbook.close();
        
//        ReaderSupport rxs = ReaderSupport.newInstance(ReaderSupport.TYPE_XLSX, new File("test.xlsx"));
//        rxs.open();
//        ExcelRowIterator it = rxs.rowIterator();
//        
//                while (it.nextRow()) {
//            System.out.println(it.getCellValue(0));
//        }
//        rxs.close();
        
        System.out.println("time=" + ( System.currentTimeMillis() - ll_start ));
    }

    public static void main (String[] args) {
        test_sjxlsx_3 test_sjxlsx_3 = new test_sjxlsx_3();
    }

}

