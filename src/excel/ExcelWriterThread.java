package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.concurrent.CountDownLatch;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/20 17:06</p>
 */
public class ExcelWriterThread implements Runnable {

    private int perThreadDoCreateRow;
    private int perRowCellNum;
    private Sheet sheet;
    private int beginRow;
    private String[] values;
    private CountDownLatch doneSignal;

    public ExcelWriterThread(CountDownLatch doneSignal, Sheet sheet, int perRowCellNum, String[] values) {
        this.sheet = sheet;
        this.perRowCellNum = perRowCellNum;
        this.values = values;
        this.doneSignal = doneSignal;
    }

    private synchronized Row getRow(Sheet sheet, int rownum) {
        return sheet.createRow(rownum);
    }

    @Override
    public void run() {
        try {
            Row curRow = null;
            Cell curCell = null;
            for (int i = this.beginRow; i < this.perThreadDoCreateRow; i++) {
                synchronized (sheet) {//这里锁住sheet可以解决在createRow时出现的脏写
                    curRow = sheet.getRow(i);
                    if (curRow == null) {
                        curRow = sheet.createRow(i);
                    }
                }
                for (int j = 0; j < perRowCellNum; j++) {
                    curCell = curRow.getCell(j);
                    if (curCell == null) {
                        curCell = curRow.createCell(j);
                    }
                    curCell.setCellValue(values[j]);
                }
                System.out.println("第" + i + "行完成");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            doneSignal.countDown();
        }
    }

    public int getBeginRow() {
        return beginRow;
    }

    public void setBeginRow(int beginRow) {
        this.beginRow = beginRow;
    }

    public int getPerThreadDoCreateRow() {
        return perThreadDoCreateRow;
    }

    public void setPerThreadDoCreateRow(int perThreadDoCreateRow) {
        this.perThreadDoCreateRow = perThreadDoCreateRow;
    }
}
