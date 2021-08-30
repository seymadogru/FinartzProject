package com.airport.serviceImplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import com.airport.dao.AirlineCompanyRepository;


class AirlineCompanyServiceImplTest {

	private AirlineCompanyServiceImpl airlineCompanyServiceImpl;
	
	private AirlineCompanyRepository airlineCompanyRepository;
	
	
	public void setUp() throws Exception{
		airlineCompanyServiceImpl = new AirlineCompanyServiceImpl();
	}
	
	
	@Test
	void testFindAirlineCompanyByName() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAirlineCompanyByAirportName() {
		fail("Not yet implemented");
	}

	@Test
	void testSaveAirlineCompany() {
		fail("Not yet implemented");
	}

}
