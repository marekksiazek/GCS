package com.lge.lgema.gcs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "car_id")
    private String carId;
    @Column (name = "car_brand")
    private String carBrand;
    @Column (name = "car_model")
    private String carModel;
//    @Enumerated(EnumType.STRING)
//    @Column (name = "TypPrzepustki")
//    private PassType passType;
    @Column (name = "PrzepustkaDO")
    private Date passTo;

    public Car(){    }

    public Car(String carId, String carBrand, String carModel, PassType passType, Date passTo) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
//        this.passType = passType;
        this.passTo = passTo;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

//    public PassType getPassType() {
//        return passType;
//    }
//
//    public void setPassType(PassType passType) {
//        this.passType = passType;
//    }

    public Date getPassTo() {
        return passTo;
    }

    public void setPassTo(Date passTo) {
        this.passTo = passTo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
//                ", passType=" + passType +
                ", passTo=" + passTo +
                '}';
    }
}
