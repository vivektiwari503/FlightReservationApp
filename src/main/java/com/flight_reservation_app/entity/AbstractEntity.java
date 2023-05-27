package com.flight_reservation_app.entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass//id column is used in every table so I made one Abstract Entity class where I define id and marked with @mappedSuperClass and this
//class inherited by child class for the purpose of reusability of code
public class AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
