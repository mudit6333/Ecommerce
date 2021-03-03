package com.SpringProject.FirstProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
@Component
@Primary
public class Bike implements Vehicle {
    public void move() {
        System.out.println("Travelled by bike");
    }
}
