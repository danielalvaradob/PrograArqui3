/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatrices;

/**
 *
 * @author danielalvarado
 */
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

    private String inputFile;
    private Sheet sheet;

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void read() throws IOException  {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            sheet = w.getSheet(0);
            // Loop over first 10 column and lines

            /*
            for (int j = 0; j < sheet.getColumns(); j++) {
                for (int i = 0; i < sheet.getRows(); i++) {
                    Cell cell = sheet.getCell(j, i);
                    CellType type = cell.getType();
                    if (type == CellType.LABEL) {
                        System.out.println("I got a label "
                                + cell.getContents());
                    }

                    if (type == CellType.NUMBER) {
                        System.out.println("I got a number "
                                + cell.getContents());
                    }

                }
            }
            */
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
    
    int getNumberInCell(int r,int c) {
        
        Cell cell = sheet.getCell(r, c);
        int content = Integer.parseInt(cell.getContents());
        return content;
    }
    
    /*
    public static void main(String[] args) throws IOException {
        ReadExcel test = new ReadExcel();
        test.setInputFile("c:/temp/lars.xls");
        test.read();
    }
    */
}

