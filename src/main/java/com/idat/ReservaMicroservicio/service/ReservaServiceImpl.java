package com.idat.ReservaMicroservicio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ReservaMicroservicio.cliente.OpenFeignClient;
import com.idat.ReservaMicroservicio.dto.HospedajeDTO;
import com.idat.ReservaMicroservicio.dto.ReservaDTO;
import com.idat.ReservaMicroservicio.model.Reserva;
import com.idat.ReservaMicroservicio.model.ReservaDetalle;
import com.idat.ReservaMicroservicio.model.ReservaHospedajeFK;
import com.idat.ReservaMicroservicio.repository.DetallleReservaRepository;
import com.idat.ReservaMicroservicio.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository repository;
	
	@Autowired
	private DetallleReservaRepository detalleRepository;
	
	@Autowired
	private OpenFeignClient feignCliente;

	@Override
	public List<ReservaDTO> listar() {
		List<Reserva> lista=repository.findAll();
		List<ReservaDTO> listadto= new ArrayList<>();
		ReservaDTO dto=null;
		for(Reserva res: lista) {
			dto=new ReservaDTO();
			dto.setIdResv(res.getIdReserva());
			dto.setCost(res.getCosto());
			listadto.add(dto);
				
		}
		return listadto;
	}

	@Override
	public void guardar(ReservaDTO reserva) {
		Reserva res = new Reserva();
		res.setIdReserva(reserva.getIdResv());
		res.setCosto(reserva.getCost());
		repository.save(res);		
	}

	@Override
	public void asignarReservaHospd() {
		List<HospedajeDTO> listado=feignCliente.listarHospedajes();
		ReservaHospedajeFK fk=null;
		ReservaDetalle detalle=null;
		
		for(HospedajeDTO dto:listado) {
			fk= new ReservaHospedajeFK();
			fk.setIdHospedaje(dto.getIdHosp());
			fk.setIdReserva(1);
			
			detalle=new ReservaDetalle();
			detalle.setFk(fk);
			detalleRepository.save(detalle);
		}
		
	
		
		
	}
	
	

	
}
