package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.BinaryInteger;

class FileHandlingTest {

		@Test
		void testBinaryInteger() {
			File file = new File("C:\\reshe\\sai.txt");
			assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
