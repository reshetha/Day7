package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.PatternSearch;

class GrepTest {

		@Test
		void testPatternSearch() throws FileNotFoundException, IOException {
			File file = new File("C:\\reshe\\sai.txt");
					
			assertEquals("Line number 6 : String not found;\n", PatternSearch.findString(file,"import"));
		}

		
	}

