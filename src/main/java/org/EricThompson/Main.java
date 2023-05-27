package org.EricThompson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Animal.xml");

        Dog noise = (Dog)context.getBean("dog");
        noise.sound();

//        Food food = (Food)context.getBean("food");
//        System.out.println(food);
    }
}