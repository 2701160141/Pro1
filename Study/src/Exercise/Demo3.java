package Exercise;

public class Demo3 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Integer[] b = a;

        try {
            int s = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
            throw e;
        }
    }
}
