package org.operator;

public class CharactorOnlyPrint {

	public static void main(String[] args) {
//		Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher("(&@#$)(kjhfjg7684376jhfkjdg");
//		while (matcher.find()) {
//			System.out.print(matcher.group());
//		}
//		System.out.println();
//		System.out.println(matcher.replaceAll(""));
		System.out.println("(&@#$)(kjhfjg7684376jhfkjdg".replaceAll("[^a-zA-Z]", ""));
		
	}

}
