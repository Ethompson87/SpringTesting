package org.EricThompson;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
}
