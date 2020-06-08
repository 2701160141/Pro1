package Exercise;

import java.io.FileOutputStream;

public class FileOutDemo1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream out = new FileOutputStream("demo/out.dat");
        out.write('A');
        out.write('B');
        int a = 10;
        out.write(a >>> 24);
        out.write(a >>> 16);
        out.write(a >>> 8);
        out.write(a);
        byte[] zg = "中国".getBytes("UTF-8");
        out.write(zg);
        out.close();

        IOUtil.printHex("demo/out.dat");
    }
}
