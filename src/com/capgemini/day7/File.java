package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File 
{
	BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
	int lines;{
	try {
		while (reader.readLine() != null) lines++;
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		reader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}
