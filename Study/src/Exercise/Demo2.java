package Exercise;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
//        Queue<node> que = new LinkedList<>();
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        //λ表达式输出
        //list.forEach(System.out::println);
//        list.forEach(str ->
//                System.out.println(str));
    }
}
