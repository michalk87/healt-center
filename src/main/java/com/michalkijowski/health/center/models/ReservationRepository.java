package com.michalkijowski.health.center.models;

import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {

    boolean existsByDateEquals(LocalDate date);

}
