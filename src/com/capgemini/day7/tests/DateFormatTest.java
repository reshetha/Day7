package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormat;

class DateFormatTest {

	@Test
	void testDateFormat() throws ParseException {
		
		
			
		 assertEquals("12/12/2010",DateFormat.DateFormat("12122010"));
		 assertEquals("12 December, 2010",DateFormat.DateFormat1("12122010"));

}
		}


