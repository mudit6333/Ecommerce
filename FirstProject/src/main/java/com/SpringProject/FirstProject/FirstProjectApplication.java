package com.SpringProject.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {


    public static void main(String[] args) {

        //Traveller traveller=new Traveller(new Car());
        ApplicationContext applicationContext =
                SpringApplication.run(FirstProjectApplication.class, args);

        //Ques4 Get a Spring Bean from application context and display its properties.
        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.journey();


    }

}
