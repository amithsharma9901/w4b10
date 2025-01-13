package com.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest3 {
	Loan l;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {//once
		System.out.println("before ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {//once
		System.out.println("after ");
	}

	@BeforeEach
	void setUp() throws Exception {//number test cases
		l=new Loan();
	}

	@AfterEach
	void tearDown() throws Exception {
		l=null;
	}
	@Test
	void testGetEmi() {
		assertEquals(l.getEmi(60000),5000);
	}
	@Test
	void testGetEmi1() {
		assertEquals(l.getEmi(-60000),-5000);
	}

}
