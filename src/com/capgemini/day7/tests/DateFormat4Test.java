package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormat4;

class DateFormat4Test {

	@Test
	void test() 
	{
		assertEquals(true, DateFormat4.checkMagic(2,2,04));
		assertEquals(false, DateFormat4.checkMagic(2,2,14));
	}

	

	
	}

	


