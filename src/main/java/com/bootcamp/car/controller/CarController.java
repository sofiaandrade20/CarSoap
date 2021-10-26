package com.bootcamp.car.controller;

import com.bootcamp.car.model.GetCarRequest;
import com.bootcamp.car.model.GetCarResponse;
import com.bootcamp.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarController {

    @Autowired
    private CarService carService;

    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCarRequest(@RequestPayload GetCarRequest request) {
        GetCarResponse response = new GetCarResponse();
        response.setCar(carService.getCars(request.getBrand()));
        return response;
    }
}
