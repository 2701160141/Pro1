package lianxi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectExercise {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clz = Class.forName("leetcode.LCfirst");
        Method[] methods = clz.getDeclaredMethods();
        Field[] fields = clz.getFields();
        for (Method method : methods) {
            System.out.println("方法名:" + method);
        }
        System.out.println("--------------------------------");
        for (Field field : fields) {
            System.out.println("属性名:" + field.getName());
        }
    }
}
