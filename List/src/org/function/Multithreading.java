package org.function;

//public class Multithreading extends Thread {

//		public synchronized void add(int j) {
//		public void add(int j) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Run " + i+"==="+j);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//
//			}
//		}
//	}
//
//	public void Data() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Data " + i);
//		}
//	}
//
//	public static void main(String[] args) throws InterruptedException {
//		Multithreading mt = new Multithreading();
//		Thread t1= new Thread() {
//			public void run() {
//				mt.add(5);
//			}
//		};
//		Thread t2= new Thread() {
//			public void run() {
//				mt.add(10);
//			}
//		};
//		Thread t3= new Thread() {
//			public void run() {
//				mt.add(15);
//			}
//		};
//		t1.start();
//		t2.start();
//		t3.start();
//		mt.setName("Thread class extends");
//		mt.start();
//		mt.Data();
//		System.out.println("Isalive :" + mt.isAlive());
//		mt.join();
//		mt.Data();
//		mt.setPriority(NORM_PRIORITY);
//		System.out.println("Isalive :" + mt.isAlive());
//		System.out.println(mt.getPriority());
//	}

public class Multithreading implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Override " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}

	public void sample() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Multithreading();
		Thread th = new Thread(runnable);
		th.start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Inside run" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}
				}
			}
		}).start();
		System.out.println("Isalive :" + th.isAlive());
		th.join();
		System.out.println("Isalive :" + th.isAlive());
		new Thread(new Runnable() {
			@Override
			public void run() {
				new Multithreading().sample();
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Lambda expression Thread " + i);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {

				}
			}
		}).start();
		new Thread(() -> {
			new Multithreading().sample();
		}).start();
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Lambda expression runnable " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
			}
		};
		new Thread(r).start();
	}
}
