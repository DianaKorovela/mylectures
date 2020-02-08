package lv.diana.inputoutput;

import java.io.*;

public class TestCreateAndWriteFile {


	public static void main(String[] args) throws Exception {
		
		File fileObj = new File("newfile.txt");
		FileWriter fw = new FileWriter(fileObj,true); 
		fw.write("Check again?");
		fw.append("\nString next line txt");
		fw.close();
		
//		if(fileObj.createNewFile()){
//			System.out.println("File created: " +fileObj.getName());
//		}else{
//			System.out.println("File exists");
//			
//		}

	}

}
