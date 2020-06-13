package Exercise;

public class Face1 {
    public static int get(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i;
            case 3:
                result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = 5;
        System.out.println(get(i));
        int j = 2;
        System.out.println(get(j));
    }
}
