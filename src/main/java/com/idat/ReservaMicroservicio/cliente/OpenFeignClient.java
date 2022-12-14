package com.idat.ReservaMicroservicio.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.ReservaMicroservicio.dto.HospedajeDTO;

@FeignClient(name="hospedaje-microservice",url="localhost:8090")
public interface OpenFeignClient {
	
	@GetMapping("/api/hospedaje/v1/listar")
	public List<HospedajeDTO> listarHospedajes();
	
}
