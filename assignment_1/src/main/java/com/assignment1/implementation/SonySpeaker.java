package com.assignment1.implementation;

import com.assignment1.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speakers {
    public String makeSound(){
        return "Playing with Sony speakers";
    }
}