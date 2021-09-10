package regex01;

import java.util.regex.Pattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="[a-z&&[^c]]";
		String s2="[a-z[A-Z][0-9]_]";
		
		
		
		System.out.println(Pattern.matches(s2, "D"));
		}

}
