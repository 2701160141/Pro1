package leetcode;

import java.lang.ref.SoftReference;

public class exercise {
    public static void main(String[] args) {
        SoftReference<String> sr = new SoftReference<String>(new String("hello"));
        System.out.println(sr.get());
        sr.clear();
    }
}
