package org.function;

public class Index {
	public static void main(String[] args) {
		String one = "AlRightTechnology";
		String two = "SeleniumAutomationtool";
		String three = "shahul";
		String four = "j a v a p r o g r a m ";
		String five = "9095484678";
		int one1 = one.lastIndexOf('o');
		int two2 = two.indexOf('o');
		int three3 = three.indexOf('n');
		int four4 = four.lastIndexOf(' ');
		int five5 = five.indexOf('8');
		System.out.println(one1);
		System.out.println(two2);
		System.out.println(three3);
		System.out.println(four4);
		System.out.println(five5);

		int i = 0, j = i;
		System.out.println(i);
		i++;
		System.out.println(i++);
		j = i++ + j;
		System.out.println(i + "-" + j);
	}
}
