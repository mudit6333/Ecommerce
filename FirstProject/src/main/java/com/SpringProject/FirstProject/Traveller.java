package com.SpringProject.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
    //Ques1 tightly coupled
    /*  Bike bike=new Bike();

    public void journey() {
        bike.move();
    }

   */

    //Ques2 Loosely coupled
  /*  Vehicle vehicle;
    public Traveller(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void journey(){
        vehicle.move();
    }
    */

    //Ques3 @Components and @Autowired
  
    Vehicle vehicle;

    //Ques 6 Perform Constructor Injection in a Spring Bean
    @Autowired
    public Traveller(Vehicle vehicle) {
        super();
        this.vehicle = vehicle;
    }

    public void journey() {
        vehicle.move();
    }

}
