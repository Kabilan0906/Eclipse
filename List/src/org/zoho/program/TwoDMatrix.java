//Transpose 2D matrix 
//For example input : { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }
//output : { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } }
//Don't use another 2D array


package org.zoho.program;

public class TwoDMatrix {
	public static void main(String[] args) {
		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] x= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x[0].length; j++) {
				x[i][j] = x[i][j] + x[j][i];
				x[j][i] = x[i][j] - x[j][i];
				x[i][j] = x[i][j] - x[j][i];
			}
		}
		System.out.print("{");
		for (int i = 0; i < x.length; i++) {
			System.out.print("{");
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j]);
				if (x[0].length - 1 != j) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			if (x.length - 1 != i) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

}