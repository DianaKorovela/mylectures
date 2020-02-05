package diana.lv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {


	public static void main(String[] args) {
		String inputStr = "abc03U0304_9";
		String regexStrExp = "[a-z]+";
		
		System.out.println(inputStr.charAt(0));
		System.out.println(inputStr.charAt(1));
		
		Pattern pattern = Pattern.compile(regexStrExp);
		Matcher matcher = pattern.matcher(inputStr);
		
		while(matcher.find()){
			System.out.println("find() found substring " +matcher.group());
			
		}
		
		String replaceSymbols = "l";
		String outputStr = matcher.replaceFirst(replaceSymbols); 
		
		System.out.println(outputStr);
	}

}