package com.lge.lgema.gcs;

import com.lge.lgema.gcs.dao.CarDAO;
import com.lge.lgema.gcs.entity.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CarDAO carDAO) {
		return runner -> {
			readCar(carDAO);
//			updateCar(carDAO);
		};
	}

	private void updateCar(CarDAO carDAO) {
		String theId = "CAD210969";
		System.out.println("Getting car with id: " + theId);
		Car tempCar = carDAO.findByCarsId(theId);

		System.out.println("Changing pass to...");
		tempCar.setPassTo(new Date());

		System.out.println("Updating car...");
		carDAO.update(tempCar);

		System.out.println(tempCar);

    }

	private void readCar(CarDAO carDAO) {
		String theId = "CAD210969";
		System.out.println("Searching car with ID: " + theId);
		Car tempCar = carDAO.findByCarsId(theId);
		System.out.println(tempCar);
	}
}
