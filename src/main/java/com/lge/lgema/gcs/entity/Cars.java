package com.lge.lgema.gcs.entity;

import jakarta.persistence.*;
import org.springframework.orm.jpa.vendor.Database;

import java.util.Date;

@Entity
@Table (name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "car_id")
    private String carId;
    @Column (name = "car_brand")
    private String carBrand;
    @Column (name = "car_model")
    private String carModel;
    @Column (name = "TypPrzepustki")
    private Database passType;
    @Column (name = "PrzepustkaDo")
    private Date passTo;

}
