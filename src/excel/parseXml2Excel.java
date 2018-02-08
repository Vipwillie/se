package excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/12 14:09</p>
 */
public class parseXml2Excel {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(6);
        studentList.add(new Student("a", 1, "男", "十堰市", "136544245", ""));
        studentList.add(new Student("b", 31, "男", "武汉市", "136544245", ""));
        studentList.add(new Student("c", 11, "女", "十堰市", "136544245", ""));
        studentList.add(new Student("d", 15, "男", "武汉市", "136544245", ""));
        studentList.add(new Student("e", 11, "女", "十堰市", "136544245", ""));
        studentList.add(new Student("f", 12, "男", "咸宁市", "136544245", ""));

        try {
            //创建Excel 07
            SAXReader reader = new SAXReader();
            Document doc = reader.read(new File("D:" + File.separator + "willie" + File.separator + "src" + File.separator + "excel" + File.separator + "excel.xml"));

            Workbook wb = new XSSFWorkbook();//创建exc

            Element rootElement = doc.getRootElement();//取得配置文件中的根节点
            Attribute excelName = rootElement.attribute("excelName");
            String sheetName = excelName.getStringValue();
            Sheet sheet = wb.createSheet(sheetName);

            Pattern pattern = Pattern.compile("\\{(.*?)}");

            Element columnsElement = rootElement.element("columns");//列
            List<Element> columnList = columnsElement.elements();
            int columnLength = columnList.size();
            for (int index = 1; index < columnLength; index++) {
                Attribute widthAttr = columnList.get(index).attribute("width");//宽度
                String width = widthAttr.getStringValue();

                Attribute unitAttr = columnList.get(index).attribute("unit");//单位
                String unit = unitAttr.getStringValue();
                sheet.setColumnWidth(index, getWidthOrHeight(unit, width).intValue());
            }

            //标题
            Element titleElement = rootElement.element("title");
            String title = titleElement.getText();
            Matcher titleMatcher = pattern.matcher(title);
            while (titleMatcher.find()) {
                String key = titleMatcher.group();
                String value = "";
                title = title.replace(key, value);
            }
            //合并的行数
            Attribute rowspanAttr = titleElement.attribute("rowspan");
            int rowspan = Integer.parseInt(rowspanAttr.getStringValue()) - 1;

            //合并的列数
            Attribute colspanAttr = titleElement.attribute("colspan");
            int colspan = Integer.parseInt(colspanAttr.getStringValue()) - 1;

            Row titleRow = sheet.createRow(0);//第一行
            Cell titleCell = titleRow.createCell(0);
            titleCell.setCellValue(title);//设置标题
            //设置格式
            CellStyle cellStyle = wb.createCellStyle();
            //对齐方式
            Attribute alignAttr = titleElement.attribute("align");
            String align = alignAttr.getStringValue();
            cellStyle.setAlignment(getAlignment(align));
            cellStyle.setFillForegroundColor(CellStyle.NO_FILL);
            cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
            //设置字体
            Font font = wb.createFont();
            font.setColor((short) 20);

            cellStyle.setFont(font);
            titleCell.setCellStyle(cellStyle);
            sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, 5));

            //附标题
            Element subTitleElement = rootElement.element("subTitle");
            if (null != subTitleElement) {
                String subTitle = subTitleElement.getText();
                Matcher subTitleatcher = pattern.matcher(subTitle);
                while (subTitleatcher.find()) {
                    String key = subTitleatcher.group();
                    String value = "";
                    subTitle = subTitle.replace(key, value);
                }
                //合并的行数
                Attribute rowspanAttr1 = titleElement.attribute("rowspan");
                int rowspan1 = Integer.parseInt(rowspanAttr1.getStringValue()) - 1;

                //合并的列数
                Attribute colspanAttr1 = titleElement.attribute("colspan");
                int colspan1 = Integer.parseInt(colspanAttr1.getStringValue()) - 1;

                Row subTitleRow = sheet.createRow(2);//第二行
                Cell subTitleCell = subTitleRow.createCell(0);
                subTitleCell.setCellValue(subTitle);//设置标题

                //对齐方式
                CellStyle subTitleCellStyle = wb.createCellStyle();
                Attribute alignAttr1 = titleElement.attribute("align");
                String align1 = alignAttr1.getStringValue();
                subTitleCellStyle.setAlignment(getAlignment(align1));
                subTitleCellStyle.setFillForegroundColor(CellStyle.NO_FILL);
                subTitleCellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
                //设置字体
                Font subTitleFont = wb.createFont();
                font.setColor((short) 20);

                subTitleCellStyle.setFont(subTitleFont);
                subTitleCell.setCellStyle(cellStyle);

                sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, 5));
            }

            //报表头
            Row tableTitleRow = sheet.createRow(3);
            Element table = rootElement.element("table");
            Element thread = table.element("tr");
            Attribute heightAttr = thread.attribute("height");
            String height = heightAttr.getStringValue();
            Attribute trUnitAttr = thread.attribute("unit");
            String trUnit = trUnitAttr.getStringValue();
            tableTitleRow.setHeight(getWidthOrHeight(trUnit, height).shortValue());
            List<Element> tdElement = thread.elements();
            int tdSize = tdElement.size();
            CellStyle tdCellStyle = wb.createCellStyle();
            tdCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
            for (int index = 0; index < tdSize; index++) {
                String tdText = tdElement.get(index).getText();
                Cell tdCell = tableTitleRow.createCell(index);
                tdCell.setCellValue(tdText);
                tdCell.setCellStyle(tdCellStyle);
            }

            File excel = new File(sheetName + ".xlsx");
            OutputStream os = new FileOutputStream(excel);
            wb.write(os);
            os.close();

            System.out.println("导出成功");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static short getAlignment(String align) {
        short returnVlaue;
        switch (align) {
            case "center":
                returnVlaue = CellStyle.ALIGN_CENTER;
                break;
            case "left":
                returnVlaue = CellStyle.ALIGN_LEFT;
                break;
            case "right":
                returnVlaue = CellStyle.ALIGN_RIGHT;
                break;
            default:
                returnVlaue = CellStyle.ALIGN_CENTER;
        }
        return returnVlaue;
    }

    private static Number getWidthOrHeight(String unit, String value) {
        int returnValue;
        switch (unit) {
            case "px":
                returnValue = Math.round(Float.parseFloat(value) * 37F);
                break;
            case "em":
                returnValue = Math.round(Float.parseFloat(value) * 267.5F);
                break;
            default:
                returnValue = Math.round(Float.parseFloat(value) * 37F);
        }
        return returnValue;
    }
}
