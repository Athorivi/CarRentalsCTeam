package com.Cteam.Interfaces;

import com.Cteam.Tables.Car;
import java.util.List;

public interface CarInterface {

    public void createCar(Car car);

    public List<Car> readCar();

    public void updateCar(Car car);

    public void deleteCar(Integer id);
}
