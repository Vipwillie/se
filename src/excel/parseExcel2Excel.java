package excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/12 18:34</p>
 */
public class parseExcel2Excel {

    private static synchronized Row getRow(Sheet sheet, int rownum) {
        return sheet.getRow(rownum);
    }

    private static synchronized Cell getCell(Row row, int cellIndex) {
        return row.getCell(cellIndex);
    }

    public static void main(String[] args) {
        File file = new File("student.xlsx");
        String[] values = new String[]{"1", "q", "13", "sgwe", "wetfgwe", "wsedgw4et23", "", "", "", ""};
        try {
            XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));

            Sheet sheet = wb.getSheetAt(0);

            CellStyle cellStyle = wb.createCellStyle();

            short borderColor = IndexedColors.GREY_50_PERCENT.getIndex();

            cellStyle.setAlignment(HorizontalAlignment.CENTER);
            cellStyle.setFillPattern(FillPatternType.NO_FILL);

            cellStyle.setBorderTop(BorderStyle.THIN);
            cellStyle.setTopBorderColor(borderColor);
            cellStyle.setBorderRight(BorderStyle.THIN);
            cellStyle.setRightBorderColor(borderColor);
            cellStyle.setBorderBottom(BorderStyle.THIN);
            cellStyle.setBottomBorderColor(borderColor);
            cellStyle.setBorderLeft(BorderStyle.THIN);
            cellStyle.setLeftBorderColor(borderColor);

            cellStyle.setWrapText(true);

            int size = values.length;
            Map titleReplace = new HashMap<String, Object>();
            titleReplace.put("a", "2011");
            titleReplace.put("b", "2012");
            Set<Map.Entry> replace = titleReplace.entrySet();
            int rowNum = 3;

            for (int m = 0; m < 3; m++) {
                Row curRow = sheet.getRow(m);
                for (int n = 0; n < 6; n++) {
                    Cell curCell = curRow.getCell(n);
                    String content = curCell.getStringCellValue();

                    for (Map.Entry me : replace) {
                        String key = me.getKey().toString();
                        String value = me.getValue().toString();

                        if (content.contains(key)) {
                            content = content.replace(key, value);
                        }
                    }
                    curCell.setCellValue(content);
                }
            }

            int beginRow = 3;
            int perThreadCreateRowCount = 5000;
            ExecutorService es = Executors.newCachedThreadPool();//创建线程池
            CountDownLatch doneSignal = new CountDownLatch(3);
            ExcelWriterThread excelWriterThread = null;
            for (int i = 1; i <= 3; i++) {
                excelWriterThread = new ExcelWriterThread(doneSignal, sheet, 10, values);
                if (i == 1) {
                    excelWriterThread.setBeginRow(beginRow);
                    excelWriterThread.setPerThreadDoCreateRow(perThreadCreateRowCount);
                } else {
                    excelWriterThread.setBeginRow(perThreadCreateRowCount * (i - 1));
                    excelWriterThread.setPerThreadDoCreateRow(perThreadCreateRowCount * (i + 1));
                }
                es.submit(excelWriterThread);
            }

            doneSignal.await();
            es.shutdown();

            File excel = new File("学生报表.xlsx");
            SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook(wb, 100);
            OutputStream os = new FileOutputStream(excel);
            sxssfWorkbook.write(os);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
