package com.lge.lgema.gcs.dao;

import com.lge.lgema.gcs.entity.Car;

public interface CarDAO {
    Car findByCarsId(String carId);
    void update(Car theCar);
}
