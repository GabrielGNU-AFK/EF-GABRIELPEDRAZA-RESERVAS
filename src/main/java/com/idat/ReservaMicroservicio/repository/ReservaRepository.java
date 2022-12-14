package com.idat.ReservaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.ReservaMicroservicio.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
