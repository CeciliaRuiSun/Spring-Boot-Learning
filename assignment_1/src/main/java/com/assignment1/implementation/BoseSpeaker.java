package com.assignment1.implementation;

import com.assignment1.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {
    public String makeSound(){
        return "Playing with Bose speakers";
    }
}
