package com.flight_reservation_app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_reservation_app.entity.Reservation;
import com.flight_reservation_app.repository.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Optional<Reservation> findById = reservationRepo.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	}
	
	
	
}
