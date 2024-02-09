package org.operator;

import java.util.Scanner;

public class Roman {
	static int PreviousValue = 0, CurrentValue = 0, res = 0;
	public static int data(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			char value = s.charAt(i);
			switch (value) {
			case 'I': {
				CurrentValue = 1;
				if (CurrentValue < PreviousValue) {
					res -= CurrentValue;
				} else {
					res += CurrentValue;
				}
				PreviousValue = CurrentValue;
				break;
			}
			case 'V': {
				CurrentValue = 5;
				if (CurrentValue < PreviousValue) {
					res -= CurrentValue;
				} else {
					res += CurrentValue;
				}
				PreviousValue = CurrentValue;
				break;
			}
			case 'X': {
				CurrentValue = 10;
				if (CurrentValue < PreviousValue) {
					res -= CurrentValue;
				} else {
					res += CurrentValue;
				}
				PreviousValue = CurrentValue;
				break;
			}
			case 'L': {
				CurrentValue = 50;
				if (CurrentValue < PreviousValue) {
					res -= CurrentValue;
				} else {
					res += CurrentValue;
				}
				PreviousValue = CurrentValue;
				break;
			}
			case 'C': {
				CurrentValue = 100;
				if (CurrentValue < PreviousValue) {
					res -= CurrentValue;
				} else {
					res += CurrentValue;
				}
				PreviousValue = CurrentValue;
				break;
			}
			case 'D': {
				CurrentValue = 500;
				if (CurrentValue < PreviousValue) {
					res -= CurrentValue;
				} else {
					res += CurrentValue;
				}
				PreviousValue = CurrentValue;
				break;
			}
			case 'M': {
				CurrentValue = 1000;
				if (CurrentValue < PreviousValue) {
					res -= CurrentValue;
				} else {
					res += CurrentValue;
				}
				PreviousValue = CurrentValue;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + value);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Roman number");
		String s = scanner.nextLine();
		s=s.toUpperCase();
		int result = data(s);
		System.out.println("Integer value of " + s + " : " + result);
		scanner.close();
	}

}




//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Roman {
//    public static int romanToInt(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//        
//        int ans=map.get(s.charAt(s.length()-1));
//
//        for(int i=s.length()-2;i>=0;i--)
//        {
//            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1)))
//                ans+=map.get(s.charAt(i));
//            else
//                ans-=map.get(s.charAt(i));
//        }  
//        return ans;
//        
//    }
//    public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the roman number");
//		String s = scanner.nextLine();
//		int x=romanToInt(s);
//		System.out.println(x);
//	}
//}
