package com.constructor;

public class Address {

	private String Padd;
	private String Ladd;
	public Address(String padd, String ladd) {
		super();
		Padd = padd;
		Ladd = ladd;
	}
	@Override
	public String toString() {
		return "Address [Padd=" + Padd + ", Ladd=" + Ladd + "]";
	}
	
	}
	

