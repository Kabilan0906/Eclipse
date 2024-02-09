package org.function;
public class CharacterOfString {
	public static void main(String[] args) {
		String one = "AlRightTechnology";
		char letter1 = 'h';
		for (int i=0;i<one.length();i++) {
			if(one.charAt(i)==letter1)
			System.out.println("Found 'h' at index : "+i);	}
		String two = "SeleniumAutomationtool";
		char letter2 = 'o';
		for (int i=0;i<two.length();i++) {
			if(two.charAt(i)==letter2)
			System.out.println("Found 'o' at index : "+i);	}
		String three = "shahul";
		char letter3 = 'u';
		for (int i=0;i<three.length();i++) {
			if(three.charAt(i)==letter3)
			System.out.println("Found 'u' at index : "+i);	}
		String four = "j a v a p r o g r a m ";
		char letter4 = 'p';
		for (int i=0;i<four.length();i++) {
			if(four.charAt(i)==letter4)
			System.out.println("Found 'p' at index : "+i);	}
		String five = "9095484678";
		char letter5 = '7';
		for (int i=0;i<five.length();i++) {
			if(five.charAt(i)==letter5)
			System.out.println("Found '7' at index : "+i);	}
	}


}
