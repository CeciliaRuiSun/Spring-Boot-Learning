package com.assignment1.services;

import com.assignment1.interfaces.Speakers;
import com.assignment1.interfaces.Tires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class VehicleServices {

    @Autowired    //inject dependency to interface
    private Speakers speakers;
    private Tires tires;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tires.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }


    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tires getTires() {
        return tires;
    }

    @Autowired   // we can also inject dependency in setter method
    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
