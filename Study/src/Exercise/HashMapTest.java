package Exercise;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        hashMap.put(2, new User("zhangsan", 25));
        hashMap.put(1, new User("lisi", 28));
        hashMap.put(3, new User("wangwu", 26));
        System.out.println(hashMap);
        HashMap<Integer, User> sortHashMap = sortHashMap(hashMap);
        System.out.println(sortHashMap);
    }

    public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();
        List<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();
        for (Map.Entry<Integer, User> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
            //System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }
        return linkedHashMap;
    }
}

class User {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
