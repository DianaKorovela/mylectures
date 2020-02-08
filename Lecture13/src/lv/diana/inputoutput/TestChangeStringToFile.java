package lv.diana.inputoutput;

import java.io.*;
import java.util.Scanner;

public class TestChangeStringToFile {

	
	public static void main(String[] args) throws Exception {
	/*	String defaultStr = "Dear user userName";
		String lastString = defaultStr.replace("userName", "");
		System.out.println(lastString + "Diana");
*/
		File file = new File("DefaultText.txt");

		Scanner sc = new Scanner(file);
		String stringFromTextFile = "";
		while (sc.hasNextLine()) {
			stringFromTextFile = sc.nextLine();
		}

		// System.out.println("Check: " +stringFromTextFile);

		String lastString1 = stringFromTextFile.replaceAll("userName", "");
		String userName = "Diana Koroela";
		File fileForUser = new File(userName + ".txt");
		FileWriter fw = new FileWriter(fileForUser, true);
		fw.write("Dear user " +lastString1 +userName);
		fw.close();
		
		

	}
}
