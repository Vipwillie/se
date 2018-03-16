package httpClient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/16 14:25</p>
 */
public class HttpClientTest {
    public static void main(String[] args) {
        //创建http请求客户端
        HttpClient httpClient = HttpClients.createDefault();
        //创建GET请求方式
        HttpGet httpGet = new HttpGet("http://www.baidu.com/");
        try {
            //执行请求
            HttpResponse httpResponse = httpClient.execute(httpGet);
            System.out.println(httpResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
