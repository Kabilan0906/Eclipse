package org.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Immutable {
	{
		System.out.println("khjk");
	}

	public static void main(String[] args) {
//		new Immutable();
		Integer ii = 10;
		Integer ij = new Integer(10);
		System.out.println((ii == ij) ? "Integer mutable" : "Integer immutable");

		Long li = 15l;
		Long lj = new Long(15l);
		System.out.println((li == lj) ? "Long mutable" : "Long immutable");

		Character ci = 'a';
		Character cj = new Character('a');
		System.out.println((ci == cj) ? "Character mutable" : "Character immutable");

		Float fi = 20000.00f;
		Float fj = new Float(20000.00f);
		System.out.println((fi == fj) ? "Float mutable" : "Float immutable");

		Double di = 1000.00;
		Double dj = new Double(1000.00);
		System.out.println((di == dj) ? "Double mutable" : "Double immutable");

		String si = "Kabilan";
		String sj = new String("Kabilan");
		System.out.println((si == sj) ? "String mutable" : "String immutable");

		List<String> strings = new ArrayList<String>();
		strings.add("One");
		strings.add("Two");
		strings.add("Three");
		List<String> unmodifiable = Collections.unmodifiableList(strings);
		System.out.println(strings);
		System.out.println(unmodifiable);
//		unmodifiable.add("New string"); // will fail at runtime
		strings.add("Four"); // will succeed
		System.out.println(strings);
		System.out.println(unmodifiable);

	}
}
