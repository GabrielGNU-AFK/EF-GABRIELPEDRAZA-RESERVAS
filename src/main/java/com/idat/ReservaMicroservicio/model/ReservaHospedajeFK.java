package com.idat.ReservaMicroservicio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;


@Embeddable
@Getter
@Setter
public class ReservaHospedajeFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1376833586613573885L;
	
	@Column(name="id_reserva",nullable = false)
	private int idReserva;
	@Column(name="id_hospedaje",nullable = false)
	private int idHospedaje;
}
