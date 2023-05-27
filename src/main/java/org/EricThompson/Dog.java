package org.EricThompson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    @Autowired
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void sound(){
        System.out.println("dog: " + food);
    }
}
