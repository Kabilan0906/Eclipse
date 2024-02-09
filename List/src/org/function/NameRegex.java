package org.function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameRegex {

	public static void main(String[] args) {
		String s="Karthick .V";
		String pattern = "^[a-zA-Z]+[\\s\\.]?[a-zA-Z]+$";
		Pattern phone = Pattern.compile(pattern);
		Matcher match = phone.matcher(s);
		if(match.matches())
			System.out.println("name is valid");
		else
			System.out.println("name is invalid");
	}
}
