package org.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test { int i;
	public static void main(String[] args) {
		int[] arr= {1,2,0,4,6,0,9,0,4,0,3,0,9,0,1,0,3,0};
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int x : arr) {
			if(x==0) {
				list.addFirst(x);
			}else {
				list.addLast(x);
			}
		}
		Object[] y=list.toArray(); 
		String k= Arrays.toString(y);
		System.out.println(k);
		List<Integer> li=new ArrayList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		
	}
	
}