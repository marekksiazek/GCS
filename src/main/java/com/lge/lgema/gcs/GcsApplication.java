package com.lge.lgema.gcs;

import com.lge.lgema.gcs.dao.CarDAO;
import com.lge.lgema.gcs.entity.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CarDAO carDAO) {
		return runner -> {
			readCar(carDAO);
		};
	}

	private void readCar(CarDAO carDAO) {
		String theId = "CAD210969";
		System.out.println("Searching car with ID: " + theId);
		Car tempCar = carDAO.findByCarsId(theId);
		System.out.println(tempCar);
	}
}
