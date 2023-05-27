package org.EricThompson;

import org.springframework.stereotype.Component;

@Component
public class Food {
    private String brand;

//    public Food(String brand) {
//        this.brand = brand;
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "It's working, Wellness";
    }
}
