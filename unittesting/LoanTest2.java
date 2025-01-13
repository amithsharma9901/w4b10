package com.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest2 {

	
	
	@Test
	void testGetEmi() {
		Loan l=new Loan();
		assertEquals(l.getEmi(60000),5000);
		
		//fail("Not yet implemented");
	}
	@Test
	void testGetEmi1() {
		Loan l=new Loan();
		assertEquals(l.getEmi(-60000),-5000);
		
		//fail("Not yet implemented");
	}
}
