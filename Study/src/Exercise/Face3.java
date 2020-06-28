package Exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Face3 {
    public static void listAll(List<String> candidate, String prefix) {
        if (prefix != " ")
            System.out.println(prefix);
        for (int i = 0; i < candidate.size(); i++) {
            List<String> temp = new LinkedList<>(candidate);
            listAll(temp, prefix + temp.remove(i));
        }
    }

    public static void listAll2(List<String> list) {
        if (!list.isEmpty())
            System.out.println(list.toArray());
        for (int i = list.size() - 1; i >= 0; i--) {
            List<String> temp = new LinkedList<>(list);
            temp.remove(i);
            listAll2(temp);
        }
    }

    public static void main(String[] args) {
        String[] array = new String[]{"1", "2", "3", "4"};
        listAll(Arrays.asList(array), " ");
        listAll2(Arrays.asList(array));
//    }
    }
}