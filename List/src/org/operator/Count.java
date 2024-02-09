package org.operator;

public class Count {
	
	public void Data() {
		new Count().Data();
	}
	public static void main(String[] args) {
		int Count=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				Count=Count+1;
			}
			else {
				continue;
			}
		}
		System.out.println(Count);
		new Count().Data();
	}

}
