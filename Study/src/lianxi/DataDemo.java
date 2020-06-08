package lianxi;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DataDemo {
    public static void main(String[] args) throws Exception {
        String Encoding = "UTF-8";
        File file = new File("C:\\Users\\76365\\Desktop\\新建文本文档.txt");
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file), Encoding);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String lineTxt = null;
        while ((lineTxt = bufferedReader.readLine()) != null) {
            System.out.println(lineTxt);
            String quote = JSONParser.quote(lineTxt);
            System.out.println(quote);
        }
        reader.close();
    }
}
