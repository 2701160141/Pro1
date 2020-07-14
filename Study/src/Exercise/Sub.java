package Exercise;

public class Sub {
    public static String getDimName(String string) {
        String newstring = new String();
        if (null == string) {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < string.length() - 1; i++) {
            stringbuffer.append("*");
        }
        stringbuffer.append(string.subSequence(string.length() - 1, string.length()));
        newstring = stringbuffer.toString();

        return newstring;
    }

    public static void main(String[] args) {
        System.out.println(getDimName("保剑"));
    }
}
