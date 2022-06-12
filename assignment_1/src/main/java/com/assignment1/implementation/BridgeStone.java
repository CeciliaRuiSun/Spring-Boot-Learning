package com.assignment1.implementation;

import com.assignment1.interfaces.Tires;
import org.springframework.stereotype.Component;

@Component
public class BridgeStone implements Tires {
    public String rotate(){
        return "using BrideStone tires";
    }
}
