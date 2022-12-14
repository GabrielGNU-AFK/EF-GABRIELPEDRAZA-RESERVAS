package com.idat.ReservaMicroservicio.service;

import java.util.List;

import com.idat.ReservaMicroservicio.dto.ReservaDTO;



public interface ReservaService {
	
	List<ReservaDTO> listar();
	void guardar(ReservaDTO reserva);
	void asignarReservaHospd();
}
