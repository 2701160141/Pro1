package lianxi;

public class ReverseString {
    public static String GetReverse(String string) {
        if (string.length() <= 1) return string;
        return string.charAt(string.length() - 1) + GetReverse(string.substring(0, string.length() - 1));
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(GetReverse(str));
    }
}
