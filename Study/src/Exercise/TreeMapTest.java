package Exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String line = cin.nextLine().trim().toUpperCase();
        //line = line.replaceAll("[,.]", "").toUpperCase();
        String[] words = line.split("\\W+");
        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<String> keys = new ArrayList<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                int num = map.get(word);
                map.put(word, num + 1);
            } else {
                map.put(word, 1);
                keys.add(word);
            }
        }
        for (String str : keys) {
            System.out.println(str + " : " + map.get(str));
        }
    }
}
