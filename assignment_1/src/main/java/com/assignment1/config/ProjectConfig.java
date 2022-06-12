package com.assignment1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


    @Configuration
    @ComponentScan(basePackages = {"com.assignment1.implementation","com.assignment1.services"})
    @ComponentScan(basePackageClasses = {com.assignment1.beans.Vehicle.class, com.assignment1.beans.Person.class})

    public class ProjectConfig{

    }

