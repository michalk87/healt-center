package com.michalkijowski.health.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = {HealthCenterApplication.class, Jsr310JpaConverters.class}
)

@SpringBootApplication
public class HealthCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCenterApplication.class, args);
	}

}
