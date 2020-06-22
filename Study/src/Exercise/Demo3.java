package Exercise;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Integer[] b = a;

        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new LinkedHashMap<>();

        map1.put("a3", "aa");
        map1.put("a2", "bb");
        map1.put("b1", "cc");

        map2.put("a3", "aa");
        map2.put("a2", "bb");
        map2.put("b1", "cc");

        for (Iterator iterator = map1.values().iterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
        System.out.println("----------------------------------------");

        for (Iterator iterator = map2.values().iterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
        System.out.println("----------------------------------------");

        Map<Object, Object> map3 = new LinkedHashMap<>();
        map3.put(null, null);
        System.out.println(map3.entrySet() + " " + map3.values());
        System.out.println("----------------------------------------");

        Set<String> set=new HashSet<>();
        set.add("123");
        set.add("456");
        for (Iterator it=set.iterator();it.hasNext();){
            String next = (String) it.next();
            System.out.println(next);
        }
        System.out.println("----------------------------------------");

        String str="aa";
        boolean flag = Objects.equals("aa", str);
        System.out.println("flag="+flag);

    }
}
