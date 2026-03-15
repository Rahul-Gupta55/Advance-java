package com.cg.carrentals.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRentalController {

    @GetMapping("/rentalcardetails")
    public String cars(){
        return "Cars Available : Swift, Creta, Innova";
    }

    @GetMapping("/bookingdetails")
    public String booking(){
        return "Car Booking Successful";
    }
}