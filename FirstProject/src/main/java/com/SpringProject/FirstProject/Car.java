package com.SpringProject.FirstProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public void move() {
        System.out.println("Travelled by car");
    }
}

