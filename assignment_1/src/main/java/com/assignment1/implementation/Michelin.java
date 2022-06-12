package com.assignment1.implementation;

import com.assignment1.interfaces.Tires;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Michelin implements Tires {
    public String rotate(){
        return "using BrideStone tires";
    }
}