package lv.diana.inputoutput;

import java.io.*;

public class TestBufferRead {

	public static void main(String[] args)throws Exception{
		File file = new File("Data2.txt"); 
		FileReader fileReader = new FileReader(file); 
		
		BufferedReader buffReader = new BufferedReader(fileReader); // (new FileReader(file)); 

		String stringFileData;
		while((stringFileData = buffReader.readLine()) != null){
			System.out.println(stringFileData);
	}


}
}