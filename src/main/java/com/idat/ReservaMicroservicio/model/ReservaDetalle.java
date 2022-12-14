package com.idat.ReservaMicroservicio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="detalle_reserva")
@Getter
@Setter
public class ReservaDetalle {
	@Id
	private ReservaHospedajeFK fk= new ReservaHospedajeFK();
	
	

}
