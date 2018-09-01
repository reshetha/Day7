package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import org.junit.jupiter.api.Test;


class LineCountTest {

		int count;
		@Test
		void Test() {
			File file = new File("C:\\reshe\\sai.txt");
			try(FileReader fileReader=new FileReader(file))
			{
			BufferedReader reader = new BufferedReader(fileReader);
					{
						String s;
						while((s = reader.readLine())!= null)
							count ++;
					}}
					catch(IOException e)
					{
						e.printStackTrace();
					}
			assertEquals(4, count);
		
	}
		}


