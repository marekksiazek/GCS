package com.lge.lgema.gcs.dao;

import com.lge.lgema.gcs.entity.Car;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void update(Car theCar) {
        entityManager.merge(theCar);
    }
}
