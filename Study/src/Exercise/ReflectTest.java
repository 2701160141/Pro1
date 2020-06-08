package Exercise;

import java.lang.reflect.Field;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //取得Class对象
        Class<MyClass1> cls = MyClass1.class;
        //对象实例化
        MyClass1 myClass1 = cls.newInstance();
        //取得Field
        Field field = cls.getDeclaredField("age");

        //动态设置封装，破坏封装性
        field.setAccessible(true);//private age也可访问

        //设置以及取得属性
        field.set(myClass1, 20);
        Object object = field.get(myClass1);
        System.out.println(object);
    }
}

class MyClass1 {
    private String name;
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MyClass1 [name=" + name + ", age=" + age + "]";
    }
}
