package com.tianya.learn;

import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        pro.load(ReflectTest.class.getClassLoader().getResourceAsStream("pro.properties"));

        Class cls = Class.forName(pro.getProperty("className"));
        Object obj = cls.newInstance();
        Method method = cls.getDeclaredMethod(pro.getProperty("methodName"), String.class);
        method.setAccessible(true);
        method.invoke(obj, "哦豁");
    }
}
