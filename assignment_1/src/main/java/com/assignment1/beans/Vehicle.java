package com.assignment1.beans;

import com.assignment1.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {
    private String name = "Honda";
    private final VehicleServices vehicleservices;

    @Autowired
    public Vehicle(VehicleServices vehicleservices){
        this.vehicleservices = vehicleservices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleservices;
    }
}
