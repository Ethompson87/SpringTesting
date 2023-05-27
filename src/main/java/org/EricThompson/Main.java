package org.EricThompson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Animal.xml");

        Animal noise = (Animal)context.getBean("cat");
        noise.sound();
    }
}