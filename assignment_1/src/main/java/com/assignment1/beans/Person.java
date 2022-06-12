package com.assignment1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")      //we can customize bean value to "personbean", or by default IoC container will maintain this bean with class name, Person.
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired     // inject dependency by constructor
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
