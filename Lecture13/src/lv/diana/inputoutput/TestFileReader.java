package lv.diana.inputoutput;

import java.io.*;

public class TestFileReader {
	

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("Data2.txt");
		
		int i;
		char test = 100; 
	
		
		while((i=fr.read()) != -1){
			System.out.println((char)i);
		}
		

	}

}
