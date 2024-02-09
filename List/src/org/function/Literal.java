package org.function;

public class Literal {
	public static void main(String[] args) {
		String literali = "Nisha";
		String literalj = "Nisha";
		String nonliterali = new String("Nisha");
		String nonliteralj = new String("Nisha");
		int li = System.identityHashCode(literali);
		int lj = System.identityHashCode(literalj);
		int nli = System.identityHashCode(nonliterali);
		int nlj = System.identityHashCode(nonliteralj);
		System.out.println("First literal string identityHashCode :" + li);
		System.out.println("Second literal string identityHashCode :" + lj);
		System.out.println("First non literal string identityHashCode :" + nli);
		System.out.println("Second non literal string identityHashCode :" + nlj);
		String li1 = String.valueOf(li);
		String lj1 = String.valueOf(lj);
		String nli1 = String.valueOf(nli);
		String nlj1 = String.valueOf(nlj);
		if (li1.equals(lj1)) {
			System.out.println("Two same literal string identityHashCode is same");
		} else {
			System.out.println("Two same literal string identityHashCode is different");
		}
		if (nli1.equals(nlj1)) {
			System.out.println("Two same non literal string identityHashCode is same");
		} else {
			System.out.println("Two same non literal string identityHashCode is different");
		}
		
	}
}
