package org.function;

public class Literal1 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		String literali = "Nisha";
		String literalj = "Rengan";
		String literalk = "NishaRengan";
		String nonliterali = new String("Nisha");
		String nonliteralj = new String("Rengan");
		String nonliteralk = new String("NishaRengan");
		int li = System.identityHashCode(literali);
		int lj = System.identityHashCode(literalj);
		int lk = System.identityHashCode(literalk);
		int nli = System.identityHashCode(nonliterali);
		int nlj = System.identityHashCode(nonliteralj);
		int nlk = System.identityHashCode(nonliteralk);
		System.out.println("First literal string identityHashCode :" + li);
		System.out.println("Second literal string identityHashCode :" + lj);
		System.out.println("Three literal string identityHashCode :" + lk);
		System.out.println("First non literal string identityHashCode :" + nli);
		System.out.println("Second non literal string identityHashCode :" + nlj);
		System.out.println("Three non literal string identityHashCode :" + nlk);
		String li1 = li + "", lj1 = lj + "", lk1 = lk + "";
		String nli1 = nli + "", nlj1 = nlj + "", nlk1 = nlk + "";
		if (li1.equals(lj1.equals(lk1))) {
			System.out.println("Three different literal string identityHashCode is same");
		} else {
			System.out.println("Three different literal string identityHashCode is different");
		}
		if (nli1.equals(nlj1.equals(nlk1))) {
			System.out.println("Three different non literal string identityHashCode is same");
		} else {
			System.out.println("Three different non literal string identityHashCode is different");
		}
	}

}
