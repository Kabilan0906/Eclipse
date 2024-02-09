package org.function;

public class Replaceword {
	public static void main(String[] args) {
		String word = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		String result = word.replaceAll("pincode", " ");
		System.out.println(result);
	}
}
