package org.EricThompson;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    public void sound(){
        System.out.println("Woof");
    }
}
