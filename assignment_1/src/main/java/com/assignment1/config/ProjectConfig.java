package com.assignment1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
    We can use either approach to do componentscan. Scanning package, we won't need to write all classes name if there are too many. But 
    it could be ineffecient since not all classes has bean annotation. 
    
    There could be compile error if we use packages and someone changed package name since it is a string-style configuration and won't 
    change automatically.
*/
    @Configuration
    @ComponentScan(basePackages = {"com.assignment1.implementation","com.assignment1.services"})   
    @ComponentScan(basePackageClasses = {com.assignment1.beans.Vehicle.class, com.assignment1.beans.Person.class})

    public class ProjectConfig{

    }

