package com.cockly.reflection;

import com.cockly.reflection.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReflectionApplication {

    public static void main(String[] args) throws ClassNotFoundException {
        SpringApplication.run(ReflectionApplication.class, args);
        //获取类对象4种方式
        Class<User> clazz1 = User.class;
        Class<? extends User> clazz2 = new User().getClass();
        Class<?> clazz3 = Class.forName("com.cockly.reflection.entity.User");
        Class<?> clazz4 = ReflectionApplication.class.getClassLoader().loadClass("com.cockly.reflection.entity.User");
        System.out.println("(clazz1 == clazz2) = " + (clazz1 == clazz2));
        System.out.println("(clazz1 == clazz3) = " + (clazz1 == clazz3));
        System.out.println("(clazz1 == clazz4) = " + (clazz1 == clazz4));
        int modifiers = clazz1.getModifiers();//获取修饰符
        System.out.println("modifiers = " + modifiers);
    }

}
