package org.zoho.program;

public class MoveToZero {

	public static void main(String[] args) {
		int[] i = { 1, 0, 2, 0, 3, 4, 0, 5, 6, 7, 0 };
		int x, y = 1;
		for (int j = 0; j < i.length; j++) {
			if (i[j] == 0) {
				x = j + y;
				if (x < i.length) {
					i[j] = i[j] + i[x];
					i[x] = i[j] - i[x];
					i[j] = i[j] - i[x];
					if (i[j] != 0) {
						y = 1;
					} else {
						y++;
						j--;
						continue;
					}
				}
			}
			System.out.print(i[j] + " ");
		}
	}
}
