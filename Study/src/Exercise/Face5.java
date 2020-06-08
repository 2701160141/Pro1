package Exercise;

import java.util.HashMap;
import java.util.Map;

public class Face5 {
    public static void main(String[] args) {
        String data = "aaabb";
        char[] ch = data.toCharArray();
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                Integer value = map.get(ch[i]);
                map.put(ch[i], value + 1);
            } else map.put(ch[i], 1);
        }
        int max = 0;
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (max < m.getValue()) max = m.getValue();
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == max) System.out.println(m.getKey() + ":" + m.getValue());
        }
    }
}
