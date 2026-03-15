package com.cg.passenger.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="carrentals-service")
public interface CarClient {

    @GetMapping("/rentalcardetails")
    public String getCars();
}