package com.cisc181.core;

public class PersonException extends Exception {

	private Person x;

	public PersonException() {
		super();
	}

	public PersonException(Person x) {
		super();
		this.x = x;
	}
}