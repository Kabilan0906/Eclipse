package org.function;

public class Encapculasion {

	private String name;
	private int age;
	private double salary;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Encapculasion encapculasion = new Encapculasion();
		encapculasion.setName("Kabilan");
		System.out.println(encapculasion.getName());
		encapculasion.setAge(21);
		System.out.println(encapculasion.getAge());
		encapculasion.setSalary(25000.00);
		System.out.println(encapculasion.getSalary());
	}
}
