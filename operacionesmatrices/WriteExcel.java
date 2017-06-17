/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatrices;


import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 *
 * @author danielalvarado
 */
public class WriteExcel {
    private WritableCellFormat timesBoldUnderline;
    private WritableCellFormat times;
    private String inputFile;
    private int ncols;
    private int nrows;
    private IntType type;

    public void setOutputFile(String name) {
    String inputFile = "";
    inputFile += name + ".xls";
    this.inputFile = inputFile;
    }
    
    
    public void setNormalSettings(int _nrows, int _ncols, IntType _type) {
        ncols= _ncols;
        nrows = _nrows;
        type = _type;
    
    }



    public void writeNewFile() throws IOException, WriteException {
        File file = new File(inputFile);
        WorkbookSettings wbSettings = new WorkbookSettings();

        wbSettings.setLocale(new Locale("en", "EN"));

        WritableWorkbook workbook = Workbook.createWorkbook(file, wbSettings);
        workbook.createSheet(inputFile, 0);
        WritableSheet excelSheet = workbook.getSheet(0);
        //createLabel(excelSheet);
        createRandomIntContent(excelSheet);

        workbook.write();
        workbook.close();
    }

    private void createLabel(WritableSheet sheet)
            throws WriteException {
        // Lets create a times font
        WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
        // Define the cell format
        times = new WritableCellFormat(times10pt);
        // Lets automatically wrap the cells
        times.setWrap(true);

        // create create a bold font with unterlines
        WritableFont times10ptBoldUnderline = new WritableFont(
                WritableFont.TIMES, 10, WritableFont.BOLD, false,
                UnderlineStyle.SINGLE);
        timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
        // Lets automatically wrap the cells
        timesBoldUnderline.setWrap(true);

        CellView cv = new CellView();
        cv.setFormat(times);
        cv.setFormat(timesBoldUnderline);
        cv.setAutosize(true);

        // Write a few headers
        //addCaption(sheet, 0, 0, "Header 1");
        //addCaption(sheet, 1, 0, "This is another header");


    }

    private void createRandomIntContent(WritableSheet sheet) throws WriteException,
            RowsExceededException {
        
        // Lets create a times font
        WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
        // Define the cell format
        times = new WritableCellFormat(times10pt);
        // Lets automatically wrap the cells
        times.setWrap(true);

        // create create a bold font with unterlines
        WritableFont times10ptBoldUnderline = new WritableFont(
                WritableFont.TIMES, 10, WritableFont.BOLD, false,
                UnderlineStyle.SINGLE);
        timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
        // Lets automatically wrap the cells
        timesBoldUnderline.setWrap(true);

        CellView cv = new CellView();
        cv.setFormat(times);
        cv.setFormat(timesBoldUnderline);
        cv.setAutosize(true);
        
        int n = 0;
        for (int i = 0; i < this.nrows ; i++ ) {
            for (int j = 0; j < this.ncols; j++) {
                n = getRandomInt(this.type);
                Integer integerN = n;
                addNumber(sheet,i,j,integerN);
            }
            
        
        }
    
    
    }
    
    private int getRandomInt(IntType _type) {
        int number = 0;
        Random r = new Random();        
        if (null != _type) switch (_type) {
            case POS_NEG:
                number =  -100 + r.nextInt(100 - (-100)) + 1;
                break;
            case POSITIVE:
                number =  0 + r.nextInt(100 - 0) + 1;
                break;
            case NEGATIVE:
                number =  -100 + r.nextInt(0 - (-100)) + 1;
                break;
            default:
                break;
        }
        
        return number;
    
    }
    
    private void createContent(WritableSheet sheet) throws WriteException,
            RowsExceededException {
        // Write a few number
        for (int i = 1; i < 10; i++) {
            // First column
            addNumber(sheet, 0, i, i + 10);
            // Second column
            addNumber(sheet, 1, i, i * i);
        }
        
        // Lets calculate the sum of it
        StringBuffer buf = new StringBuffer();
        buf.append("SUM(A2:A10)");
        Formula f = new Formula(0, 10, buf.toString());
        sheet.addCell(f);
        buf = new StringBuffer();
        buf.append("SUM(B2:B10)");
        f = new Formula(1, 10, buf.toString());
        sheet.addCell(f);

        // now a bit of text
        for (int i = 12; i < 20; i++) {
            // First column
            addLabel(sheet, 0, i, "Boring text " + i);
            // Second column
            addLabel(sheet, 1, i, "Another text");
        }
    }

    
    private void addCaption(WritableSheet sheet, int column, int row, String s)
            throws RowsExceededException, WriteException {
        Label label;
        label = new Label(column, row, s, timesBoldUnderline);
        sheet.addCell(label);
    }

    private void addNumber(WritableSheet sheet, int column, int row,
            Integer integer) throws WriteException, RowsExceededException {
        Number number;
        number = new Number(column, row, integer, times);
        sheet.addCell(number);
    }

    private void addLabel(WritableSheet sheet, int column, int row, String s)
            throws WriteException, RowsExceededException {
        Label label;
        label = new Label(column, row, s, times);
        sheet.addCell(label);
    }
/*
    public static void main(String[] args) throws WriteException, IOException {
        WriteExcel test = new WriteExcel();
        test.setOutputFile("c:/temp/lars.xls");
        test.write();
        System.out
                .println("Please check the result file under c:/temp/lars.xls ");
    }
 
*/
}