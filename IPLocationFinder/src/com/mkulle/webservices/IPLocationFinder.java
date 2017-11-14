package com.mkulle.webservices;

import net.webservicex.Airport;
import net.webservicex.AirportSoap;


public class IPLocationFinder {

	public static void main(String[] args) {

if (args.length !=1) 
{
	System.out.println("Please provide the country name");
	}
else
	{
	String airportCode = args[0];
	
	
	Airport airport = new Airport();
	AirportSoap airportSoap = airport.getAirportSoap();
	System.out.println(airportSoap.getAirportInformationByAirportCode(airportCode));
	//System.out.println(airportSoap.getAirportInformationByCountry(country));
	}

	}
}
