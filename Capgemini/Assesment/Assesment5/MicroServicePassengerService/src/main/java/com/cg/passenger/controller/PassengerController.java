package com.cg.passenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.passenger.feign.CarClient;

@RestController
public class PassengerController {

    @Autowired
    private CarClient client;

    @GetMapping("/passengerdetails")
    public String passenger(){

        String cars = client.getCars();

        return "Passenger Rahul\nCar Details -> " + cars;
    }
}