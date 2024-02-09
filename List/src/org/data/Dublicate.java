package org.data;

public class Dublicate {
	public static void main(String[] args) {
		String a= "Aiite";
	    for (int i = 0; i < a.length(); i++) {
	    	for(int j=i+1;j<a.length();j++) {
	    		if(a.charAt(i)==a.charAt(j)) {
	    			System.out.println(a.charAt(i));
	    		}
	    		else {
	    			continue;
	    		}
	    			
	    	} 
		}
	}

}
