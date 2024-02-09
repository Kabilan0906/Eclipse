package org.function;

public class Looping {

	public static void main(String[] args) throws InterruptedException {
//		int i = 1;
//		while (i <= 10) {
//			if (i == 2)
//				continue;
//			System.out.println(i);
//			if (i == 5)
//				break;
//			System.out.println("*");
//			i++;
//		}
//		if (i == 6) {
//			System.out.println("#");
//			break;
//		}

//		for (int j = 0; j < 10; j++) {
//			if (j == 2)
//				continue;
//			System.out.println(j);
//			if (j == 5)
//				break;
//			System.out.println("*"+j);
//		}

		int k = 1;
		do {
			Thread.sleep(1000);
			System.out.println(k);
			if (k == 2)
				continue;
			if (k == 5)
				break;
			System.out.println("*");
			k++;
		} while (k <= 10);

	}
}
