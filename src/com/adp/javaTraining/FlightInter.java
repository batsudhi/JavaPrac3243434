package com.adp.javaTraining;

public class FlightInter {
	public static void main(String[] args) {
		FlightOpeartions obj = new Emirates(); 
		obj.getAllAvailableFlights(); 
		
		FlightOpeartions obj2 = new BritishAirways();
		obj2.getAllAvailableFlights();  
		}	
	}
