package excel.jxls;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.*;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/21 15:19</p>
 */
public class JxlsExport2ExcelUtil {

    /**
     * 生成excel
     *
     * @param tempFileName  模版名称
     * @param context       数据
     * @param excelName     导出文件名
     * @param isSingleSheet 是否单sheet，true单sheet,false多sheet
     */
    public static void generateExcel(String tempFileName, Context context, String excelName, boolean isSingleSheet) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File(tempFileName));
            os = new FileOutputStream(excelName);
            JxlsHelper jxlsHelper = JxlsHelper.getInstance();

            if (!isSingleSheet) {
                jxlsHelper.setUseFastFormulaProcessor(false);//多sheet
            }

            jxlsHelper.processTemplate(is, os, context);

            if (null != os) {
                os.close();
            }

            if (null != is) {
                is.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
