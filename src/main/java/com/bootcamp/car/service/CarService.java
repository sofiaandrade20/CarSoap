package com.bootcamp.car.service;

import com.bootcamp.car.model.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {
    private static final Map<String, Car> cars = new HashMap<>();

    @PostConstruct
    public void inizialize() {
        Car bmw = new Car();
        bmw.setModel("X5");
        bmw.setCarId(1);
        bmw.setBrand("BMW");

        Car porsche = new Car();
        porsche.setModel("Cayman");
        porsche.setCarId(1);
        porsche.setBrand("Porsche");

        Car audi = new Car();
        audi.setModel("Q3");
        audi.setCarId(1);
        audi.setBrand("Audi");

        cars.put(bmw.getBrand(), bmw);
        cars.put(porsche.getBrand(), porsche);
        cars.put(audi.getBrand(), audi);
    }

    public Car getCars(String brand) {
        System.out.println(brand);
        return cars.get(brand);
    }
}
