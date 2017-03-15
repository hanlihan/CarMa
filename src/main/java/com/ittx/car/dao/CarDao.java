package com.ittx.car.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ittx.car.model.Car;

@Repository("carDao")
public interface CarDao {
    void addCar(Car car);
    List<Car> getAllStudent();
    void updateCars(Car car);
    void deleteCar(int id);
    Car isExistCarByID(int id);
    Car isExistCarNumber(String number);
    Car isExistCarModel(String model);
    Car isExistCarCarnumber(String carnumber); 
}
