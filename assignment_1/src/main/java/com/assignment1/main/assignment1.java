package com.assignment1.main;

import com.assignment1.beans.Person;
import com.assignment1.beans.Vehicle;
import com.assignment1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class assignment1 {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        //String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
