package Exercise;

import java.io.*;

public class first {
    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "test.txt");
        Reader in = new FileReader(f);
        char[] c = new char[1024];
        int len = in.read(c);
        in.close();
        System.out.println(new String(c, 0, len));
    }
}
