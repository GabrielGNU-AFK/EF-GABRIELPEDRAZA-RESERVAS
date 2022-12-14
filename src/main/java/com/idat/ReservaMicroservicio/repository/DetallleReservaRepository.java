package com.idat.ReservaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ReservaMicroservicio.model.ReservaDetalle;

@Repository
public interface DetallleReservaRepository extends JpaRepository<ReservaDetalle, Integer> {

}
