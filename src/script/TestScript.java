package script;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/25 9:52</p>
 */
public class TestScript {
    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        try {
            engine.eval(new FileReader("D:" + File.separator + "willie" + File.separator + "src" + File.separator + "script" + File.separator + "test.js"));
            if (engine instanceof Invocable) {
                Invocable in = (Invocable) engine;

                System.out.println(in.invokeFunction("count"));
            }
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
