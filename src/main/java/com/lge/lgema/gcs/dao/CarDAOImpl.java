package com.lge.lgema.gcs.dao;

import com.lge.lgema.gcs.entity.Car;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAOImpl implements CarDAO{

    private EntityManager entityManager;

    @Autowired
    public CarDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Car findByCarsId(String carId) {
        return entityManager.find(Car.class, carId);
    }

    @Override
    public void update(Car theCar) {

    }
}
