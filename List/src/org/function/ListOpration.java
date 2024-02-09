package org.function;

import java.util.LinkedList;
import java.util.List;

public class ListOpration {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(15);
		list.add(18);
		list.add(20);
		list.add(21);
		list.add(25);
		list.add(3);
		list.add(30);
		for (Integer x : list) {
			if (x % 3 == 0) {
				System.out.println("Divisible by 3 :" + x);
				if (x % 5 == 0 && x % 15 == 0) {
					System.out.println("Divisible by 3,5,15 :"+x);
				}
			} else if (x % 5 == 0) {
				System.out.println("Divisible by 5 :" + x);
				if (x % 3 == 0 && x % 15 == 0) {
					System.out.println("Divisible by 3,5,15 :"+x);
				}
			} else if (x % 15 == 0) {
				System.out.println("Divisible by 15 :" + x);
				if (x % 5 == 0 && x % 3 == 0) {
					System.out.println("Divisible by 3,5,15 :"+x);
				}
			}
		}
//		int count=0; String res="";
//		String s="hello world";
//		for (int i = 0; i < args.length; i++) {
//			for (int j = i+1; j < args.length; j++) {
//				if (s.charAt(i)==s.charAt(j)) {
//					count++;
//				}
//			}
//			res +=s.charAt(i);
//			System.out.println(s.charAt(i)+count);
//			count=0;
//		}
	}

}

