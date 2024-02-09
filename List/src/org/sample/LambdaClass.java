package org.sample;

public class LambdaClass {
	public static void main(String[] args) {
		LambdaInterface lambda=(a,b) ->a*b;
		int result = lambda.i(5, 9);
		System.out.println(result);
	}

}
