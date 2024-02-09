package org.sample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dob {
	Scanner scanner = new Scanner(System.in);

	public void Test() {
		int day = 0;
		int month = 0;
		int leap = 0;
		int j = 1;
		for (int i = 0; i < j; i++) {
			System.out.println("Enter the date of birth(DD/MM/YYYY)");
			String dob = scanner.nextLine();
			String m = dob.substring(3, 5);
			String d = dob.substring(0, 1);
			String y = dob.substring(6, 10);
			int g = Integer.parseInt(y);
			int year = g % 4;

			int a=Integer.parseInt(d);
			if(a==0||a==1||a==2) {
				day +=1;
			}else if(a==3) {
				day +=2;
			}else {
				day +=3;
			}

			switch (m) {
			case "01": {
				month += 1;
				break;
			}
			case "02": {
				month += 3;
				break;
			}
			case "03": {
				month += 1;
				break;
			}
			case "04": {
				month += 2;
				break;
			}
			case "05": {
				month += 1;
				break;
			}
			case "06": {
				month += 2;
				break;
			}
			case "07": {
				month += 1;
				break;
			}
			case "08": {
				month += 1;
				break;
			}
			case "09": {
				month += 2;
				break;
			}
			case "10": {
				month += 1;
				break;
			}
			case "11": {
				month += 2;
				break;
			}
			case "12": {
				month += 1;
				break;
			}
			default:
				month += 4;
			}

			if (year == 0) {
				leap++;
			}

			System.out.println(dob);
			System.out.println(m);
			System.out.println(d);
			System.out.println(year);
			System.out.println(month);
			System.out.println(leap);
			switch (month) {
			case 1: {
				switch (day) {
				case 1: {
					String pattern = "^[0-2][0-9]\\/(01|03|05|07|08|10|12)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					System.out.println(k);
					if (k == true) {
						System.out.println("valid");

					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}

				case 2: {
					String pattern = "^(30|31)\\/(01|03|05|07|08|10|12)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					System.out.println(k);
					if (k == true) {
						System.out.println("valid");

					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}
				default:
					System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
					j++;
				}
				break;
			}
			case 3: {
				switch (leap) {
				case 0: {
					switch (d) {
					case "0": {
						String pattern = "^[0-2][0-9]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						System.out.println(k);
						if (k == true) {
							System.out.println("valid");

						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					case "1": {
						String pattern = "^[0-2][0-9]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						System.out.println(k);
						if (k == true) {
							System.out.println("valid");
						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					case "2": {
						String pattern = "^(2)[0-8]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						System.out.println(k);
						if (k == true) {
							System.out.println("valid");

						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					default:
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;

				}
				case 1: {
					switch (day) {
					case 1: {
						String pattern = "^[0-2][0-9]\\/(02)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
						Pattern data = Pattern.compile(pattern);
						Matcher match = data.matcher(dob);
						boolean k = match.matches();
						System.out.println(k);
						if (k == true) {
							System.out.println("valid");

						} else {
							System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
							j++;
						}
						break;
					}
					default:
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}
				default:
					System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
					j++;
				}
				break;
			}
			case 2: {
				switch (day) {

				case 1: {
					String pattern = "^[0-2][0-9]\\/(02|04|06|09|11)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					System.out.println(k);
					if (k == true) {
						System.out.println("valid");

					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}
				case 2: {
					String pattern = "^(30)\\/(02|04|06|09|11)\\/((19)[0-9]{2}|(20)[0-2][0-9]|(202)[0-3])$";
					Pattern data = Pattern.compile(pattern);
					Matcher match = data.matcher(dob);
					boolean k = match.matches();
					System.out.println(k);
					if (k == true) {
						System.out.println("valid");

					} else {
						System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
						j++;
					}
					break;
				}

				default:
					System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
					j++;
				}
				break;
			}
			default:
				System.out.println("Invalid data of birth or wrong symbol, you can use '/' this symbol");
				j++;

			}
			day *= 0;
			month *= 0;
			leap *= 0;
		}

	}

	public static void main(String[] args) {
		Dob data = new Dob();
		data.Test();
	}

}