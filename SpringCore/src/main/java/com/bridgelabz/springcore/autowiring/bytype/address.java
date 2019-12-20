package com.bridgelabz.springcore.autowiring.bytype;

import org.springframework.beans.factory.annotation.Autowired;

public class address {
	@Autowired
	private Person person;

	@Autowired
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
